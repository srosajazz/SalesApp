import DataTable from 'components/DataTable'
import Footer from 'components/Footer'
import NavBar from './components/NavBar'

const App = () => {
  return (
    <>
      <NavBar />
      <div className='container'>
        {/* <h1 className='text-primary'>Sergio App!</h1> */}
        <DataTable />
      </div>
      <Footer />
    </>
  )
}

export default App
