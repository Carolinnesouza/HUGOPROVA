package Entidade;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Turma implements Identificavel {

		private String nome;
		
		@Id
		@GeneratedValue(generator="turma_seq", strategy=GenerationType.SEQUENCE)
		@SequenceGenerator(name="turma_seq")
		private Long id;
		private Set<Disciplina> disciplinas;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Set<Disciplina> getDisciplinas() {
			return disciplinas;
		}
		public void setDisciplinas(Set<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}
		
		
		

	}


