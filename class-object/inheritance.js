//parent class 
class Animal {
    static staticword;
    static{
        console.log('satic block');
        Animal.staticword = {};
    }
    constructor(name, food) {
        this.name = name;
        this.food = food ; 
    }
    animalProp(){
        return `${name} ${food}`;
    }
    static msg(){
        return `I am an animal ${this.name}`;
    }
}
//child class 
 class Dog extends Animal {
    static prop = 'Love Dog ';
    constructor(name, breed , food) { 
        super(name, food); //constructor overriding 
        this.instanceprop = {};
        this.breed = breed;
    }
    breedName(){
        return `${breed}`;
    }
    static msg(){ //method overridding 
        return `I am an animal ${this.name}, my breed is  ${this.breed}`;
    }
 }
 let a1 = new Dog ('Tom ' , 'Dog' , 'dogFood');
 let b1 = new Dog ('JIm' , 'Cat' , "milk");
 console.log(Dog.msg()); //static method 
 console.log(Dog.prop);
 console.log(a1.prop ==  b1.prop);
console.log(a1.instanceprop == b1.instanceprop );