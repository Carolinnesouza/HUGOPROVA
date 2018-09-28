package Servico;

	
	import java.io.Serializable;
	import java.io.UnsupportedEncodingException;
	import java.security.MessageDigest;
	import java.security.NoSuchAlgorithmException;
	import java.util.Base64;
	import java.util.List;

	import javax.enterprise.context.ApplicationScoped;
	import javax.inject.Inject;

import DAO.AlunoDAO;
import Entidade.Aluno;
import Util.TransacionalCdi;



	@ApplicationScoped
	public class AlunoServico implements Serializable, Service<Aluno> {

		/**
		 * 
		 */
		private static final long serialVersionUID = -7803325791425670859L;

		@Inject
		private AlunoDAO userDAO;

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.
		 * ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public void save(Aluno user) {
			userDAO.save(user);
		}

		@Override
		@TransacionalCdi
		public void update(Aluno user) {
			userDAO.update(user);
		}

		@Override
		@TransacionalCdi
		public void remove(Aluno user) {
			userDAO.remove(user);
		}

	
		@Override
		public Aluno getByID(long userId) {
			return userDAO.getByID(userId);
		}

		@Override
		public List<Aluno> getAll() {
			return userDAO.getAll();
		}

}
