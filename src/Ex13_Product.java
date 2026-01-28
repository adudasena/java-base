public class Ex13_Product {
    public static class Product {

        private String name;
        private double price;
        private int quantity;

        //construtor
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

//getters e setters

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

//métodos

        public boolean isAvailable() {
            if (quantity > 0) {
                return true;
            } else {
                return false;
            }
        }

        public double totalValue() {
            return (price * quantity);
        }
    }
}


