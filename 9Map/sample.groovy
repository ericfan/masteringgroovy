//create map
Map m1 = [name:"Eric"]
Map m2 = [id:1,title:"Ant in action"] as Map
println m1.get("name")
println m2["id"]

Map m3 = [Eric:34, Daniel: 28]
//loop
m3.each{key, value -> println "Name is: "+ key
                      println "Age is:" + value};
m3.each{entry -> println "Name is: "+ entry.key
                 println "Age is: "+ entry.value};

println m3.any {key, value -> value > 30}
println m3.every {key, value -> value > 30}

//find
println m3.find {key, value -> value%2 == 0 }
println m3.findAll {key, value -> value%2 == 0 }
