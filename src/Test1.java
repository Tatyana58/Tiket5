
/* In this program we are checking the Student age
 * if the student age<12 and weight <40 then our program
 * should return that the student is not eligible for registration.
 */
public class Test1 {
    static void checkEligibilty(int stuAge, int stuWeight){
        if(stuAge<12 && stuWeight<45) {
            throw new ArithmeticException("Student is not eligible for registration");
        }
      else {
            System.out.println("Student Entry is Valid!!");
        }
    }
    public static void main(String args[]){
        System.out.println("Welcome to the Registration process!!");
        checkEligibilty(10, 40);
        System.out.println("Have a nice day..");
    }
}

