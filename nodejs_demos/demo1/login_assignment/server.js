// server.js
const http = require('http');
const url = require('url');
const fs = require('fs');
const path = require('path');

// User credentials for demo purposes
const validUsername = 'user';
const validPassword = 'password';

// Create an HTTP server
const server = http.createServer((req, res) => {
    const parsedUrl = url.parse(req.url, true);

    // Serve the login page
    if (parsedUrl.pathname === '/' || parsedUrl.pathname === '/login.html') {
        fs.readFile(path.join(__dirname, 'login.html'), (err, data) => {
            if (err) {
                res.writeHead(500, { 'Content-Type': 'text/plain' });
                res.end('Internal Server Error');
                return;
            }
            res.writeHead(200, { 'Content-Type': 'text/html' });
            res.end(data);
        });
    } 
    // Handle login request
    else if (parsedUrl.pathname === '/login' && req.method === 'POST') {
        let body = '';
        req.on('data', chunk => {
            body += chunk.toString(); // Convert Buffer to string
        });
        req.on('end', () => {
            const params = new URLSearchParams(body);
            const username = params.get('username');
            const password = params.get('password');

            // Validate credentials
            if (username === validUsername && password === validPassword) {
                res.writeHead(200, { 'Content-Type': 'text/html' });
                fs.readFile(path.join(__dirname, 'welcome.html'), (err, data) => {
                    if (err) {
                        res.writeHead(500, { 'Content-Type': 'text/plain' });
                        res.end('Internal Server Error');
                        return;
                    }
                    res.end(data);
                });
            } else {
                res.writeHead(401, { 'Content-Type': 'text/html' });
                res.end('<h1>Invalid username or password. Please try again.</h1><a href="/">Go back to login</a>');
            }
        });
    } 
   
    // Handle 404
    else {
        res.writeHead(404, { 'Content-Type': 'text/plain' });
        res.end('404 Not Found');
    }
});

// Start the server
const PORT = 3000;
server.listen(PORT, () => {
    console.log(`Server is running at http://localhost:${PORT}`);
});
