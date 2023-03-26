package homework_7.model;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();
    String createNote(Note user);
    void saveNote(List<Note> users);
    void deleteNote(String id);
}
