import java.util.*;
public class Q3_2016 {
    public boolean vowelChecker(String s){
        char fc,lc;//First Char & Last Char
        int len = s.length();//String Length
        fc = s.charAt(0);
        lc = s.charAt(len-1);
        //Check if the string begins and ends with a vowel
        if((fc=='A'||fc=='E'||fc=='I'||fc=='O'||fc=='U')&&(lc=='A'||lc=='E'||lc=='I'||lc=='O'||lc=='U')){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Q3_2016 ob = new Q3_2016();
        Scanner sc = new Scanner(System.in);
        String in="",first="",second="",resent ="";
        //Validate,counter & loop variable
        int i,count=0;
        boolean valid = false;        
        //Accepting String in UPPERCASE
        System.out.println("");
        in = sc.nextLine();
        in = in.toUpperCase();

        try {
            int lastpos = in.length()-1;
            if(in.charAt(lastpos)=='.'||in.charAt(lastpos)=='!'||in.charAt(lastpos)=='?'){
                StringTokenizer st = new StringTokenizer(in," .?!");
                int N = st.countTokens();
                String arr[] = new String[N];  
                //Array with individual Words as elements          
                for(i=0;i<N;i++){
                    arr[i] = st.nextToken();
                }
                //Check individual elements
                for(i=0;i<N;i++){
                    valid = false;
                    valid = ob.vowelChecker(arr[i]);
                    /*Create 
                    first = string consists of words with vowel at start and end
                    last = all other words in input order
                    */
                    if(valid==true){
                        count++;
                        first = first.concat(arr[i]+" ");
                    }else{
                        second = second.concat(arr[i]+" ");
                    }
                } 
                //Join the two strings to make sentence
                resent=first+second;
                //OUTPUT
                System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = "+count);    
                System.out.println(resent);  
            }else{
                System.out.print("INVALID INPUT");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.print("INVALID INPUT");
        }        
        
    }

} 