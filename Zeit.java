import java.util.Collections;

// Implementierung nicht wichtig, für Sie interessant sind nur die öffentlichen Methoden.
public class Zeit implements Comparable<Zeit> {
  private int sekunden;
  
  public Zeit(int s) {
    sekunden = s;
  }
  
  @Override
  public String toString() {
    return sekunden + " Sekunden";
  }
  
  @Override
  public int compareTo(Zeit other) {
    return Integer.compare(this.sekunden, other.sekunden);
  }
}
