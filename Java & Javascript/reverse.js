

function reverseWords(sentence) {
    let words = sentence.split(" ");
    let reversedWords = words.map(word => word.split("").reverse().join(""));
    let reversedSentence = reversedWords.join(" ");
    return reversedSentence;
}

let inputSentence = "This is sunny day";
let reversedResult = reverseWords(inputSentence);
console.log(reversedResult);

