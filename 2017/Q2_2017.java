import java.util.*;
public class Q2_2017 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N,i,j;
        //Accept N
        System.out.println("");
        System.out.print("N = ");
        N = sc.nextInt();

        try {
            //Check Arguments and create Array
            if(N>3&&N<11){
                String A[][] = new String[N][5];
                String K[] = new String[5];
                int S[] = new int[N];
                int highCount = 0;
                //Input Particpant Array 
                for(i=0;i<N;i++){
                    System.out.print("\nParticipant "+(i+1)+" ");
                    for(j=0;j<5;j++){
                        A[i][j]= sc.next();
                    }
                }
                //Input key array
                System.out.print("\nKey : ");
                for(j=0;j<5;j++){
                        K[j]= sc.next();
                }
                //Check each participant
                for(i=0;i<N;i++){
                    int count=0;                    
                    for(j=0;j<5;j++){
                        if(A[i][j].equals(K[j])){
                            count++;
                        }
                    }
                    S[i] = count;
                    if(count>highCount){highCount=count;}
                }
                //Display results
                System.out.println("Scores:");
                for(j=0;j<N;j++){
                    System.out.print("\nParticipant "+(j+1)+" = "+S[j]);
                }
                //Display Highest scorers
                System.out.print("\nHighest Score:");
                for(j=0;j<N;j++){
                    if(S[j]==highCount){
                        System.out.print("Participant "+(j+1)+"\n");
                    }
                }       
            }else{
                System.out.println("INPUT SIZE OUT OF RANGE");
            } 
        } catch (Exception e) {
            //TODO: handle exception
            System.out.print("INVALID INPUT");
        }        
        
    }

} 