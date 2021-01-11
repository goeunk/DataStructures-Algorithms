class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        // Check the indexes when the pieces[i] contains more than one element.
        // 2 Approaches
        // 1) Map
        int n = arr.length;
        Map<Integer, int[]> map = new HashMap<>();
        
        for(int[] p : pieces)
        {
            map.put(p[0], p);
        }
        
        
        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                int[] p = map.get(arr[i]);
                for(int num : p)
                {
                    if(num == arr[i])
                    {
                        i++;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            else
            {
                return false;
            }
            
            i--;
        }
        return true;
        
        // 2) Array
        
    }
}