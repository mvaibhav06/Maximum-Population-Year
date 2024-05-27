class MaxPopulation {
    public int maximumPopulation(int[][] logs) {
        Map<Integer,Integer> temp = new HashMap<>();
        for(int i=0; i<logs.length; i++){
            for(int j=logs[i][0]; j<logs[i][1]; j++){
                temp.put(j, temp.getOrDefault(j,0)+1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int a : temp.values()){
            if(a > max){
                max = a;
            }
        }
        int out = Integer.MAX_VALUE;
        for(int year : temp.keySet()){
            if(temp.get(year) == max){
                if(out > year){
                    out = year;
                }
            }
        }
        return out;
    }
}
