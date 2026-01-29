import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("---A partir daqui, classe Product e seus testes---");
        Ex13_Product.Product product1 = new Ex13_Product.Product("Batom vermelho", 35.0, 5);
        System.out.println(product1.isAvailable());
        System.out.println(product1.totalValue());
        System.out.println("----------");

        System.out.println("---A partir daqui, classe estudante e seus testes---");
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

        System.out.println(students.get(0).getName());

        System.out.println("--Exibindo os aprovados--");
        for (Ex14_Student.Student s : students) {
            if (s.isApproved()) {
                System.out.println(s.getName());
            }
        }

            System.out.println("--Removendo os reprovados--");
            for (int i = students.size()-1; i>=0; i--) {
                if (!students.get(i).isApproved()) {
                    students.remove(i);
                }
            }

            System.out.println("--Percorrendo a lista--");
            for (Ex14_Student.Student s : students) {
                System.out.println("Aluno: " + s.getName());
                System.out.println("Média: " + s.calculateAverage());
                System.out.println("Aprovado: " + s.isApproved());
                System.out.println("-----");
            }

        }
    }
