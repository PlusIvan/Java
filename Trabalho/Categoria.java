
public enum Categoria {
    BIOLOGY("Biology and Science"),
    HISTORY("History, Culture"),
    FINANCE("Economy, Stocks, Marketing");

    private String type;

    private Categoria(String tipo) {
        this.type = tipo;
    }

    public String url() {
        return type;
    }

}
