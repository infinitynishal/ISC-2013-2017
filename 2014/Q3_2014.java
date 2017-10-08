import java.util.*;
public class Q3_2014 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //initialize variables
        String in="",word_delete="",mod_sentence="";
        int i,pos=0;
        char lch;//last character        
        //Accepting String in UPPERCASE
        System.out.println("");
        in = sc.nextLine();
        in = in.toUpperCase();

        try {
            int lastpos = in.length()-1;
            lch = in.charAt(lastpos);
            //Check if the last char is valid
            if(lch=='.'||lch=='!'||lch=='?'){
                StringTokenizer st = new StringTokenizer(in," .?!");
                int N = st.countTokens();
                String arr[] = new String[N]; 
                //Array with individual Words as elements          
                for (i=0;i<N;i++){
                    arr[i] = st.nextToken();
                }
                //Accepting word to be deleted and its position
                System.out.print("\nWORD TO BE DELETED : ");
                word_delete = sc.next();
                System.out.print("\nWORD POSITION IN THE SENTENCE : ");
                pos = sc.nextInt();
                pos -= 1;
                //Check if user entered valid position
                if(pos>=0||pos<N){
                    //Printing out the modified sentence
                    for (i=0;i<N;i++){
                        if((i==pos)&&(arr[pos].equals(word_delete))){

                        }else{
                            mod_sentence += (arr[i]+" ");
                        }
                    }
                    System.out.println(mod_sentence.trim()+lch);
                }else{
                    System.out.println("INVALID POSITION");
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