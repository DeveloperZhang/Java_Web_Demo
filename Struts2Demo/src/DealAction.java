import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DealAction extends ActionSupport {
    private String num1;
    private String cal;
    private String num2;
    private double num3;

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getCal() {
        return cal;
    }

    public void setCal(String cal) {
        this.cal = cal;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    @Override
    public String execute() throws Exception {
        String x = getNum1();
        String y = getNum2();

        double num4 = Double.parseDouble(x);
        double num5 = Double.parseDouble(y);

        if (cal.equals("+")) {
            num3 = num4 + num5;
        } else if (cal.equals("-")) {
            num3 = num4 - num5;
        } else if (cal.equals("*")) {
            num3 = num4 * num5;
        } else if (cal.equals("/")) {
            num3 = num4 / num5;
        }

        ActionContext.getContext().getSession().put("num3",num3);

        return SUCCESS;
    }
}
