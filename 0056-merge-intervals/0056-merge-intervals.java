class Solution {
    public int[][] merge(int[][] intervals) {
        sort(intervals,0,intervals.length-1);
        ArrayList<int[]> result=new ArrayList<int[]>();
        result.add(intervals[0]);
        int i=1;
        int j=0;
        while(i<intervals.length){
            if(intervals[i][0]<=result.get(j)[1]){
                result.get(j)[1]=Math.max(result.get(j)[1],intervals[i][1]);
                i++;
            }
            else{
                result.add(intervals[i]);
                j++;
                i++;
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
    static void sort(int[][] arr,int s,int e){
        if(s>=e)    return;
        int low=s;
        int high=e;
        int mid=s+(e-s)/2;
        int p0=arr[mid][0];
        int p1=arr[mid][1];
        while(low<=high){
            while(arr[low][0]<p0 || (arr[low][0]==p0 && arr[low][1]<p1)) low++;
            while(arr[high][0]>p0 || (arr[high][0]==p0 && arr[high][1]>p1)) high--;
            if(low<=high){
                if(arr[low][0]==arr[high][0] && arr[low][1]<arr[high][1]){
                    low++;
                    high--;
                }
                else{
                    int[] temp=arr[low];
                    arr[low]=arr[high];
                    arr[high]=temp;
                    low++;
                    high--;
                }  
            }
        }
        sort(arr,s,high);
        sort(arr,low,e);
    }
}