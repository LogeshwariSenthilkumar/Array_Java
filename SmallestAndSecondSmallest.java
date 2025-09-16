class Array41{
    public static void main(String[] args){
        int[] arr={9,4,5,7,2,8,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[0]+" "+arr[1]);
    }
}