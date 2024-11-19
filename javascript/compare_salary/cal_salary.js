function compareSalaries() {
    const emp1Name = document.getElementById('emp1Name').value;
    const emp1Experience = parseFloat(document.getElementById('emp1Experience').value);
    const emp1Salary = parseFloat(document.getElementById('emp1Salary').value);
  
    const emp2Name = document.getElementById('emp2Name').value;
    const emp2Experience = parseFloat(document.getElementById('emp2Experience').value);
    const emp2Salary = parseFloat(document.getElementById('emp2Salary').value);
  
    if (
      isNaN(emp1Experience) || isNaN(emp1Salary) ||
      isNaN(emp2Experience) || isNaN(emp2Salary)
    ) {
      alert("Please enter valid inputs for experience and salary.");
      return;
    }
  
    let resultMessage;
  
    if (emp1Experience > emp2Experience) {
      resultMessage = `${emp1Name} has more experience (${emp1Experience} years) compared to ${emp2Name} (${emp2Experience} years). `;
    } else if (emp1Experience < emp2Experience) {
      resultMessage = `${emp2Name} has more experience (${emp2Experience} years) compared to ${emp1Name} (${emp1Experience} years). `;
    } else {
      resultMessage = `${emp1Name} and ${emp2Name} have equal experience (${emp1Experience} years). `;
    }
  
    if (emp1Salary > emp2Salary) {
      resultMessage += `${emp1Name} earns more (₹${emp1Salary}) than ${emp2Name} (₹${emp2Salary}).`;
    } else if (emp1Salary < emp2Salary) {
      resultMessage += `${emp2Name} earns more (₹${emp2Salary}) than ${emp1Name} (₹${emp1Salary}).`;
    } else {
      resultMessage += `${emp1Name} and ${emp2Name} have the same salary (₹${emp1Salary}).`;
    }
  
    document.getElementById('result').textContent = resultMessage;
  }