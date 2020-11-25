<!DOCTYPE HTML>
<html>

<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<meta name="description" content="Tela Editar">
	<meta name="author" content="Marcela Amorim">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>CINEMAX</title>
	<link rel="stylesheet" href="assets/css/formed.css" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>

<body class="is-preload">
	<!-- Breadcrumb -->
	<ul class="breadcrumb">
		<li><a href="func.html">LISTAGEM</a></li>
		<li>EDITAR</li>
	</ul>

	<!-- Main -->
	<div id="main">
		<header class="major container medium">
			<div class="tooltip"><h2>Alteração de Agendamento</h2>
			<span class="tooltiptext">Ao alterar os dados anteriores é possível recuperá-los pelo botão de redefinição, mas apenas antes da confirmação</span>
			  </div>
		</header>
	</div>

	<!-- Footer -->
	<div id="footer">
		<div class="container medium" id="contato">
			<header class="major last">
				<form method="post" action="#" >
					<label align ="left">Sala</label>	<br>
					<div class="row">
						<div class="col-6 col-12-mobilep">
							<input type="text" name="codigo" placeholder="Digite o código da sala" required=""/>
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="tipo" placeholder="Digite o tipo da sala" required=""/>
						</div>
						<div class="col-12">
							<input type="text" name="capacidade" placeholder="Digite a capacidade da sala" required=""/>
						</div>
	
						<label>Sessão</label><br>
						<div class="col-12">
							<input type="text" name="faixaE" placeholder="Digite a faixa etária da sessão"required="">
												</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="valorM" placeholder="Digite o valor da entrada meia" required=""/>
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="valorI" placeholder="Digite o valor da entrada inteira"required="" />
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="dtI" placeholder="Digite a data inicial da exibição"required="">
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="dtS" placeholder="Digite a data final da exibição"required="">
						</div>
						<div class="col-12">
							<textarea name="horarios" placeholder="Digite os horários das sessões disponíveis"required=""></textarea>
						</div>
						<label>Filme</label><br>
						<div class="col-12">
							<input type="text" name="titulo" placeholder="Digite o título do filme"required="">
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="ano" placeholder="Digite o ano de estreia"required="" />
						</div>
						<div class="col-6 col-12-mobilep">
							<input type="text" name="duracao" placeholder="Digite a duração do filme"required="" />
						</div>
						<div class="col-12">
							<textarea name="elenco" placeholder="Digite o elenco principal do filme"required=""></textarea>
						</div>
						<div class="col-12">
							<textarea name="sinopse" placeholder="Digite a sinopse do filme em cartaz"required=""></textarea>
						</div>
						<div class="col-12">
						<label align="left" for="myfile">Clique aqui para selecionar arquivo do cartaz</label>
  							<input type="file" id="myfile" name="file"><br><br>
						</div>
					
						<div class="col-12">
							<ul class="actions special">
								<li><input type="submit" value="EDITAR" /></li>
								<li><input type="reset" value="REDEFINIR"/></li>
							</ul>
						</div>
					</div>
				</form>
			</header>
			

			<ul class="copyright">
				<li>&copy; Todos os direitos reservados</li>
				<li>CineMax</li>
			</ul>

		</div>
	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
	<script src="assets/js/comboBox.js"></script>

</body>

</html>