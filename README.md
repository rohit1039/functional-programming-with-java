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

Node looks like, [key,value,hash,next]






