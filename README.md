# Function Programming Using Java!

### filter() => Predicate(Integer) i.e. returns boolean
### map() => Function(Integer) i.e. one input and one result
### System.out::println => Method reference i.e. Consumer

# How HashMap internally works?

- [x] Map<Employee,String> map = new HashMap<>();
- [x] Employee e1 = new Employee(1,"Rohit");
- [x] Employee e2 = new Employee(2,"Rahul");
- [x] Employee e3 = new Employee(3,"Raj");
- [x] Employee e4 = new Employee(4,"Saurav");
- [x] Employee e5 = new Employee(5,"Alisha");    

Now, when map.put(e1,"Developer"). HashMap internally creates a bucket list of initial capacity 16 (with zero-based indexing).

Each bucket internally uses LinkedList and each LinkedList uses Node to save the data.

Node looks like, [key,value,hash,next]. Now, for map.put() there is hash value being calculated and the index is evaluated.

                                                ```
                                                 put(K k, V v)
                                                {
                                                   hash = hash(k);

                                                   index = hash & (n-1);
                                                } 
                                                ```

Example - Saved it as -> index = 6, Node = [e1,"Developer",1011,null], null because there is no next node and it is the first node.

If again there is same index = 6  is evaluated for map.put(e2,"QEA"). This concept is called Hashing collision.

Now, for index = 6. It will check if(e1.equals(e2)) -> 
                                                       True e1 will be replaced by e2.
                                                    -> 
                                                       False e2 will be added as the next node.
                                                      
Now, index=6 and Node = [e1,"Developer",1011,null] -> [e2,"QEA",7976,null].

This is how HashMap internally works.

Additionally, In Java 8 after a certain threshold there is no longer LinkedList is used, it uses Balanced Tree mechanism. Lets say, when we have 5 nodes at index=6 then LinkedList is no longer efficient to manage so it uses Balanced Tree.

# For Reference:

<img src="https://github.com/rohit1039/functional-programming-with-java/blob/main/src/programming/Screenshot%20(25).png" />
