var i=0;
function timeCount()
{
	setInterval(function(){postMessage(i++);},100);
}
timeCount();