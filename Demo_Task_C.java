public class Demo_Task_C {
    public static void main(String[] args) {      
        String borderColor = "\033[0;33m";
        String borderReset = "\033[30;0m";

        String amountColor = "\033[31;1m";
        String amountReset = "\033[40;0m";
        
        String cityColor = "\033[32;1m";
        String citytReset = "\033[40;0m";
        
        System.out.printf("%1$s+-------------+------------+------------+%2$s \n",borderColor,borderReset);
        System.out.printf("%1$s|%2$s CITY        %1$s|%2$s STATE      %1$s|%2$s POPULATION %1$s|%2$s\n",borderColor,borderReset);
        System.out.printf("%1$s+-------------+------------+------------+%2$s\n",borderColor,borderReset);
        System.out.printf("%1$s|%2$s Los Angeles %1$s|%2$s California %1$s|%2$s %3$s3,966,936%4$s  %1$s|%2$s\n",borderColor,borderReset,amountColor,amountReset);
        System.out.printf("%1$s|%2$s %3$sNew%4$s York    %1$s|%2$s %3$sNew%4$s York   %1$s|%2$s %5$s8,336,817%6$s  %1$s|%2$s\n",borderColor,borderReset,cityColor,citytReset,amountColor,amountReset);
        System.out.printf("%1$s+-------------+------------+------------+%2$s\n",borderColor,borderReset);
    }   
}
