public class Dog {

    private String name;
    private int age;

        public Dog(String name, int age) {
            this.age = age;
            this.name = name;
        }
            public void getName(String name) {
                this.name = name;
            }

            public void getAge(int age) {
                this.age = age;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public int getPeopleYears() {
                this.age = age * 7;
                return age;
            }

            public String toString() {
                return "This dog is " + age + " years old and their name is " + name;
            }
}
