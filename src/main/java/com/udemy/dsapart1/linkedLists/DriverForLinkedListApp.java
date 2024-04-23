package com.udemy.dsapart1.linkedLists;

public class DriverForLinkedListApp {
	
	public static void main(String[] args) {
	LinkedNodeEntity nodeObj=new LinkedNodeEntity(384.34);
	System.out.println("First Node : "+nodeObj);
	System.out.println("\nAfter adding 1st node to LinkedList : ");
	nodeObj.printDataItemsOfLinkedList(nodeObj);
	
	nodeObj.addNodeAtEndOfLinkList(-34.4);
	nodeObj.addNodeAtEndOfLinkList(394.4);
	nodeObj.addNodeAtEndOfLinkList(0.344);
	nodeObj.addNodeAtEndOfLinkList(540.34);
	nodeObj.addNodeAtEndOfLinkList(349.340);
	nodeObj.addNodeAtEndOfLinkList(100);
	System.out.println("\n");
	System.out.println("\nAfter adding multiple nodes to LinkedList : ");
	System.out.println("************************************************");
	nodeObj.printDataItemsOfLinkedList(nodeObj.getHeadNodeRef());
	System.out.println("\nHead Node - "+nodeObj.getHeadNodeRef().getDataValue());
	System.out.println("\nTail Node - "+nodeObj.getTailNodeRef().getTailNodeRef());
	System.out.println("\nCheck is the node with Value : 0.344 is exists into linkedList - "+nodeObj.checkIsNodeExistsWithAGivenValue(0.344));
	System.out.println("\nCheck is the node with Value : 73 is exists into linkedList - "+nodeObj.checkIsNodeExistsWithAGivenValue(73));
	System.out.println("\n");
	nodeObj.addNodeAtBegeningOfLinkList(44);
	nodeObj.addNodeAtBegeningOfLinkList(11);
	nodeObj.addNodeAtBegeningOfLinkList(2);
	nodeObj.addNodeAtBegeningOfLinkList(22);
	System.out.println("\nAfter adding multiple nodes at the begening of LinkedList : ");
	System.out.println("******************************************************************");
	nodeObj.printDataItemsOfLinkedList(nodeObj.getHeadNodeRef());
	}

}