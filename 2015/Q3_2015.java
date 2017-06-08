import java.util.*;
public class Q3_2015 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in="";
        int i;        
        //Accepting String in UPPERCASE
        System.out.println("");
        in = sc.nextLine();
        in = in.toUpperCase();

        try {
            int lastpos = in.length()-1;
            if(in.charAt(lastpos)=='.'||in.charAt(lastpos)=='?'){
                StringTokenizer st = new StringTokenizer(in," .?");
                int N = st.countTokens();
                String arr[] = new String[N]; 
                //Array with individual Words as elements          
                for (i=0;i<N;i++){
                    arr[i] = st.nextToken();
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