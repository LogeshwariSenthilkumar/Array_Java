class Array28{
    public static void main(String[] args){
        int[] arr={5,2,8,1,9};
        int max=arr[0];
        int min=arr[0];
        if(arr.length>1){
           for(int i:arr){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.println("Difference : "+(max-min));
        }
        else{
            System.out.println("The Array Length Should be Greater than 1");
        }
        
    }
}