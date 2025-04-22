<?php
if($_SERVER['REQUEST_METHOD']=='POST'){
        $username =$_POST['username'];
        $email = $_POST['email'];
        $age =$_POST['age']; 
        $password = $_POST['password'];
    }
    ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Inf</h1>
    <table>
        <thead>
            <tr>
                <td>User Name</td>
                <td>Email User</td>
                <td>Age User</td>
                <td>Password User</td>
            </tr>
        </thead>
        <tbody>
                <tr>
                    <td> <?= $username?> </td>
                    <td> <?= $email?> </td>
                    <td> <?= $age?> </td>
                    <td> <?= $password?> </td>
                </tr>
            </tbody>
    </table>
</body>
</html>
