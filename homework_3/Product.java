package homework_3;

public abstract class Product {
    protected String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    protected long price;
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
}
