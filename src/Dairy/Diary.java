package Dairy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diary {

    private String ownersName;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String ownersName, String password) {
        this.isLocked = true;
        this.ownersName = ownersName;
        this.password = password;
        entries = new ArrayList<>();
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlock(String password) {
        if (this.password.equals(password)) isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }

    public void write(String title, String body) {
        if (isLocked) throw new IllegalArgumentException("Unlock diary to write");
        entries.add(new Entry(entries.size()+1, title, body));
    }

    public int numberOfEntries() {
        return entries.size();
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries){
            if (Objects.equals(entry.getId(), id)) return entry;
        }
        return null;
    }

    public Entry findEntryByTitle(String title) {
        for (Entry entry : entries) {
            if (Objects.equals(entry.getTitle(), title)) return entry;
        }
        return null;
    }

    public Entry findEntryByBody(String body) {
        for (Entry entry : entries) {
            if (Objects.equals(entry.getBody(), body)) return entry;
        }
        return null;
    }
}
