class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0; 
        for (int trainer : trainers) {
            if (i < players.length && trainer >= players[i]) {
                i++; 
            }
        }
        return i;
    }
}