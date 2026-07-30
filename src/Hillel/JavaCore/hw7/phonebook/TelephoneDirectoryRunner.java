package Hillel.JavaCore.hw7.phonebook;

import java.util.List;

public class TelephoneDirectoryRunner {
    public static void main(String[] args) {
        Note note1 = new Note("Alina S", List.of("099418410222"));
        Note note2 = new Note("Ra S", List.of("099418410222", "4654654"));
        Note note3 = new Note("Sq we", List.of("45545", "46546546879"));
        Note note4 = new Note("Alina S", List.of("79879879879"));

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add(note1);
        telephoneDirectory.add(note2);
        telephoneDirectory.add(note3);
        telephoneDirectory.add(note4);

        System.out.println(telephoneDirectory.find("Alina S"));
        System.out.println(telephoneDirectory.findAll("Alina S"));
        System.out.println(telephoneDirectory.find("fd"));
        System.out.println(telephoneDirectory.findAll("t"));
    }
}
