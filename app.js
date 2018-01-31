const express = require('express');
const app = express ();

app.get("/", (req, res) => res.send('hello tama'));
app.get("/jose", (req, res) => res.send('hello jose'));
app.get("/joiner", (req, res) => res.send('hello joiner'));

app.listen(3000, () => console.log("listen port: 3000"));
