class Solution {
    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int m, n;
    public int maxDistance(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) q.offer(new int[] {i, j});
            }
        }
        if (q.isEmpty() || q.size() == m * n) return -1;
        int res = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                for (int[] dir : dirs) {
                    int x = cur[0] + dir[0];
                    int y = cur[1] + dir[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 0) {
                        grid[x][y] = 1;
                        q.offer(new int[] {x, y});
                    }
                }
            }
            res++;
        }
        return res - 1;
    }
}
