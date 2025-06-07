// function reverse(str){

//     let reverse1= "";

//     for(i=str.length-1; i>=0;i--){
//         reverse1 += str[i];
//     }
//     return reverse1;
// }
// console.log(reverse("hello"))


function palindrome(str){
    let reverse = "";

    for(let i=str.length-1; i>=0;i--){
        reverse += str[i]
    }
    return reverse;
}
console.log(palindrome("hello"));

let arr = [1,2,3,4,5,6,7,8]
let target1 = 8

function find(arr, target){
    let start= 0
    let end=arr.length-1

    while(start<=end){
        let mid= Math.floor(start+end / 2)
        if(arr[mid]==target1){
            return mid
        }else if(arr[mid]< target1){
            start = mid+1
        }else{
            end = mid -1
        }
    }
    return -1
}

let result1 = find(arr,target1)
console.log("found at ",result1);



function reverse(str){
    let reversed= ""
    for(let i=str.length-1; i>=0; i--){
        reversed += str[i]
    }
    return reversed
}
 console.log(reverse("hello world "))



 let myarr= [1,2,3,4,5,67,89]
 let target = 5;

 function find1(myarr, target){
    let start = 0;
    let end = myarr.length-1;

    while(start<=end){
        let mid= Math.floor((start+end)/2)
        if(myarr[mid]===target){
            return mid
        }else if(myarr[mid]< target){
             start = mid+ 1
        }else{
            end = mid-1
        }
    }
    return -1
}

let result = find1(myarr, target)
console.log("found at ",result)



