package app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Destino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@ManyToOne(mappedBy = "destino")
    	private Datas datas;
	@ManyToOne(mappedBy = "destino")
    	private Local local;
    	private float valor;
}
