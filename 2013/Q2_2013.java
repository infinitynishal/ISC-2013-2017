import java.util.*;
public class Q2_2013 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M,i,j;
        //Accept M
        System.out.println("");
        System.out.print("M = ");
        M = sc.nextInt();

        try {
            //Check Arguments and create Array
            if(M>2&&M<20){
                int A[][] = new int[M][M];
                //Input Array 
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        A[i][j]= sc.nextInt();
                    }
                }
                //Output Original Array  
                System.out.println("ORIGINAL MARIX \n"); 
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        System.out.print(A[i][j]+"\t");
                    }
                    System.out.println("");
                }
                //Transforming into Mirror Array   
                for(i=0;i<M;i++){
                    for(j=0;j<M-1;j++){
                        int temp = A[i][j];
                        A[i][j] = A[i][((M-1)-j)];
                        A[i][((M-1)-j)] = temp;
                    }
                } 
                //Output Mirror Array  
                System.out.println("MIRROR IMAGE MARIX \n"); 
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        System.out.print(A[i][j]+"\t");
                    }
                    System.out.println("");
                }       
            }else{
                System.out.println("SIZE OUT OF RANGE");
            } 
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("INVALID INPUT");
        }        
        
    }

} 