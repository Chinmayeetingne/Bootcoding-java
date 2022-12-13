package oops;


    public class Person {
        private String name;
        private int age;
        private long phone;


        //parameterize constr
        public Person(String name, int age, long phone) {
            this.name = name;
            this.age = age;
            this.phone = phone;
        }

        public Person(Person person){
            this.name=person.name;
            this.age=person.age;
            this.phone=person.phone;

        }
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", phone=" + phone +
                    '}';
        }
    }
    class Demo{
        public static void main(String[] args) {
            Person person= new Person("Raj",22,2633193);
            Person person1= new Person(person);
            Person person2= person;
            System.out.println(person);
            System.out.println(person1);

        }
    }
