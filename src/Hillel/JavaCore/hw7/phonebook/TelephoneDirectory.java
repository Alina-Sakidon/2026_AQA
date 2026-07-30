package Hillel.JavaCore.hw7.phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
    private List<Note> listNotes;

    public TelephoneDirectory() {
        this.listNotes = new ArrayList<>();
    }


    public void add(Note note) {
        this.listNotes.add(note);
    }

    public Note find(String name) {
        return this.listNotes.stream()
                .filter(s -> s.getName().equals(name)).findFirst()
                .orElse(null);

    }

    public List<Note> findAll(String name) {
        List<Note> result = this.listNotes.stream()
                .filter(s -> s.getName().equals(name)).toList();
        return result.isEmpty() ? null : result;
    }
}

