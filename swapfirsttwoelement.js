function swap(arr){

   let temp = arr[0];
    arr[0]= arr[1];
    arr[1] = temp;
    return arr;
}
let arr = [1,2,3,4,5,6]

console.log(swap(arr));
