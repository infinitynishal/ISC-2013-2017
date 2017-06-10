import java.util.*;
public class Q1_2015
{
    //function to find required number
    public void find(int m,int n){
        int temp = m+1,rem,sum=0; 
        while(true){
            int temp2=temp;
            //adding individual digits
            rem=0;sum=0;
            while(temp2!=0){                
                rem=temp2%10;
                sum+=rem;
                temp2=temp2/10;
            }
            //check if digits add up to n
            if(sum==n){
                System.out.println("The required number is= "+temp);
                System.out.println("Total number of digits= "+((int) Math.log10(temp) + 1));
                break;
            }else{
                temp++;
            }
        }        
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q1_2015 ob = new Q1_2015();
        //Accept M&N as inputs
        int M,N;
        System.out.print("M= ");
        M=sc.nextInt();
        System.out.print("N= ");
        N=sc.nextInt();
        //Check required conditions
        if((M>=100&&M<=10000)&&(N<100)){
            ob.find(M,N);
        }else{
            System.out.println("INVALID INPUT");
        }
    }
}
