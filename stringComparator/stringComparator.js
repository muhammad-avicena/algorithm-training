let str1 = "kuda";
let str2 = "kuDa";

function stringComparator(str1, str2) {
  let str1Lower = str1.toLowerCase();
  let str2Lower = str2.toLowerCase();

  if (str1Lower === str2Lower) {
    return true;
  } else {
    return false;
  }
}

console.log(stringComparator(str1, str2));
