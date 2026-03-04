public class Produto {

    private String nomeProduto;
    private String qntProduto;
    private double precoProduto;

    public Produto(String nomeProduto, String qntProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.qntProduto = qntProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getQntProduto() {
        return qntProduto;
    }

    public void setQntProduto(String qntProduto) {
        this.qntProduto = qntProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", qntProduto='" + qntProduto + '\'' +
                ", precoProduto=" + precoProduto +
                '}';
    }
}
