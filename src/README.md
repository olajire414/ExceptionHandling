11.14 Exceptional Conditions:

- ArrayIndexOutOfBoundsException(
Place any code that might throw an exception in 
a try block and the catch block contains the code that 
handles the exception if one occurs.There could be many
catches to handle different types of exceptions.)

- IllegalArgumentException()
- ArithmeticException(checking the denominator to
  determine whether it’s 0 before performing the calculation.)
- InputMismatchException
- SecurityException
- FileNotFoundException
- IOException
- ClassNotFoundException
- IllegalStateException
- FormatterClosedException
- NoSuchElementException
- ClassCastException
- UnsupportedOperationException 
- NullPointerException
- custom exception types 
- ClassCastException 
- IllegalArgumentException 
- InterruptedException
- IllegalMonitorStateException 
- ExecutionException
- CancellationException 
- SQLException
- PatternSyntaxException 
- MalformedURLException
- EOFException
- SocketException 
- InterruptedException
- UnknownHostException


Question 11.18


The code will fail to compile due to a compilation error.
What happens at runtime logic: Calling name.length() when name is null throws a NullPointerException.
Why it won't compile: NullPointerException is a subclass of RuntimeException. 
Catch blocks must be ordered from the most specific (subclass) to the most general (superclass). 
Because catch (RuntimeException e) appears first, it already catches NullPointerException, 
making the second catch (NullPointerException e) block unreachable 
and triggering a compiler error (exception NullPointerException has already been caught).


