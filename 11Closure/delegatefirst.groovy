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
proc.resolveStrategy = Closure.DELEGATE_FIRST;
proc.delegate = new PrintHandler()
proc();
