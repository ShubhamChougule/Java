class que8 {
    public static void main(String [] args) {
        int row,col;

        for(row = 1; row <= 6; row++) {
            for(col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        } 
    }
}