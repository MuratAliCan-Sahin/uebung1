// Implementierung nicht wichtig, für Sie interessant sind nur die öffentlichen Methoden.
import java.util.Random;

public class Ergebnis {
  private String name;
  private Zeit zeit;
  
  private static Random r = new Random();
  
  public Ergebnis() {
    name = "Name" + r.nextInt(1000);
    zeit = new Zeit(r.nextInt(10000));
  }
  
  public String getName() {
    return name;
  }
  
  public Zeit getZeit() {
    return zeit;
  }
  
  @Override
  public String toString() {
    return "Ergebnis: " + name + " " + zeit;
  }
}
