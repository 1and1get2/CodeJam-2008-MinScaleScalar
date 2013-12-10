package permute;
import java.util.Enumeration;
import java.util.List;


public class MyTreeNode implements javax.swing.tree.TreeNode{
	private MyTreeNode parent;
	private int value;
	protected List<MyTreeNode> childList;
	
	public MyTreeNode(int value) {
		super();
		this.parent = null;
		this.value = value;
		this.childList = null;
	}
	
	public MyTreeNode(MyTreeNode parent, int value, List<MyTreeNode> childList) {
		super();
		this.parent = parent;
		this.value = value;
		this.childList = childList;
	}

	public MyTreeNode getParent() {
		return parent;
	}

	public void setParent(MyTreeNode parent) {
		this.parent = parent;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public List<MyTreeNode> getChildList() {
		return childList;
	}

	public void setChildList(List<MyTreeNode> childList) {
		this.childList = childList;
	}

	public int[] getAncient(){
		return null;
	}
	public int[] getAncients(int[] ancients){
		return null;
	}

	@Override
	public Enumeration children() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public javax.swing.tree.TreeNode getChildAt(int childIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIndex(javax.swing.tree.TreeNode node) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
