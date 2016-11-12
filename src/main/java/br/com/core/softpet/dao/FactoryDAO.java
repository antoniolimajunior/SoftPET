package br.com.core.softpet.dao;

public class FactoryDAO {

    public static MarcaDAO marcaDao = new MarcaDAO();
    public static CategoriaDAO categoriaDao = new CategoriaDAO();
    public static ProdutoDAO produtoDao = new ProdutoDAO();
    public static EspecieDAO especieDao = new EspecieDAO();
    public static RacaDAO racaDao = new RacaDAO();
    public static UsuarioDAO usuarioDao = new UsuarioDAO();
    public static FornecedorDAO fornecedorDao = new FornecedorDAO();
    public static ClienteDAO clienteDao = new ClienteDAO();
    public static AnimalDAO animalDao = new AnimalDAO();
    public static CompraDAO compraDao = new CompraDAO();
    public static CompraItemDAO compraItemDao = new CompraItemDAO();
    public static AtendimentoDAO atendimentoDao = new AtendimentoDAO();
    public static AtendimentoItemDAO atendimentoItemDao = new AtendimentoItemDAO();
    public static VendaDAO vendaDao = new VendaDAO();
    public static VendaItemDAO vendaItemDao = new VendaItemDAO();

    public static MarcaDAO getInstanceMarcaDao() {
        return marcaDao;
    }

    public static CategoriaDAO getInstanceCategoriaDao() {
        return categoriaDao;
    }

    public static ProdutoDAO getInstanceProdutoDao() {
        return produtoDao;
    }

    public static EspecieDAO getInstanceEspecieDao() {
        return especieDao;
    }

    public static RacaDAO getInstanceRacaDao() {
        return racaDao;
    }

    public static UsuarioDAO getInstanceUsuarioDao() {
        return usuarioDao;
    }

    public static FornecedorDAO getInstanceFornecedorDao() {
        return fornecedorDao;
    }

    public static ClienteDAO getInstanceClienteDao() {
        return clienteDao;
    }

    public static AnimalDAO getInstanceAnimalDao() {
        return animalDao;
    }

    public static CompraDAO getInstanceCompraDao() {
        return compraDao;
    }

    public static CompraItemDAO getInstanceCompraItemDao() {
        return compraItemDao;
    }

    public static AtendimentoDAO getInstanceAtendimentoDao() {
        return atendimentoDao;
    }

    public static AtendimentoItemDAO getInstanceAtendimentoItemDao() {
        return atendimentoItemDao;
    }

    public static VendaDAO getInstanceVendaDao() {
        return vendaDao;
    }

    public static VendaItemDAO getInstanceVendaItemDao() {
        return vendaItemDao;
    }
}
