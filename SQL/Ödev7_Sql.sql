--4.Soru
SELECT country_id,COUNT(*) FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC
LIMIT 1

--3.Soru
SELECT store_id,COUNT(*) FROM customer
GROUP BY store_id

--2.Soru
SELECT replacement_cost,COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50

--1.Soru
SELECT rating,COUNT(*) FROM film
GROUP BY rating












