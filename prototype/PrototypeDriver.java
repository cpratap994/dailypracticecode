package pattern.prototype;

public class PrototypeDriver {

    public static void main(String[] args) {
        Registry registry = new Registry();

        Movie movie = (Movie)registry.createItem("Flag");
        movie.setTitle("Sazam");
        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getRunTime());
        System.out.println(movie.getUrl());

        Movie movie2 = (Movie)registry.createItem("Flag");
        System.out.println(movie2);
    }
}
