# Steps to run mobile tests
 
 ## Note:
 App is automated considering app location as `United States` because based on the location app flows changes. Hence please make sure app location is set to `United States`.
 
 ## Runing WatchFlow
```bash
mvn clean test -DgroupName=WATCHFLOW
```
## Getting n product
```bash
mvn clean test -DgroupName=GETPRODUCT
```
 



# Steps to run StringIntersection tests
```bash
mvn clean test -DgroupName=BRUTEFORCE
mvn clean test -DgroupName=HASHSET
```

# Time Complexity
## Hash Based Approach
I have used `HashSet retainAll` method here to solve the problem
The method retainAll is inherited from AbstractCollection and looks like this:

```java
public boolean retainAll(Collection<?> c) {
    boolean modified = false;
    Iterator<E> it = iterator();
    while (it.hasNext()) {
        if (!c.contains(it.next())) {
            it.remove();
            modified = true;
        }
    }
    return modified;
}
```
we loop over this.iterator() and call c.contains. So the time complexity is n calls to c.contains where `n = this.size()`

So final time complexity is `O(n)`


## BruteForce
In this approach i have used normal nested for loop and for this time complexity is `O(n²)`





