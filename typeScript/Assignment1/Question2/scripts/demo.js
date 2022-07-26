var x = 11;
if (x == 11) {
    var a_1 = 5;
}
else {
    var a_2 = 6;
}
//console.log(a); cannot print a becase its scope is only in if and else block
// to use it ue can use var insted of let
if (x == 11) {
    var a = 5;
}
else {
    var a = 6;
}
console.log(a);
