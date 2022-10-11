public class Main {
    public static int Remove_duplicates(int a[], int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int[] temp = new int[n];
        int k = 0;
        int j = 0;
        for(int i=0;i<n-1;i++) {
            if (a[i] != a[i + 1]) {
                temp[k] = a[i];
                k++;

            }
        }
        temp[k++]=a[n-1];
            for(int i=0;i<k;i++)
            {
                a[i]=temp[i];
            }
            return k;
        }

    public static void main(String[] args) {
       int a[]={1,1,3,4,5};
       int n=a.length;
       n=Remove_duplicates(a,n);
        for (int i = 0; i<n;i++) {
            System.out.println(a[i]);
        }

    }

}