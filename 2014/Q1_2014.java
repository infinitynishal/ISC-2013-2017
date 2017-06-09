import java.util.*;
public class Q1_2014 {
    //Composite Number function
    public boolean compnum(int c){
        int i,count = 0;
        for(i=1;i<=c;i++){
            if(c%i==0){
                count++;
            }
        }
        if(count>2){
            return true;
        }else{
            return false;
        }
    }
    //Magic Number Function
    public boolean magicnum(int num){
        while(num>9){
            int sum=num,s=0;
            while(sum!=0)
            {
                s=s+(sum%10);
                sum=sum/10;
            }
            num=s;
        }
        if(num==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q1_2014 ob = new Q1_2014();
        int m=0,n=0,i;

        System.out.println("");
        System.out.print("m=");
        m = sc.nextInt();
        System.out.print("n=");
        n = sc.nextInt();

        try {
            //Check required condition
           if (m<n){
               int count=0;
               System.out.println("THE COMPOSITE MAGIC INTEGERS ARE :");
               //Check every number
                for(i=m;i<=n;i++){
                    //Evaluate Composite Magic integer
                    if(ob.compnum(i)==true&&ob.magicnum(i)==true){
                        if(count==0){
                            System.out.print(i);
                        }else{
                            System.out.print(","+i);
                        }                        
                        count++;
                    }
                }
                System.out.println("\nFREQUENCY OF COMPOSITE MAGIC INTEGERS IS :"+count);
            }else{
                System.out.println("INVALID INPUT");
            }             
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("INVALID INPUT");
        }        
        
    }

} 