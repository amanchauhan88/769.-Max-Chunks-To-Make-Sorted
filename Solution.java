class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int maxSeen = 0;

        for (int i = 0; i < arr.length; i++) {
            maxSeen = Math.max(maxSeen, arr[i]);
            // If the maximum value seen so far equals the current index,
            // we can form a chunk
            if (maxSeen == i) {
                chunks++;
            }
        }

        return chunks;
    }
}
