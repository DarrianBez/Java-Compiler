/*
    Team VOS:
        Sebastian Adame,
        Darrian Bezayiff,
        Aingty Eung,
        Angela Flores,
        Matthew Nguyen
*/
import java.util.ArrayList;

public class Node
{
    private ArrayList<Node> childrenList;
    private String value;
    private int nodeID;

    public Node(String v, int givenID)
    {
        value = v;
        nodeID = givenID;
        childrenList = new ArrayList<Node>();
    }

    public void addChild(Node cNode)
    {
        childrenList.add(cNode);
    }

    public String getValue()
    {
        return this.value;
    }

    public int getID()
    {
        return this.nodeID;
    }
    public ArrayList<Node> getChildren()
    {
        return this.childrenList;
    }

}