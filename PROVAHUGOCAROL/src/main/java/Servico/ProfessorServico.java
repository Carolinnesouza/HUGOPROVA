package Servico;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;

import javax.inject.Inject;

import DAO.ProfessorDAO;
import Entidade.Aluno;
import Entidade.Professor;
import Util.TransacionalCdi;

public class ProfessorServico implements Serializable, Service<Professor> {
	@Inject
	private ProfessorDAO userDAO;

	@Override
	@TransacionalCdi
	public void save(Professor user) {
		user.setSenha(hash(user.getSenha()));
		userDAO.save(user);
	}

	private String hash(String password) {
		try {
			MessageDigest md;
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes("UTF-8"));
			byte[] digest = md.digest();
			String output = Base64.getEncoder().encodeToString(digest);
			return output;
		} catch (Exception e) {
			return password;
		}
	}

	@Override
	@TransacionalCdi
	public void update(Professor user) {
		userDAO.update(user);
	}

	@Override
	@TransacionalCdi
	public void remove(Professor user) {
		userDAO.remove(user);
	}

	@Override
	public Professor getByID(long userId) {
		return userDAO.getByID(userId);
	}

	@Override
	public List<Professor> getAll() {
		return userDAO.getAll();
	}
}
