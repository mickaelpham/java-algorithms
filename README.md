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

