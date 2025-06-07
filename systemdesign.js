class Customer {
  constructor(name, address, contactNumber) {
    this.name = name;
    this.address = address;
    this.contactNumber = contactNumber;
  }
}

class MenuItem {
  constructor(name, price) {
    this.name = name;
    this.price = price;
  }
}

class Restaurant {
  constructor(name) {
    this.name = name;
    this.menu = [];
  }

  addMenuItem(item) {
    this.menu.push(item);
  }

  getMenu() {
    return this.menu;
  }
}

class DeliveryPerson {
  constructor(name) {
    this.name = name;
    this.isAvailable = true;
  }

  assignOrder() {
    this.isAvailable = false;
  }

  completeOrder() {
    this.isAvailable = true;
  }
}

const OrderStatus = {
  PLACED: "Placed",
  OUT_FOR_DELIVERY: "Out for Delivery",
  DELIVERED: "Delivered",
};

class Order {
  constructor(customer, restaurant, items) {
    this.customer = customer;
    this.restaurant = restaurant;
    this.items = items;
    this.status = OrderStatus.PLACED;
    this.deliveryPerson = null;
  }

  assignDeliveryPerson(dp) {
    if (dp.isAvailable) {
      this.deliveryPerson = dp;
      dp.assignOrder();
      this.status = OrderStatus.OUT_FOR_DELIVERY;
    } else {
      console.log("Delivery person is not available");
    }
  }

  calculateTotal() {
    return this.items.reduce((sum, item) => sum + item.price, 0);
  }

  markDelivered() {
    this.status = OrderStatus.DELIVERED;
    if (this.deliveryPerson) {
      this.deliveryPerson.completeOrder();
    }
  }
}




// Create customer
const customer = new Customer("Gourav", "Bangalore", "9876543210");

// Create restaurant and menu
const restaurant = new Restaurant("Swiggy Bites");
const burger = new MenuItem("Burger", 120);
const fries = new MenuItem("Fries", 80);
restaurant.addMenuItem(burger);
restaurant.addMenuItem(fries);

// Create order
const selectedItems = [burger, fries];
const order = new Order(customer, restaurant, selectedItems);

// Assign delivery person
const dp = new DeliveryPerson("Ravi");
order.assignDeliveryPerson(dp);

// Print total
console.log("Order Total: ₹" + order.calculateTotal());

// Deliver the order
order.markDelivered();
console.log("Order Status:", order.status);



k k e * * * * *
k k e
k k e * * *
k k e
* * e