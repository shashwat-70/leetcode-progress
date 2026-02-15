class Solution {
    public String addBinary(String a, String b) {
        int m=a.length()-1;
        int n=b.length()-1;
        StringBuilder rs=new StringBuilder();
        char carry='0';
        while(m>=0 && n>=0){
            if(a.charAt(m)=='0' && b.charAt(n)=='0' && carry=='0'){
                rs.insert(0,"0");
                carry='0';
            }
            else if(a.charAt(m)=='0' && b.charAt(n)=='0' && carry=='1'){
                rs.insert(0,"1");
                carry='0';
            }
            else if(a.charAt(m)=='0' && b.charAt(n)=='1' && carry=='0'){
                rs.insert(0,"1");
                carry='0';
            }    
            else if(a.charAt(m)=='0' && b.charAt(n)=='1' && carry=='1'){
                rs.insert(0,"0");
                carry='1';
            }
            else if(a.charAt(m)=='1' && b.charAt(n)=='0' && carry=='0'){
                rs.insert(0,"1");
                carry='0';
            }
            else if(a.charAt(m)=='1' && b.charAt(n)=='0' && carry=='1'){
                rs.insert(0,"0");
                carry='1';
            }
            else if(a.charAt(m)=='1' && b.charAt(n)=='1' && carry=='0'){
                rs.insert(0,"0");
                carry='1';
            }
            else if(a.charAt(m)=='1' && b.charAt(n)=='1' && carry=='1'){
                rs.insert(0,"1");
                carry='1';
            }
            m--;
            n--;
        }
        while(m>=0){
            if(carry=='0'){
                rs.insert(0,a.charAt(m));
                carry='0';
            }
            else if(a.charAt(m)=='1'){
                rs.insert(0,"0");
                carry='1';
            }
            else if(a.charAt(m)=='0'){
                rs.insert(0,"1");
                carry='0';
            }
            m--;
        }
        while(n>=0){
            if(carry=='0'){
                rs.insert(0,b.charAt(n));
                carry='0';
            }
            else if(b.charAt(n)=='1'){
                rs.insert(0,"0");
                carry='1';
            }
            else if(b.charAt(n)=='0'){
                rs.insert(0,"1");
                carry='0';
            }
            n--;
        }
        if(carry=='1'){
            rs.insert(0,"1");
        }
        return rs.toString();
    }
}