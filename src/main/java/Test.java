import java.util.*;

public class Test {

    public static void main(String[] args) {
       // System.out.println("ab");
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Set<Integer> notPrime =new HashSet<>();
        Set<Integer> prime =new HashSet<>();
        for(int i=0;i<l1.size();i++){
            int count =0;
            for(int j=2;j<l1.get(i);j++){
                if(l1.get(i)%j == 0){
                    count += 1;
                    notPrime.add(l1.get(i));
                }
            }
            if(count ==0){
                prime.add(l1.get(i));
            }
        }
        prime.remove(1);
        System.out.println("not prime"+ notPrime);
        System.out.println(" prime"+ prime);
    }
}
