class Array32{
    public static void main(String[] args){
        int[] arr={1,4,65,6,77,88};
        boolean hasnum65=false;
        boolean hasnum77=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==65){
                hasnum65=true;
            }
            if(arr[i]==77){
                hasnum77=true;
            }
        }
        if(hasnum65 && hasnum77){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}