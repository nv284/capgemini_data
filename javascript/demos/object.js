const person = {
    title :{
          docter :"Doc",
          engineer :"Eng",
          teacher :"Tea"
    },
    name:["sajal" , "badal" , "sumi"],
    age :[22,23,25],
    bio () {
        console.log(`{this.name[0] } {this.name[1] } {this.name[2] } is  ${this.age[0]} ${this.age[1]} ${this.age[2]} years old`);
    },
    intro : function(){
        console.log(`Hello ! Everyone I am  $ {this.name [0]} $ {this.name [1]} $ {this.name [2]}`)
    },
};
person.title.docter;
person.bio();
person.intro();

//--------------------------------------------------------

//Constructors 

let s1 ={
    name:"raj",
    intro(){
        console.log(`Hello ! Everyone I am ${this.name}`);
    }
};
let s2 ={
    name:"raj",
    intro(){
        console.log(`Hello ! Everyone I am ${this.name}`);
    }
};

function createPerson(name){
    const obj = {};
    obj.name = name ;
    obj.intro =function(){
        console.log(`Hello ! Everyone I am ${this.name}`);
    };
 return obj;
}
const mona = createPerson("Mona");
mona.intro();

const sona = createPerson("Sona");
sona.intro();

//consturtor function with parameter 
function Person(name){
    this.name = name ;
    this.intro =function(){
        console.log(`Hello ! Everyone I am ${this.name}`);
    };
 
}
const m =  new Person("Mona");
m.intro();

const s = new Person("Sona");
s.intro();

//built in construtor 
const o1 = new Object({name :"amit" , age:30});

const o2 = new String("Jhon");

const o3 = new Number(678);

const o4 = new Boolean(true);
console.log(o1);
console.log(o2);
console.log(o3);


