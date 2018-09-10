import java.util.Scanner;

class Adder
{
static Scanner sc = new Scanner(System.in);

public static void main(String[] args) 
  {
    System.out.print("Enter No.1 =>");
    int x = sc.nextInt();
    System.out.print("Enter No.2 =>");
    int y = sc.nextInt();

    int z = x+y;
    System.out.println(z);
  }
}
