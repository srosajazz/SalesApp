const Footer = () => {
  return (
    <>
      <footer className='footer mt-auto py-3 bg-dark'>
        <div className='container'>
          <p className='text-light'>
            App desenvolvido por{' '}
            <a
              href='https://github.com/srosajazz'
              target='_blank'
              rel='noreferrer'
            >
              DevSuperior
            </a>
          </p>
          <p className='text-light'>
            <small>
              <strong>Learning Spring React</strong>
              <br />
              Evento promovido pela escola DevSuperior:{' '}
              <a
                href='https://github.com/srosajazz'
                target='_blank'
                rel='noreferrer'
              >
                @sergiorosa
              </a>
            </small>
          </p>
        </div>
      </footer>
    </>
  )
}

export default Footer
