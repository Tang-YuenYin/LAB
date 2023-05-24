
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
    
    //Q1
    //This is enough. 
    //A -> B
    //B -> A
        public boolean addUndirectedEdge(T source, T destination) {
        return addEdge(source, destination) && addEdge(destination, source);
    }
    
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
    public 
    
       
}
