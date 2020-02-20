
# cs-char-counter

# ------------------------------------------------------------------
# SPEC
# ------------------------------------------------------------------
Given a sorted array of N elements with duplicates, for example:
   a,b,b,b,b,b,d,h,h,h,p
count the number of occurrences of each unique element.
    1a) Solve this with an O(N) algorithm
    1b) Solve this with a better-than-O(N) algorithm and analyze
    its time complexity.
While it may be useful to run your code with the example array above,
please also test it with a larger (ex., 100-1000 elements) randomly
generated, sorted array.

# ------------------------------------------------------------------
# IMPLEMENTATION NOTE
# ------------------------------------------------------------------

For simplicity we create an input to the counting method limited
to subset of ASCII characters from '0' to 'z' but that does not
affect the implemenation in any way.


# ------------------------------------------------------------------
# ALGORITHM COMPLEXITY
# ------------------------------------------------------------------
The problem statement given above requests that the implementation
be provided for 2 distinct algorithms expressed in big-O notation
as O(N) and better than O(N) complexity.

With the input of the form of array of characters it can be stated
that no algorithm can be found to perform better than O(N).
This because the complexity of the algorithm is inherently
proportional to the size of the input N - all characters in the array
must be visited and examined for the counter program to be correct.

Sorting the array of characters does not lend itself at all to
designing any 'divide and conquer' type of algorithm. All characters
in the array still need to be traversed, whether the array of
characters is sorted or unsorted.

