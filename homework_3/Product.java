package homework_3;

public abstract class Product implements Comparable<Product>{
    protected String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    protected int price;
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public int compareTo(Product o) {
        if (this.price > o.price) {
            return 1;
        } else if(this.price < o.price)
        {
            return -1;
        }
        return 0;
    }
}
