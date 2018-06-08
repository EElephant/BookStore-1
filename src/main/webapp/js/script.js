function refreshKaptcha() {
    var imgSrc = $("#kaptchaImg");
    var src = imgSrc.attr("src");
    imgSrc.attr("src",chgUrl(src));
}

function chgUrl(url) {
    var timestamp = (new Date()).valueOf();
    var stamp = $("#timestamp");
    /* alert(url);
    url = url.substring(0, 60);
    if ((url.indexOf("&") >= 0)) {
        url = url + "×tamp=" + timestamp;
    } else {
        url = url + "?timestamp=" + timestamp;
        stamp.val(timestamp);
    } */
    return url;
}