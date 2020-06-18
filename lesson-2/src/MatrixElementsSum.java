public class MatrixElementsSum {
    public static void main(String[] args) {
        String[][] array = new String[][] {
                {"2", "4", "0", "-3"},
                {"5", "5", "1", "0"},
                {"2", "4", "0", "-3"},
                {"0", "2", "3", "4"},
        };
        try {
            System.out.println(String.format("Matrix elements sum: %d",matrixSum(array)));
        } catch (MyArraySizeException e) {
            System.out.println("Wrong array size!");
        } catch (MyArrayDataException e) {
            System.out.println(String.format("Illegal element in array: row %d, column %d", e.getRow(), e.getColumn()));
        }
    }

    public static int matrixSum(String[][] strings) throws MyArraySizeException, MyArrayDataException{
        if (strings.length != 4) {
            throw new MyArraySizeException("Wrong array size!");
        }
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length != 4) {
                throw new MyArraySizeException("Wrong array size!");
            }
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends NumberFormatException {
    private int row;
    private int column;

    public MyArrayDataException(int i, int j) {
        super(String.format("Illegal element in array: row %d, column %d", i, j));
        row = i;
        column = j;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}