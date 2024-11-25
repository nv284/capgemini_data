console.log("start");
setTimeout(()=>{
    console.log("timeout 1");
} ,0);

setTimeout(()=>{
    console.log("timeout 2");
},0);

console.log("End");

/*
start 
end 
timeout 1
timeout 2
*/