package IntroPoo.entities1;

public class product {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueStock() {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
            this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }
}
