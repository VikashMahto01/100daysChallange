

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> pg = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                pg.add(nums[i]);
            }
        }
        for(int i=0;i<pg.size();i++){
            nums[i]=pg.get(i);
        }
        return pg.size();
    }
}
