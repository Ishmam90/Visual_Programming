package Task_2;

import java.util.ArrayList;

public class Calculator implements Addition, Dot_product, Cross_product{
    @Override
    public ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b, int n, int m) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                newArray.set(j, a.get(j)+b.get(j));
            }
        }

        return newArray;
    }

    @Override
    public void crossProduct() {

    }

    @Override
    public int dotProduct(ArrayList<Integer> a, ArrayList<Integer> b, int n, int m) {
        int sum=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sum += a.get(j)*b.get(j);
            }
        }

        return sum;
    }
}
