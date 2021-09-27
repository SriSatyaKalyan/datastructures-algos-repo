### Bubble Sort:
Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble" to the top of the list.
> Swapping and bubbling up until the end
>> * In-place
>> * Stable
>> * O(n^2) - Algorithm degrades quickly

### Selection Sort:
The selection sort algorithm sorts an array by repeatedly finding the maximum element from unsorted part and putting it at the end. The algorithm maintains two subarrays in a given array. 
1. The subarray which is already sorted. 
2. Remaining subarray which is unsorted.

In every iteration of selection sort, the maximum element (considering descending order) from the unsorted subarray is picked and moved to the sorted subarray.
> Selects the max element from the unsorted array and places them in the sorted array through swapping
>> * In-place 
>> * Unstable 
>> * O(n^2)

### Insertion Sort:
Insertion sort iterates, consuming one input element each repetition, and grows a sorted output list. At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there. It repeats until no input elements remain.
> Element by element, the algorithm finds the right place and places it in there
>> * In-place 
>> * Stable 
>> * O(n^2) 

### Shell Sort:
Shellsort is an optimization of insertion sort that allows the exchange of items that are far apart. It is an adaptive sorting algorithm in that it executes faster when the input is partially sorted. 
> _gap_ is calculated with arr.length/2 and eventually when the _gap_ becomes 1, it is insertion sort with partially sorted array 
>> * In-place 
>> * Unstable 
>> * O(n^2) - but can perform better than that

### Merge Sort:
Divide and Conquer Algorithm
> A merge sort works as follows:
> 1. Divide the unsorted list into n sublists, each containing one element (a list of one element is considered sorted).
> 2. Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining. This will be the sorted list.
>> * Not In-place
>> * Stable
>> * O(nlog(n)) - base 2 - Repeated dividing of the array into half during the splitting phase

### Quick Sort:
Divide and Conquer Algorithm
> It picks an element as pivot and partitions the given array around the picked pivot. The choice of pivot can have an impact on the time-complexity.
>> * In-place
>> * Unstable
>> * O(nlog(n)) - base 2 - Repeated dividing of the array into two halves 

### Counting Sort:
> Counting sort is an algorithm for sorting a collection of objects according to keys that are small positive integers; that is, it is an integer sorting algorithm. It operates by counting the number of objects that possess distinct key values, and applying prefix sum on those counts to determine the positions of each key value in the output sequence.
> 1. Doesn't use comparisons 
> 2. Counts the number of occurrences of each values 
> 3. Only works with non-negative discrete values (can't work with floats, strings)
> 4. Values must be within a specific range
>> * Not an in-place algorithm
>> * For this to be stable, we have to perform extra steps
>> * 0(n) - can be achieved because we are making assumptions about the data we are sorting

### Radix Sort:
> The idea of Radix Sort is to do digit by digit sort starting from least significant digit to most significant digit. Radix sort uses counting sort as a subroutine to sort.
> 1. Makes assumptions about the data
> 2. Data must have the same radix and width. So, data must be integers or strings
> 3. Start at the right-most position
> 4. Must use a stable sort algorithm at each stage. We use Stable Counting Sort
>> * In-place depending on which algorithm we use
>> * Stable
>> * O(n) - If we are making assumptions about the data we are sorting. Often runs slower than O(n log n) because of the overhead involved
