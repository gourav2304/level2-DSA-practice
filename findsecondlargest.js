let arr = [22,3,33,5,5,66,77,77]

for(let i = 0 ; i<= arr.length-1; i++){
    for(let j= 0 ; j<=arr.length-1-i ; j++){
        if(arr[j]< arr[j+1]){
            [arr[j] , arr[j+1] ]= [arr[j+1], arr[j]];
        }
    }console.log(arr)
}
let secondlargest = "";

for(let i = 0 ; i<=arr.length ; i++){
    if(arr[i] != arr[0]){
        secondlargest = arr[i]
        console.log(secondlargest);
        break;
    }

}