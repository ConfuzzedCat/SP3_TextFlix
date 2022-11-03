public class Series extends Media {

    ArrayList<Season> Seasons = new ArrayList<>();


    //TODO: Gøres pænt senere
    @Override
    public String toString() {
        return "Series" +
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
