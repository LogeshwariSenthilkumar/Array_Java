class Array49{
    public static void main(String[] args){
        int[] arr={-4,-3,-2,4,3,-1,7};
        int[] newarr=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                newarr[index++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                newarr[index++]=arr[i];
            }
        }
        for(int i:newarr){
            System.out.print(i+" ");
        }
    }
}