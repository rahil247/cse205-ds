import java.util.ArrayList;
import java.util.List;

public class Q54 {
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> l = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol) {
            
            for (int j = startCol; j <=endCol ; j++) {
                l.add(matrix[startRow][j]);
            }

            for (int i = startRow+1; i <= endRow ; i++) {
                
                l.add(matrix[i][endCol]);
            }

            for (int j = endCol-1; j >= startCol ; j--) {
                
                if (startRow == endRow) {
                    break;
                }

                l.add(matrix[endRow][j]);
            }

            for (int i = endRow-1; i >= startRow+1 ; i--) {

                if (startCol == endCol) {
                    break;
                }
                
                l.add(matrix[i][startCol]);
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;  
            
        }
        return l;
    }
}
}
