import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2,ekok, smallNum;
        int ebob = 1;


        System.out.print(" enter n1 :");
        n1 = input.nextInt();
        System.out.print("enter n2 :");
        n2 = input.nextInt();

        if(n1<n2){
            smallNum =n1;

        }else{
            smallNum =n2;
        }
        int i = smallNum;
        while(i>=1){
            if(n1%i == 0 && n2%i==0){
                ebob =i;
                System.out.println("ebob :" + ebob);
                ekok =(n1*n2)/ebob;
                System.out.println("ekok :" + ekok);
                break;
            }else{
                i--;
            }
        }

            }

        }




