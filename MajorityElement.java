class Array38{
    public static void main(String[] args){
        int[] arr={2,2,3,2};
        int majority=-1;
        for(int i=0;i<arr.length;i++){
             int count=0;
             for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   count++;
                }
             }
             if(count>(arr.length/2)){
                majority=arr[i];
                break;
             }
        }
        if (majority != -1) {
    System.out.println("Majority element is: " + majority);
} else {
    System.out.println("No Majority element");
}
    }
}