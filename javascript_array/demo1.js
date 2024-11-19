let names = ["jhon" , "aina" , "Tom " , "tim " , "bella"];
//Descructive methods 
//extract 
names.pop();
console.log("after extracting :" ,names);
//insertion 
names.push('jenny');
console.log("after inserting : " , names);
// first element of an array.
names.shift();
console.log("shift method :" , names );
//add element at the begining of the array 
names.unshift("Rose");
//splice - returns the removed element  -> array.splice(index , howmany , element)
names.splice(2,1);
console.log("splice :",names);
//Non-destructive methods 
let job = ["dev" , "tester" , "UI-Dev" , "Program-Manager" , "Project-Manager" , "Senior Manager " , "Lead"];
//concate
let info = names.concat(job);
console.log("concatenated array : " , info);
names.concat("Isha");
names.concat(job , "Scrum Master");
console.log("concatenated array : " , names);
//slice
const name = names.slice(0,3);
console.log("Slice :", name);
const name1 = names.slice(-4,-2);
console.log("Slice with negative index :", name1);
const nums = [1,2,3,4,5,6,7];
nums.fill("*" , 2,5);
console.log("fill :", nums);
let data = ['A','B','C','D','E'];
let joinName = data.join();
console.log("join :", joinName);
let joinName1 = data.join('-');
console.log("join :", joinName1);
console.log(names.includes("Rose"));
console.log(names.includes("Rose" ,3));
let students =[
    {name:"John" , age:20},
    {name:"Aina" , age:21},
    {name:"Tom" , age:22},
    {name:"Tim" , age:23}
];
const checkStudent =(student) =>{
    if(student.name === "Tom"){
        return student;
    }
};
console.log(students.find(checkStudent).age);

console.log(job.indexOf(3));//[2,3,4,5,6,7,8,9]
console.log(job.indexOf(3 , -1));







