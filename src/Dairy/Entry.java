package Dairy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String title;
    private String body;
    private LocalDate timeOfEntry;
    private int id;
    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        timeOfEntry = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String time = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, hh:mm:ss a").format(timeOfEntry);
        return String.format("""
                =======================
                Entry %s
                Written on %s
                Title: %s
                Body: %s
                =======================
                """, id, time, title, body);
    }
}
