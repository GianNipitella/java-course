

/**
 *
 * @author adrianplattner
 */
public class Movie {
    private long id;
    private String name;
    private int year;
    private Actor [] actors;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setAuthors(Actor[] actors) {
        this.actors = actors;
    }
    
}
