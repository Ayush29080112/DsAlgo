import java.util.ArrayList;

public class TreeNode {

	String data;
	ArrayList<TreeNode> children;

	public TreeNode(String data) {
		super();
		this.data = data;
		this.children = new ArrayList<TreeNode>();
	}

	public void addChild(TreeNode child) {
		children.add(child);
	}

	public String print(int level) {
		String ret;
		ret = new String(new char[level]).replace("\0", " ") + data + "\n";
		for (TreeNode treeNode : children) {
			ret += treeNode.print(level + 1);
		}
		return ret;
	}
}
