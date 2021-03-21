package platformer;

public class Levels {
	int state = 2;
	public int[][][] testBench(){
		int[][][] map = new int[100][100][state];
		for(int x = 0; x < 100;x++) {
			for(int y = 0; y < 20;y++) {
				map[x][y][0] = 1;
				map[x][y][1] = 1;
			}
		}
		
		for(int x = 0; x < 100;x++) {
			for(int y = 0; y < 20;y++) {
				map[y][x][0] = 1;
				map[y][x][1] = 1;
			}
		}
		for(int x = 0; x < 100;x++) {
			for(int y = 80; y < 100;y++) {
				map[y][x][0] = 1;
				map[y][x][1] = 1;
			}
		}

		for(int x = 0; x < 34;x++) {
			for(int y = 35; y < 37;y++) {
				map[y][x][0] = 1;
				map[y][x][1] = 1;
			}
		}

		for(int x = 0; x < 100;x++) {
			for(int y = 35; y < 37;y++) {
				map[x][y][0] = 1;
				map[x][y][1] = 1;
			}
		}
		for(int i=25; i <= 29;i++ ) {
			map[i][32][0]=1;
			map[i][32][1]=1;
		}
		
		map[33][33][0] = 1;
		map[33][33][1] = 0;
		return map;
	}
	public int[][][] emptyLevel(){
	 int[][][] map = new int[100][100][state];
	 return map;
	}

	
}
