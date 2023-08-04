
## SET Interface

| HashSet Class | EnumSet Class                                  | LinkedSet | TreeSet |
|---------------|------------------------------------------------|-----------|---------|
| git status    | List all new or modified files                 | wfwef     |         |
| git diff      | Show file differences that haven't been staged | sdd       |         |


## SET Interface
- The set interface of the Java collection framework provides the feature of the mathematical
  sets in Java that extends the collection interface.
- It is an unordered collection of objects in which duplicate values cannot be store.
- It is an interface that implements the mathematical set
- This interface contains the methods inherited from the collection interface
- A feature that restricts the insertion of the duplicate elements.


- Declaration:
    public interface Set extends Collection



- Since Set is an interface, we cannot create object from it


- Use the functionalities of the Set interface, We can use these classes:
    1. EnumSet
    2. HashSet
    3. LinkedHashSet
    4. TreeSet


- Set interface is also extended by these sub interfaces:
    1. SortedSet
    2. NavigableSet


- Java Set interface allow us to perform basic mathematical set operations like:
    1. Union
        - To get the union of two sets x and y, we acn use x.addAll(y)
    2. Intersection
        - To get the intersection of two sets x and y, we can use x.retainAll(y)
    3. Subset
        - To check if x is a subset of y, we can use y.containsAll(x)