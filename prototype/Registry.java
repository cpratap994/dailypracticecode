package pattern.prototype;

import java.util.HashMap;

public class Registry {

    private HashMap<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setRunTime(222);
        movie.setPrice(22);
        movie.setTitle("Star Wars");
        movie.setUrl("www.starwars.com");
        items.put("Flag",movie);

        Book book = new Book();
        book.setNumberOfPages(100);
        book.setPrice(123);
        book.setUrl("www.mybook.com");
        book.setTitle("New Book");
        items.put("Book",book);
    }

    public Item createItem(String type){
         Item item =null;

         try {
            item = (Item)(items.get(type)).clone();
         }catch (CloneNotSupportedException e){
             e.printStackTrace();
         }
         return item;
    }
}
