create table funcionario(
	id_func serial primary key,
	email varchar (100) not null,
	senha varchar (10) not null,
	permss varchar (20) not null
);

create table cd_sala(
	id_cd_sal serial primary key not null,
	option varchar (7) not null
);

create table tp_sala(
	id_tp_sal serial primary key not null,
	option varchar (5) not null
);
create table cap_sala(
	id_cap_sal serial primary key not null,
	option int not null
);

create table fxE_sessao(
	id_fxE_ses serial primary key not null,
	option varchar (2) not null
);
create table filme(
	id_fil serial primary key not null,
	til varchar (100) not null,
	es date not null,
	du time not null,
	dire varchar (50) not null,
	elenco text not null,
	si text not null
);

create table sessao(
	id_ses serial primary key not null,
	id_fxE_ses int not null,
	id_fil int not null,
	vm int not null,
	vi varchar not null,
	dti date not null,
	dtf date not null,
	foreign key (id_fxE_ses) references fxE_sessao (id_fxE_ses),
	foreign key (id_fil) references filme (id_fil)
);

create table sala(
	id_sal serial primary key not null,
	id_cd_sal int not null,
	id_tp_sal int not null,
	id_cap_sal int not null,
	id_ses int not null,
	foreign key (id_cd_sal) references cd_sala (id_cd_sal),
	foreign key (id_tp_sal) references tp_sala (id_tp_sal),
	foreign key (id_cap_sal) references cap_sala (id_cap_sal),
	foreign key (id_ses) references sessao (id_ses)

);




insert into funcionario (id_func, email, senha, permss) values (1,'func11@yopmail.com', '1234', 'funcionario');
insert into funcionario (id_func, email, senha, permss) values (2,'gerente2@yopmail.com', '4321', 'gerente');
insert into funcionario (id_func, email, senha, permss) values (3,'admin3@yopmail.com', 'abcd', 'administrador');
insert into funcionario (id_func, email, senha, permss) values (4,'func24@yopmail.com', 'dcba', 'funcionario');
insert into funcionario (id_func, email, senha, permss) values (5,'func35@yopmail.com', 'aaaa', 'funcionario');

insert into cap_sala(id_cap_sal, option) values (1, 25);
insert into cap_sala(id_cap_sal, option) values (2, 25);
insert into cap_sala(id_cap_sal, option) values (3, 25);
insert into cap_sala(id_cap_sal, option) values (4, 25);
insert into cap_sala(id_cap_sal, option) values (5, 25);
insert into cap_sala(id_cap_sal, option) values (6, 25);

insert into cd_sala (id_cd_sal, option) values (1, 'Sala 01');
insert into cd_sala (id_cd_sal, option) values (2, 'Sala 02');
insert into cd_sala (id_cd_sal, option) values (3, 'Sala 03');
insert into cd_sala (id_cd_sal, option) values (4, 'Sala 04');
insert into cd_sala (id_cd_sal, option) values (5, 'Sala 05');
insert into cd_sala (id_cd_sal, option) values (6, 'Sala 06');

insert into tp_sala (id_tp_sal, option) values (1, 'Normal'); 
insert into tp_sala (id_tp_sal, option) values (2, 'VIP');   

insert into sala (id_sal, id_cd_sal, id_tp_sal, cap) values (1, 1, 2, 25);
insert into sala (id_sal, id_cd_sal, id_tp_sal, cap) values (2, 2, 1, 25);
insert into sala (id_sal, id_cd_sal, id_tp_sal, cap) values (3, 3, 1, 25);
insert into sala (id_sal, id_cd_sal, id_tp_sal, cap) values (4, 4, 1, 25);
insert into sala (id_sal, id_cd_sal, id_tp_sal, cap) values (5, 5, 1, 25);
insert into sala (id_sal, id_cd_sal, id_tp_sal, cap) values (6, 6, 1, 25);

insert into fxE_sessao (id_fxE_ses, option) values (1, 'L');
insert into fxE_sessao (id_fxE_ses, option) values (2, '10');
insert into fxE_sessao (id_fxE_ses, option) values (3, '12');
insert into fxE_sessao (id_fxE_ses, option) values (4, '16');
insert into fxE_sessao (id_fxE_ses, option) values (5, '18');

insert into sessao (id_ses, id_fxE_ses, vm, vi, dti, dtf) values (1, 3, 10, 20, TO_DATE('2020-11-10','yyyy-mm-dd'), TO_DATE('2020-11-30','yyyy-mm-dd'));
insert into sessao (id_ses, id_fxE_ses, vm, vi, dti, dtf) values (2, 3, 10, 20, TO_DATE('2020-11-10','yyyy-mm-dd'), TO_DATE('2020-11-30','yyyy-mm-dd'));
insert into sessao (id_ses, id_fxE_ses, vm, vi, dti, dtf) values (3, 3, 10, 20, TO_DATE('2020-11-10','yyyy-mm-dd'), TO_DATE('2020-11-30','yyyy-mm-dd'));
insert into sessao (id_ses, id_fxE_ses, vm, vi, dti, dtf) values (4, 4, 10, 20, TO_DATE('2020-11-10','yyyy-mm-dd'), TO_DATE('2020-11-30','yyyy-mm-dd'));
insert into sessao (id_ses, id_fxE_ses, vm, vi, dti, dtf) values (5, 3, 10, 20, TO_DATE('2020-11-10','yyyy-mm-dd'), TO_DATE('2020-11-30','yyyy-mm-dd'));
insert into sessao (id_ses, id_fxE_ses, vm, vi, dti, dtf) values (6, 3, 10, 20, TO_DATE('2020-11-10','yyyy-mm-dd'), TO_DATE('2020-11-30','yyyy-mm-dd'));

