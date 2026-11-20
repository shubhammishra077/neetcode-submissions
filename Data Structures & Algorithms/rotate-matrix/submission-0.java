class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
       } 
       for(int row=0;row<n;row++){
        int startCol=0;
        int endCol=n-1;
        while(startCol<=endCol){
            int temp=matrix[row][startCol];
            matrix[row][startCol]=matrix[row][endCol];
            matrix[row][endCol]=temp;
            startCol++;
            endCol--;
        }
       }
    }
}
