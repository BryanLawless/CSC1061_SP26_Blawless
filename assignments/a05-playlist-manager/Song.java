public class Song {

    private String title;
    private String artist;

    /**
     * Creates a new song.
     * @param title the song title
     * @param artist the song artist
     */
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    /**
     * Gets the title.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * @param title the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the artist.
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the artist.
     * @param artist the new artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Returns song as a string.
     * @return formatted string
     */
    @Override
    public String toString() {
        return "\"" + title + "\" by " + artist;
    }

    /**
     * Checks if two songs are equal.
     * @param obj the object to compare
     * @return true if equal
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Song other = (Song) obj;
        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }
        if (artist == null) {
            if (other.artist != null) {
                return false;
            }
        } else if (!artist.equals(other.artist)) {
            return false;
        }
        return true;
    }

    /**
     * Gets hash code.
     * @return hash code
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((artist == null) ? 0 : artist.hashCode());
        return result;
    }
}
