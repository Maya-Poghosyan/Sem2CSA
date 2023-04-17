import networkx as nx
import matplotlib.pyplot as plt
import scipy
fb = nx.read_gml("football.gml")
options = {
    'node_color': 'red',
    'node_size': 50,
    'width': 1,
}
nx.draw(fb, with_labels=True, **options)
plt.savefig("graph1.png")
print("A full list of the nodes AKA teams represented in the graph:")
print(fb.nodes())
print("\nThere are ", len(fb.nodes()), " teams represented.")

# the "degree" of a node is how many nodes it itself is connected to. let's test the degree of some random nodes
print("\nDegrees (number of other nodes each node is connected to) of different teams. In this context, the degree represents how many other teams each school's team has played in the 2000 season.")
print("Wisconsin:", fb.degree("Wisconsin"))
print("Cincinnati:", fb.degree("Cincinnati"))
print("Vanderbilt:", fb.degree("Vanderbilt"))

# let's map these out
subax1 = plt.subplot(121)
subax1.set_title("Teams Vanderbilt Played Against")
van_adj = set(fb.adj["Vanderbilt"])
van_adj.add("Vanderbilt")
vanderbilt_subgraph = fb.subgraph(van_adj)
nx.draw_shell(vanderbilt_subgraph,with_labels=True, **options)
subax2 = plt.subplot(122)
subax2.set_title("Teams Purdue Played Against")
purd_adj = set(fb.adj["Purdue"])
purd_adj.add("Purdue")
purdue_subgraph = fb.subgraph(purd_adj)
nx.draw_shell(purdue_subgraph,with_labels=True, **options)
plt.savefig("graph2.png")

print("\nGraph-Wide Values:")
print("Average clustering coefficient:", nx.average_clustering(fb)) # avg clustering
print("Degree assortativity: ", nx.degree_assortativity_coefficient(fb)) # assortativity
btwn_cntr = nx.betweenness_centrality(fb)
sum = 0
for key in btwn_cntr:
  sum += btwn_cntr[key]
sum/len(btwn_cntr)
print("Average betweenness centrality of nodes across the graph: ", sum) # average betweenness centrality
pr = nx.pagerank(fb)
print("PageRank ranking of the teams (from lowest to highest):", sorted(pr)) # sorted pagerank
