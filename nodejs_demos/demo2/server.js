// server.js
const express = require('express');
const mysql = require('mysql');
const bodyParser = require('body-parser');
const path = require('path');

// Create an instance of express
const app = express();
const PORT = 3000;

// Middleware
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static(path.join(__dirname, 'public')));

// MySQL connection
const db = mysql.createConnection({
    host: 'localhost',
    user: 'your_mysql_username', // replace with your MySQL username
    password: 'your_mysql_password', // replace with your MySQL password
    database: 'user_registration'
});

// Connect to MySQL
db.connect((err) => {
    if (err) throw err;
    console.log('Connected to MySQL Database');
});

// Serve the registration form
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'public', 'index.html'));
});

// Handle form submission
app.post('/register', (req, res) => {
    const { name, email, phone, address, pan_number } = req.body;

    // Insert the user data into the database
    const sql = 'INSERT INTO users (name, email, phone, address, pan_number) VALUES (?, ?, ?, ?, ?)';
    db.query(sql, [name, email, phone, address, pan_number], (err, result) => {
        if (err) {
            return res.status(500).send('Error inserting data into database');
        }
        res.send('User registered successfully with ID: ' + result.insertId);
    });
});

// Start the server
app.listen(PORT, () => {
    console.log(`Server is running at http://localhost:${PORT}`);
});
