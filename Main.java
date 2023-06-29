import java.util.*;
import java.util.LinkedList;

public class Main {
    static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        List<List<int[]>> adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        System.out.println("Enter the edges in the format 'source destination weight':");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            int weight = scanner.nextInt();

            adjacencyList.get(source).add(new int[]{destination, weight});
        }

        int shortestCycleLength = findShortestCycle(adjacencyList, vertices);
        if (shortestCycleLength == INF) {
            System.out.println("No cycle exists in the graph.");
        } else {
            System.out.println("Length of the shortest cycle: " + shortestCycleLength);
        }
        scanner.close();
    }

    public static int findShortestCycle(List<List<int[]>> adjacencyList, int vertices) {
        int shortestCycleLength = INF;

        for (int startVertex = 0; startVertex < vertices; startVertex++) {
            int[] distance = new int[vertices];
            Arrays.fill(distance, INF);

            distance[startVertex] = 0;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(startVertex);

            while (!queue.isEmpty()) {
                int currentVertex = queue.poll();

                for (int[] neighbor : adjacencyList.get(currentVertex)) {
                    int nextVertex = neighbor[0];
                    int weight = neighbor[1];
                    if (distance[nextVertex] == INF) {
                        distance[nextVertex] = distance[currentVertex] + weight;
                        queue.add(nextVertex);
                    } else if (nextVertex == startVertex) {
                        shortestCycleLength = Math.min(shortestCycleLength, distance[currentVertex] + weight);
                    }
                }
            }
        }
        return shortestCycleLength;
    }
}
// day 20 cdc