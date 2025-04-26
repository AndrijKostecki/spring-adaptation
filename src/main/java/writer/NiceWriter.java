package writer;

public class NiceWriter implements IWriter {

    IOzdobnik ozdobnik;

    public void writer(String s) {
        System.out.println("The string is: " + s);
        System.out.print(" Thank you for your attention");
        System.out.print(ozdobnik.ozdobnik("This is ") + s);
    }

    public void setOzdobnik(IOzdobnik ozdobnik) {
        this.ozdobnik = ozdobnik;
    }


}