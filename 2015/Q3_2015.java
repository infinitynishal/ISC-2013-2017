import java.util.*;

import javax.print.DocFlavor.CHAR_ARRAY;
public class Q3_2015 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in="";
        int i;        
        //Accepting String
        System.out.println("");
        in = sc.nextLine();

        try {
            int lastpos = in.length()-1;
            char last = in.charAt(lastpos);
            if(last=='.'||last=='?'){
                StringTokenizer st = new StringTokenizer(in," .?");
                int N = st.countTokens();
                String arr[] = new String[N]; 
                //Array with individual Words as elements          
                for (i=0;i<N;i++){
                    arr[i] = st.nextToken();
                }
                //Convert the first letter of each word to uppercase          
                for (i=0;i<N;i++){
                    String is = arr[i];//initial string
                    int len = is.length();
                    char ch = is.charAt(0);
                    ch = Character.toUpperCase(ch);
                    //create new string with first char in UPPERCASE
                    String ns = (ch+"").concat(is.substring(1));
                    arr[i]=ns;
                }
                //Print the changed sentence
                for (i=0;i<N;i++){
                    System.out.print(arr[i]+" ");
                }System.out.print(last);

            }else{
                System.out.println("INVALID INPUT");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("INVALID INPUT");
        }        
        
    }

} 