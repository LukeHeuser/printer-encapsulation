public class Main {
    public static void main(String[] args) {

        Printer duplexPrinter = new Printer(85, true);
        System.out.println(duplexPrinter.addToner(13));
        System.out.println(duplexPrinter.addToner(2));

        int pagesPrinted = duplexPrinter.printPages(1);

        System.out.printf("Current Job pages: %d, Printer Total: %d %n",
                pagesPrinted, duplexPrinter.getPagesPrinted());

        pagesPrinted = duplexPrinter.printPages(8);
        System.out.printf("Current Job pages: %d,Printer Total: %d %n",
                pagesPrinted, duplexPrinter.getPagesPrinted());

        pagesPrinted = duplexPrinter.printPages(4);
        System.out.printf("Current Job pages: %d, Printer Total: %d %n",
                pagesPrinted, duplexPrinter.getPagesPrinted());

        System.out.println(duplexPrinter.printPages(7) + " pages printed");
        System.out.println(duplexPrinter.printPages(4) + " pages printed");

        Printer oldPrinter = new Printer(5, false);
        System.out.println(oldPrinter.addToner(15));
        System.out.println(oldPrinter.addToner(100));
        System.out.println(oldPrinter.printPages(15) + " pages printed");
        System.out.println(oldPrinter.printPages(5) + " pages printed");

    }

}
