package ch.borobudur;

/*
 * Schnittstelle für Konfiguration-Objekt.
 * 
 * In der Anwendung soll ein und dasselbe Config-Objekt an vielen 
 * verschiedenen Stellen (d.h. Klassen) verwendet werden.
 */
public interface Config {
 
    public String getValue(String key);
 
    public void setValue(String key, String value);
 
}
