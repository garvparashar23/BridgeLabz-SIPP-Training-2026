SELECT 
    Date, 
    AVG(Deaths) AS Avg_Deaths
FROM covid_cases
GROUP BY Date
ORDER BY Date ASC;
