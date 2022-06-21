package br.com.athenas.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.athenas.Repository.PessoaRepository;
import br.com.athenas.models.Pessoa;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository PessoaRepo;
	
	@Transactional(readOnly = true)
	public Pessoa findById(Long id) {
		Pessoa p = PessoaRepo.findById(id).get();		
		Pessoa dto = new Pessoa();		
		return dto;		
	}
	
public List<Pessoa> findAll(){	

	 List<Pessoa> list = PessoaRepo.findAll();	 	
	return list;
}
	
		public void deletePessoa(Long id) {
			PessoaRepo.deleteById(id);
		}
	public Pessoa savePessoa(Pessoa pessoa) {
		PessoaRepo.save(pessoa);
		return pessoa;
		
	}

}
