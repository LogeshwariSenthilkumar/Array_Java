class Array46{
    public static void main(String[] args){
        int[] arr = {11, 15, 6, 8, 9, 10}; 
        int pivot=0;
        int min=arr[0];
        int target=16;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                pivot=i;
                break;
            }
        }
        boolean found=false;
        int left=pivot;
        int right=(pivot-1+n)%n;
        while(left!=right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(arr[left]+" "+arr[right]);
                found=true;
                break;
            }
            if(sum<target){
                 left=(left+1)%n;
            }
            else{
                right=(right-1+n)%n;
            }
        }
      if(!found){
        System.out.println("No Match Found!!!");
      }
    }
}