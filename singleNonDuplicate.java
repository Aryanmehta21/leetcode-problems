// Leetcode 540 - Single Element in a Sorted Array
// Hashing Solution
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
  HashMap<Integer,Integer> fmap=new HashMap<>();

  for(int val:nums){
      if(fmap.containsKey(val)==true){
       
       int of= fmap.get(val);
       int nf=of+1;
       fmap.put(val,nf);
      }
      else{
          fmap.put(val,1);
      }
  }


      int number= nums[0];

      for(Integer ele:fmap.keySet()){

    if(fmap.get(ele)==1){
             number=ele;
        }
  }

  return number;
    }
}


// Binary Search Solution
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
        int mid =start + (end-start)/2;

        if(mid%2 ==1){
            mid--;
        }
        if(nums[mid] != nums[mid+1]){
            end = mid;
        }else{
            start = mid + 2;
        }
        }
        return nums[start];
    }
}

