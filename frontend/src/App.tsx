import BarChart from 'components/BarChart'
import DataTable from 'components/DataTable'
import DonutChart from 'components/DonutChart'
import Footer from 'components/Footer'
import NavBar from './components/NavBar'

const App = () => {
  return (
    <>
      <NavBar />
      <div className='container'>
        <h1 className='text-primary py-3'>ENSDash</h1>

        <div className='row px-3'>
          <div className='col-sm-6'>
            <h5 className='text-center text-secondary'>Metric 1</h5>
            <BarChart />
          </div>
          <div className='col-sm-6'>
            <h5 className='text-center text-secondary'>
              Metric of Ensemble by Class
            </h5>
            <DonutChart />
          </div>
        </div>
        {/*  */}
        <div className='py-3'>
          <h2 className='text-primary'>Student Data List</h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  )
}

export default App
