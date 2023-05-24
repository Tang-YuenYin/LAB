
package Graph;
public class Graph<T extends Comparable<T>, N extends Comparable<N>> extends WeightedGraph<T, N> {
    
    // Methods
    public boolean addEdge(T source, T destination) {
        if (head == null) return false;
        if (!super.hasVertex(source) || !super.hasVertex(destination)) return false;
        Vertex<T, N> sourceVertex = head;
        while (sourceVertex != null) {
            if (sourceVertex.vertexInfo.compareTo(source) == 0) {
                // Reached source vertex, look for destination now
                Vertex<T, N> destinationVertex = head;
                while (destinationVertex != null) {
                    if (destinationVertex.vertexInfo.compareTo(destination) == 0) {
                        // Reached destination vertex, add edge here
                        Edge<T, N> currentEdge = sourceVertex.firstEdge;
                        Edge<T, N> newEdge = new Edge<>(destinationVertex, null, currentEdge);
                        sourceVertex.firstEdge = newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                    destinationVertex = destinationVertex.nextVertex;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    
    //Q3
    addEdge(source,destination,1);
    //or
    //addEdge(source,destination,null);//If you dont want to add weight
    //Q1
    //This is enough. 
    //A -> B
    //B -> A
        public boolean addUndirectedEdge(T source, T destination) {
        return addEdge(source, destination) && addEdge(destination, source);
    }
    /*
    public boolean ddEdge(T source, T destination)
    {
        return super.addEdge(source,destination,1);
    }
    
    public boolean addUndirectedEdge(T v1,T v2)
    {
        boolean a,b;
        a=addEdge(v1,v2,1);
        b=addEdge(v2,v1,1);
        return(a&&b);
        
        
    }
    */
    //Q1
    /*
    Alternative:
    public boolean addUndirectedEdge(T v1,T v2,N w)
    {
        boolean a,b;
        a=addEdge(v1,v2,w);
        b=adddEdge(v2,v1,w);
        return(a&&b);
     }
    */
    
    //Q2
    public oolean removeEdge(T source, T destination)
    {
        if(!hasEdge(source,destination)
           {
               return false;
           }
           
        Vertex<T,N> temp=head;
           
        while(temp!=null)
           {
               if(temp.vertexInfo.compareTo(source)==0)
               {
                   //Reached vertex,start deleting module
                   Edge<T,N> currentEdge =temp.firstEdge;
                   if(currentEdge.toVertex.vertexInfo.compareTo(destimation)==0)
                   {
                       //The first edge is the onw we want to delete
                       temp.firstEdge=currentEdge.nextEdge;
                       currentEdge.nextEdge=null;
                   }
                   else{
                       //need to transverse to find te edge
                       Edge<T,N>previousEdge=currentEdge;
                       currentEdge=currentEdge.nextEdge;
                       while(currentEdge!=null)
                       {
                           if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0))
                           {
                               previosEdge.nextEdge=currentEdge.nextEdge;
                               currentEdge.nextEdge=null;
                               break;
                           }
                           previousEdge=currentEdge;
                           currentEdge=currentEdge.nextEdge;
                       }
                   }
                   temp.outdeg--;
                   currentEdge.toVertex.indeg--;
                   return true;
                   
               }//end deleteting module
               temp=temp.nextVertex;
           }
           return false;
    }
    
       
}
