package twoPointers;

public class CheckNDoubleExist {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++){
                if((double)arr[i] == (double)arr[j]/2 || (double)arr[i] == (double)arr[j] * 2){
                    return true;
                }
            }
        return false;
    }
}
