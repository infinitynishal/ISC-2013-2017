import java.util.*;
public class Q2_2015
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M,i,j,sum=0;
        System.out.print("M= ");
        M=sc.nextInt();
        
        try {
            if(M>2&&M<10){
                int A[][] = new int[M][M];
                //Accepting Array elements
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        A[i][j] = sc.nextInt();
                    }
                }
                //Printing Original Array
                System.out.println("ORIGINAL MATRIX");
                for(i=0;i<M;i++){
                    for(j=0;j<M;j++){
                        System.out.print(A[i][j]+"\t");
                    }
                    System.out.println("");
                }
                //Rotating Array
                for(i=0;i<M;i++){
                        for(j=0;j<M;j++){
                            int temp=0; 
                            temp = A[i][j];
                            A[i][j] = A[j][M-1-i];
                            A[j][M-1-i] = temp;
                        }
                }
                //Printing Rotated Array
                System.out.println("\nMATRIX AFTER ROTATION");
                for(i=0;i<M;i++){
                        for(j=0;j<M;j++){
                            System.out.print(A[i][j]+"\t");
                        }
                        System.out.println("");
                }
                //Finding Sum of corner elements
                sum = A[0][0]+A[0][M-1]+A[M-1][0]+A[M-1][M-1];
                System.out.println("\nSum of the corner eements= "+sum);
            }else{
                System.out.println("SIZE OUT OF RANGE");
            }            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("INVALID INPUT");
        }        
    }
}
