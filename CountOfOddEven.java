class Array27{
    public static void main(String[] args){
        int[] arr={1,3,4,5,6,7,9};
        int oddCount=0;
        int evenCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
               oddCount++;
            }
        }
        System.out.println("Odd Count : "+oddCount);
         System.out.println("Even Count : "+evenCount);
    }
}