// -----------------------------------------------------------
// Estruturas de Dados 2025/2026 (CC1007) - DCC/FCUP
// https://www.dcc.fc.up.pt/~fds/aulas/EDados/2526/
// -----------------------------------------------------------
// Lista ligada simples
// -----------------------------------------------------------

public class SinglyLinkedList<T> {
    private Node<T> first;    // Primeiro no da lista
    private int size;         // Tamanho da lista

    // Construtor (cria lista vazia)
    SinglyLinkedList() {
        first = null;
        size = 0;
    }

    // Retorna o tamanho da lista
    public int size() {
        return size;
    }

    // Devolve true se a lista estiver vazia ou falso caso contrario
    public boolean isEmpty() {
        return (size == 0);
    }
    
    // Adiciona v ao inicio da lista
    public void addFirst(T v) {
        Node<T> newNode = new Node<T>(v, first); 
        first = newNode;
        size++;
    }

    // Adiciona v ao final da lista
    public void addLast(T v) {
        Node<T> newNode = new Node<T>(v, null); 
        if (isEmpty()) {
            first = newNode;
        } else {
            Node<T> cur = first;
            while (cur.getNext() != null)
                cur = cur.getNext();
            cur.setNext(newNode);         
        }
        size++;
    }

    // Retorna o primeiro valor da lista (ou null se a lista for vazia)
    public T getFirst() {
        if (isEmpty()) return null;
        return first.getValue();
    }

    // Retorna o ultimo valor da lista (ou null se a lista for vazia)
    public T getLast() {
        if (isEmpty()) return null;
        Node<T> cur = first;
        while (cur.getNext() != null)
            cur = cur.getNext();
        return cur.getValue();      
    }

    // Remove o primeiro elemento da lista (se for vazia nao faz nada)
    public void removeFirst() {
        if (isEmpty()) return;
        first = first.getNext();
        size--;
    }

    // Remove o ultimo elemento da lista (se for vazia nao faz nada)
    public void removeLast() {
        if (isEmpty()) return;
        if (size == 1) {
            first = null;
        } else {
            // Ciclo com for e uso de de size para mostrar alternativa ao while
            Node<T> cur = first;
            for (int i=0; i<size-2; i++)
                cur = cur.getNext();
            cur.setNext(cur.getNext().getNext());
        }
        size--;
    }
    
    // Converte a lista para uma String
    public String toString() {
        String str = "{";      
        Node<T> cur = first;
        while (cur != null) {
            str += cur.getValue();
            cur = cur.getNext();
            if (cur != null) str += ",";                     
        }      
        str += "}";
        return str;
    }
    public T get(int pos){
        if(this.isEmpty()){return null;}
        if(pos>this.size() || pos<0){return null;}
        int counter=0;
        Node<T> current=this.first;
        while(counter<this.size()){
            if(counter==pos){return current.getValue();}
            current=current.getNext();
            counter++;
        }
        return null;
    }
    public T remove(int pos){
        //if empty or pos out of range
        if(this.isEmpty()){return null;}
        if(pos>=this.size() || pos<0){return null;}
        //first
        if(pos==0){
            T temp=this.getFirst();
            this.removeFirst();
            return temp;
        }
        //last
        if(pos==this.size()-1){
            T temp=getLast();
            this.removeLast();
            return temp;
        }
        //other cases
        int counter=1;
        Node<T> prev=this.first;
        Node<T> current=this.first.getNext();
        while(counter<this.size()){
            if(counter==pos){
                T temp=current.getValue();
                prev.setNext(current.getNext());
                this.size--;
                return temp;
            }
            prev=current;
            current=current.getNext();
            counter++;
        }
        return null;
    }
    public SinglyLinkedList<T> copy(){
        SinglyLinkedList<T> res = new SinglyLinkedList<T>();
        if(this.isEmpty()){return res;}      
        for(int i=0; i!=this.size; i++){
            res.addLast(this.get(i));
        }
        return res;
    }
    public void duplicate(){
        if(this.isEmpty()){return;}
        Node<T> current=this.first;
        while(current.getNext()!=null){
            Node<T> temp=new Node<T>(current.getValue(), current.getNext());
            current.setNext(temp);
            this.size++;
            current=current.getNext().getNext();
        }
        this.addLast(current.getValue());
    }
    public int count(T value){
        int res=0;
        if(this.isEmpty()){return res;}
        Node<T> current=this.first;
        while(current!=null){
            if(current.getValue().equals(value)){res++;}
            current=current.getNext();
        }
        return res;
    }
    public void removeAll(T value) {
        if (this.isEmpty()) {
            return;
        }
        while (!this.isEmpty() && this.getFirst().equals(value)) {
            this.removeFirst();
        }
        if (this.isEmpty()) {
            return;
        }
        Node<T> current = this.first;
        while (current != null && current.getNext() != null) {
            Node<T> iter = current.getNext();
            int count = 0;
    
            while (iter != null && iter.getValue().equals(value)) {
                count++;
                iter = iter.getNext();
            }
            this.size -= count;
            current.setNext(iter);
            if (iter == null) {
                break;
            }
            current = iter;
        }
    }
}
