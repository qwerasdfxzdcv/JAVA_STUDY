package quiz;

public class Road {
    public static void main(String[] args) {
        //출발점은 0,0  도착점은 4,4
        //1은 길 0은 벽 최단 거리 구하기
        int[][] map = {
                {1, 0 ,1 ,1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1}
        };
        Solution solution = new Solution();
        int short_cut = solution.solve(map);
        System.out.println(short_cut);
    }
}