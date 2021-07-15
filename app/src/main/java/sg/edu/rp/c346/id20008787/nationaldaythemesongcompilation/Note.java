package sg.edu.rp.c346.id20008787.nationaldaythemesongcompilation;

import java.io.Serializable;

public class Note implements Serializable {

    private int id;
    private String title;
    private String singers;
    private int year;
    private int stars;


    public Note(String title, String singers, int year, int stars) {

        this.title = title;
        this.singers = singers;
        this.year = year;
        this.stars = stars;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSingers() {
        return singers;
    }

    public int getYear() {
        return year;
    }

    public int stars() {
        return stars;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() { return "ID:" + id + ", " + title;
    }
}