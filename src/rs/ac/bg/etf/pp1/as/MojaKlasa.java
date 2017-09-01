package rs.ac.bg.etf.pp1.as;

public class MojaKlasa {

	
	public int printCallCount = 0;
	public int globalVars = 0;
	public int inMainVars = 0;
	public int globalConsts = 0;

    //SINTAKSNA ANALIZA DUMP
    public String dump(){
		StringBuilder sb = new StringBuilder();
        sb.append("=====================SINTAKSNA ANALIZA=========================" + "\n");
        sb.append("Broj Print poziva: " + printCallCount + "\n");
        sb.append("Deklaracije globalnih promenljivih: " + globalVars + "\n");
		sb.append("Deklaracije lokalnih promenljivih(main): " + inMainVars + "\n");
		sb.append("Deklaracije globalnih konstanti: " + globalConsts + "\n");
		return sb.toString();
	}
}
