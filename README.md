# cs-char-counter
# -------------------------------------------------------------------------
# PURPOSE
# -------------------------------------------------------------------------
This repository is for implementation of Credit-Suisse coding exercise.

# -------------------------------------------------------------------------
# SPEC
# -------------------------------------------------------------------------
The following is the spec for the program:

Given a sorted array of N elements with duplicates, for example:
 *  a,b,b,b,b,b,d,h,h,h,p
 * count the number of occurrences of each unique element.
 *   1a) Solve this with an O(N) algorithm
 *   1b) Solve this with a better-than-O(N) algorithm and analyze
 *   its time complexity.
 * While it may be useful to run your code with the example array above,
 * please also test it with a larger (ex., 100-1000 elements) randomly
 * generated, sorted array.

# -------------------------------------------------------------------------
# IMPLEMENTATION NOTE
# -------------------------------------------------------------------------
The test driver makes use of the App class implementing a bare minimum
of methods to implement task. All methods are implemented as static as
the App class object has no state to maintain and no data members
except for the Credit-Suisse provided test string.

# -------------------------------------------------------------------------
# ALGORITHM COMPLEXITY
# -------------------------------------------------------------------------
The problem statement given above requests that the implementation
be provided for 2 distinct algorithms expressed in big-O notation
as O(N) and better than O(N) complexity.

With the input of the form of array of characters it can be stated
that no algorithm can be found to perform better than O(N). This because
the complexity of the algorithm is inherently proportional to the size
of the input N - all characters in the array have to be visited and
examined for the counter program to be correct.

Sorting the array of characters does not lend itself at all to designing
any 'divide and conquer' type of algorithm. All characters in the array
still need to be traversed, whether the array of characters is sorted
or unsorted.

