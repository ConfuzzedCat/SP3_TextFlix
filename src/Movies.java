public class Movies extends Media {

    //TODO: Gøres pænt senere
    @Override
    public String toString() {
        return "Movie " +
                ", " + name + '\'' +
                ", " + category +
                ", rating: " + rating +
                "Year of release: " + releaseYear +
                '}';
    }

    @Override
    public void watch() {

    }
}
