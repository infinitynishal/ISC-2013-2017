import java.util.*;
public class Q1_2015
{
    public void find(int m,int n){
        int temp = m+1,rem,sum=0; 
        while(true){
            int temp2=temp;
            rem=0;sum=0;
            while(temp2!=0){                
                rem=temp2%10;
                sum+=rem;
                temp2=temp2/10;
            }
            if(sum==n){
                System.out.println("The required number is= "+temp);
                System.out.println("Total number of digits= "+((int) Math.log10(temp) + 1));
                break;
            }else{
                temp++;
            }
        }        
    } 
    public void main(){
        Scanner sc = new Scanner(System.in);
        int M,N;
        System.out.print("M= ");
        M=sc.nextInt();
        System.out.print("N= ");
        N=sc.nextInt();
        
        if((M>=100&&M<=10000)&&(N<100)){
            find(M,N);
        }else{
            System.out.println("INVALID INPUT");
        }
    }
}
