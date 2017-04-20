public class Ticket implements Comparable {

    int id;
    int vpLvl;
    String problem;
    boolean solved;
    String name;
    String solutionDesc;

    public Ticket() {
	id = 0;
	vpLvl = 0;
	problem = "";
	solved = false;
	name = "";
	solutionDesc = "";
    }

    public Ticket(int identity, int vp, String prob, String nam) {
	this();
	id = identity;
	vpLvl = vp;
	problem = prob;
	name = nam;
    }

    public int compareTo(Ticket x) {
	return vpLvl.compareTo(x.getLvl());
    }
