fun testaAutenticacao() {
    val gerente = Gerente("Teste1", "44433399922", 6000.00, 161616)
    val diretor = Diretor("Teste2", "33344422211", 8000.00, 303030, 200.00)
    val cliente = Cliente("Teste3", "3333555666777", 202020)

    val sistema = SistemaInterno()
    sistema.entra(gerente, 161616)
    sistema.entra(diretor, 303030)
    sistema.entra(cliente, 202020)


}