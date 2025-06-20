
    let index =1;
    for(let i =101; i<=150;i++){
        let tens = Math.floor(i/10)%10;
        let unit = i%10;
        if(tens ===unit){
            // console.log(`Skipped at index ${index}: ${i}`);
        }else{
            console.log(`Index ${index}: ${i}`)
        }
    }
    

