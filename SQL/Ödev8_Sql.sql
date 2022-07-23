--4.Soru
DELETE FROM employee 
WHERE id < 6;

--3.Soru
UPDATE employee
SET name = 'XXXXX',email= 'YYYY'
WHERE id < 6;

--2.Soru
insert into employee (name, birthday, email) values ('Missy', '1941-02-15', 'mbordman0@printfriendly.com');
insert into employee (name, birthday, email) values ('Ezmeralda', '1932-06-11', 'ecrowcombe1@chronoengine.com');
insert into employee (name, birthday, email) values ('Sayer', '1961-05-28', 'serskinesandys2@aol.com');
insert into employee (name, birthday, email) values ('Gustavo', '1945-06-17', 'glemar3@hhs.gov');
insert into employee (name, birthday, email) values ('Elton', '1942-03-07', 'ehasell4@w3.org');
insert into employee (name, birthday, email) values ('Pen', '1999-08-11', 'pattiwill5@cmu.edu');
insert into employee (name, birthday, email) values ('Rolf', '1976-07-20', 'rgarratt6@networkadvertising.org');
insert into employee (name, birthday, email) values ('Lyndsey', '1976-12-30', 'lockenden7@bizjournals.com');
insert into employee (name, birthday, email) values ('Karlotte', '1933-11-28', 'khafford8@icio.us');
insert into employee (name, birthday, email) values ('Arvie', '1934-09-02', 'asimonnin9@naver.com');
insert into employee (name, birthday, email) values ('Larissa', '1944-09-07', 'ltiernya@etsy.com');
insert into employee (name, birthday, email) values ('Prent', '1930-03-19', 'preinbechb@wiley.com');
insert into employee (name, birthday, email) values ('Alexandre', '1957-08-15', 'aashtonc@nsw.gov.au');
insert into employee (name, birthday, email) values ('Gawen', '1964-07-22', 'gsimoncellod@prnewswire.com');
insert into employee (name, birthday, email) values ('Rona', '2000-09-10', 'rflathere@godaddy.com');
insert into employee (name, birthday, email) values ('Vanya', '2013-04-08', 'vrizzillof@hud.gov');
insert into employee (name, birthday, email) values ('Gunar', '1913-01-15', 'gfranceg@mashable.com');
insert into employee (name, birthday, email) values ('Robbie', '1991-06-17', 'rwigmoreh@nih.gov');
insert into employee (name, birthday, email) values ('Goldie', '1985-06-20', 'gdeclerqi@ustream.tv');
insert into employee (name, birthday, email) values ('Fawnia', '1989-02-25', 'fbrownhillj@t-online.de');
insert into employee (name, birthday, email) values ('Daloris', '1930-09-03', 'dlukek@elpais.com');
insert into employee (name, birthday, email) values ('Norri', '2003-03-09', 'nnavarrol@usgs.gov');
insert into employee (name, birthday, email) values ('Quinn', '1954-09-22', 'qbrughm@who.int');
insert into employee (name, birthday, email) values ('Corinne', '1902-07-12', 'cchampainn@bloglines.com');
insert into employee (name, birthday, email) values ('Cammie', '1910-08-06', 'croloffo@studiopress.com');
insert into employee (name, birthday, email) values ('Letizia', '1987-07-08', 'lsidesp@edublogs.org');
insert into employee (name, birthday, email) values ('Desmond', '1912-10-06', 'dwittmanq@themeforest.net');
insert into employee (name, birthday, email) values ('Jeremiah', '1921-12-06', 'jjenksr@timesonline.co.uk');
insert into employee (name, birthday, email) values ('Cyril', '1984-06-29', 'cwoodworths@naver.com');
insert into employee (name, birthday, email) values ('Zebedee', '1909-06-27', 'zwraightt@acquirethisname.com');
insert into employee (name, birthday, email) values ('Wolfie', '1988-01-16', 'wriditchu@washingtonpost.com');
insert into employee (name, birthday, email) values ('Thurstan', '1913-05-05', 'tmenelv@miibeian.gov.cn');
insert into employee (name, birthday, email) values ('Johann', '2004-04-19', 'jverbrugghenw@topsy.com');
insert into employee (name, birthday, email) values ('Nilson', '1996-11-17', 'nreamanx@unblog.fr');
insert into employee (name, birthday, email) values ('Violetta', '1968-08-15', 'vcreaneyy@unc.edu');
insert into employee (name, birthday, email) values ('Anett', '1946-11-15', 'arichemontz@multiply.com');
insert into employee (name, birthday, email) values ('Alonso', '2017-05-11', 'asouthcott10@omniture.com');
insert into employee (name, birthday, email) values ('Natty', '1993-12-26', 'ningman11@livejournal.com');
insert into employee (name, birthday, email) values ('Enoch', '2002-03-16', 'egatenby12@squidoo.com');
insert into employee (name, birthday, email) values ('Nicolas', '1964-08-28', 'ntayspell13@feedburner.com');
insert into employee (name, birthday, email) values ('Annmaria', '1932-01-03', 'ablaxill14@ted.com');
insert into employee (name, birthday, email) values ('Melli', '1919-12-25', 'mjobbins15@gov.uk');
insert into employee (name, birthday, email) values ('Clari', '1975-03-29', 'cscallan16@google.co.uk');
insert into employee (name, birthday, email) values ('Dayna', '1964-02-27', 'dhallas17@amazon.de');
insert into employee (name, birthday, email) values ('Sharleen', '1946-11-29', 'smazzia18@google.es');
insert into employee (name, birthday, email) values ('Brianna', '2006-06-13', 'baskam19@ftc.gov');
insert into employee (name, birthday, email) values ('Garwin', '1929-08-13', 'gmagovern1a@nytimes.com');
insert into employee (name, birthday, email) values ('Teddie', '1939-08-31', 'taslum1b@techcrunch.com');
insert into employee (name, birthday, email) values ('Reinwald', '1948-03-01', 'rgounet1c@slideshare.net');
insert into employee (name, birthday, email) values ('Craggy', '2014-08-24', 'crolf1d@google.com.au');

--1.Soru
CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
)
