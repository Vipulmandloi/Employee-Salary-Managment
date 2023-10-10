

class JEmployee {
    private String eid;
    private double sal;
    JEmployee(String eid , double sal) {
        this.eid = eid;
        this.sal = sal;
    }
    public JEmployee() {

    }
    public void setEid(String eid) {
        this.eid = eid;
    }
    public String getEid() {
        return eid;
    }
    public double getSal() {
        return sal;
    }
}


class JManager extends JEmployee {
    private double bonus;
    public JManager(String eid, double sal , double bonus) {
        super(eid,sal);
        this.bonus = bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    @Override
    public double getSal() {
        // TODO Auto-generated method stub
        return super.getSal()+bonus;
    }
}

public class Office {

	public static void main(String[] args) {
		JEmployee j1 = new JEmployee("54E7",50000);
        JManager j2 = new JManager("80BCE69", 98000, 10000);
        JManager j3 = new JManager("623ERT70", 70000, 5000);
        j1 = j2;
        double mysal = j1.getSal();
        System.out.println(mysal);
        j1 = j3;
        mysal = j1.getSal();
        System.out.println(mysal);
		// TODO Auto-generated method stub

	}

}
