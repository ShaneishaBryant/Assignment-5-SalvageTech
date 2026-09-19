# Journal
When you create an array of objects in Java, why are the elements initially null? Why is a standard indexed for loop better suited for initializing these array elements than an enhanced for-each loop?

When you create an array of objects in Java it only allocates memory for the array container itself, not the actual objects inside it. Because no individual objects have been instantiated yet using the new keyword, each slot in the array defaults to null.

A standard for loop allows you to modify array slots directly using their index. While, an enhanced for-each loop does not provide direct access to the array index. Also, assigning a value to the loop variable in a for-each loop only updates a temporary local variable, leaving the original array slot as null.