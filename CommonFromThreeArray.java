class Array25{
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={3,4,5,6,7,1};
        int[] arr3={3,4,5,9,8,1};
        for(int i=0;i<arr1.length;i++){
            boolean foundin2=false;
            boolean foundin3=false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    foundin2=true;
                    break;
                }
            }
            for(int k=0;k<arr3.length;k++){
                if(arr1[i]==arr3[k]){
                    foundin3=true;
                    break;
                }
            }
            if(foundin2 && foundin3){
                System.out.println(arr1[i]);
            }
        }
    }
}