document.getElementById("btn1").addEventListener("click", function () {
    alert("버튼을 클릭햇어요!");
});

document.getElementById("submit").addEventListener("click", function () {
    let name = document.getElementById("nameInput").value;
    document.getElementById("result").textContent = `안녕하세요, ${name}님!`;
});