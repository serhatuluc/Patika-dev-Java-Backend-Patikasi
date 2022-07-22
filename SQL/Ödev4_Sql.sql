--5.Soru
SELECT COUNT(*) FROM city
WHERE city ILIKE 'R%r' 

--4.Soru
SELECT COUNT(*) FROM country
WHERE country LIKE '_____' 

--3.Soru
SELECT COUNT(*) FROM film
WHERE title LIKE 'T%' 
and 
rating = 'G'

--2.Soru
SELECT COUNT(DISTINCT replacement_cost) FROM film

--1.Soru
SELECT DISTINCT replacement_cost FROM film
