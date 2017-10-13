class PrintValue{
  def printClosure = {
    println myvalue;
  }
}

class PrintHandler{
  def myvalue = "Bonjour";
}

def proc = new PrintValue().printClosure;
proc.delegate = new PrintHandler()
proc();
