public class GetterSetter
{
    public static void main(String args[])
    {
        Pen p1 = new Pen();  // Create a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

    }
} 
    class Pen
    {
        private int tip;
        private String color;

        String getColor()
        {
            return this.color;
        }

        int getTip()
        {
            return this.tip;
        }

        void setColor(String newColor)
        {
            this.color = newColor;
        }
        void setTip(int tip)
        {
            this.tip = tip;
        }

    }
    