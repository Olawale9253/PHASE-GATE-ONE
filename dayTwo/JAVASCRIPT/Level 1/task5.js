const prompt = require('prompt-sync')();

let temperature = Number(prompt('Enter temperature '));

celsius = (temperature * 9/5) + 32

console.log("the temperature is: " + celsius); 
