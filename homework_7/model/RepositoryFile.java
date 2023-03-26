package homework_7.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private final NoteMapper mapper = new NoteMapper();
    private final FileOperation fileOperation;
    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }
    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public String createNote(Note note) {
        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        saveNote(notes);
        return id;
    }

    @Override
    public void saveNote(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item: notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public void deleteNote(String id) {
        List<String> lines = fileOperation.readAllLines();
        List<String> updatedLines = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(","); // перезапись файла без удаленного id
            if (!parts[0].equals(id)) {
                updatedLines.add(line);
            }
            fileOperation.saveAllLines(updatedLines);
        }
    }
}