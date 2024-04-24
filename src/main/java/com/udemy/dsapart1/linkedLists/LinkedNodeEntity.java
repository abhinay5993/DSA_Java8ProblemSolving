package com.udemy.dsapart1.linkedLists;

public class LinkedNodeEntity {
	
	private double dataValue;
	private LinkedNodeEntity nextNodeRef;
	private LinkedNodeEntity headNodeRef;
	private LinkedNodeEntity tailNodeRef;
	private LinkedNodeEntity currentNodeRef;
	
	public LinkedNodeEntity(double dataValue) {
		this.dataValue = dataValue;
	}
	
	/**
	 * @return the dataValue
	 */
	public double getDataValue() {
		return dataValue;
	}

	/**
	 * @return the nextNodeRef
	 */
	public LinkedNodeEntity getNextNodeRef() {
		return nextNodeRef;
	}

	
	/**
	 * @return the tailNodeRef
	 */
	public LinkedNodeEntity getHeadNodeRef() {
		return headNodeRef;
	}
	
	/**
	 * @return the tailNodeRef
	 */
	public LinkedNodeEntity getTailNodeRef() {
		return tailNodeRef;
	}


	/**
	 * @return the currentNodeRef
	 */
	public LinkedNodeEntity LinkedNodeEntity() {
		return currentNodeRef;
	}

	
	/**
	 * @return the currentNodeRef
	 */
	public LinkedNodeEntity getCurrentNodeRef() {
		return currentNodeRef;
	}


	@Override
	public String toString() {
		return "LinkedNodeEntity [dataValue=" + dataValue + ", nextNodeRef=" + nextNodeRef + "]";
	}


	public void addNodeAtEndOfLinkList(double nodeDataValue) {
		LinkedNodeEntity newNodeObj = new LinkedNodeEntity(nodeDataValue);
		if (headNodeRef == null) {
			headNodeRef = newNodeObj;
			tailNodeRef = newNodeObj;
		} else {
			tailNodeRef.nextNodeRef = newNodeObj;
			newNodeObj.nextNodeRef = null;
			tailNodeRef = newNodeObj;
		}
	}
	

	public void addNodeAtBegeningOfLinkList(double nodeDataValue) {
		LinkedNodeEntity newNodeObj = new LinkedNodeEntity(nodeDataValue);
		if (headNodeRef == null || tailNodeRef==null) {
			headNodeRef = newNodeObj;
			tailNodeRef = newNodeObj;
		} else {
			newNodeObj.nextNodeRef=headNodeRef;
			headNodeRef=newNodeObj;
		}
	}
	
	
	public void printDataItemsOfLinkedList(LinkedNodeEntity headNodeRef) {
		LinkedNodeEntity currentNodeRef = headNodeRef;
		while (currentNodeRef != null) {
			System.out.print(""+currentNodeRef.dataValue+" --> ");
			currentNodeRef = currentNodeRef.nextNodeRef;
		}
	}
	
	
	public boolean checkIsNodeExistsWithAGivenValue(double targetValue) {
		boolean blnFlag = false;
		currentNodeRef = headNodeRef;
		while (currentNodeRef != null) {
			if (currentNodeRef.dataValue == targetValue) {
				blnFlag = true;
			}
		currentNodeRef = currentNodeRef.nextNodeRef;
		}
		return blnFlag;
	}
	
	
	public void addNodeToLinkListByIndex(double dataValue, int targetIndex) {
	LinkedNodeEntity newNodeObj = new LinkedNodeEntity(dataValue);
	int count = 1;
	LinkedNodeEntity currentNodeRef = headNodeRef;
	while (currentNodeRef != null && count != targetIndex - 1) {
	currentNodeRef = currentNodeRef.nextNodeRef;
	count++;
	}
	LinkedNodeEntity tempNode=currentNodeRef.nextNodeRef;
	currentNodeRef.nextNodeRef=newNodeObj;
	newNodeObj.nextNodeRef=tempNode;
	}
	
}