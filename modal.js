<<<<<<< HEAD
var linkAbrirModal = document.getElementById('abrirModal');
var modal = document.getElementById('meuModal');

// Quando o link é clicado, mostra o modal
linkAbrirModal.addEventListener('click', function() {
    modal.style.display = 'block';
});

// Quando o usuário clica no botão "Fechar" ou fora do modal, fecha o modal
modal.addEventListener('click', function(event) {
    if (event.target === modal || event.target.className === 'fechar') {
        modal.style.display = 'none';
    }
=======
var linkAbrirModal = document.getElementById('abrirModal');
var modal = document.getElementById('meuModal');

// Quando o link é clicado, mostra o modal
linkAbrirModal.addEventListener('click', function() {
    modal.style.display = 'block';
});

// Quando o usuário clica no botão "Fechar" ou fora do modal, fecha o modal
modal.addEventListener('click', function(event) {
    if (event.target === modal || event.target.className === 'fechar') {
        modal.style.display = 'none';
    }
>>>>>>> 65a5bf5c33f6d639dcbfa3c74ddac86dc411148c
});