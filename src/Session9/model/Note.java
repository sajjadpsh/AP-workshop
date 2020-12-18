package Session9.model;

import java.io.Serializable;

public class Note implements Serializable {

    private String title;
    private String content;
    private String date;

    /**
     * Create a new Note with given title and content and date.
     *
     * @param title   title of Note.
     * @param content content  of Note.
     * @param date    date of Note.
     */
    public Note(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    /**
     * an Override method to get a String for Note.
     *
     * @return a String.
     */
    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                '}';
    }


}

