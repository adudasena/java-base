public class Ex12_User {
    public static class User {

        //atributos não inicializados
        private String name;
        private String email;
        private int age;

        //construtor
        public User(String name, String email, int age) {
            this.name = name;
            this.email = email;
            this.age = age;
        }

        //getters e setters
        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

        //métodos
        boolean isAdult() {
            if (age > 18) {
                return true;
            } else {
                return false;
            }
        }
    }
}