var list = ["Hello", "World", "in", "a", "frame"] ;

function printPattern(arr){
    console.log("*********************");
    for(i=0;i<arr.length; i++){
        console.log("*"+arr[i]+"*");
    }
    console.log("*********************");
}

printPattern(list);