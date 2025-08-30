class Array29{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int sum=0;
        int max=arr[0];
        int min=arr[0];
        if(arr.length<3){
            System.out.println("Array Length Should be Greater than Three");
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]!=min){
                sum+=arr[i];
            }
        }
        System.out.println("Average Except Large and Small : "+(sum/(double)(arr.length-2)));
    }

}