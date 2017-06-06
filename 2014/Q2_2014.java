import java.util.*;
public class Q2_2014 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M,i,j,sum_left=0,sum_right=0;
        boolean symmetric = true;
        //Accept M
        System.out.println("");
        System.out.print("M = ");
        M = sc.nextInt();

        try {
            //Check requirement and create Array
            if(M>2&&M<10){
                int A[][] = new int[M][M];
                //Input Array 
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        A[i][j]= sc.nextInt();
                    }
                }
                //Output Original Array  
                System.out.println("\nORIGINAL MARIX\n"); 
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        System.out.print(A[i][j]+"\t");
                    }
                    System.out.println("");
                }
                //Check if Array is symmetric   
                for(i=0;i<M;i++){
                    for(j=0;j<M-1;j++){
                        if(A[i][j]!=A[j][i]){
                            symmetric = false;                            
                        }
                    }
                }
                //Display appropriate message
                if(symmetric==true){
                    System.out.println("\nTHE GIVEN MATRIX IS SYMMETRIC\n"); 
                }else{
                    System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC\n");
                } 
                //Calculate and display sum of left Diagonal 
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        if(i==j){
                            sum_left += A[i][j];
                        }
                    }
                }
                System.out.println("The sum of the left diagonal = "+sum_left); 
                //Calculate and display sum of right Diagonal
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        if(i+j==M-1){
                            sum_right += A[i][j];
                        }
                    }
                }
                System.out.println("The sum of the right diagonal = "+sum_right);       
            }else{
                System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
            } 
        } catch (Exception e) {
            //TODO: handle exception
            System.out.print("INVALID INPUT");
        }        
        
    }

} 