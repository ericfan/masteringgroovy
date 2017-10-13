def checkInput(def input){
  switch(input){
    case [3,4,5] : println("Array Matched");  break;
    case 10..15  : println("Range Matched");  break;
    case Integer : println("Integer Matched");  break;
    case ~/\w+/  : println("Pattern Matched");  break;
    case String  : println("String Matched"); break;
    default      : println("Nothing Matched");  break;
  }
}

checkInput(3)
checkInput(10)
checkInput(100)
checkInput("Bonjour")
checkInput("Hello World")
checkInput(0.34)
