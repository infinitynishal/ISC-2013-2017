import java.util.*;
public class Q1_2016 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N,i;
        boolean flag = true;
        //Accept N as Input
        System.out.println("");
        System.out.print("N= ");
        N = sc.nextInt();
        int temp = N;

        try {
            //check basic condition
            if(N>1){
                do{
                    System.out.println(N);
                    //Prime checker
                    int count =0;
                    for(i=1;i<=N;i++){
                        if(N%i==0){
                            count++;
                        }
                    }
                    //Set flag for circular prime
                    if(count>2){
                        flag = false;
                    }                    
                    /*Cyclic Shift of Digits
                    cs - int to string
                    fcs - first char to string
                    ncs - new char string
                    */
                    String cs = ""+N;
                    String fcs = ""+cs.charAt(0);
                    String ncs = "";
                    for(i=1;i<cs.length();i++){
                        ncs += cs.charAt(i);
                    }
                    ncs = ncs.concat(fcs);
                    N = Integer.parseInt(ncs);                                        
                }while(N!=temp);
                //Print if number is Circular prime or not
                if(flag==true){
                    System.out.println(temp +" IS A CIRCULAR PRIME");
                }else{
                    System.out.println(temp +" IS NOT A CIRCULAR PRIME");
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