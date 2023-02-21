package prototype;

import java.util.List;

public class Movie extends Product{
    private String director;
    private List<String> actors;
    private int duration;

    public Movie() {
    }

    public Movie(int id, String name, String description, double price, String image, String director, List<String> actors, int duration) {
        super(id, name, description, price, image);
        this.director = director;
        this.actors = actors;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public Movie clone() {
        Movie cloneMovie = new Movie();
        cloneMovie.setId(this.getId());
        cloneMovie.setName(this.getName());
        cloneMovie.setDescription(this.getDescription());
        cloneMovie.setPrice(this.getPrice());
        cloneMovie.setImage(this.getImage());
        cloneMovie.setActors(this.getActors());
        cloneMovie.setDirector(this.getDirector());
        cloneMovie.setDuration(this.getDuration());
        return cloneMovie;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", image='" + getImage() + '\'' +
                ", director='" + director + '\'' +
                ", actors=" + actors +
                ", duration=" + duration +
                '}';
    }
}
