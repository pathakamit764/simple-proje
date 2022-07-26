"use strict";
var add1 = function (A, B) {
    return new Promise((resolve, reject) => {
        var sum = A + B;
        if (sum) {
            resolve(sum);
        }
        else {
            reject(Error("Could not add the two values"));
        }
    });
    ;
};
add1(2, 5).then((added) => {
    console.log("Addition is: " + added);
});
