package ch.borobudur;
 
import javax.inject.Inject;
 
// Beispielklasse, die Config-Objekt verwenden soll.
public class ReadController {
 
    // Config-Objekt wird von Spring injiziert.
    @Inject
    private Config conf;
 
    public ReadController() {}
 
    public void printConfig() {
        System.out.println("Konfiguration: Test=" + this.conf.getValue("Test"));
    }
}
