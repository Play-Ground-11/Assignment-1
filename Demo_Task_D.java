public class Demo_Task_D {
    public static void main(String[] args) {   
        String borderColor = "\033[0;33m";
        String borderReset = "\033[30;0m";

        String quantityColor = "\033[34;1m";
        String quantityReset = "\033[40;0m";

        String currencyColor = "\033[32;1m";
        String currencyReset = "\033[40;0m";

        String amountColor = "\033[31;1m";
        String amountReset = "\033[40;0m";
        
        System.out.printf("%1$s+----------+----------+-------+%2$s \n",borderColor,borderReset);
        System.out.printf("%1$s|%2$s ITEM     %1$s|%2$s QUANTITY %1$s|%2$s PRICE %1$s|%2$s\n",borderColor,borderReset);
        System.out.printf("%1$s+----------+----------+-------+%2$s\n",borderColor,borderReset);
        System.out.printf("%1$s|%2$s Apples   %1$s|%2$s        %3$s5%4$s %1$s|%2$s %5$s$%6$s%7$s0.99%8$s %1$s|%2$s\n",borderColor,borderReset,quantityColor,quantityReset,currencyColor,currencyReset,amountColor,amountReset);
        System.out.printf("%1$s|%2$s Oranges  %1$s|%2$s       %3$s10%4$s %1$s|%2$s %5$s$%6$s%7$s1.49%8$s %1$s|%2$s\n",borderColor,borderReset,quantityColor,quantityReset,currencyColor,currencyReset,amountColor,amountReset);
        System.out.printf("%1$s+----------+----------+-------+%2$s\n",borderColor,borderReset);
    }   
}
