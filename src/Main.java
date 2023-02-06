public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main.copyArray();



    }
    private static int multiDimArray() {
        int[] measurments, testseries [], threDimMatrix[][]; // Array of int, Array of Array of int, Array of Array of Array of int
        int[] measurments2 = new int[10]; // Array of 10 int
        int[] measurments3 = {1, 2, 3, 4, 5}; // Array of 5 int
        int[] ausgabe;

        String[] [] names = {
                {"Mr.", "Mrs.", "Ms."},
                {"Smith", "Jones"}
        };
        System.out.println(names.length);
        System.out.println(names[0].length);
        System.out.println(names[1].length);

        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
        System.out.println("");
        for (String[] namesArray : names) {
            for (String item : namesArray) {
                System.out.print(item);
            }
        }
        return 0;

    }
    public  class  Kreis {
        private  double  radius;
        public  Kreis ( double  radius) {
            this .radius = radius;
        }
        public  double  getRadius () {
            return  radius;
        }
        public  void  setRadius ( double  radius) {
            this .radius = radius;
        }
        public  double  getUmfang () {
            return  2 * Math.PI * radius;
        }
        public  double  getFlaeche () {
            return  Math.PI * radius * radius;
        }
    }
    private static int copyArray() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
       /* for(int e : a) {
            //System.out.println(e);
            //System.out.println("");
            for(int p : b) {
                System.out.println(p);
            }
            System.out.println("");
        }*/
        for(int i = 0, j = 4; i < 5; i++, j--) {
            //System.out.println(a[i]);
            b[j] = a[i];
            //System.out.println(b[j]);
        }
        System.out.println("AB HIER!");
        for(int e: b) {
            System.out.println(e);
        }
        return 0;
    }
}