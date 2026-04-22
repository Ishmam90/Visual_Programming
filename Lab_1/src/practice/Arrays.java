package practice;

public class Arrays {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3};
        int[] arr = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr2;
        arr2=arr; // but it copies the point, so if one of the value is changed, both the values will be changed
        arr2=arr.clone(); //proper way of copying

        for(int i=0; i<3; i++){
            System.out.println(arr[i]+" ");
        }

        for(int i=0; i<3; i++){
            System.out.println(arr2[i] + " ");
        }
    }
}
