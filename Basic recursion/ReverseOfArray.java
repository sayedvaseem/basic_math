class ReverseOfArray_Finder{
    void function(int arr[],int i,int n){
        if(i >= n/2) return ;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        function(arr, n+1, n);
    }
}

public class ReverseOfArray {
    public static void main(String[] args) {
        ReverseOfArray_Finder r = new ReverseOfArray_Finder();
        int n =5;
        int[] arr= {1,2,3,4,5};
        r.function(arr, 0, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
