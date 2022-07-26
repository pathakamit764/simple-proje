"use strict";
function add(a = 5, b = 5) {
    console.log(a + b);
}
add();
add(2, 2);
add(10, 2);
let displayFriend = function (name, ...friend) {
    console.log(name);
    for (let frn of friend) {
        console.log(frn);
    }
};
displayFriend("sanjay", "friendList", "abc", "xyz", "try");
let friendList = ["abc", "xyz", "try"];
displayFriend("sanjay", ...friendList);
console.log(" ");
let pringCapitalName = (...name) => {
    for (let n of name) {
        console.log(n.toUpperCase());
    }
};
let nameList = ["Sanjay", "Yogesh", "David"];
pringCapitalName(...nameList);
