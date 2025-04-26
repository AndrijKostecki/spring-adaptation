package writer;

public class OzdobnikMinus implements IOzdobnik {

    @Override
    public String ozdobnik(String co) {
        return "****" + co + "****";
    }
}
