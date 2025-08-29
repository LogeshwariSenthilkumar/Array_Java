class Array37{
    public static void main(String[] args){
        int[][] matrix={
            {1,2},
            {3,4}
        };
        int n=matrix.length;
        for(int s=0;s<(n*n)-1;s++){
            for(int i=0;i<n;i++){
                int j=s-i;
                if(j>=0 && j<n){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}