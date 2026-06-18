class Solution {
    public double angleClock(int hour, int minutes) {
        double mAngle=6*minutes;
        double hAngle=(30*hour)+(0.5*minutes);
        double ans=Math.abs(mAngle-hAngle);
        
        if(360-ans<ans) return 360-ans;
        return ans;
    }
}