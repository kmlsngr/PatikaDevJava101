import java.util.Arrays;

public class EvenDuplicate {
    static boolean isFind(int [] arr,int num){
        for(int i:arr){
            if(num==i){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,5,6,3,5,4,4,9,8,8,6,35,10,10,12,14,14};
        int [] duplicate = new int[array.length];
        int startIndex = 0;
        for(int i = 0; i<array.length;i++){
            for(int j =i+1;j<array.length;j++){
                if(array[i]==array[j]&&array[i]%2==0){
                    if(isFind(duplicate,array[i])){
                        continue;
                    }
                    else {
                        duplicate[startIndex++]=array[i];
                    }

                }
            }
        }

        for(int i: duplicate){
            if(i != 0){
                System.out.print(i+" ");
            }
        }

    }
}
