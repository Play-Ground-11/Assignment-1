public class Demo_Task_A {
    public static void main(String[] args) {

        String redColour = "\033[41;1m";
        String resetRed = "\033[40;0m";

        String greenColour = "\033[42;1m";
        String resetGreen = "\033[40;0m";
        
        System.out.printf("%1$s[     5%2$s%3$s0     ]%4$s\n",redColour,resetRed,greenColour,resetGreen);
    }
}
