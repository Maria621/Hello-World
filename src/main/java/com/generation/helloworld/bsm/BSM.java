package com.generation.helloworld.bsm;


	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/BSM")


	public class BSM {
		
		@GetMapping
		public String BSM() {
			return "\t Lista de BSMs: RESPONSABILIDADE PESSOAL é a capacidade de reconhecer e assumir a responsabilidade por suas ações, escolhas e resultados na vida.  "
					+ " MENTABILIDADE DE CRESCIMENTO é a crença de que as habilidades, capacidades e inteligência podem ser desenvolvidas e aprimoradas ao longo do tempo.   "
					+ " ORIENTAÇÃO AO FUTURO é a capacidade de pensar e planejar a longo prazo, estabelecendo metas e objetivos para si mesmo.  "
					+ " PERSISTENCIA é a habilidade de continuar tentando e não desistir diante de obstáculos, fracassos ou adversidades.  "					
					+ " COMUNICAÇÃO é a troca de informações, ideias e sentimentos entre as pessoas. Envolve ouvir ativamente, expressar-se de forma clara e eficaz, e buscar compreender os outros.  "					
					+ " TRABALHO EM EQUIPE é a colaboração e cooperação entre os membros de um grupo para alcançar um objetivo comum.  "				
					+ " PRODUTIVIDADE é a atitude de antecipar e agir de forma antecipada em relação às situações. Envolve tomar a iniciativa, identificar problemas ou oportunidades, e agir de forma preventiva ou criativa para alcançar resultados desejados.  "				
					+ " ORIENTAÇÃO AO DETALHE é a habilidade de prestar atenção aos detalhes e ser minucioso em suas atividades. Envolve ter precisão e cuidado no trabalho, garantindo que todas as informações, tarefas e processos sejam executados com qualidade e exatidão.";
		}
	}   

