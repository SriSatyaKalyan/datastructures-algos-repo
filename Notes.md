# Data Structures

A Data Structure is about organizing and managing data effectively in order to perform a specific operation efficiently, while Algorithm is a step-by-step procedure to be followed to reach the desired output. Steps in an algorithm can use one or many data structures to solve a problem.

__Time complexity__ of an algorithm quantifies the amount of time taken by an algorithm to run as a function of length of the input.

__Space complexity__ of an alogorithm quantifies the amount of space/memory taken by an algorithm to run as a function of the length of the input. Auxiliary space is the extra space or temporary space used by an algorithm. Space complexity includes both auxiliary space and space used by input.

Time and space complexuty depend on lots of things like hardware, operating system, processors etc. However, we will only consider the execution time of an algorithm.

## Asymptotic Notations

O - Big oh notation: works as an upper-bound of a function

![Big Oh Notation](https://github.com/SriSatyaKalyan/Images/blob/master/DataStructures%20Images/Big%20Oh%20Notation.png)

Ω - Omega notation: works as a lower-bound of a function

![Omega Notation](https://github.com/SriSatyaKalyan/Images/blob/master/DataStructures%20Images/Omega%20Notation.png)

θ - Theta: works as an average bound of a function. The most useful is this.

![Theta Notation](https://github.com/SriSatyaKalyan/Images/blob/master/DataStructures%20Images/Theta%20Notation.png)

This is not related to best case or worst case notation. This is purely to understand the bounds of a function.

For example, for `n!`, we cannot find a tight bound in terms of Big Oh or Omega as shown below. Because for smaller values of n, it is closer to `1` and for increasing larger values, it is closer to `n to the power of n`. Big Oh or Omega are used when we cannot provide the Theta value.

***

### Dynamic Array
- Contiguous block in memory
- Every element occupies the same amount of space in memory
- If an array starts at memory address 'x', and the size of each element in the array is 'y', we can calculate the memory address of the 'i'th element by using the expression: (x + (i * y))

**Arrays and Strings** can be solved using the following ways:
- Hashtables 
    - This can be implemented using an array, operating as a *Hashtable*, mapping character to frequency
- ArrayList or Resizable Arrays
- String Builder

#### Points to Remember
- Always ensure that the character set is either ASCII or Unicode
- Check for case-sensitivity
- Check for significance of white space
- Ask if the operation has to be performed in-place
 - If this is the case

### Linked List
- XXXXXX

### Stacks & Queues
- XXXXXX

### HashTables
- XXXXXX

### Binary Search Tree
- XXXXXX

### Binary Heaps
- XXXXXX

### Priority Queue
- XXXXXX

### Graphs
- There are directed and undirected graphs
- There are connected and disconnected graphs
- Adjacency matrix or Adjacency List are used to represent graphs programmatically
- There are two different implementations to traverse graphs - Breadth First Search and Depth First Search. BFS is implemented using Queue. DFS is implemented using Stack.
- If it has not been explicitly mentioned, always account for cycles in the graphs

- I have stopped the [video](#https://www.youtube.com/watch?v=tWVWeAqZ0WU&t=4409s&ab_channel=freeCodeCamp.org) at ==largest component count== chapter

### Trie
- Trie is used to re'trie'ving elements. They are sometimes called prefix trees or digital trees
- It is a Tree data structure used for storing collections of strings
- We can also use a HashTable but we cannot perform prefix based search and it would consume more memory
- XXXX

***

## Questions
- What is amortized runtime?
- What is auxiliary space?
- Differences between ASCII and Unicode strings?
- Why is sorting O(n log(n)) runtime?