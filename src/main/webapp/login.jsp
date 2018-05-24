<html>
<body>
<h2>Hello World!</h2>
</body>
<form action="login.action" method="post">
    <div>
        <input type="text" name="username" class="username"
               placeholder="用户名 / UID" autocomplete="off" required/>
    </div>
    <div>
        <input type="password" name="password" class="password"
               placeholder="密码" oncontextmenu="return false"
               onpaste="return false" required/>
    </div>
    <button id="submit" type="submit" class="btn btn-success btn-block loginbtn">登陆</button>
</form>
</html>
