import java.util.*;
public class Q3_2017 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String in="",ns="";        
        int i,L=0;
        //Accepting string as in
        System.out.println("");
        in = sc.nextLine();
        L = in.length();

        try {
            //Check if Valid Input
            if(L>3&&L<100){                
                for(i=0;i<L;i++){
                    char a = in.charAt(i);
                    int na = a;
                    char b;
                    //Actual rotation of elements
                    if(na>=65&&na<=77){//For A-M
                        b = (char)(a+13);
                    }else if(na>=78&&na<=90){//For N-Z
                        b = (char)(a-13);
                    }else if(na>=97&&na<=109){//For a-m
                        b = (char)(a+13);
                    }else if(na>=110&&na<=122){//For n-z
                        b = (char)(a-13);
                    }else if(na==32||na==46){//For ' ' and '.'
                        b=a;
                    }else{//For every thing else
                        b='?';
                    }
                    //catenating individual char to make String
                    ns += b;
                }
                //Printing the cipher text
                System.out.println("The cipher text is:");
                System.out.println(ns);
            }else{
                System.out.println("INVALID LENGTH");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("INVALID INPUT");
        }        
        
    }

} 