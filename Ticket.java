public class Ticket implements Comparable {

    private int id, vpLvl;
    private String problem, name, solutionDesc;
    private boolean solved;

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

    public int compareTo(Object x) {
	return vpLvl-((Ticket)x).getLvl();
    }

    public int getId() {
	return id;
    }

    public int getLvl() {
	return vpLvl;
    }

    public String getName() {
	return name;
    }

    public int setId(int newId) {
	id = newId;
	return id;
    }

    public boolean setSolved(boolean newSolved) {
	solved = newSolved;
	return solved;
    }

    public String setSolutionDesc(String newSolution) {
	solutionDesc = newSolution;
	return solutionDesc;
    }

}
