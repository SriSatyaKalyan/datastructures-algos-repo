# Data Structures

A Data Structure is about organizing and managing data effectively in order to perform a specific operation efficiently, while Algorithm is a step-by-step procedure to be followed to reach the desired output. Steps in an algorithm can use one or many data structures to solve a problem.

__Time complexity__ of an algorithm quantifies the amount of time taken by an algorithm to run as a function of length of the input.

__Space complexity__ of an alogorithm quantifies the amount of space/memory taken by an algorithm to run as a function of the length of the input. Auxiliary space is the extra space or temporary space used by an algorithm. Space complexity includes both auxiliary space and space used by input.

Time and space complexuty depend on lots of things like hardware, operating system, processors etc. However, we will only consider the execution time of an algorithm.

## Asymptotic Notations

O - Big oh notation: works as an upper-bound of a function

Ω - Big omega notation: works as a lower-bound of a function

θ - Theta: works as an average bound of a function. The most useful is this.

![Differences between different Asymptotic notations](https://github.com/SriSatyaKalyan/Images/blob/master/DataStructures%20Images/Screenshot%202023-05-07%20at%207.46.40%20PM.png)






### Dynamic Array
- Contiguous block in memory
- Every element occupies the same amount of space in memory
- If an array starts at memory address 'x', and the size of each element in the array is 'y', we can calculate the memory address of the 'i'th element by using the expression: (x + (i * y))

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
-

#### BFS problems
- Flood Fill: https://leetcode.com/problems/flood-fill/
- Number of Islands: https://leetcode.com/problems/number-of-islands/
- Word Ladder I: https://leetcode.com/problems/word-ladder/
- Word Ladder II: https://leetcode.com/problems/word-ladder-ii/
- Evaluate Division: https://leetcode.com/problems/evaluate-division/
- Get Watched Videos by Your Friends: https://leetcode.com/problems/get-watched-videos-by-your-friends/
- Cut Off Trees for Golf Event: https://leetcode.com/problems/cut-off-trees-for-golf-event/

#### DFS problems
- Number of Islands: https://leetcode.com/problems/number-of-islands/
- Flood Fill: https://leetcode.com/problems/flood-fill/
- Longest Increasing Path in a Matrix: https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
- Evaluate Division: https://leetcode.com/problems/evaluate-division/
- Robot Room Cleaner: https://leetcode.com/problems/robot-room-cleaner/
- Most Stones Removed with Same Row or Column: https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/
- Reconstruct Itinerary: https://leetcode.com/problems/reconstruct-itinerary/
- Tree Diameter: https://leetcode.com/problems/tree-diameter/
- Accounts Merge: https://leetcode.com/problems/accounts-merge/

#### Connected components problems
- Number of Provinces: https://leetcode.com/problems/number-of-provinces/
- Number of Connected Components in an Undirected Graph: https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
- Number of Operations to Make Network Connected: https://leetcode.com/problems/number-of-operations-to-make-network-connected/
- Accounts Merge: https://leetcode.com/problems/accounts-merge/
- Critical Connections in a Network: https://leetcode.com/problems/critical-connections-in-a-network/
#### Dijkstra's problems
- Path With Maximum Minimum Valued: https://leetcode.com/problems/path-with-maximum-minimum-value/
- Network delay time: https://leetcode.com/problems/network-delay-time/
- Path with Maximum Probability: https://leetcode.com/problems/path-with-maximum-probability/
- Path With Minimum Effort: https://leetcode.com/problems/path-with-minimum-effort/
- Cheapest Flights Within K Stops: https://leetcode.com/problems/cheapest-flights-within-k-stops/
#### Union Find problems
- Number of Islands: https://leetcode.com/problems/number-of-islands/
- Largest Component Size by Common Factor: https://leetcode.com/problems/largest-component-size-by-common-factor/
- Most Stones Removed with Same Row or Column: https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/
- Number of Connected Components in an Undirected Graph: https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
#### Minimum Spanning Tree problems
- Connecting Cities With Minimum Cost: https://leetcode.com/problems/connecting-cities-with-minimum-cost/
- Min Cost to Connect All Points: https://leetcode.com/problems/min-cost-to-connect-all-points/
#### Topological sort problems
- Course Schedule : https://leetcode.com/problems/course-schedule/
- Course Schedule II: https://leetcode.com/problems/course-schedule-ii/
- Sequence Reconstruction: https://leetcode.com/problems/sequence-reconstruction/
- Alien Dictionary: https://leetcode.com/problems/alien-dictionary/solution/
#### Floyd Warshall problems
- Find the City With the Smallest Number of Neighbors at a Threshold Distance: https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/
- Network delay time: https://leetcode.com/problems/network-delay-time/
#### Bellman Ford problems
- Network delay time: https://leetcode.com/problems/network-delay-time/