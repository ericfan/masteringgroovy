class Order {
  int orderNo
  Customer customer
  String desc

  static main(args){
    Order order1 = new Order()
    order1.orderNo = 1
    order1.customer = new Customer(name:"EricFan", email:"fanlei77@hotmail.com" )
    order1.setDesc("Sample")
    println order1.customer.showMail()
  }
}

class Customer {
   String name
   String email
   String address

   String showMail(){
     email
   }
}
