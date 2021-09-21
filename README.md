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

Merge Sort:
* Not In-place
* Stable
* O(nlog(n)) - base 2 - Repeated dividing of the array into half during the splitting phase

Quick Sort:
* In-place
* Unstable
* O(nlog(n)) - base 2 - Repeated dividing of the array into two halves
* The choice of pivot can have an impact on the time-complexity

Counting Sort:
* Makes assumptions about data
* Doesn't use comparisons
* Counts the number of occurrences of each values
* Only works with non-negative discrete values (can't work with floats, strings)
* Values must be within a specific range