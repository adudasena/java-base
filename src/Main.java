import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ex12_User.User user1 = new Ex12_User.User("Maria", "maria@gmail.com", 20);
        System.out.println(user1.isAdult());
        System.out.println("----------");
        Ex13_Product.Product product1 = new Ex13_Product.Product("Batom vermelho", 35.0, 5);
        System.out.println(product1.isAvailable());
        System.out.println(product1.totalValue());
        System.out.println("----------");

        Ex14_Student.Student student1 = new Ex14_Student.Student("Fulano", 40.0, 20.0);
        System.out.println(student1.calculateAverage());
        System.out.println(student1.isApproved());

        Ex14_Student.Student student2= new Ex14_Student.Student("Bia", 90.0, 80.0);
        Ex14_Student.Student student3= new Ex14_Student.Student("Dudinha", 100.0, 70.0);

        //adc ArrayList
        ArrayList<Ex14_Student.Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);



    }
}
