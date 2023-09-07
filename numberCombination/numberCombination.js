function generateCombinations(a, b, c, current, combinations) {
  if (current.length === 3) {
    combinations.push(current);
    return;
  }

  generateCombinations(a, b, c, current + a, combinations);
  generateCombinations(a, b, c, current + b, combinations);
  generateCombinations(a, b, c, current + c, combinations);
}

const a = 1;
const b = 2;
const c = 3;
const combinations = [];

generateCombinations(a, b, c, "", combinations);

console.log(combinations);
