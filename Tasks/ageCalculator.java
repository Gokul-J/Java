import java.time.*;
import java.util.Scanner;

public class ageCalculator {

    static void calculator(int year,int month,int date, LocalDate today){
        //LocalDate today = LocalDate.now();                    //Today's date
        LocalDate birthday = LocalDate.of(year, month, date);  //Birth date
 
        Period p = Period.between(birthday, today);
 
        //Now access the values as below
        System.out.print("Your are "+p.getYears()+ " Years ");
        System.out.print(p.getMonths()+" Months ");
        System.out.print(p.getDays()+" Days old.");
    }
    public static void main(String[] args){
        System.out.print("Enter the DOB in YYYY MM DD : ");
        Scanner s = new Scanner(System.in);
        String dob = s.nextLine();
        s.close();
        
        String digit[] = dob.split(" ");
        /*for(int i=0;i<3;i++){
            System.out.println(digit[i]); }*/
        int year = Integer.parseInt(digit[0]);
        int month = Integer.parseInt(digit[1]);
        int date = Integer.parseInt(digit[2]);

        LocalDate today = LocalDate.now(); 
        //int currentyear = today.getYear();
        calculator(year,month,date,today);
        /*if(year<=currentyear && month<=12 && date<=31){
            calculator(year,month,date,today);
        }
        else{
            System.out.println("Invalid Data");
        }*/
    }
}