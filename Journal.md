# Journal
When you create an array of objects in Java, why are the elements initially null? Why is a standard indexed for loop better suited for initializing these array elements than an enhanced for-each loop?

When you create an array of objects in Java it only allocates memory for the array container itself, not the actual objects inside it. Because no individual objects have been instantiated yet using the new keyword, each slot in the array defaults to null.

A standard for loop allows you to modify array slots directly using their index. While, an enhanced for-each loop does not provide direct access to the array index. Also, assigning a value to the loop variable in a for-each loop only updates a temporary local variable, leaving the original array slot as null.



---------------


Compare the enhanced for loop you used in this phase to the standard for loop from Phase 1. When reading through all elements in an array, what are the advantages in terms of code readability and avoiding off-by-one errors?

With a standard for loop, you have to manually manage the counter and boundary conditions. Writing out this extra code increases the risk of common off-by-one errors, which can trigger an ArrayIndexOutOfBoundsException, or accidentally skipping or repeating elements. In contrast, an enhanced for loop handles element traversal automatically, visiting every single element in the array safely.

An enhanced for loop eliminates boilerplate code and reduces visual clutter. By removing loop counters and bracket indexing, it makes your code cleaner and clearly communicates your intent.