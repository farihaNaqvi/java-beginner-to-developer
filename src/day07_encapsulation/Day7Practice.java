
public class Day7Practice {
    
    // Example 1: Student class demonstrating encapsulation
    static class Student {
        private String name;
        private int age;
        private double gpa;
        
        // Constructor
        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }
        
        // Getters
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
        
        public double getGpa() {
            return gpa;
        }
        
        // Setters with validation
        public void setName(String name) {
            if (name != null && !name.isEmpty()) {
                this.name = name;
            }
        }
        
        public void setAge(int age) {
            if (age > 0 && age < 100) {
                this.age = age;
            }
        }
        
        public void setGpa(double gpa) {
            if (gpa >= 0.0 && gpa <= 4.0) {
                this.gpa = gpa;
            }
        }
        
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gpa=" + gpa +
                    '}';
        }
    }
    
    public static void main(String[] args) {
        Student student = new Student("John", 20, 3.5);
        System.out.println(student);
        
        student.setName("Jane");
        student.setAge(21);
        student.setGpa(3.8);
        System.out.println(student);
        
        // Invalid values are ignored
        student.setAge(-5);
        student.setGpa(5.0);
        System.out.println(student);
    }
}