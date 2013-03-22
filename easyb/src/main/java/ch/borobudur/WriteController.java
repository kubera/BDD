package ch.borobudur;
 
import javax.inject.Inject;
 
// Beispielklasse, die Config-Objekt verwenden soll.
public class WriteController {
 
    // Config-Objekt wird von Spring injiziert.
    @Inject
    private Config conf;
 
    public WriteController() {}    
 
    public void doConfig() {
        this.conf.setValue("Test", "42");
    }
}
