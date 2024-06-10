package abstractcomponents;

public class java_basics {


    public static void main(String[] args) {


        int l = 0;

        for (int i = 4; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                l++;

                System.out.print(l + " ");
            }

            System.out.println();

        }


        int m = 0;

        for (int i = 1; i <= 4; i++) {

            for (int j = 0; j < i; j++) {

                m++;

                System.out.print(m + " ");
            }

            System.out.println();

        }


        for (int i = 1; i <= 4; i++) {

            int r = 0;
            for (int j = 0; j < i; j++) {

                r++;
                System.out.print(r + " ");

            }

            System.out.println();

        }







        int abc[][] = {{2,4,7},{9,12,17},{1,-6,90}};
        int minNumber = abc[0][0];
        int k = 0;
        int maxNumberInSameColumn = abc[0][k];

        for(int i = 0; i < abc.length; i++)
        {
            for(int j = 0; j < abc[i].length; j++) {

                if(abc[i][j] < minNumber) {
                    minNumber = abc[i][j];
                     k = j;
                }
                int c = 0;
                while(c < abc.length) {

                    if(maxNumberInSameColumn < abc[c][k]) {
                        maxNumberInSameColumn = abc[c][k];
                    }
                    c++;
                }
            }
        }

        System.out.println(minNumber);
        System.out.println(maxNumberInSameColumn);



        int array[][] = {{3,7,9,4}, {2,7,14,26, 5657}, {12,52,7,99}};
        int maxNumber = array[0][0];

        for(int i = 0;i < array.length; i++) {

            for(int j = 0; j < array[i].length; j++) {

                if(array[i][j] > maxNumber) {
                    maxNumber = array[i][j];
                }
            }
        }
        System.out.println(maxNumber);

    }
}