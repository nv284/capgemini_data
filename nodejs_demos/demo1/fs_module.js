const fs = require('fs');
const path = require('path');

const currentDir = process.cwd ();
const filePath = path.join (currentDir, 'file.txt');

fs.writeFile(filePath , 'Hello this is test file ' , (err)=>{
    if (err) {
        console.error(err);
        return;
    }
    console.log('File has been written sucessfully');

    fs.readFile(filePath , 'utf-8' , (err, data)=>{
        if (err) { 
            console.error(err);
            return;
        }
        console.log('File content :' , data);
    });
});