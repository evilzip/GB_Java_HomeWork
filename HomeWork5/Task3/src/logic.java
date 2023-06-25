//В этом классе создаются три метода:
//создание шахматной доски
//Отмечаются все битые поля ферзем расположенным на заданном поле
//проверка заданного поля - бито или нет


public class logic {

    private static int[][] chessBoard = new int[8][8];

    //Создание пустой доски в вииде двумерного массива. Не битые поля (элеметны массива) задаем нулями.
    public static void emptyBoard() {
        //приравниваем 0.
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j] = 0;
            }
        }
    }

    //Отмечаем какие поля бьются ферзем установленным на поле с координатами posHorizontal,posVertical. В массие эти
    //элементы приравниваем к 1.
    public static void newFerz(int posHorizontal, int posVertical) {
        for (int i = 0; i < 8; i++) {
            chessBoard[i][posVertical] = 1;
        }
        for (int j = 0; j < 8; j++) {
            chessBoard[posHorizontal][j] = 1;
        }
        int h = posHorizontal;
        int v = posVertical;
        while (h < 8 & v < 8) {
            chessBoard[h][v] = 1;;
            h++;v++;
        }
        h = posHorizontal;
        v = posVertical;
        while (h >= 0 & v >= 0) {
            chessBoard[h][v] = 1;
            h--;
            v--;
        }
        h = posHorizontal;
        v = posVertical;
        while (h < 8 & v >= 0) {
            chessBoard[h][v] = 1;;
            h++;
            v--;
        }
        h = posHorizontal;
        v = posVertical;
        while (h >= 0 & v < 8) {
            chessBoard[h][v] = 1;;
            h--;
            v++;
        }
    }
    //метод проверят, является поле с координатами posHorizontal, posVertical битым на данный момент
    public static boolean isCellKilled(int posHorizontal, int posVertical){
        boolean flag = false;
        if (chessBoard[posHorizontal][posVertical]==1){
            flag = true;
        }
        return flag;
    }
    public static void printBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" "+ chessBoard[i][j]);
            }
            System.out.print("\n");
        }
    }
}
