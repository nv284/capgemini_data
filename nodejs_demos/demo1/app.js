// Load the http module to create an HTTP server
const http =  require('http');

const hostname = '127.0.0.1'; //localhost 

const port = 3000;

//creating server 
const server = http.createServer((req,res)=>{
    res.statusCode = 200; //Http status code 200 (ok)
    res.setHeader('Contect-Type','text/plain');//set the response content type 
    res.end('Hello World !!\n');
});


// start the server 
server.listen(port , hostname , ()=>{
    console.log(`server running at http:\\${hostname} :${port}/`);//log server url 
});
