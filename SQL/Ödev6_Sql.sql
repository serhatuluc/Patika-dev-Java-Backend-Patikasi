--4.Soru
SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150

--3.Soru
SELECT MAX (length) FROM film
WHERE rental_rate = 0.99

--2.Soru
SELECT COUNT (*) FROM film
WHERE title LIKE 'C%'

--1.Soru
SELECT ROUND(AVG(rental_rate),3) FROM film


