import java.util.Scanner;
class StrongNumber
{   
    public static int fact(int n){
        int prod=1;
        while(n>1){
            prod=prod*n;
            n--;
        }
        return prod;
    }
    public static boolean isStrong(int x){
        int sum=0;
        int temp=x;
        do{
            int d=x%10;
            sum=sum+fact(d);
             x= x/10;
        }while(x!=0);
        return sum==temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :-");
        int num = sc.nextInt();

        boolean rs=isStrong(num);
        if(rs==true)
            System.out.println("strong number");
        else 
            System.out.println("not a strong number");    
    }
}
