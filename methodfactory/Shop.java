package pattern.methodfactory;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new CartPage());
        pages.add(new ContactPage());
    }
}
