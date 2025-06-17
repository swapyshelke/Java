class FibonachiNo {
    public static int calcSum(int n) {
        if(n == 0 ) {
            return 0;
        }  else if (n == 1){
            return 1;
        }

        return calcSum(n - 1) + calcSum(n - 2);
    }

    public static void main(String[] args) {
        int position = 5;
        int fobonachiNo = calcSum(position);
        System.err.println("the fibonachi no at position " + position + " is " + fobonachiNo);
    }
}