const a =[1,2,3];
const b = [5,6,7];
const c = a.concat(b);
console.log("concat array : " , c);
const d = [a,b];
console.log(c);//[[1,2,3],[5,6,7]]
const e = [...a , ...b];//[1,2,3,5,6,7]
//rest operator
function demo(...p){
    //let a1 = Array.from(b);
   // let a2 =a1.map(x=>x*2);
   let a2 = p.map(x=>x*2);
    console.log(a2);
}
demo(1,2);
demo(2,3,2);

let arr = [3,4,5,6];
let m = arr.map(function(element){
    return element*2;
})

console.log(arr);

let Emp = [{fname:"suman" , lname:"kale"},
    {fname:"rajat" , lname: "pradhan"},
    {fname:"bhushan" ,lname: "sharma"}];

    let emp1 = Emp.map(function(element){
        return `${element.fname}  ${element.lname}`;
    })
    console.log(emp1);





    function itr(value ,key,map){
        console.log(`m[${key}] = ${value}`);
    }

    new Map ([['a', 10],['b' , 12],['x' , '13'],]).foreach(itr);

//set 
let s = new Set ([1,1,2,3,4,4,5,5,5,6,7]);
console.log("set :" , typeof(s));
console.log("set :" , (s));
console.log("check 5 is present :" ,s.has(5));
for (let p of s ){
    console.log(p);
}





//
const m1 = new Map() ;       
const map1 = new Map();

map1.set('0', 'foo');
map1.set(1, 'bar');

const iterator1 = map1.keys();

console.log(iterator1.next().value);


console.log(iterator1.next().value);

