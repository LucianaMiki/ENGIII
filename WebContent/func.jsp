<!DOCTYPE HTML>
<html>

<head>
	<title>CINEMAX</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<meta name="description" content="Tela Gerencia">
	<meta name="author" content="Marcela Amorim">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="assets/css/funcmain.css" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">

</head>

<body class="is-preload">
	<!--Menu-->

	<nav class="navbar navbar-inverse">
		<a href="login.html">Logout</a>
		<div class="animation start-home"></div>
	</nav>

	<!-- Main -->
	<div id="main">

		<header class="major container medium">
			<h2>Essa área é reservada apenas a funcionárois com permissão de acesso</h2>
			<p>Cadastre uma nova informação pelo botão principal ou veja mais ações direcionadas</p>
		</header>
		<div class="box alt container">
			<ul class="actions special">
				<li>
					<div id="busca">
						<form class="form-inline">
							<input class="form-control shadow-sm" type="text" placeholder="Pesquisar">

						</form>
					</div>
				</li>
				<li><input type="submit" value="Cadastrar Novo Agendamento" id="btnadd" onClick="window.location.href='formadd.jsp'"/></li>
			</ul><br>
			<section class="feature left">
				<a href="#" class="image icon solid "><img src="images/re.jpg" alt="" /></a>
				<div class="content">
					<h3>Sala 01</h3>
					<p>O Senhor dos Aneis: A Sociedade do Anel<br>Fantasia/Aventura ‧ 03:48 ‧ Faixa Etária: 12
						<br>Sessões - 14:00, 18:30, 22:00</p>
					<ul class="actions special">
						<li><input type="submit" value="Editar" onClick="window.location.href='formed.html'" /></li>
						<li><input type="submit" value="Excluir" data-toggle="modal" data-target="#myModal" /></li>
					</ul>
				</div>
			</section>
			<section class="feature right">
				<a href="#" class="image icon solid "><img src="images/pic2.jpg" alt="" /></a>
				<div class="content">
					<h3>Sala 02</h3>
					<p>O Senhor dos Aneis: As Duas Torres<br>Fantasia/Aventura ‧ 03:43 ‧ Faixa Etária: 12 <br>Sessões -
						12:00, 16:30, 21:00</p>
					<ul class="actions special">
						<li><input type="submit" value="Editar" onClick="window.location.href='formed.jsp'" /></li>
						<li><input type="submit" value="Excluir" data-toggle="modal" data-target="#myModal" /></li>
					</ul>
				</div>
			</section>
			<section class="feature left">
				<a href="#" class="image icon solid "><img src="images/pic03.jpg" alt="" /></a>
				<div class="content">
					<h3>Sala 03</h3>
					<p>O Senhor dos Aneis: O Retorno do Rei<br>Fantasia/Aventura ‧ 04:11 ‧ Faixa Etária: 14 <br>Sessões
						- 12:00, 16:30, 21:00</p>
					<ul class="actions special">
						<li><input type="submit" value="Editar" onClick="window.location.href='formed.jsp'" /></li>
						<li><input type="submit" value="Excluir" data-toggle="modal" data-target="#myModal" /></li>
					</ul>
				</div>
			</section>
			<section class="feature right">
				<a href="#" class="image icon solid "><img src="images/pic4.jpg" alt="" /></a>
				<div class="content">
					<h3>Sala 04</h3>
					<p>O Hobbit: Uma Jornada Inesperada<br>Fantasia/Aventura ‧ 03:o2 ‧ Faixa Etária: 12 <br>Sessões -
						13:00, 16:30, 20:00</p>
					<ul class="actions special">
						<li><input type="submit" value="Editar" onClick="window.location.href='formed.jsp'" /></li>
						<li><input type="submit" value="Excluir" data-toggle="modal" data-target="#myModal" /></li>
					</ul>
				</div>
			</section>
			<section class="feature left">
				<a href="#" class="image icon solid "><img src="images/pic5.jpg" alt="" /></a>
				<div class="content">
					<h3>Sala 05</h3>
					<p>O Hobbit: A Desolação de Smaug<br>Fantasia/Aventura ‧ 03:o7 ‧ Faixa Etária: 12 <br>Sessões -
						12:00, 16:30, 21:00</p>
					<ul class="actions special">
						<li><input type="submit" value="Editar" onClick="window.location.href='formed.jsp'" /></li>
						<li><input type="submit" value="Excluir" data-toggle="modal" data-target="#myModal" /></li>
					</ul>
				</div>
			</section>
			<section class="feature right">
				<a href="#" class="image icon solid "><img src="images/pic6.jpg" alt="" /></a>
				<div class="content">
					<h3>Sala 06</h3>
					<p>O Hobbit: A Batalha dos Cinco Exercitos<br>Fantasia/Aventura ‧ 02:44 ‧ Faixa Etária: 12
						<br>Sessões - 12:00, 16:30, 21:00</p>
					<ul class="actions special">
						<li><input type="submit" value="Editar" onClick="window.location.href='formed.jsp'" /></li>
						<li><input type="submit" value="Excluir" data-toggle="modal" data-target="#myModal" /></li>
					</ul>
				</div>
			</section>
			<!--Modal-->
			<div class="container">
				<!-- Modal -->
				<div class="modal fade" id="myModal" role="dialog">
					<div class="modal-dialog">

						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Confirmar Exclusão</h4>
							</div>
							<div class="modal-body">
								<p>Ao excluir um item da agenda o mesmo não pode ser recuperado, deseja continar?</p>
							</div>
							<div class="modal-footer">
								<input type="submit" mx-2 value="Cancelar" data-dismiss="modal" />
								<input type="submit" value="Confirmar" data-dismiss="modal" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Footer -->
	<div id="footer">
		<div class="container medium" id="contato">
			<ul class="copyright">
				<li>&copy; Todos os direitos reservados</li>
				<li>CineMax</a></li>
			</ul>

		</div>
	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
	<script src="assets/js/modal.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</body>

</html>