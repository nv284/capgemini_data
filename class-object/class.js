class Employee{
    constructor(name , id ){
        this.name = name ;
        this.id = id ;
    }
    disp(){
        console.log(`Employee name is ${this.name} and id is ${this.id}`);
    }
}
let e1 = new  Employee("Radha" , 22);
let e2 = new Employee("Sumit" , 24);
e1.disp() ; e2.disp();