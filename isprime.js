function isPrime(n){
    if(n<=0)return false
    if(n===2)return true;
    if(n%2===0)return false

    const sqrt = Math.sqrt(n)
    for(let i=3; i<=sqrt; i +=2){
        if(n%i===0)return false

    }
    return true
}
console.log(isPrime(7));


function isprime1(n){

    if(n===2)return true
    if(n<=0)return false
    if(n%2 ===0)return false


    let sqrt = Math.sqrt(n)
    for(let i=3; i<=sqrt; i++){
        if(n%i ==0){
            return false
        }
    }return true

}
console.log(isprime1(6))