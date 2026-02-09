import java.util.ArrayList;
import java.util.List;

public class Extra {

    public static void main(String[] args) {
        int[][] intArray = { { 1, 2, 3 }, { 4, 6 }, { 7, 8, 9 } };

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(5);
        intList.add(6);
        intList.add(3);

        System.out.println(findIndex(intList, 3));

        int rowIndex = -1;
        int colIndex = -1;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (intArray[i][j] == 8) {
                    rowIndex = i;
                    colIndex = j;
                    break;
                }
            }
        }

        System.out.println(colIndex);
        System.out.println(rowIndex);
    }

    public static int findIndex(List<Integer> ints, int num) {
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) == num) return i;
        }

        return -1;
    }
}
