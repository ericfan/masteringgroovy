def range1 = 1..10;
Range range2 = 'a'..'f';

//loop
range1.each { print it }
println ''

//step
List l1 = range1.step(2)
println l1

//first and last
println range2.getFrom()
println range2.getTo()
