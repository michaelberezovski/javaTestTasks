SELECT * FROM price

select name, start_date from subjects /*выбока столбцов*/

select name as name_subject, grade as total_grade from subjects /* выборка под псевдонимом */

select * from products order by price desc /* выборка с сортировкой по убывынию */

select * from subjects order by name, grade /* выборка с сортировкой по возрастанию по 2м столбцам по очереди */

select distinct name from accounts/* выборка уникальных записей по полю имя */

select distinct name, price from products order by price desc /* выборка уникальных значений по полям имя и цена
с сортировкой по убыванию по полю цена */
/* !! !! !! важное замечание!! !! !! если в ячейке находится null, то это значение не будет проигнорировано */

select distinct (name_person) name_person, login, password from accounts /* вывод всех перечисленных полей, в скобках уникальные */

select distinct (name) id, name, grade from subjects order by name desc/* уникальные по имени сортировка по убыванию тоже по имени */

select distinct on (price) name, price, count from products order by price, name, count
/*если в ORDER BY указано несколько столбцов, то самым левым в перечислении столбцов должно быть то,
которое указано в DISTINCT - т.е. столбцы указанные в DISTINCT должны быть в ORDER BY (в любом порядке)
и только потом уже могут идти остальные столбцы. В противном случае вы получите ошибку синтаксиса. */

select count(*) from accounts /* считаем все записи в таблице */

select count(distinct name) from products /* вернет подсчитанное количество уникальных строк по столбцу name */

select category_id, count(category_id) from movies group by category_id order by category_id /*
 подсчет количества фильмов по категориям в возрастающем порядке сгруппированные по категориям*/


/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */
/* */



