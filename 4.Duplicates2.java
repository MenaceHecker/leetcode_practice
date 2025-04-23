class abc 
{
    public static void main(String[] args) 
    {
      int[] num = {0,0,0,1,1,1,1,1,2,3,3,4,5,5,5};
        int n = num.length;
        for(int i=0; i<num.length; i++)
        {
            if(i<n-1 && num[i]==num[i+1])
            {
                for(int j=i; j<n-1; j++)
                {
                    num[j] = num[j+1];
                }
                n--;
                i--;
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}