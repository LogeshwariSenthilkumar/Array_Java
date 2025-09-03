class Array14{
    public static void main(String[] args){
        String[] name1={"Logu","Chitra","Janani","Dhivya"};
        String[] name2={"Aishu","Logu","Barani","Chitra"};
        System.out.println("The Duplicates Are : ");
        for(int i=0;i<name1.length;i++){
            for(int j=0;j<name2.length;j++){
                if(name1[i].equals(name2[j])){
                    System.out.println(name1[i]);
                }
            }
        }
    }
}