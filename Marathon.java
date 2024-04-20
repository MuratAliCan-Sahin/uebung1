import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Marathon {

  public static void print(List<Ergebnis> ergebnisse) {
    // hier Ihren Code einfügen
    System.out.println("wir sind hier");
    for(Ergebnis s:ergebnisse)
    System.out.println(s.getName()+" "+s.getZeit());
    ;
  }

  public static void sortErgebnisse(List<Ergebnis> ergebnisse) {
    // hier Ihren Code einfügen
    Comparator <Ergebnis> nachZeit =  Comparator.comparing(Ergebnis::getZeit);
    Collections.sort(ergebnisse,nachZeit);
  }

  public static void main(String[] args) {
    
    // Liste von zufälligen Ergebnissen
    List<Ergebnis> ergebnisse = zufaelligeErgebnisse(8);
    System.out.println( "groesse "+ergebnisse.size());
    
    sortErgebnisse(ergebnisse);
    print(ergebnisse);
  }

  private static List<Ergebnis> zufaelligeErgebnisse(int anzahl) {
    List<Ergebnis> ergebnisse = new ArrayList<>(anzahl);
    // Warum hier keine foreach-Schleife?
    // (Wir werden später noch lernen, dass es auch mit Streams geht.)
    for(int i = 0; i < anzahl; i++) {
      ergebnisse.add(new Ergebnis());
    }
    return ergebnisse;
  }

}
