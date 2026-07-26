public class ArraysEx {
    public static void main(String[] args) {
          int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]);
    for (int i = 0; i < 4; i++) { // i=2 2<3 3
            for (int j = 0; j < 3; j++) { // j=2 2<3 3
                System.out.print(myNumbers[i][j] + " "); //arrr[0][0] arrr[0][1] arrr[0][2]
            }                                       ////arrr[1][0] arrr[1][1] arrr[1][2]
                                                    ////arrr[2][0] arrr[2][1] arrr[2][2]
            System.out.println();

}
// }
    }}