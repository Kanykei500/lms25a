public class Avto {
    private int godVypuska;
    private String model;
    private String color;
    private  String price;

    public Avto(int godVypuska, String model, String color, String price) {
        super();
        this.godVypuska = godVypuska;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Avto() {

    }

    public int getGodVypuska() {
        return godVypuska;
    }

    public void setGodVypuska(int godVypuska) {
        this.godVypuska = godVypuska;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Avto{" +
                "godVypuska='" + godVypuska + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    
}
