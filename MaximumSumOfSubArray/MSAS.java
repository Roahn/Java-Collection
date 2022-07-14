class MSAS{



    public static void main (String args[])
    {
           int A [] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSoFar=A[0], maxEndingHere=A[0];

        for(int i=0;i<A.length;i++)
        {
            if(maxEndingHere+A[i]<A[i])
            {
                maxEndingHere = A[i];
            }
            else
            {
                maxEndingHere=maxEndingHere+A[i];
            }

            if(maxSoFar<maxEndingHere)
            {
                maxSoFar= maxEndingHere;
            }

        }
        System.out.println("Maximum is "+maxSoFar);
    }
}