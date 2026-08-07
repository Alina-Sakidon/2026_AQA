package JavaCore.hw7.phonebook;

import java.util.List;

public class Note {
    private String name;
    private List<String> phoneNumber;

    public Note(String name, List<String> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Note{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
