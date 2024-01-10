import styles from './card.module.css';


export async function getStaticProps() {

	const getData = async () =>  {
		const data = await fetch('http://localhost:7777')
		return data.json()
	  }
	  	  
	return (
		
		<div className={styles.container}>

			<h1> Tabela de Viajantes</h1>
			{cards?.map((card) => (
				<div key={card.id} className={styles.card}>					
					<div className={styles.card_title}>
						<p>{card.name}</p>
					</div>
				</div>
			))}
		</div>
		
	)
}



