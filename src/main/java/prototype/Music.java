package prototype;

public class Music extends Product{
    private String artist;
    private String genre;
    private String album;

    public Music() {
    }

    public Music(int id, String name, String description, double price, String image, String artist, String genre, String album) {
        super(id, name, description, price, image);
        this.artist = artist;
        this.genre = genre;
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public Music clone() {
        Music cloneMusic = new Music();
        cloneMusic.setId(this.getId());
        cloneMusic.setName(this.getName());
        cloneMusic.setDescription(this.getDescription());
        cloneMusic.setPrice(this.getPrice());
        cloneMusic.setImage(this.getImage());
        cloneMusic.setArtist(this.getArtist());
        cloneMusic.setGenre(this.getGenre());
        cloneMusic.setAlbum(this.getAlbum());
        return cloneMusic;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", image='" + getImage() + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
