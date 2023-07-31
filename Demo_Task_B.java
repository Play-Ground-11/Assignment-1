public class Demo_Task_B {
    public static void main(String[] args) {       
        String borderColor = "\033[0;33m";
        String borderReset = "\033[30;0m";

        String headerColor = "\033[34;1m";
        String headerReset = "\033[30;0m";

        String contentColor = "\033[31;1m";
        String contentReset = "\033[40;0m";        
        
        System.out.printf("%1$s+--------------+-----+%2$s \n",borderColor,borderReset);
        System.out.printf("%1$s|%2$s %3$sNAME%4$s         %1$s|%2$s %3$sAGE%4$s %1$s|%2$s\n",borderColor,borderReset,headerColor,headerReset);
        System.out.printf("%1$s+--------------+-----+%2$s\n",borderColor,borderReset);
        System.out.printf("%1$s|%2$s Alice        %1$s|%2$s %3$s24%4$s  %1$s|%2$s \n",borderColor,borderReset,contentColor,contentReset);
        System.out.printf("%1$s|%2$s Bob          %1$s|%2$s %3$s30%4$s  %1$s|%2$s\n",borderColor,borderReset,contentColor,contentReset);
        System.out.printf("%1$s+--------------+-----+%2$s\n",borderColor,borderReset);
    } 
}
