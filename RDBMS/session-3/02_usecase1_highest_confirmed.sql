SELECT 
    c.Country, 
    c.Confirmed_Cases, 
    c.Date
FROM covid_cases c
INNER JOIN countries co ON c.Country = co.Country
WHERE c.Date = '2023-02-01'
ORDER BY c.Confirmed_Cases DESC
LIMIT 1;
