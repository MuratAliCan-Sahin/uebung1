import java.util.List;
public class Streamtest{
    public static int compute(List<Integer>  ns, int k){
        return ns.stream()
                .filter(x -> x%2==0)
                .filter (x -> x>5)
                .map(x-> x*x)
                .limit(k)
                .reduce(0,  (x,y) -> x+y);
    }
    public static void main (String []  args){
        List<Integer>  test =  List.of(3,5,11,8,10,4,23);
        System.out.println(compute(test,5));
   
    }
}