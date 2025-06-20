function factorial(n){
    let result = 1;
    for(let i = 2 ;i<=n; i++){
        result *= i;

    }
    let res = 0;
    while(result%10==0){
        res++;
        result = Math.floor(result/10);
    }
    return [res,result];
}
console.log(factorial(10));