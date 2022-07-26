let Order = {
    id: 1,
    title: "Your order deliverd successfully",
    price: 100,
    printOrder(){
        console.log(this.id);
        console.log(this.title);
        console.log(this.price);
    },
    getPrice(){
        return this.price;
    }
}
let copy = Object.assign({}, Order);

console.log(copy);