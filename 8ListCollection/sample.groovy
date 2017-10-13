def list1 = ['a','b','c','d']
def list2 = [3,2,1,4,5] as List
List list3 = new ArrayList();

//get elements from list
println(list1[1])
println(list2.get(4))
println(list3.size())

//sorting
println list2.sort();

//reverse
println list1.reverse();

//utility
println ("Max: " + list2.max() + ";Last: "+ list1.last())

//find
println list2.find({it%2 == 0})
println list2.findAll({it%2 == 0})
