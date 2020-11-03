public class listad<t> 
{
    private nodod<t> root;

    public listad() 
    {
        root = new nodod<t>();
    }


    private nodod<t> start() 
    {
        return root;
    }

    private nodod<t> first() 
    {
        return root.getNext();
    }

    private nodod<t> last() 
    {
        nodod<t> currentNode = root;
        while (currentNode.getNext() != null) 
        {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    public void addFirst(t dato) 
    {
        add(dato, start());
    }

    public void addLast(t dato) 
    {
        add(dato, last());
    }

    public void add(t dato) 
    {
        add(dato, last());
    }

    public void add(int indice, t dato) 
    {
        nodod<t> aux = start();
        int cont = 0;
        while (aux.getNext() != null && cont < indice) 
        {
            aux = aux.getNext();
            cont++;
        }
        add(dato, aux);
    }

    public void add(t dato, nodod<t> PN) 
    {
        if(PN != null)
        {
            PN.setNext(new nodod<t>(PN, dato, PN.getNext()));

            if(PN.getNext().getNext() != null)
            PN.getNext().getNext().setPrevious(PN.getNext());
        }
    }

    public void remove(int indice) 
    {
        nodod<t> aux = start();
        int cont = 0;
        while (aux.getNext() != null && cont < (indice)) 
        {
            aux = aux.getNext();
            cont++;
        }
        if (aux.getNext() != null) 
        {
            aux.setNext(aux.getNext().getNext());
            if(aux.getNext() != null)
            {
                aux.getNext().setPrevious(aux);
            }
            
        }
    }

    public t get(int indice) 
    {
        nodod<t> aux = first();
        int cont = 0;
        while (aux != null && cont < indice) 
        {
            aux = aux.getNext();
            cont++;
        }
        return aux != null ? aux.getDato() : null;
    }

    public int size() 
    {
        nodod<t> aux = start();
        int cont = 0;
        while (aux.getNext() != null) 
        {
            aux = aux.getNext();
            cont++;
        }
        return cont;
    }

}
