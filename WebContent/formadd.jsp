<!DOCTYPE HTML>
<html>

<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<meta name="description" content="Tela Cadastro">
	<meta name="author" content="Marcela Amorim">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>CINEMAX</title>
	<link rel="stylesheet" href="assets/css/formaddmain.css" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
</head>

<body class="is-preload">
	<!-- Breadcrumb -->
	<ul class="breadcrumb">
		<li><a href="func.html">LISTAGEM</a></li>
		<li>NOVO</li>
	</ul>

	<!-- Main -->
	<div id="main">
		<header class="major container medium">
		<div class="tooltip"><h2>Cadastro de Agendamento</h2>
			<span class="tooltiptext">Ao clicar em cadastrar os dados só são excluídos de forma direcionada</span>
			  </div>
		</header>
	</div>

	<!-- Footer -->
	<div id="footer">
		<div class="container medium" id="formadd">
			<header class="major last">
				<form method="post" action="#">
					<label id="labelSala" align="left">Sala</label>	<br>
					<div class="row">
						<div class="col-6 col-12-mobilep">
							<select id="cdSala" name="codigo" required="">
								<option value="">Selecione o código da sala</option>
								<option value="l">Sala 01</option>
								<option value="2">Sala 02</option>
								<option value="3">Sala 03</option>
								<option value="4">Sala 04</option>
								<option value="5">Sala 05</option>
								<option value="6">Sala 06</option>
							</select>
						</div>
						<!--<div class="col-6 col-12-mobilep">
							<select id="tpSala"name="tipo" required="">
								<option value="">Selecione o tipo da sala</option>
								<option value="1">comum</option>
								<option value="2">VIP</option>
						 </select>
							</div>
						<div class="col-12">
							<input id="capSala" type="text" name="capacidade" required="" placeholder="Digite a capacidade da sala" />
						</div>
						</select>
						<label id="labelSessao">Sessão</label><br>
						<div class="col-12">
							<select id="fxeSessao" name="faixaE" required="">
								<option value="">Selecione a faixa etária da sessão</option>
								<option value="l">L</option>
								<option value="2">10</option>
								<option value="3">12</option>
								<option value="4">16</option>
								<option value="5">18</option>
							 </select>
						</div>
						<div class="col-6 col-12-mobilep">
							<input id="vmSessao" type="text" name="valorM" placeholder="Digite o valor da entrada meia" />
						</div>
						<div class="col-6 col-12-mobilep">
							<input id="viSessao" type="text" name="valorI" required="" placeholder="Digite o valor da entrada inteira" />
						</div>
						<div class="col-12">
							<input id="dtiSessao" placeholder="Selecione data inicial de exibição" type="date" required="required"  maxlength="10" name="dtI" pattern="[0-9]{2}\/[0-9]{2}\/[0-9]{4}$" min="2020-01-01" max="2021-06-01" >
						</div>
						<div class="col-12">
							<input id="dtfSessao" placeholder="Selecione data final de exibição" type="date" required="required"  maxlength="10" name="dtF" pattern="[0-9]{2}\/[0-9]{2}\/[0-9]{4}$" min="2020-01-01" max="2021-06-01" >
						</div>
						<div class="col-12">
							<textarea id="hrSessao"name="horarios" required="" placeholder="Digite horários das sessões"></textarea>
						</div>

						<label id="labelFilme">Filme</label><br>
						<div class="col-12">
							<input id="tFilme" type="text" name="titulo" placeholder="Digite o título do filme"required="">
						</div>
						<div class="col-6 col-12-mobilep">
							<input id="esFilme" type="text" name="ano" placeholder="Digite o ano de estreia" required=""/>
						</div>
						<div class="col-6 col-12-mobilep">
							<input id="duFilme" type="text" name="duracao" placeholder="Digite a duração do filme" required=""/>
						</div>
						<div class="col-12">
							<textarea id="elFilme" name="elenco" placeholder="Digite o elenco principal do filme" required=""></textarea>
						</div>
						<div class="col-12">
							<textarea id="siFilme" name="sinopse" placeholder="Digite a sinopse do filme em cartaz" required=""></textarea>
						</div>
						<div class="col-12">
							<label id="aqvFilme" align="left" for="myfile" required="">Clique aqui para selecionar arquivo do cartaz</label>
								  <input type="file" id="myfile" name="file" accept="image/*" required="required" ><br><br>
							</div>
						-->
						<div class="col-12">
							<ul class="actions special">
								<button type='button' onclick="getValues()">Cadastrar</button>
							</ul>
						</div>
					</div>
			</form>

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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	

</body>

</html>