insert into filme (id_fil, til, es, du, dire, elenco, si) values (1, 'Senhor dos Aneis: A Sociedade do Anel', TO_DATE('2001-11-10','yyyy-mm-dd'), '03:48', 'Peter Jackson', 'Elijah Wood, Sean Astin, Ian McKellen, Viggo Mortensen, John Rhys-Davie, Sean Bean, Orlando Bloom, Dominic Monaghan, Billy Boyd', 'Em uma terra fantástica e única, um hobbit recebe de presente de seu tio um anel mágico e maligno que precisa ser destruído antes que caia nas mãos do mal. Para isso, o hobbit Frodo tem um caminho árduo pela frente, onde encontra perigo, medo e seres bizarros. Ao seu lado para o cumprimento desta jornada, ele aos poucos pode contar com outros hobbits, um elfo, um anão, dois humanos e um mago, totalizando nove pessoas que formam a Sociedade do Anel.');
insert into filme (id_fil, til, es, du, dire, elenco, si) values (2, 'Senhor dos Aneis: As Duas Torres', TO_DATE('2002-11-10','yyyy-mm-dd'), '03:43', 'Peter Jackson', 'Elijah Wood, Sean Astin, Ian McKellen, Viggo Mortensen, John Rhys-Davie, Sean Bean, Orlando Bloom, Dominic Monaghan, Billy Boyd', 'Após a captura de Merry e Pippy pelos orcs, a Sociedade do Anel é dissolvida. Frodo e Sam seguem sua jornada rumo à Montanha da Perdição para destruir o anel e descobrem que estão sendo perseguidos pelo misterioso Gollum. Enquanto isso, Aragorn, o elfo e arqueiro Legolas e o anão Gimli partem para resgatar os hobbits sequestrados e chegam ao reino de Rohan, onde o rei Theoden foi vítima de uma maldição mortal de Saruman.');
insert into filme (id_fil, til, es, du, dire, elenco, si) values (3, 'Senhor dos Aneis: O Retorno do Rei', TO_DATE('2003-11-10','yyyy-mm-dd'), '04:11', 'Peter Jackson', 'Elijah Wood, Sean Astin, Ian McKellen, Viggo Mortensen, John Rhys-Davie, Sean Bean, Orlando Bloom, Dominic Monaghan, Billy Boyd', 'O confronto final entre as forças do bem e do mal que lutam pelo controle do futuro da Terra Média se aproxima. Sauron planeja um grande ataque a Minas Tirith, capital de Gondor, o que faz com que Gandalf e Pippin partam para o local na intenção de ajudar a resistência. Um exército é reunido por Theoden em Rohan, em mais uma tentativa de deter as forças de Sauron. Enquanto isso, Frodo, Sam e Gollum seguem sua viagem rumo à Montanha da Perdição para destruir o anel.');
insert into filme (id_fil, til, es, du, dire, elenco, si) values (4, 'O Hobbit: Uma Jornada Inesperada', TO_DATE('2012-11-10','yyyy-mm-dd'), '03:02', 'Peter Jackson', 'Ian McKellen, Martin Freeman, Richard Armitage, Lee Pace, Luke Evans, Ken Stott, James Nesbitt, Ian Holm, Orlando Bloom', 'Como a maioria dos hobbits, Bilbo Bolseiro leva uma vida tranquila até o dia em que recebe uma missão do mago Gandalf. Acompanhado por um grupo de anões, ele parte numa jornada até a Montanha Solitária para libertar o Reino de Erebor do dragão Smaug.');
insert into filme (id_fil, til, es, du, dire, elenco, si) values (5, 'O Hobbit: A Desolação de Smaug', TO_DATE('2013-11-10','yyyy-mm-dd'), '03:07', 'Peter Jackson', 'Ian McKellen, Martin Freeman, Richard Armitage, Lee Pace, Luke Evans, Ken Stott, James Nesbitt, Ian Holm, Orlando Bloom', 'Ao lado de um grupo de anões e de Gandalf, Bilbo segue em direção à Montanha Solitária, onde deverá ajudar seus companheiros a retomar a Pedra de Arken. O problema é que o artefato está perdido em meio a um tesouro protegido pelo temido dragão Smaug.');
insert into filme (id_fil, til, es, du, dire, elenco, si) values (6, 'o Hobbit: A Batalha dos Cinco Exercitos', TO_DATE('2014-11-10','yyyy-mm-dd'), '02:44','Peter Jackson', 'Ian McKellen, Martin Freeman, Richard Armitage, Lee Pace, Luke Evans, Ken Stott, James Nesbitt, Ian Holm, Orlando Bloom', 'O dragão Smaug lança sua fúria ardente contra a Cidade do Lago que fica próxima da montanha de Erebor. Bard consegue derrotá-lo, mas, rapidamente, sem a ameaça do dragão, inicia-se uma batalha pelo controle de Erebor e sua riqueza. Os anões, liderados por Thorin, adentram a montanha e estão dispostos a impedir a entrada de elfos, anões e orcs. Bilbo Bolseiro e Gandalf tentam impedir a guerra.');


