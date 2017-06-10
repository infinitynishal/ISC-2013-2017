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
                int B[][] = new int[M][M];
                int x=0,y=0;
                for(i=M-1;i>=0;i--){
                        for(j=0;j<M;j++){
                            B[x][y] = A[i][j];
                            x++;
                        }y++;x=0;
                }
                //Printing Rotated Array
                System.out.println("\nMATRIX AFTER ROTATION");
                for(i=0;i<M;i++){
                        for(j=0;j<M;j++){
                            System.out.print(B[i][j]+"\t");
                        }
                        System.out.println("");
                }
                //Finding Sum of corner elements
                sum = B[0][0]+B[0][M-1]+B[M-1][0]+B[M-1][M-1];
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
