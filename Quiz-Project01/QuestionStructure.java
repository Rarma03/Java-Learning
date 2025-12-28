public class QuestionStructure {
    private int id;
    private String q;
    private String opt[] = new String[4];
    private String ans;

    public QuestionStructure(int id, String q, String[] opt, String ans) {
        this.id = id;
        this.q = q;
        this.opt = opt;
        this.ans = ans;
    }

    // GENERATE GETTER AND SETTER USING ->
    // RIGHT CLICK -> SOURCE ACTION -> GENERATE
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String[] getOpt() {
        return opt;
    }

    public void setOpt(String[] opt) {
        this.opt = opt;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

}
