
function add(a,b){
    return a+b;
}
function subtract(a,b){
    return a-b;
}
function multiply(a,b){
    return a*b;
}
function divide(a,b){
    if(b === 0){
        throw new Error("Cannot divide by zero");
    }
    return a/b;
    }

    //export the function so they can be used in other files 
    module.exports = {
        add,
        divide,

    }
    module.exports = " I am a Module ";

    module.exports.name = ' Java Full Stack ';
    module.exports.frmwork = 'springboot';