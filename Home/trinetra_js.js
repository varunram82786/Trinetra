
// Resize iframe when the window is resized
window.addEventListener('resize', resizeIframe);

// Initial resize
window.addEventListener('load', resizeIframe);

function resizeIframe() {
    var iframe = document.getElementById('web1Frame');
    iframe.style.height = window.innerHeight + 'px';


    var left_rectangle_size = document.getElementById('left_rectangle');
    left_rectangle_size.style.height = window.innerHeight + 'px';

    document.getElementById('right_rectangle').style.height = window.innerHeight + 'px';
}

function changeIframe(id,url) {
    var iframe = document.getElementById('web1Frame');
    iframe.src = url;

    var side_menu_elements = document.getElementsByClassName('side_menu');
    var button = document.getElementById(id);

    for (var i = 0; i < side_menu_elements.length; i++) {
        if (side_menu_elements[i] == button)
            side_menu_elements[i].style.backgroundColor = '#0A0801';
        else
            side_menu_elements[i].style.backgroundColor = '#03A9F4';
    }
        var title_elements = document.getElementById('title');
        title_elements.innerHTML = button.value;
     

}
