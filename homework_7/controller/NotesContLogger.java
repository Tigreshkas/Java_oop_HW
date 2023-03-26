package homework_7.controller;

import homework_7.Logger.Logger;
import homework_7.model.Note;
import java.util.List;

public class NotesContLogger implements Notes {
    private final NotesController notesController;
    private final Logger log;

    public NotesContLogger(NotesController notesController, Logger log) {
        this.notesController = notesController;
        this.log = log;
    }

    @Override
    public void saveNote(Note note) throws Exception {
        log.saveToLog("Сохранена новая записка \n" + note);
        notesController.saveNote(note);
    }

    @Override
    public Note readNote(String noteId) throws Exception {
        log.saveToLog("Была прочтена записка под номером " + noteId);
        return notesController.readNote(noteId);
    }

    @Override
    public Note noteSearch(String noteId, List<Note> notes) throws Exception {
        log.saveToLog("Выполнен поиск записки по номеру " + noteId);
        return notesController.noteSearch(noteId, notes);
    }

    @Override
    public List<Note> readAllUsers() {
        log.saveToLog("Прочтены все пользователи");
        return notesController.readAllUsers();
    }

    @Override
    public void updateNote(String noteId, Note newNote) throws Exception {
        log.saveToLog("Обновлена записка " + noteId);
        notesController.updateNote(noteId, newNote);

    }

    @Override
    public void deleteNote(String noteID) throws Exception {
        log.saveToLog("Удалена записка " + noteID);
        notesController.deleteNote(noteID);
    }
}