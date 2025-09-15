class Array47{
    public static void main(String[] args){
        int[] arr={11, 15, 6, 8, 9, 10};
        int count=0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
             if(min>arr[i]){
                min=arr[i];
             }
            }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                count=i;
            }
        }
        System.out.println("Rotation count : "+count);
    }
}