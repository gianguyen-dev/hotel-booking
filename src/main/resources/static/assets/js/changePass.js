
let old_pass = document.querySelector(".old_pass");
let new_pass = document.querySelector(".new_pass");
let conf_new_pass = document.querySelector(".conf_new_pass");


let submitBtn = document.querySelector(".submit-btn");
let errMsg = document.querySelector("#err-msg");
console.log(submitBtn);
submitBtn.onclick = function handleSubmit(){
    if(old_pass.value ==="" || new_pass.value ==="" || conf_new_pass.value ===""){
        errMsg.innerText = "Vui lòng đầy đủ thông tin";
        return false;
        
    }else if(new_pass.value <8){
        errMsg.innerText = "Vui lòng nhập mật khẩu ít nhất 8 kí tự";
        return false;
    }
    else if(new_pass.value!==conf_new_pass.value){
        errMsg.innerText = "Mật khẩu mới không khớp";
        return false;
    }else if(old_pass.value===new_pass.value){
        errMsg.innerText = "Vui lòng nhập mật khẩu mới khác mật khẩu cũ";
        return false;
    }
    return true;
}

let navLinks = document.getElementById("nav-links");
function showMenu() {
    navLinks.style.right = "0";
}

function hideMenu() {
    navLinks.style.right = "-400px";
}