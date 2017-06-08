import java.util.*;
public class Q2_2016 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M,i,j,diag_sum=0,temp=0;        
        //Accept M
        System.out.println("");
        System.out.print("M=");
        M = sc.nextInt();
        try {
            //Check requirement and create Array
            if(M>3&&M<10){
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
                //Convert inner elements of 2D array to 1D array
                int c=0,size = ((M-2)*(M-2));
                int S[] = new int[size];                
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        if(i==0 || j==0 || i == M-1 || j == M-1){}else{
                            S[c] = A[i][j];
                            c++;
                        }
                    }
                }
                //Sort the 1D array
                for(i=0;i<size-1;i++){
                    for(j=i+1;j<size;j++){
                        if (S[i]>S[j]) {
                            temp = S[i];
                            S[i] = S[j];
                            S[j] =temp;
                        }                        
                    }
                }
                //convert 1D array back to 2D
                c=0;
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        if(i==0 || j==0 || i == M-1 || j == M-1){}else{
                            A[i][j] = S[c];
                            c++;
                        }
                    }
                }
                //Output rearranged Array  
                System.out.println("\nREARRANGED MARIX\n"); 
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        System.out.print(A[i][j]+"\t");
                    }
                    System.out.println("");
                }
                //Calculate sum and display diagonal elements 
                System.out.println("\nDIAGONAL ELEMENTS\n");
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        if(i==j||i+j==M-1){
                            System.out.print(A[i][j]+"\t");
                            diag_sum += A[i][j];
                        }else{
                            System.out.print(" \t");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("SUM OF THE DIAGONAL ELEMENTS = "+diag_sum);                      
            }else{
                System.out.println("THE MATRIX IS OUT OF RANGE");
            } 
        } catch (Exception e) {
            //TODO: handle exception
            System.out.print("INVALID INPUT");
        }        
        
    }

} 