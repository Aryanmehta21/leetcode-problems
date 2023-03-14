// Leetcode - 383
class Solution{
    public boolean canConstruct(String b, String a) {
            HashMap<Character, Integer>h=new HashMap<>();
            int n=b.length();
            int m = a.length();
            for(int i=0;i<n;i++) {
                if(!h.containsKey(b.charAt(i)))
                    h.put(b.charAt(i), 1);
                else 
                    h.put(b.charAt(i), h.get(b.charAt(i))+1);
            }
            for(int i=0;i<m;i++) {
                if(h.containsKey(a.charAt(i))) {
                    h.put(a.charAt(i), h.get(a.charAt(i))-1);
                if(h.get(a.charAt(i))==0) 
                    h.remove(a.charAt(i));
            }
            }
            if(h.size()==0)return true;
            return false;
        }
    }