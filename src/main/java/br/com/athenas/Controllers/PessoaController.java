package br.com.athenas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.athenas.Services.PessoaService;
import br.com.athenas.models.Pessoa;

@RestController
@RequestMapping(value= "api/v1/pessoa")
public class PessoaController {
	@Autowired
	private PessoaService PessoaServ;
	@GetMapping(value= "/{id}")
	public Pessoa findByID(@PathVariable Long id) {
		Pessoa p = PessoaServ.findById(id);
		return p;	
	}
	
	@GetMapping(value="/")
	public List<Pessoa> findAll() {		
		List<Pessoa> list = PessoaServ.findAll();
		
		return list;			
	}

	@DeleteMapping(value="delete/{id}")
	public String deletePessoa(@PathVariable Long id) {
		PessoaServ.deletePessoa(id);
		return "Pessoa deletada";
	}
	
	@PostMapping("save")
	public Pessoa savePessoa(@RequestBody Pessoa pessoa) {
		return PessoaServ.savePessoa(pessoa);
		
	}
	
}
