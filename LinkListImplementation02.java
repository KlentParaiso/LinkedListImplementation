
package javaapplication1;
public class LinkListImplementation02 {
    Node head;
    Node tail;
    int size =0;
    
    public Object[] toArray(){//convert list to array
        Object[] objs = new Object[size];
        
        Node tmp = head;
        int index=0;
        while(tmp!=null){
            objs[index] = tmp.obj;
            tmp = tmp.link;
            index++;
        }

        return objs;
    }
    
    public void addLast(Object o){//adds element at the end of the list
        Node newNode = new Node();
        newNode.obj = o;
        if(tail==null){
            head = newNode;
        }else{
            tail.link = newNode;
        }
        tail = newNode;
        size++;
    }
    public void addFirst(Object o){//insert new element at the beginning of the list
        
        Node newNode = new Node();
       
        
        newNode.obj = o;
        newNode.link = head;
        if(head == null){
            tail = newNode;
        }
        head = newNode;
        size++;
    }
    
    public void clear(){//remove all elements
         Node empty = new Node();
        head = empty;
        size = 0;
    }
    
    public boolean contains(Object o){//returns TRUE if the element exists else FALSE
          Node tmp = head;
        while (tmp.link != null) {
            if (tmp.obj == o) {
                return true;
            }
            tmp = tmp.link;
        }
        return false;
    }
    
    public Object get(int index){//get element at the specific index
          if (index < 0 || index > size){
            return null;
        }
        Object[] objs = this.toArray();
        return objs[index];
      
    }
    
    public Object getFirst(){//return the first element and dont remove it
         return head.obj;
      
    }
    
    public Object getLast(){//return the last element and dont remove it
        
          return tail.obj;
    }
       
    public int size(){//get the number of objects in the list
        return size;
    }
    
    public Object removeFirst(){//removes the head
        
       Object o = head.obj;
        head = head.link;
        size--;
        return o;
    }
    
    public Object removeLast(){//removes the last element
        Node tmp = head;
        Object o = null;
        while(tmp!=null){
            if(tmp.link==tail){
                o = tail.obj;
                tail = tmp;
                tail.link = null;
                break;
            }
            tmp = tmp.link;
        }
        size--;
        return o;
    }
}

class Node{
    Object obj;
    Node link;
}

    

