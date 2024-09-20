/* order by asc*/
/* time에서 month 뽑기 */

select count(*) as fish_count,
extract(month from time) as month 
from fish_info
group by extract(month from time)
order by month