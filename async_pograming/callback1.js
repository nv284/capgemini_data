function fetchData(callback){
     
    setTimeout(()=>{
        const data = {name :" Seema" , age:30};
    callback(data);
},2000);
}

function displayData(userData){
 console.log(`Name : ${userData.name} , Age : ${userData.age}`);
}

fetchData(displayData);