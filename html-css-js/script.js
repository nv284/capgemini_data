document.getElementById('registrationForm').addEventListener('submit', function (event) {
    event.preventDefault(); // Prevent form submission
    
    // Collect form data
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const email = document.getElementById('email').value;
    const gender = document.getElementById('gender').value;
    const phone = document.getElementById('phone').value;
    const altEmail = document.getElementById('altEmail').value;

    // Check if already registered (mock logic for demonstration)
    if (localStorage.getItem(email)) {
        alert('User already registered. Please log in.');
        return;
    }

    // Store user data (for simplicity, using localStorage)
    const userData = {
        username,
        password,
        email,
        gender,
        phone,
        altEmail
    };

    localStorage.setItem(email, JSON.stringify(userData));
    alert('Registration successful!');
    document.getElementById('registrationForm').reset();
});

// Login logic
document.getElementById('loginLink').addEventListener('click', function () {
    const email = prompt('Enter your registered email:');
    const password = prompt('Enter your password:');
    
    const userData = localStorage.getItem(email);
    
    if (userData) {
        const user = JSON.parse(userData);
        if (user.password === password) {
            alert(`Welcome back, ${user.username}!`);
        } else {
            alert('Incorrect password. Please try again.');
        }
    } else {
        alert('No user found with this email. Please register.');
    }
});