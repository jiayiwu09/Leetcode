public class Problem1266 {
    public static void main(String[] args){
        int[][] a = {{1,1}, {3,4}, {-1,0}};
        Problem1266 p = new Problem1266();
        System.out.println(p.minTimeToVisitAllPoints(a));
    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for(int i = 0; i< points.length-1;i++){
            int[] point1 = points[i];
            int x = point1[0];
            int y = point1[1];
            int[] point2 = points[i+1];
            int a = point2[0];
            int b = point2[1];
            int xLength = Math.abs(x-a);
            int yLength = Math.abs(y-b);
            int n = Math.max(xLength,yLength);
            sum += n;
//            int xLength = Math.abs(points[i][0] - points[i+1][0]);
//            int yLength = Math.abs(points[i][1] - points[i+1][1]);
//            sum+=Math.max(xLength, yLength);
        }
        return sum;
    }
}
