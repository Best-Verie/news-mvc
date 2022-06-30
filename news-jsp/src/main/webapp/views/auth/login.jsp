<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <style>
        .container-fluid{
            width: 100%;
            height: 100vh;        }
        .descr-page{
            background-color: #4361EE;
            height: 100vh;
        }
        .descr-part{
            /*display: flex;*/
            margin-top: 10em;
            /*justify-content: center;*/
            /*align-items: center;*/
        }
        .form-part{
            margin-top: 10em;
        }
        /*.content{*/
        /*    margin-top: 10em;*/
        /*}*/
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row content">
        <div class="col-md-6 descr-page">
            <div class="descr-part">
                <h3 class="font-italic">Welcome to the NEWS API</h3>
            </div>
        </div>
        <div class="col-md-6">
            <div class="form-part">
                <form action="/auth/login" method="post">
                    <div class="form-group">
                        <label for="exampleInputEmail1">Email address</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name = "email" placeholder="Enter email">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>

        </div>
    </div>
</div>
</body>
</html>