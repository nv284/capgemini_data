const express = require("express");
const mysql = require("mysql");
const bodyParser = require("body-parser");
const cors = require("cors");

const app = express();
const PORT = 3000;

// Middleware
app.use(cors());
app.use(bodyParser.json());
app.use(express.static("public"));

// MySQL Connection
const db = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "pass", // replace with your MySQL password
    database: "user_management",
});

db.connect((err) => {
    if (err) {
        console.error("Error connecting to the database:", err);
    } else {
        console.log("Connected to MySQL database.");
    }
});

// Create 'users' table if it doesn't exist
db.query(
    `CREATE TABLE IF NOT EXISTS users (
        id INT AUTO_INCREMENT PRIMARY KEY,
        username VARCHAR(255) NOT NULL,
        password VARCHAR(255) NOT NULL
    );`,
    (err) => {
        if (err) console.error(err);
    }
);

// User Registration Endpoint
app.post("/register", (req, res) => {
    const { username, password } = req.body;

    const query = "INSERT INTO users (username, password) VALUES (?, ?)";
    db.query(query, [username, password], (err) => {
        if (err) {
            res.status(500).send("Error registering user.");
        } else {
            res.status(200).send("User registered successfully.");
        }
    });
});

// User Login Endpoint
app.post("/login", (req, res) => {
    const { username, password } = req.body;

    const query = "SELECT * FROM users WHERE username = ? AND password = ?";
    db.query(query, [username, password], (err, results) => {
        if (err) {
            res.status(500).send("Error logging in.");
        } else if (results.length > 0) {
            res.status(200).send("Login successful.");
        } else {
            res.status(401).send("Invalid credentials.");
        }
    });
});

// Start the server
app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
