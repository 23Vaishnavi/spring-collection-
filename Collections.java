package collection2;
import java.util.List;
import java.util.Set;
import java.util.Map;
public class Collections {
	private int id;
	private String name;
	List<Integer> studentid;
	Set<String>Studentname;
	Map<Integer,String>Studentidname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getStudentid() {
		return studentid;
	}
	public void setStudentid(List<Integer> studentid) {
		this.studentid = studentid;
	}
	public Set<String> getStudentname() {
		return Studentname;
	}
	public void setStudentname(Set<String> studentname) {
		Studentname = studentname;
	}
	public Map<Integer, String> getStudentidname() {
		return Studentidname;
	}
	public void setStudentidname(Map<Integer, String> studentidname) {
		Studentidname = studentidname;
	}
	@Override
	public String toString() {
		return "Collections [id=" + id + ", name=" + name + ", studentid=" + studentid + ", Studentname=" + Studentname
				+ ", Studentidname=" + Studentidname + "]";
	}
	

}
