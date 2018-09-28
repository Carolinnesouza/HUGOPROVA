package Servico;

 
	import java.io.Serializable;
	import java.io.UnsupportedEncodingException;
	import java.security.MessageDigest;
	import java.security.NoSuchAlgorithmException;
	import java.util.Base64;
	import java.util.List;

	import javax.enterprise.context.ApplicationScoped;
	import javax.inject.Inject;

import DAO.DisciplinaDAO;
import Entidade.Disciplina;
import Util.TransacionalCdi;


	@ApplicationScoped
	public class DisciplinaServico implements Serializable, Service<Disciplina> {

		/**
		 * 
		 */
		private static final long serialVersionUID = -7803325791425670859L;

		@Inject
		private DisciplinaDAO userDAO;

		@Override
		@TransacionalCdi
		public void save(Disciplina user) {
			userDAO.save(user);
		}

		

		@Override
		@TransacionalCdi
		public void update(Disciplina user) {
			userDAO.update(user);
		}

	
		@Override
		@TransacionalCdi
		public void remove(Disciplina user) {
			userDAO.remove(user);
		}

	
		@Override
		public Disciplina getByID(long userId) {
			return userDAO.getByID(userId);
		}

		@Override
		public List<Disciplina> getAll() {
			return userDAO.getAll();
		}

}
