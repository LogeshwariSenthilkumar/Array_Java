class Array8{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] newarr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        for(int i:newarr){
            System.out.print(i+" ");
        }
    }
}