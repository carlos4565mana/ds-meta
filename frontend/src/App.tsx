import Header from "./components/Header"
import NotificationButton from "./components/NotificationButton"
import SallesCard from "./components/SallesCard"


function App() {

  return (
    <>
      <Header />
      <section id="sales">
        <div className="dsmeta-container">
          <SallesCard />
        </div>
      </section>
    
    </>
    
  )
}

export default App
