class Solution {
    public int maximumWealth(int[][] accounts) {
        int numOfCustomers = accounts.length;
        
        int mostWealth = 0;
        
        for(int customer = 0; customer < numOfCustomers; customer++){
            int sumOfWealth = 0;
            for(int account = 0; account < accounts[customer].length; account++){
                sumOfWealth += accounts[customer][account];
            }
            if(sumOfWealth > mostWealth){
                mostWealth = sumOfWealth;
            }
        }
        return mostWealth;
    }
}
