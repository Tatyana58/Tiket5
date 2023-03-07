import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> mas = new ArrayList<>();
        List<Integer> masEven = new ArrayList<>();
       mas.add(2);
       mas.add(15);
       mas.add(8);
       mas.add(9);
       mas.add(7);
       mas.add(12);
       mas.add(10);
       mas.add(3);
        for (int i=0; i < mas.size(); i++) {
            masEven.add(increasesEvenNumber(mas.get(i)));
            System.out.println(increasesEvenNumber(mas.get(i)));
        }
        System.out.println(mas.subList(2, 6));
        System.out.println(masEven.subList(2, 6));
    }
    public static int increasesEvenNumber (int number){
        if (number % 2 == 0) {
            number++;
        } else {
            return number;
        }
      return number;
    }
}