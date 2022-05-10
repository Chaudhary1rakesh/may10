import java.util.Scanner;

// import javax.sql.rowset.spi.SyncFactory;
public class day2 {
    //WAP to input hour(24 hour format) and print good morning(<12) /
    // good afternoon(<=16) / good evening(<=20) / good night.
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any time:");
      int n=sc.nextInt();
      if(n<12)
      {
          System.out.println("good morning");
      }
      else if(n>=12&&n<=16)
      {
          System.out.println("good afternoon");
      }
      else if(n>16&&n<=20)
      {
          System.out.println("good evening");
      }
      else if(n>20&&n<=24)
      {
          System.out.println("good night");
      }
      else 
      {
          System.out.println("invailid time zone")
      }
    }
}
