function firstFunction(){
    return new Promise((resolve)=>{
        setTimeout(()=>{
            console.log('First function executed');
            callback();
        },1000);
    });    
}
function secondFunction(){
    return new Promise((resolve)=>{
        setTimeout(()=>{
            console.log('second function executed');
            callback();
        },1000);
    });
   
}

function thirdFunction(){
    return new Promise((resolve)=>{setTimeout(()=>{
        console.log('third function executed');
        callback();
    },1000);});
    
}

firstFunction().then(secondFunction).then(thirdFunction).then(()=>{
    console.log('All functions executed');
});