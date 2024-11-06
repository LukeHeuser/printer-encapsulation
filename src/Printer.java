public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if ((tonerLevel + tonerAmount) > 100 || (tonerLevel + tonerAmount) <  0) {
            return -1;
        } else {
            return tonerLevel += tonerAmount;
        }
    }

    public int printPages(int pages) {
        if (duplex){
            System.out.println("This is a duplex Printer.");
            return pagesPrinted += (pages + (pages % 2)) / 2;
        }
        return pagesPrinted += pages;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

}
