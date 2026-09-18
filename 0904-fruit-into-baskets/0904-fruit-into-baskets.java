class Solution {
    public int totalFruit(int[] fruits) {
        int type1=-1;
        int type2=-1;
        int last1=-1;
        int last2=-1;
        int l=0;
        int h=0;
        int count=0;
        int max=0;
        while(h<fruits.length){

            //if fruit matches the type of fruit in either basket OR we have an empty basket
            if(fruits[h]==type1 || fruits[h]==type2 || type1==-1 || type2==-1){
                count++;
                if(count>max)   max=count;

                if(fruits[h]==type1){//fruit belongs to type 1
                    last1=h;//last position where we encountered type 1 fruit
                }
                else if(fruits[h]==type2){//fruit belongs to type2
                    last2=h;//last position where we encountered type 2 fruit
                }
                else if(type1==-1){//basket 1 is empty
                    type1=fruits[h];//labelling basket 1
                    last1=h;//last position where we encountered type 1 fruit
                }
                else if(type2==-1){//basket 2 is empty
                    type2=fruits[h];//labelling basket 2
                    last2=h;//last position where we encountered type 2 fruit
                }

                h++;
            }

            //if we encounter a new fruit
            else{
                if(last1<last2){
                    //emptying basket 1 as type 1 was encountered first
                    while(l<=last1){
                        l++;
                        count--;
                    }
                    last1=-1;
                    type1=-1;
                }
                else{
                    //emptying basket 2 as type 2 was encountered first
                    while(l<=last2){
                        l++;
                        count--;
                    }
                    last2=-1;
                    type2=-1;
                }
            }
        }
        return max;
    }
}