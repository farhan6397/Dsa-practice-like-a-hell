public class OOPs
{
    public static void main(String args[])
    {
        Pen p1 = new Pen();  // Create a pen object called p1
        p1.color = "Green";
        System.out.println(p1.color);

        p1.setColor("yellow");
        System.out.println(p1.color);

        p1.tip = 5;
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Farhan";
        myAcc.setPassword("farhan123");
        System.out.println(myAcc.username);
    }
}
    class BankAccount {
        public String username;
        private String password;

        void setPassword(String pwd)
        {
            password = pwd;
        }
    }
    class Pen
    {
        int tip;
        String color;

        void setColor(String newColor)
        {
            color = newColor;
        }
        void setTip(int newTip)
        {
            tip = newTip;
        }

    }
    class Student
    {
        int age;
        String name;
        float percentage;
    }
