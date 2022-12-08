public class Car  {
    private int id;
    private int numberAvto;

    public Car(int id, int numberAvto) {
        super();
        this.id = id;
        this.numberAvto = numberAvto;
    }

    public Car() {
        super();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberAvto() {
        return numberAvto;
    }

    public void setNumberAvto(int numberAvto) {
        this.numberAvto = numberAvto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberAvto=" + numberAvto +
                '}';
    }
}
