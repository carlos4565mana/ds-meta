import Header from "./components/Header"
import NotificationButton from "./components/NotificationButton"
import SallesCard from "./components/SallesCard"
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';


function App() {

  return (
    <>
    <ToastContainer />
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
