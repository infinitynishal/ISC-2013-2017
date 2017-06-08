import java.util.*;
public class Q1_2017 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N,i;
        //Accept N as Input
        System.out.println("");
        System.out.print("N= ");
        N = sc.nextInt();
        int temp = N;

        try {
            //check give condition
            if(N<=1000){
                int total_count=0;
                //Finding Number of Cartons
                for(i=48;i>=6;i/=2){                    
                        if(N>=i&&N%i>=0){
                            int count = 0;
                            count += N/i;                            
                            N -= i*count;
                            System.out.printf("%-25s%2d%3s%2d%3s%4d%n","",i," x ",count," = ",i*count);
                            //System.out.println(i+" x "+count+" = "+i*count);
                            total_count += count;
                        }                  
                    }
                    //Final 3 lines change depending on remainder                    
                    if(N>0){
                        System.out.printf("%-25s%2d%3s%2d%3s%4d%n","Remaining Boxes",N," x ",1," = ",N);
                        System.out.printf("%-25s%2s%3s%2s%3s%4d%n","Total number of Boxes","","",""," = ",temp);
                        System.out.printf("%-25s%2s%3s%2s%3s%4d%n","Total number of cartons","","",""," = ",(total_count+1)); 
                    }else{
                        System.out.printf("%-25s%2s%3s%2s%3s%4d%n","Remaining Boxes","","",""," = ",N);
                        System.out.printf("%-25s%2s%3s%2s%3s%4d%n","Total number of Boxes","","",""," = ",temp);
                        System.out.printf("%-25s%2s%3s%2s%3s%4d%n","Total number of cartons","","",""," = ",(total_count));
                    }                
            }else{
                System.out.println("INVALID INPUT");
            }            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("INVALID INPUT");
        }        
        
    }

} 