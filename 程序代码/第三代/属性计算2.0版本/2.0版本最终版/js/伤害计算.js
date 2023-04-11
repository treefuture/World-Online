window.addEventListener("load", () => {
    let docu = document.documentElement
    // console.log(docu)
    background(docu)
    let box = document.querySelector(".box")
    box.style.height = docu.offsetHeight + "px"
})
//生成随机数,调用背景图片
function random() {
    return Math.round(Math.random() * 2)
}
//添加背景图片
function background(obj) {
    obj.style.background = "url(background/bg" + random() + ".jpg) no-repeat"
    obj.style.backgroundSize = "100% 100%"
}