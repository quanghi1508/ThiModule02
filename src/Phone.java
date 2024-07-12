public class Phone {
    private static int nextId = 1;
    private int id;
    private String name;
    private int price;
    private int quantity;
    private String producer;

    public Phone(String producer, int quantity, int price, String name) {
        this.id = nextId++;
        this.producer = producer;
        this.quantity = quantity;
        this.price = price;
        this.name = name;

    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "======Phone=======" +"\n"+
                "id= " + id +"\n"+
                "name= " + name + "\n"+
                "price= " + price + "\n"+
                "quantity= " + quantity + "\n"+
                "producer= " + producer + "\n";
    }
}
