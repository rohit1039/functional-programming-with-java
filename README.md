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

                                                      ``` put(K k, V v)
                                                      {
                                                         
                                                      }
                                                      ```

Example - Saved it as -> index = 6, Node = [e1,"Developer",1011,null], null because there is no next node and it is the first node.

If again there is same index = 6  is evaluated for map.put(e2,"QEA"). This concept is called Hashing collision.

Now, for index = 6. It will check if(e1.equals(e2)) -> 
                                                       True e1 will be replaced by e2.
                                                    -> 
                                                       False e2 will be added as 




