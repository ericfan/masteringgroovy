class Order {
  Integer no;
  String desc;
  Customer customer;
}

class Customer{
  String name;
  String mail;
}

Customer c1 = new Customer();
c1.name="Eric"
c1.mail="eric.fan@test.com"
Customer c2 = new Customer();
c2.name="Bacon"
c2.mail="bacon.wang@test.com"
def list = new ArrayList();
def order1 = new Order();
order1.no = 1
order1.desc = "Description1";
order1.customer = c1;
list.push(order1);
def order2 = new Order();
order2.no = 2
order2.desc = "Description2";
order2.customer = c2;
list.push(order2);
println(list)

def builder = new groovy.xml.MarkupBuilder(new FileWriter("orders.xml"));
builder.orders{
  for(o in list){
    order{
      no(o.no)
      description(o.desc)
      customer{
        name(o.customer.name);
        email(o.customer.mail);
      }
    }
  }
}
