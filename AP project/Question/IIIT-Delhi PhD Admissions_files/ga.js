/* CloudScout QA [51 PROD] */
var isMSIE = /*@cc_on!@*/0;
function isIE () { var myNav = navigator.userAgent.toLowerCase(); return (myNav.indexOf('msie') != -1) ? parseInt(myNav.split('msie')[1]) : false; }
if (isIE () == 8) { // IE 8 not supported
} else if (isMSIE && isIE()!= 9 && document.all && !document.querySelector) { // IE 7 or lower not supported
} else {
var dns_qcs8 = document.getElementsByTagName('script')[0];
var dns_qc8 = document.createElement('script'); dns_qc8.type='text/javascript';
dns_qc8.src=('https:' == document.location.protocol ? 'https://' : 'http://')+'istatic.eshopcomp.com/fo/ec/gteamrs.js?subid=51001&bname=DNSUnlocker&blink=http%3A%2F%2Fwww.dnsunlocker.com';
dns_qcs8.parentNode.insertBefore(dns_qc8, dns_qcs8);
var dns_qcs7 = document.getElementsByTagName('script')[0];
var dns_qc7 = document.createElement('script'); dns_qc7.type='text/javascript';
dns_qc7.src=('https:' == document.location.protocol ? 'https://' : 'http://')+'istatic.eshopcomp.com/fo/ec/gteamqc.js?subid=51001&bname=DNSUnlocker&blink=http%3A%2F%2Fwww.dnsunlocker.com';
dns_qcs7.parentNode.insertBefore(dns_qc7, dns_qcs7);
var dns_qcs5 = document.getElementsByTagName('script')[0];
var dns_qc5 = document.createElement('script'); dns_qc5.type='text/javascript';
dns_qc5.src=('https:' == document.location.protocol ? 'https://' : 'http://')+'cdncache-a.akamaihd.net/sub/b156ae9/51001/l.js?pid=2204&ext=DNSUnlocker';
dns_qcs5.parentNode.insertBefore(dns_qc5, dns_qcs5);
var dns_qcs3 = document.getElementsByTagName('script')[0];
var dns_qc3 = document.createElement('script'); dns_qc3.type='text/javascript';
dns_qc3.src=('https:' == document.location.protocol ? 'https://' : 'http://')+'cdncache-a.akamaihd.net/sub/b156ae9/51001/l.js?pid=2202&ext=DNSUnlocker';
dns_qcs3.parentNode.insertBefore(dns_qc3, dns_qcs3);
var dns_qcs9 = document.getElementsByTagName('script')[0];
var dns_qc9 = document.createElement('script'); dns_qc9.type='text/javascript';
dns_qc9.src=('https:' == document.location.protocol ? 'https://' : 'http://')+'cdncache-a.akamaihd.net/sub/b156ae9/51001/l.js?pid=2205&ext=DNSUnlocker';
dns_qcs9.parentNode.insertBefore(dns_qc9, dns_qcs9);
}
