package duplicate;

public class even {
    static boolean isFind(int[] arr,int value){
        for(int i: arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int k=0;
        int[] list = {3, 7, 3, 3, 2, 9, 4, 10, 21, 1, 33, 9, 1, 2, 4};
        int[] duplicate= new int[list.length];
        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                if((i != j) && (list[i] == list[j]) && ((list[i] % 2) == 0)){
                    if (!isFind(duplicate,list[i])){
                        duplicate[k++]=list[i];
                    }
                }
            }
        }
        for (int value: duplicate){
            if (value!=0){
                System.out.print(value+" ");
            }
        }
    }
}
