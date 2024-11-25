function firstFunction(callback){
    setTimeout(()=>{
        console.log('First function executed');
        callback();
    },1000);

}
function secondFunction(callback){
    setTimeout(()=>{
        console.log('second function executed');
        callback();
    },1000);
}

function thirdFunction(callback){
    setTimeout(()=>{
        console.log('third function executed');
        callback();
    },1000);
}

firstFunction(()=>{
    secondFunction(()=>{
        thirdFunction(()=>{
            console.log('All functions executed');
        });
    });
});