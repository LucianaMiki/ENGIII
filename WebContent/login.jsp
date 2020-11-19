<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta name="description" content="Tela de login">
	<meta name="author" content="Marcela Amorim">
	<meta name="viewport" content="width=device-widht, initial-scale=1.0">
	<meta http-equiv=”X-UA-Compatible” content="ie=edge">
	<title>CINEMAX</title>
	<link rel="stylesheet" href="assets/css/formlogin.css">
</head>

<body class="is-preload">
	<!-- Breadcrumb -->
	<ul class="breadcrumb">
		<li><a href="index.html">INICIAL</a></li>
		<li>LOGIN</li>
	</ul>
	
	<form class="form" action="#">
		<div class="card">
			<div class="card-top">
				<div align="center"><img class="imglogin" src="./assets/css/images/user.png" alt=""></div>

				<h2 class="titulo">Login</h2>
				<p>Gerenciamento do cinema</p>
			</div>

			<div class="card-group">
				<input type="email" name="email" placeholder="Digite seu email" required="">
			</div>

			<div class="card-group">
				<input type="password" name="senha" placeholder="Digite sua senha" required="">
			</div>

			<div class="card-group">
				<!-- Lembre-me -->
				<label><input type="checkbox" name=""> Lembre-me</label>
			</div><br>

			<div class="col-12">
				<div class="card-group btn">
					<!-- Enviar -->
			<button id="btnOcorrenciaConcluida" class="hide" type="submit" onClick="window.location.href='func.html'" >ENTRAR</button>
				</div>
			</div>
	</form>
	</script>
</body>

</html>