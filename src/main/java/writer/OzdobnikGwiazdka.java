package writer;

public class OzdobnikGwiazdka implements IOzdobnik {

    @Override
    public String ozdobnik(String co) {
       return "****" + co + "****";
    }

}
