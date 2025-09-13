class Array26{
    public static void main(String[] args){
        int[] arr={0,0,2,3,4,0,2};
        int len=arr.length;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<len){
            arr[index++]=0;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}