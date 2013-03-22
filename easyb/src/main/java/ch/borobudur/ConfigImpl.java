package ch.borobudur;
 
import java.util.HashMap;
import java.util.Map;
 
/*
 * Standard-Implementierung der Config-Schnittstelle.
 */
public class ConfigImpl implements Config {
 
    private Map<String, String> prefs = new HashMap<String, String>();
 
    public String getValue(String key) {
        return this.prefs.get(key);
    }
 
    public void setValue(String key, String value) {
        this.prefs.put(key, value);
    }
}
