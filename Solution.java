class Solution {
    public boolean canWinNim(int n) {
        //1 2 3 5 6 7 9 10 11
        //4 8 12
        if(n % 4 != 0){
            return(true);
        }
        else{
            return(false);
        }
    }
}
