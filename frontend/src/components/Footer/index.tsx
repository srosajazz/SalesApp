const Footer = () => {
  return (
    <footer className='footer mt-auto py-3 bg-dark'>
      <div className='container'>
        <p className='text-light'>
          App created by{' '}
          <a
            href='https://github.com/srosajazz'
            target='_blank'
            rel='noreferrer'
          >
            Sergio Rosa(GitHub){' '}
          </a>
          <br />
          <a
            href='https://www.linkedin.com/in/sergiorosa1/'
            target='_blank'
            rel='noreferrer'
          >
            Sergio Rosa(Linedkin)
          </a>
        </p>
        <p className='text-light'>
          <small>
            <strong>
              Week training Spring React <br />
              Java - Spring Boot - JPA / Hibernate - Maven - JWT
            </strong>
            <br />
            Event organized by DevSuperior:{' '}
            <a
              href='https://instagram.com/devsuperior.ig'
              target='_blank'
              rel='noreferrer'
            >
              @devsuperior.ig
            </a>
          </small>
        </p>
      </div>
    </footer>
  )
}

export default Footer
