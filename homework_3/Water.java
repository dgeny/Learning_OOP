package homework_3;

public class Water extends Product {
    protected int volume;
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Water(String name, int price, int volume){
        super.name = name;
        super.price = price;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Water {name: %s, price: %d, volume: %d}",
             super.name, super.price, this.volume);
    }
    


}
