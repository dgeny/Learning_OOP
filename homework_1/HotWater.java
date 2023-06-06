package homework_1;

public class HotWater extends Water {
    
    public HotWater(String name, int price, int temperature, int volume){
        super(name, price, volume);
        this.temperature = temperature;
    }

    
    private int temperature;
    
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        
        return String.format("Water {name: %s, price: %d, temp: %d, volume: %d}",
        super.name, super.price, this.temperature, super.volume);
    }
    
}
