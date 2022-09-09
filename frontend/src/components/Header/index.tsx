import './styles.css'
import logo from '../../assets/img/logo.svg'

function Header (){
    return (
        <header>
        <div className="dsmeta-logo-container">
            <img src={logo} alt="DSMeta" />
            <h1>DSMeta</h1>
            <p>
              Desenvolvido por
              <a href="https://github.com/carlos4565mana/ds-meta">@carlos4565mana/ Semana Spring React Devsuperior</a>
            </p>
        </div>
    </header>
    )
}
export default Header