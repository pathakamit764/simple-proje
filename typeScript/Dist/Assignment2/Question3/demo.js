"use strict";
let list = [153, 370, 371, 407];
function* generatorFunc(n1) {
    for (let item of list) {
        yield item;
    }
    yield null;
}
var generatorObject = generatorFunc(128);
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
var generatorObject = generatorFunc(128);
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
