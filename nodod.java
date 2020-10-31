public class nodod <t>
{
    private t dato;
	
	private nodod<t> next, previous;
	
    public nodod(nodod<t> previous, t dato, nodod<t> next) 
    {
		this.previous = previous;
		this.dato = dato;
		this.next = next;
	}
    public nodod() 
    {
		this(null, null, null);
	}


    public t getDato() 
    {
		return dato;
	}

    public void setDato(t dato) 
    {
		this.dato = dato;
	}

    public nodod<t> getNext() 
    {
		return next;
	}

    public void setNext(nodod<t> next) 
    {
		this.next = next;
    }
    
    public nodod<t> getPrevious() 
    {
		return previous;
    }
    
    public void setPrevious(nodod<t> previous) 
    {
		this.previous = previous;
    }
    
}
