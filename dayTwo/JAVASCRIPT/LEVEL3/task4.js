const prompt = require('prompt-sync')();

let number =Number(prompt('Enter number '));

for(let count = 1; count <= 12; count++){

    console.log("table of " + number * count);
}
