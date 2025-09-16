class Array31{
    public static void main(String[] args){
        int[] arr={1,10,3,4,10,6,10,10};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==10){
                sum+=arr[i];
            }
        }
        if(sum==30){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}