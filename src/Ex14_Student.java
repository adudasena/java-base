public class Ex14_Student {
    public static class Student {

        private String name;
        private double grade1;
        private double grade2;

        //construtor
        public Student(String name, double grade1, double grade2) {
            this.name = name;
            this.grade1 = grade1;
            this.grade2 = grade2;
        }

        //getters e setters
        public String getName() {
            return name;
        }

        public double getGrade1() {
            return grade1;
        }

        public double getGrade2() {
            return grade2;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setGrade1(double grade1) {
            this.grade1 = grade1;
        }

        public void setGrade2(double grade2) {
            this.grade1 = grade2;
        }

        //métodos
        public double calculateAverage() {
            return (grade1 + grade2) / 2;
        }

        public boolean isApproved() {
            if ((grade1 + grade2) /2 >= 70) {
                return true;
            } else {
                return false;
        }

    }
    }
}
