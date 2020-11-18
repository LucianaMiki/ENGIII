function getValues(){

    var e = document.getElementById("codigo");
    var codigo = e.options[e.selectedIndex].text;
    console.log(codigo);
    
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            alert("Sucesso: " + codigo);
        }
    };
    xhttp.open("GET", "xmlhttp_info.txt", true);
    xhttp.send();

}

