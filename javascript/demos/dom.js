document.write(Date());

const table = document.getElementById("table");
const tableAttrs = table.attributes;
for(let i = 0;i<tableAttrs.length;i++){
    if(tableAttrs[i].nodeName.toLowerCase()=== "border"){
        table.border="1";
    }
}
table.summry="note : increased border ";