class PrintValue{
  def myvalue = "That's not delegate "
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
