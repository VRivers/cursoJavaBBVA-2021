insert into figuras(fig_tipo, fig_nombre, fig_lado)
            values (1, "cua1", 10)
insert into figuras(fig_tipo, fig_nombre, fig_radio)
            values (2, "cir1", 10)
insert into figuras(fig_tipo, fig_nombre, fig_base, fig_altura)
            values (4, "triangulo1", 10, 8.4)
insert into figuras(fig_tipo, fig_nombre, fig_base, fig_altura)
            values (3, "rect1", 10, 8.4)
insert into figuras(fig_tipo, fig_nombre, fig_lado, fig_numlados, fig_apotema)
            values (5, "polig1", 10, 6, 6.2)
            
update figuras
set fig_nombre = "cuadrado"
where fig_tipo = 1

update figuras
set fig_nombre = "circulo"
where fig_tipo = 2

update figuras
set fig_nombre = "rectamgulo"
where fig_tipo = 3

update figuras
set fig_nombre = "triangulo"
where fig_tipo = 4

update figuras
set fig_nombre = "poligono"
where fig_tipo = 5