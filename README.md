Java Algorithms
===============

Just using this repository to keep track of my exercises in Algorithms.


Data Structures
---------------

| Data Structure | Description                                           | Usage                               |
|----------------|-------------------------------------------------------|-------------------------------------|
| Array          | Most common data structure used, ever.                | Everywhere, behind the scenes!      |
| Stack          | Consider it as a conceptual aid.                      | Word reversing, bracket delimiters. |
| Queue          | Same, but their variant (priority) is more complex.   |                                     |
| Circular Queue | Or also named *ring buffer*                           |                                     |
| Dequeue        | Allow you to `insertRight()` or `insertLeft()`        | Act both like queue or stack.       |
| Priority Queue | At insertion, items are ordered by key value (lowest) | E.g. in multi-tasking processes.    |

### General-Purpose Data Strorage Structures

| Data Structure                | Search   | Insertion | Deletion | Traversal |
|-------------------------------|----------|-----------|----------|-----------|
| Array                         | O(N)     | O(1)      | O(N)     | -         |
| Ordered Array                 | O(log N) | O(N)      | O(N)     | O(N)      |
| Linked List                   | O(N)     | O(1)      | O(N)     | -         |
| Ordered Linked List           | O(N)     | O(N)      | O(N)     | O(N)      |
| Binary tree (average)         | O(log N) | O(log N)  | O(log N) | O(N)      |
| Binary tree (worst)           | O(N)     | O(N)      | O(N)     | O(N)      |
| Binary tree (average + worst) | O(log N) | O(log N)  | O(log N) | O(N)      |
| Hash table                    | O(1)     | O(1)      | O(1)     | -         |

### Special-Purpose Data Structures

Stacks, queues, and priority queues are Abstract Data Types (ADTs) that are
implemented by a more fundamental structure such as an array, linked list or (in
the case of the priority queue) a heap. These ADTs present a simple interface to
the user, typically allowing only insertion and the ability to access or delete
only one data item. These items are:

* For stacks: the last item inserted
* For queues: the first item inserted
* For priority queue: the item with the highest priority


Sorting
-------

| Algorithm      | Running Time in Big O Notation | Better than                           |
|----------------|--------------------------------|---------------------------------------|
| Bubble Sort    | O(N^2)                         | N/A                                   |
| Selection Sort | O(N^2)                         | Bubble Sort                           |
| Insertion Sort | O(N^2)                         | Bubble Sort, Insertion Sort (usually) |


Recursion
---------

Characteristics of Recursive Methods

* It calls itself.
* When it calls itself, it does so to solve a **smaller** problem.
* There's some version of the problem that is simple enough that the routine can
  solve it, and return, without calling itself.

Recursion is the progamming equivalent of mathematical induction. Mathematical
induction is a way of defining something in terms of itself. Using induction, we
could define the triangular numbers mathematically by saying:

    tri(n) = 1                       if n = 1
    tri(n) = n + tri(n-1)            if n > 1

Defining something in terms of itself may seem circular, but in fact it's
perfectly valid, provided there's a **base** case.

### Anagrams

A permutation is an arrangement of things in a definite order. Suppose you want
to list all the anagrams of a specified word—that is, all possible permutations
(whether they make a real English word or not) that can be made from the letters
of the original word. We will call this *anagramming* a word.

You could write a program to anagram a word by following those steps:

1.  Aangram the rightmost `n-1` letters.
2.  Rotate all `n` letters.
3.  Repeat these steps `n` times.


Heaps
-----

A heap is a binary tree with these characteristics:

*   It's complete. This means it's completely filled in, reading from left to
    right across each row, although the last row neet not to be full.
*   It's (usually) implemented as an array.
*   Each node in a heap satisfies the *heap condition*, which states that
    every node's key is larger than (or equal to) the keys of its children.

When a tree is implemented as an array, you can navigate between paths with
simple arithmetic. If a node is located at *index* then:

| Access to   | Formula           |
|-------------|-------------------|
| Left child  | *index* * 2 + 1   |
| Right child | *index* * 2 + 2   |
| Parent      | (*index* - 1) / 2 |


Graphes
-------

Graphes, unlike trees, often have a shape dictated by a physical or abstract
problem. For example, nodes in a graph may represent cities, while edges may
represent airline flight routes between the cities. Another more abstract
example is a graph representing the individual tasks necessary to complete a
project. In the graph, nodes may represent tasks, while directed edges (with
an arrow at one end) indicate which task must be completed before another.

*   Nodes are traditionally called *vertices* (the singular is *vertex*).
*   **Adjacency**: two vertices are said to be *adjacent* to one another if
    they are connected by a single *edge*.
*   A *path* is a sequence of edges.
*   A graph is said to be *connected* if there is at least one path from
    every vertex to every other vertex.


### The Adjacency Matrix

An adjacency matrix is a two-dimensional array in which the elements indicate
whether an edge is present between two vertices. If a graph has N vertices,
the adjacent matrix is an NxN array.

|   | A | B | C | D |
|---|---|---|---|---|
| A | 0 | 1 | 1 | 1 |
| B | 1 | 0 | 0 | 1 |
| C | 1 | 0 | 0 | 0 |
| D | 1 | 1 | 0 | 0 |
