# 특정 값을 switch하기
## SQL CASE 문
https://www.w3schools.com/sql/sql_case.asp
```sql
update Salary 
set sex = 
case
    when sex='f' then 'm'
    when sex='m' then 'f'
end
```
