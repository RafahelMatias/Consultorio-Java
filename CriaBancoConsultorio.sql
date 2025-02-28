create database DBConsultorio;

use DBConsultorio;

create table if not exists paciente (
idPaciente int unsigned not null auto_increment primary key,
nome varchar(60),
cpf varchar(45),
data_nascimento DATE,
sexo CHAR(1),
endereco varchar(100),
telefone varchar(20),
foto varchar(100),
plano_saude varchar(50),
observacoes text,
data_cadastro date
)ENGINE=MyISAM DEFAULT CHARSET=utf8;

create table if not exists psicologo (
idPsicologo int unsigned not null auto_increment primary key,
nome varchar(60),
cpf varchar(14),
crp varchar(20),
telefone varchar(20),
foto varchar(100),
login varchar(20) unique,
senha varchar(20)
)ENGINE=MyISAM DEFAULT CHARSET=utf8;


create table if not exists anamnese (
idAnamnese int unsigned not null auto_increment primary key,
queixas text,
sintomas text,
tratamentos_anteriores text,
medicamentos text,
infancia text,
rotina text,
vicios text,
hobbies text,
trabalho text,
historico_familiar text,
comportamento text,
linguagem text,
humor text,
hipotese_diagnostica text,
observacoes text,
numero_sessoes int,
valor_sessao decimal,
periodicidade varchar(20),
idPaciente int not null,
idPsicologo int not null,
foreign key (idpaciente)references paciente(idpaciente),
foreign key (idPsicologo)references psicologo(idPsicologo)
)ENGINE=MyISAM DEFAULT CHARSET=utf8;


create table if not exists sessao (
idSessao int unsigned not null auto_increment primary key,
data datetime,
queixas_paciente text,
plano_tratamento text,
diagnostico_final text,
resumo_sessao text,
evolucao int,
pago bit(1),
idAnamnese int,
foreign key (idAnamnese)references anamnese(idAnamnese)
)ENGINE=MyISAM DEFAULT CHARSET=utf8;



-- Cria dois psicólogos para teste
insert into psicologo (nome, cpf, crp, telefone, login, senha)
values 
('Psicologo teste','12345678912','987654','21987987987','user1','user123'),
('Psicologo teste 2','97718536905','456789','21987954940','user2','user321');


Use DBConsultorio;


select *
from paciente;

select *
from anamnese;

select *
from sessao;

select *
from psicologo;

