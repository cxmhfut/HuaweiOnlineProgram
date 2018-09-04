package huawei.huawei_066_070;

/**
 * 矩阵乘法计算量估算
 */
public class Huawei_070 {
    public static class Matrix {
        int row;
        int col;

        Matrix(int row, int col) {
            this.row = row;
            this.col = col;
        }

        Matrix mutiply(Matrix matrix) {
            return new Matrix(row, matrix.col);
        }

        int getMutiplyCount(Matrix matrix) {
            return row * col * matrix.col;
        }
    }

    public static void matrixMutiplyCount(){

    }
}
