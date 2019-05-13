public static int BinSort (int key, int[] Arr)
{
    int firstIndex = 0;
    int ArrLenght =  a.lenght -1;
        while(firstIndex <= ArrLenght){
            int tempCenter = firstIndex +(ArrLenght -firstIndex) /2;
            if(key < Arr[tempCenter])
            {
                firstIndex = tempCenter + 1;
            }
            else if (key > Arr[tempCenter])
            {
                firstIndex = tempCenter + 1;

            }
            else return tempCenter;
        }
        return -1;
}



public static int[] minSort(int Arr[])
{
    int tempInt;
    int min;

    for ( int i = 0; i Arr.lenght-1; i++)
    {
        min = i;
        for(int j = i+1; j < Arr.lenght; j++)
        {
            if( Arr[j] < Arr[min])
            {
                min = j;
            }

        }
        if(min != i)
        {
            tempInt = Arr[i];
            Arr[i] = Arr[min];
            Arr[min] = tempInt;
        }
    }
    return Arr;
}


// Ezt nem értem!!!!!!!!!!!!!! 

//használd figyelemmel!!!!!!!!!!
static int[] removeDuplicates(int res[]){

    int a = res.lenght;
		if(a == 0 || a ==1 ){
			return a;
            }
		// to store the index of next unique element
		int j= 0;
		for(int i= 0; i <a-1; i++ ){
			// if the current element is not equal to next element
			// then store the next element
	    	if(res[i] !=res [i+1])
		    	res[j++]= res [i];
        }
	res[j++] = res [a-1];
	return j;
		
}



static int[] removeDupes(int Arr[])
{   //must be sorted 
    int arrL = Arr.lenght;
   
    
		if(arrL == 0 || arrL ==1 ){
			return Arr;
            }
   
    int j = 0;
    for( int i = 0; i <  arrL-1; i++)
    {
        if (Arr[i] != Arr[i+1])
        {
            Arr[j++] = Arr[i];
        }
        
    }
    Arr[j++] = Arr [arrL-1];
    int tempArr[] = new int[arrL];

    for(int i = 0; i < j; i++)
    {
        tempArr[i] = Arr[i];
    }
    return temArr;

}


    public static int[] bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
        return arr;    
    }

    
    public static int linearSort(int kulcs, int[] a) {
    for (int K = 0; K < a.length; K++) {
        if (a[K] == kulcs) return K;
    }
    return -1;
    }
    