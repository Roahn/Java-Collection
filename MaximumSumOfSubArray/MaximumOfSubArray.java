class MaximumOfSubArray
{


    public static void main(String args[])
    {
        int A [] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSoFar=A[0], maxEndingHere=A[0];
        System.out.println("  Element " +A[0]+"    MaxSoFar " + maxSoFar + "    maxEndingHere" + maxEndingHere );
        for (int i=1;i<A.length;++i)
        {
            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);	

            System.out.println("  Element " +A[i]+"    MaxSoFar " + maxSoFar + "    maxEndingHere" + maxEndingHere );
        }


        System.out.println("Maximum is "+maxSoFar);
    }
}