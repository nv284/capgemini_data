function calculateInterest() {
    const principal = parseFloat(document.getElementById('principal').value);
    const rate = parseFloat(document.getElementById('rate').value);
    const time = parseFloat(document.getElementById('time').value);
    const interestType = document.getElementById('interestType').value;
  
    if (isNaN(principal) || isNaN(rate) || isNaN(time)) {
      alert("Please enter valid inputs.");
      return;
    }
  
    let interest;
    if (interestType === "simple") {
      interest = (principal * rate * time) / 100;
    } else if (interestType === "cyclic") {
      interest = principal * Math.pow((1 + rate / 100), time) - principal;
    }
  
    const resultDiv = document.getElementById('result');
    resultDiv.textContent = `The calculated interest is: ₹${interest.toFixed(2)}`;
  }