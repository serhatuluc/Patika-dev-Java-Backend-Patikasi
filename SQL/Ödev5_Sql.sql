--3.Soru
SELECT * FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4

--2.Soru
SELECT * FROM film
WHERE title ILIKE '%n'
ORDER BY length ASC
OFFSET 5
LIMIT 5

--1.Soru
SELECT * FROM film
WHERE title ILIKE '%n'
LIMIT 5



