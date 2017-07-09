使用mysql数据库
建立footballDB数据库
footballDB.sql是导出数据库“footballDB”中的数据表的SQL语句

查询出原有的数据格式
SELECT 
v.id as 对战编号,
t.city as 主队城市,t.teamname as 主队队名,v.in as 主队进球数,
i.city as 客队城市,i.teamname as 客队队名,v.out as 客队进球数 
from teaminfo t,teaminfo i,vsinfo v 
where t.teamid=v.masterID and i.teamid=v.clientid

查询出每个主队本赛季的进球数
SELECT 
t.city as 主队城市,t.teamname as 主队队名,sum(`in`) as 主队本赛季总进球数
FROM teaminfo t,VSInfo v 
where t.teamid=v.masterID 
group by masterId

查询出每个队本赛季进球数
select 
tmp.city as 城市,tmp.teamname as 队名,sum(cnt) as 本赛季总进球数 from
(
SELECT 
t.city as city,t.teamname as teamname,t.teamid as id,sum(`in`) as cnt 
FROM teaminfo t,vsinfo v 
where t.teamid=v.masterID 
group by masterId
union all
SELECT 
t.city as city,t.teamname as teamname,t.teamid as id,sum(`out`) as cnt
FROM teaminfo t,vsinfo v 
where t.teamid=v.clientID 
group by clientId
)
as tmp group by tmp.id

查询出本赛季进球数最多的场次是哪两个队
select
t.city as 主队城市,t.teamname as 主队队名,
i.city as 客队城市,i.teamname as 客队队名 
from teaminfo t,teaminfo i,
(
select masterid as master,clientid as client from vsinfo where `in`+`out`= 
	(
	select max(`in`+`out`) from vsinfo
	)
)as tmp
where t.teamid=master and i.teamid=client

计算出每个队伍的积分并且排序
规则:平局每个队+1,赢的队伍+3,输的队伍+0
select city as 城市,name as 队名,scoreNum as 积分 from
(
select t.city as city,t.teamname as name, sum(`score`) as scoreNum
from teaminfo t,
(
select masterid as id,`in`,`out`,
case when `in`>`out` then 3 when `in`=`out` then 1 else 0 end as score
from vsinfo
union all
select clientid as id,`in`,`out`,
case when `out`>`in` then 3 when `in`=`out` then 1 else 0 end as score
from vsinfo
)as tmp
where t.teamid=id group by id
)as reslutTable
order by scoreNum desc