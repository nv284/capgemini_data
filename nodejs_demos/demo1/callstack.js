
// 2. inside firstFun , secondFun is aclled and pushed onto the stack 
function firstFun(){
   console.log("First Function started ");
   //3. secondFun executes and log "Second functon started then returns and pop off the stack "
   secondFun();
   //4. control returns to firstFun , which log "first function ended " then pops off the stack 
   console.log("First Function ended");

}
//5. callstack is now empty .
function secondFun(){
    console.log("Second Function started ");
}

//1. this is called and pushed onto the stack 
firstFun();