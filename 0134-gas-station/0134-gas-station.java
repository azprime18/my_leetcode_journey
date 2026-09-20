class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int totalCost=0;
        for(int val:gas){
            totalGas=totalGas+val;
        }
        for(int val:cost){
            totalCost=totalCost+val;
        }
        if(totalGas<totalCost) return -1;
        
        
        // unique solution always exists 
        int start=0; 
        int currGas=0;
        for(int i=0;i<gas.length;i++){
            currGas=currGas+gas[i]-cost[i];
            if(currGas<0){
                start=i+1;
                currGas=0;
            }
        }
        return  start;
    }
}