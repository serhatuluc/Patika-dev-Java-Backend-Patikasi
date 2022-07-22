--4.Soru
SELECT * FROM film
WHERE title LIKE 'C%'
and
LENGTH > 90 
and
rental_rate = 2.99

--3.Soru
SELECT title FROM film
WHERE title ILIKE '%T%T%T%T%'

--2.Soru
SELECT * FROM country
WHERE country LIKE '%_____n'

--1.Soru
SELECT * FROM country
WHERE country LIKE 'A%a'
