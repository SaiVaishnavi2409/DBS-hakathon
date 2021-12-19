const express = require('express');
const mongoose = require('mongoose');
const app=express()
const bodyParser=require('body-parser')
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json())

mongoose.connect("mongodb://vishnuvardhan:vishnu@cluster0-shard-00-00.mro7x.mongodb.net:27017,cluster0-shard-00-01.mro7x.mongodb.net:27017,cluster0-shard-00-02.mro7x.mongodb.net:27017/myFirstDatabase?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority").then(() => { console.log("successful db connection") }).catch((err) => { console.log(err) });
app.set("view engine", 'ejs');

app.get("/", function (req, res) {
    res.render('home', { data: { view: false } });
});
app.get("/adminlog", function (req, res) {
    res.render('adminlog', { data: { view: false } });
});
app.get("/admin", function (req, res) {
    res.render('admin', { data: { view: false } });
});
app.post("/admin", function (req, res) {
    res.render('admin', { data: { view: false } });
});
app.get("/user", function (req, res) {
    res.render('cust', { data: { view: false } });
});
app.post("/user", function (req, res) {
    res.render('cust', { data: { view: false } });
});
app.post('/buystock',(req,res)=>{
    console.log(req.body)
    res.render('cust', { data: { view: false } });
})
app.listen(3000,()=>{
    console.log("running");
})