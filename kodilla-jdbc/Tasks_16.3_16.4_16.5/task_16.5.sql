INSERT INTO POSTS (USER_ID, BODY)
VALUES (3, 'This is my second post.');

UPDATE POSTS
SET BODY = 'To delete'
WHERE ID = 6;
COMMIT;

DELETE FROM POSTS
WHERE ID = 6;
COMMIT;