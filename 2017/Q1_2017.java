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
                            System.out.println(i+" x "+count+" = "+i*count);
                            total_count += count;
                        }                  
                    }
                    //Final 3 lines change depending on remainder                    
                    if(N>0){
                        System.out.println("Remaining Boxes \t "+N +" x 1 = "+N);
                        System.out.println("Total number of Boxes \t= "+temp);                  
                        System.out.println("Total number of cartons \t= "+(total_count+1));
                        
                    }else{
                        System.out.println("Remaining Boxes \t= "+N);
                        System.out.println("Total number of Boxes \t= "+temp);
                        System.out.println("Total number of cartons \t= "+total_count);
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