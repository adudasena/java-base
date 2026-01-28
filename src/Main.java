public class Main {
    public static void main(String[] args) {

        Ex12_User.User user1 = new Ex12_User.User("Maria", "maria@gmail.com", 20);
        System.out.println(user1.isAdult());
        System.out.println("----------");
        Ex13_Product.Product product1 = new Ex13_Product.Product("Batom vermelho", 35.0, 5);
        System.out.println(product1.isAvailable());
        System.out.println(product1.totalValue());
        System.out.println("----------");

        Ex14_Student.Student student = new Ex14_Student.Student("João", 50, 90);
        System.out.println(student.calculateAverage());
        System.out.println(student.isApproved());
    }
}
