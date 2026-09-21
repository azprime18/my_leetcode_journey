class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
       merge(nums1,nums2,arr);
       merge_sort(arr);
       int n=arr.length;
       if(n%2==1){
        double d=arr[n/2];
        return d;
       }
       if(n%2==0){
        double x=arr[n/2];
        double y=arr[n/2-1];
        double median=(x+y)/2.0;
        return median;
       }
       return 0;
    }
    static void merge(int[]a,int[]b,int[] c){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }
    }
    static void merge_sort(int[] arr){
        
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        int index=0;
        for(int i=0;i<a.length;i++){
            a[i]=arr[index++];
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[index++];
        }
        merge_sort(a);
        merge_sort(b);
        merge(a,b,arr);
    }
}