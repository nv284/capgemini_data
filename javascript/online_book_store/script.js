const users = [];

// Registration logic
function registerUser() {
  const name = document.getElementById("name").value;
  const age = parseInt(document.getElementById("age").value);
  const email = document.getElementById("email").value;
  const categories = Array.from(document.getElementById("categories").selectedOptions).map(option => option.value);

  if (age < 10 || age > 80) {
    alert("Age must be between 10 and 80.");
    return;
  }

  const user = { name, age, email, categories };
  users.push(user);
  alert("Registration successful! Please log in.");
  document.getElementById("registerForm").classList.add("d-none");
  document.getElementById("loginForm").classList.remove("d-none");
}

// Login logic
function loginUser() {
  const email = document.getElementById("loginEmail").value;
  const user = users.find(user => user.email === email);

  if (user) {
    alert(`Welcome back, ${user.name}!`);
    document.getElementById("loginForm").classList.add("d-none");
    document.getElementById("bookCategories").classList.remove("d-none");
    displayCategories(user.categories);
  } else {
    alert("User not found. Please register.");
  }
}

// Display selected categories
function displayCategories(categories) {
  const categoryList = document.getElementById("categoryList");
  categoryList.innerHTML = "";
  categories.forEach(category => {
    const li = document.createElement("li");
    li.className = "list-group-item";
    li.textContent = category;
    categoryList.appendChild(li);
  });
}

// Logout logic
function logout() {
  document.getElementById("bookCategories").classList.add("d-none");
  document.getElementById("loginForm").classList.remove("d-none");
  document.getElementById("loginEmail").value = "";
}


