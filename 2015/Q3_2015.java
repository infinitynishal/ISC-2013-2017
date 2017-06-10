import java.util.*;
public class Q3_2015 {
    //Function to count and return number of vowels
    public int vowelCount(String s){
        int i,count = 0,len = s.length();
        char ch;
        for(i=0;i<len;i++){
            ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q3_2015 ob = new Q3_2015();
        String in="",mod_sentence="";
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
                    arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);                    
                }
                //Print the changed sentence
                for (i=0;i<N;i++){
                    mod_sentence += (arr[i]+" ");
                }
                System.out.println(mod_sentence.trim()+last);
                //Print word-vowel-consonant table
                System.out.printf("%-18s%10s%13s%n","Word","Vowels","Consonants");
                for (i=0;i<N;i++){
                    int vow = ob.vowelCount(arr[i]);
                    int cons = arr[i].length() - vow;
                    System.out.printf("%-18s%10d%13d%n",arr[i],vow,cons);
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