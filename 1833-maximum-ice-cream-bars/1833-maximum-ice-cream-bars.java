class Solution {
    public int maxIceCream(int[] costs, int coins) {
        qSort(costs,0,costs.length-1);
        int count=0;
        for(int i=0;i<costs.length;i++){
            if(coins<costs[i]){
                break;
            }
            coins-=costs[i];
            count++;
        }
        return count;
    }
    static void qSort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int low=s;
        int high=e;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(low<=high){
            while(arr[low]<pivot)   low++;
            while(arr[high]>pivot)  high--;
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        qSort(arr,s,high);
        qSort(arr,low,e);
    }
}