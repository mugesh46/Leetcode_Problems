class Solution {
    public static void callBFS(char grid[][] , int i , int j){
        //when u have to stop searching // BC
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0'; // land u seen already make it 0 
        callBFS(grid,i+1,j); //check down 
        callBFS(grid,i-1,j); // check up
        callBFS(grid,i,j+1); // check right
        callBFS(grid,i,j-1); //check left
        
    }
    public int numIslands(char[][] grid) {
    int count = 0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]=='1'){ // u found land
                count++; // inc count
                callBFS(grid,i,j); // try to explore in all 4 ways using BFS
            }
        }
    }  
    return count;  
}
}