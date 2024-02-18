class Solution {
    public int countKeyChanges(String s) {
        int keyChanges = 0;
        char lastkeys = '\0'; // it means empty  charater

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                char currentKey = Character.toLowerCase(c);
                if(currentKey != lastkeys){
                    keyChanges++;
                    lastkeys = currentKey; 
                }
            }
        }
        return keyChanges-1;
    }
}