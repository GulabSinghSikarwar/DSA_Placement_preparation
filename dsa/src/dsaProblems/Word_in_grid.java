package dsaProblems;

public class Word_in_grid {
    public  static  void  search2Dword(String word,char grid[][])
    {
        int m=grid.length;
        int n=grid[0].length;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (search2D(i,j,word,grid))
                    System.out.println(
                            "pattern found at " + i + ", " + j);
            }
        }
    }
    public static boolean search2D( int i,int j ,String word,char grid [][])
    {
        if(grid[i][j]!=word.charAt(0))
            return false;
        int len=word.length();

        int x[] = { -1, -1, -1,  0, 0,  1, 1, 1 };
        int y[] = { -1,  0,  1, -1, 1, -1, 0, 1 };
        for (int dir=0;dir<8;dir++)
        {
            int newrow=i+x[dir];
            int newcol=j+y[dir];
            int k;


            for ( k=1;k<word.length();k++)
            {
                if(newrow>=grid.length||newrow<0||newcol>=grid[0].length||newcol<0)
                    break;;
                if (word.charAt(k)!=grid[newrow][newcol])
                    break;
                newrow+=x[dir];
                newcol+=y[dir];

            }
            if (k==len)
                return true;

        }
        return  false;

    }
    public static void main(String[] args) {
//        char [][]grid={
//                {'a','b','c'},
//                {'d','e','f'},
//                {'g','h','i'}
//        };
        char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };
        String word="GEEKS";
        search2Dword(word,grid);



    }

}
