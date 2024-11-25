// Frontend JavaScript for registration and login

// Registration Form
document.getElementById("registerForm").addEventListener("submit", async (e) => {
    e.preventDefault();

    const username = document.getElementById("registerUsername").value;
    const password = document.getElementById("registerPassword").value;

    const response = await fetch("http://localhost:3000/register", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ username, password }),
    });

    const message = await response.text();
    document.getElementById("message").innerText = message;
});

// Login Form
document.getElementById("loginForm").addEventListener("submit", async (e) => {
    e.preventDefault();

    const username = document.getElementById("loginUsername").value;
    const password = document.getElementById("loginPassword").value;

    const response = await fetch("http://localhost:3000/login", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ username, password }),
    });

    const message = await response.text();
    document.getElementById("message").innerText = message;

    if (response.ok) {
        document.getElementById("message").style.color = "green";
    } else {
        document.getElementById("message").style.color = "red";
    }
});
