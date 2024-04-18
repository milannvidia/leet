# Write your MySQL query statement below
SELECT c.name as Customers
From Customers c LEFT JOIN Orders o
ON c.id=o.customerId
WHERE o.customerid IS NULL;