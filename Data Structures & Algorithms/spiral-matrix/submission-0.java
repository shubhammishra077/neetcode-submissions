class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      int m=matrix.length;
      int n=matrix[0].length;

      int startRow=0;
      int endRow=m-1;
      int startCol=0;
      int endCol=n-1;

      List<Integer> res=new ArrayList<>();

      while(startRow<=endRow && startCol<=endCol){
        for(int col=startCol;col<=endCol;col++){
            res.add(matrix[startRow][col]);
        }
         startRow++;
        for(int row=startRow;row<=endRow;row++){
            res.add(matrix[row][endCol]);
        }
        endCol--;
        if(startRow<=endRow){
        for(int col=endCol;col>=startCol;col--){
            res.add(matrix[endRow][col]);
        }
        endRow--;
        }
        if(startCol<=endCol){
        for(int row=endRow;row>=startRow;row--){
            res.add(matrix[row][startCol]);
        }
        startCol++;
        }
      }
    return res;
    }
}
