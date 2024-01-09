import Link from 'next/link'

export default function Header() {
	return (
		<header className="header">
			<img src="/logo.png" alt="logo" />
			<ul>
				<li>
					<Link href="/RotaUm">Viajantes</Link>
				</li>
				<li>
					<Link href="/RotaDois"></Link>
				</li>
				<li>
					<Link href="/RotaTres"></Link>
				</li>
			</ul>
		</header>
	)
}