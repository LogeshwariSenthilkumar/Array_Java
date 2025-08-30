class Array10{
    public static void main(String[] args){
        int[] arr={34,67,89,100,45,2};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);
    }
}