function countDigit(x){
    let result = 0;

    while(x>0){
        x=Math.floor(x/10);
        result++;

    }
    return result;
}

let x = 98767;
console.log(countDigit(x));
