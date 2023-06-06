const jwt = require('jsonwebtoken');

// Specify your secret key
const secretKey = 'rs23@546#8767dmf';

// Specify the payload (data) for the token
const payload = {
  userId: '123456',
  name: 'Manasa Devi',
};

// Generate the JWT token
const token = jwt.sign(payload, secretKey);

// Output the token
console.log(token);
