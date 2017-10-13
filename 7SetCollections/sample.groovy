//creat a set
def set1 = [1,2,1,4,5,9] as Set;
Set set2 = new HashSet(['a','b','c','d']);

//add elements
set2.add(1)
set2.add(9)
set2.addAll([4,5]);
println(set2)

set2.remove(1)
set2.removeAll([4,5])
println(set2)

Set union = set1 + set2;
print("PlusResult:")
println(union)

Set intersection = set1.intersect(set2);
println(intersection);

Set minus = union.minus(set1);
println(minus);
