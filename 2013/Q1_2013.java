import java.util.*;
public class Q1_2013 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in="";
        int i,sum=0;
        int arr[] = new int[10];

        System.out.println("");
        System.out.print("INPUT CODE : ");
        in = sc.nextLine();

        try {
            //Check if Valid Input
            if(in.length()!=10){
                System.out.print("INVALID INPUT");
            }else{
                //Create an Array
                for(i=0;i<9;i++){            
                    int num = Integer.parseInt(String.valueOf(in.charAt(i)));
                    arr[i]=num;
                }
                //Replace X with 10 if exists
                if(in.charAt(9)=='X'){
                    arr[9] = 10;
                }else{
                    arr[9] = Integer.parseInt(String.valueOf(in.charAt(9)));
                }
                //Calculate Sum
                for(i=10;i>0;i--){
                        sum = sum + (arr[Math.abs(i-10)]*i);            
                }
                System.out.println("SUM ="+sum);
                //Check if code is Valid/Invalid
                if(sum%11==0){
                    System.out.println("LEAVES NO REMAINDER – VALID ISBN CODE");
                }else{
                    System.out.println("LEAVES REMAINDER – INVALID ISBN CODE");
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.print("INVALID INPUT");
        }        
        
    }

} 