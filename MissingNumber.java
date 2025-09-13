class Array24{
    public static void main(String[] args){
        int[] arr={1,2,4,5,6};
        int n=arr[arr.length-1];
        int la=(n*(n+1)/2);
        int sum=0;
        for(int i:arr){
           sum+=i;
        }
        System.out.println("Missing Number : "+(la-sum));
    }
}