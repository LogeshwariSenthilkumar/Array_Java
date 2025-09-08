class Array22{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,7,6,8};
        int num=10;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num){
                    System.out.println(arr[i]+","+arr[j]);
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("Pair not found!!!");
        }
    }
}