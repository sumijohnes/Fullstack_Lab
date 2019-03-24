select max(sal), min(sal), avg(sal),job from emp
where deptno=10 
group by job
having avg(sal) > 1000
order by job;