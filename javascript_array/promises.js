 /*function getData(){
    return [
        {name: 'John', age: 25},
        {name: 'Jane', age: 30},
        {name: 'Bob', age: 35}
    ];
 }
 function findData(u_name){
    const users = getData();
    const user = users.find(user => user.name === u_name);
    return user;
 }*/
/*promises
const promise = new Promise((resolve , reject )=>{})
*/

 console.log(findData('Jhon')); 

 function getUsers(callback){
   setTimeout(()=>{ 
    callback([   {name: 'John', age: 25},
    {name: 'Jane', age: 30},
    {name: 'Bob', age: 35} ]); } , 1000);
       
 }
function findUser(u_name , callback){
 getUsers((users)=>{
    const user = users.find((user) => user.name === u_name);
callback(user);
 });

}
console.log(findUser('Jhon'));