function fun1(name , callback){
  console.log('Hello ');
  callback(name);
}

function callme(name){
   console.log('callback Function  ' );
   console.log('Hey My name is ', name);
}

//fun1('Preeti' , callme);
setTimeout(fun1 , 2000 , 'Preeti' ,callme);


function dispTime(){
    
}