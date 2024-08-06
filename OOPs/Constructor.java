public class Constructor {
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student("Farhan");
        Student s3 = new Student(23);
    }
}

    class Student {
        String name;
        int roll;

        Student() // Constructor
        {
            System.out.println("Constructor is called..");
        }
        Student(String name) // Constructor
        {
            this.name = name;
            System.out.println(this.name);
        }
        Student(int roll) // Constructor
        {
            this.roll = roll;
            System.out.println(this.roll);
        }
    }