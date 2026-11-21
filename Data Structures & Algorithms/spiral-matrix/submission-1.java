class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer>li=new ArrayList<>();
    int m=matrix.length;
    int n=matrix[0].length;

    int startRow=0;
    int endRow=m-1;
    int startCol=0;
    int endCol=n-1;

    while(startCol<=endCol && startRow<=endRow){
        for(int col=startCol;col<=endCol;col++){
            li.add(matrix[startRow][col]);
        }
        startRow++;
        for(int row=startRow;row<=endRow;row++){
            li.add(matrix[row][endCol]);
        }
        endCol--;
        if(startRow<=endRow){
        for(int col=endCol;col>=startCol;col--){
            li.add(matrix[endRow][col]);
        }
        endRow--;
        }
    if(startCol<=endCol){
    for(int row=endRow;row>=startRow;row--){
        li.add(matrix[row][startCol]);
    }
    startCol++;
    }
    }
    return li;
    }
}
