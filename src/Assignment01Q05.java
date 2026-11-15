public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        
            int n = m.length;
            int[] queue = new int[n];
            int head = 0;
            int tail = 0;

            boolean[] visited = new boolean[n];
            int[] dist = new int[n];

            queue[tail++] = i;
            visited[i] = true;

            dist[i] = 0;

            while (head < tail) {
                int curr = queue[head++];

                for (int k = 0; k < n; k++) {
                    if (m[curr][k] == 1 && visited[k] == false) {
                        if (k == j) {
                            return dist[curr] + 1;
                        }
                    visited[k] = true;
                    dist[k] = dist[curr] +1;
                    queue[tail++] = k;
                    }
                    }
                }
            
        
        return -1;
        }
    

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}