SELECT I.SUMMARY, IL.NAME
FROM ISSUES I
JOIN ISSUESLISTS IL ON I.ISSUESLIST_ID = IL.ID;

SELECT I.SUMMARY, U.FIRSTNAME, U.LASTNAME
FROM ISSUES I
JOIN USERS U ON I.USER_ID_ASSIGNEDTO = U.ID;

SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS ISSUES_NUMBER
FROM USERS U JOIN ISSUES I ON U.ID = I.USER_ID_ASSIGNEDTO
GROUP BY I.USER_ID_ASSIGNEDTO
HAVING COUNT(*) >= 1;