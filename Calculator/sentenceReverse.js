/*
var input = prompt("Enter a sentence:");
var output = reverseWords(input);
console.log(output);
*/

/*
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter a sentence: ', function (input) {
  var output = reverseWords(input);
  console.log(output);
  rl.close();
});

*/

var input = "This is a sunny day";
var output = reverseWords(input);
console.log(output);



function reverseWords(sentence) {
  var array = sentence.split(' ');
  for (var i = 0; i < array.length; i++) {
    array[i] = reverseString(array[i]);
  }

  var reverseSentence = array.join(' ');
  return reverseSentence;
}

function reverseString(str) {
  var reversed = '';
  for (var i = str.length - 1; i >= 0; i--) {
    reversed += str[i];
  }
  return reversed;
}