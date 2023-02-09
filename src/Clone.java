

public class Clone {

    static class Person implements Cloneable {
        String name;
        int age;
        String status;

        public Person(String name, int age, String status) {
            this.name = name;
            this.age = age;
            this.status = status;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", status='" + status + '\'' +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException {


            Person anna = new Person("Anna", 20, "student");
            Person clone = (Person) anna.clone();
            System.out.println(anna);
            System.out.println(clone);
            clone.status = new String("worker");
            System.out.println(anna);
            System.out.println(clone);
        }

}