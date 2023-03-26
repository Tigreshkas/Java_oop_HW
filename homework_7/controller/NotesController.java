package homework_7.controller;

import java.util.List;
import homework_7.model.Repository;
import homework_7.model.Note;

public class NotesController implements Notes {
    private Repository repository;

    public NotesController(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void saveNote(Note note) throws Exception {
        repository.createNote(note);
    }
    @Override
    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(noteId, notes);
        return note;
    }
    @Override
    public Note noteSearch(String noteId, List<Note> notes) throws Exception{
        for (Note item : notes) {
            if (item.getId().equals(noteId)) {
                return item;
            }
        }
        throw new Exception("Такой заметки не найдено");
    }
    @Override
    public List<Note> readAllUsers(){
        return repository.getAllNotes();
    }
    @Override
    public void updateNote(String noteId, Note newNote) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(noteId,notes);
        note.setHeading(newNote.getHeading());
        note.setBody(newNote.getBody());
        repository.saveNote(notes);
    }
    @Override
    public void deleteNote(String noteID) throws Exception {
        readNote(noteID);
        repository.deleteNote(noteID);
    }

}