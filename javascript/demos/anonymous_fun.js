let x = function(){
    console.log("It will not run :)");
}
x();

function welcome(wish){
    console.log(wish() , "everyone");
}
welcome(function(){
    return "good Morning All!!!!";
})

setTimeout(function(){
    console.log("Hello World");
},5000);

//IIFE
(function(p){
    alert(p);
})('Hi everyone ');
//regular function
let m1 = function(n1 , n2 ){
    return n1*n2;
}
//arrow function 
let m2 =(n1 , n2)=>{return n1*n2} ;

const w = (name='Robot') =>`Hello ,${name}`;
console.log(w('John'));
console.log(w());

// arrow function with this 

const group ={
    member :['Sheena' , 'Reena'],
    groupName : 'India ',
    groupMsg : function(){
               this.member.forEach((mem)=>{
                console.log(`${mem} is in the Group ${this.groupName}`);
               });
    }
};

group.groupMsg(); //lexicall binds 'this ' to the Group object context 


// JavaScript Object -----
const student = {
    firstname : " Ram ",
    rollNo: 303,
    subject : 'Computer Science', 
    displayInfo : function(){
        console.log("This Is the Info about Students ");
    }
};

student.firstname ="Damini";
student.lastName = "Gupta";
student.skill= 'Java';
delete student.lastName
student.displayInfo();
console.log(student);
















