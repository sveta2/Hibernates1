package model;
import java.io.Serializable;

// model.Useras
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Useras")
public class Useras implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="useras_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="useras_name")
	private String userasName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserasName() {
		return userasName;
	}

	public void setUserasName(String userasName) {
		this.userasName = userasName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Useras [id=" + id + ", userasName=" + userasName + "]";
	}

	
	
}
