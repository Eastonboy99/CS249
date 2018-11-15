import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

class DataStore {
    String file;
    Date currentDate;
    List<Person> objects = new ArrayList<>();

    DataStore(String fileName, Date currentDate) {
        this.setFile(fileName);
        this.currentDate = currentDate;
    }

    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
        this.clearFile();
    }

    private void clearFile() {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(this.file));
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output.");
        }
    }

    public void addPerson(Person person) {
        List<Person> readObjects = this.readPersons();

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(this.file));
            if (readObjects != null)
                for (Person readPerson : readObjects) {
                    outputStream.writeObject(readPerson);

                }
            outputStream.writeObject(person);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output.");
        }
    }

    public List<Person> readPersons() {
        List<Person> readObjects = new ArrayList<>();

        try {
            FileInputStream fileStream = new FileInputStream(this.file);
            ObjectInputStream inputStream = new ObjectInputStream(fileStream);
            while (fileStream.available() > 0) {
                readObjects.add((Person) inputStream.readObject());
            }
            inputStream.close();
            return readObjects;
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find datafile. Making New one");
            return null;
        } catch (ClassNotFoundException e) {
            System.out.println("Problems with file input.");
            return null;
        } catch (IOException e) {
            System.out.println("Problems with file input.");
            return null;
        }
    }

    public void deletePerson(String name) {
        List<Person> readObjects = this.readPersons();
        if (readObjects != null) {
            this.clearFile();

            for (Person readPerson : readObjects) {
                if (!name.equals(readPerson.getName())) {
                    this.addPerson(readPerson);
                }
            }
        }

    }

    public List<Person> getAgeRange(int start, int end) {
        int startInHours = start * 8760;
        int endInHours = end * 8760;
        List<Person> readObjects = this.readPersons();
        List<Person> inRange = new ArrayList<>();
        if (readObjects != null) {
            for (Person readPerson : readObjects) {
                if (readPerson.getDeathDate() != null) {
                    Date birthDate = readPerson.getBirthDate();
                    Date deathDate = readPerson.getDeathDate();
                    int diffYears = deathDate.getYear() - birthDate.getYear();
                    int diffMonths = deathDate.getMonth() - birthDate.getMonth();
                    int diffDays = deathDate.getDay() - birthDate.getDay();
                    int ageInHours = (diffYears * 8760) + (diffMonths * 730) + (diffDays * 24);
                    if (ageInHours >= startInHours && ageInHours <= endInHours)
                        inRange.add(readPerson);
                } else {
                    Date birthDate = readPerson.getBirthDate();
                    int diffYears = this.currentDate.getYear() - birthDate.getYear();
                    int diffMonths = this.currentDate.getMonth() - birthDate.getMonth();
                    int diffDays = this.currentDate.getDay() - birthDate.getDay();
                    int ageInHours = (diffYears * 8760) + (diffMonths * 730) + (diffDays * 24);
                    if (ageInHours >= startInHours && ageInHours <= endInHours)
                        inRange.add(readPerson);
                }

            }
        }
        return inRange;
    }

}