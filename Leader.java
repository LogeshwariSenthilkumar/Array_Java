class Array39{
    public static void main(String[] args){
        int[] arr={5,2,7,8,1,9};
        int leader=arr[arr.length-1];
        System.out.println(leader);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>leader){
                    leader=arr[i];
                     System.out.println(leader);
                }

        }
    
    }
}