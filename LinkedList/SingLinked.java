/****************************************************************************/
/* Developer: Bradley Wadas, Ashlee Johnson      CSC 2403     Spring 2021		    */
/* Lab 4 exercise -- Singly Linked list enhancements			    */
/****************************************************************************/
public class SingLinked {

        /*****************/
        /*** Constants ***/
        /*****************/
        final int DEFAULT_VALUE = -1;
        /**********************/
        /* Instance variables */
        /**********************/
        protected int nodeElement;	// The data element
        protected SingLinked nextNode;	// Reference to the next list node
        SingLinked x;
        /***********************/
        /* Constructor methods */
        /***********************/
        public SingLinked() {
            nodeElement = DEFAULT_VALUE;
            nextNode = null;
        }

        public SingLinked(int elVal) {
            nodeElement = elVal;
            nextNode = null;
        }

        public SingLinked (int elVal, SingLinked nxt) {
            nodeElement = elVal;
            nextNode = nxt;
        }

        /**********************/
        /* Set/Update methods */
        /**********************/
	// Sets the value of the data element in the linked list node
        public void setElement (int elVal) {
            nodeElement = elVal;
        }

	// Sets the reference to the next node in the linked list
        public void setNext (SingLinked nxt) {
            nextNode = nxt;
        }

	/* Stubbed addToList() -- to be implemented as Lab 4 requirement #3 */
	// Creates a new list node, sets its value to that of the argument,
	// and appends the new node to the end of the linked list.
        public void addToList(int elVal) {
          SingLinked x = new SingLinked(elVal);
          SingLinked currentNode = nextNode;
          currentNode = currentNode.findTail();
          currentNode.setNext(x);
	        return;
        }

        /******************************************************/
        /* Extra credit set/update placeholders for Lab 4     */
        /* If you take this on, don't overlook getting rid of */
        /* the null return from two following stubbed methods */
        /******************************************************/

	/************************************************************************/
	/* Conversion of a singly linked list to a circular singly linked list. */
	/* Implemented as a static method since it is intended for use as a     */
	/* conversion utility and not as a method used for processing linked 	*/
	/* lists in real-time.							*/
	/************************************************************************/
        public static SingLinked convertToCirc(SingLinked listHead) {
            SingLinked tail = listHead.findTail();
            tail.setNext(listHead);
            return tail;
        }

	/************************************************************************/
	/* Conversion of a circular singly linked list to a non-circular singly */
	/* linked list. This method is implemented as a static method since it  */
	/* is intended for use as a conversion utility and not as a method used */
	/* for processing linked lists in real-time.				*/
	/************************************************************************/
        public static SingLinked convertFromCirc(SingLinked listTail) {
            SingLinked head = listTail.getNext();
            listTail.setNext(null);
            return head;
        }

        /***********************/
        /* Access/Get methods  */
        /***********************/
        // Obtain the value of the data element
        public int getElement() {
            return nodeElement;
        }

        // Obtain the link to the next node in the list
        public SingLinked getNext() {
            return (nextNode);
        }

	/* Stubbed findTail() -- to be implemented as Lab 4 requirement #1   */
        public SingLinked findTail() {
          SingLinked x = nextNode;
          while (x != null){
            if (x.getNext() == null){
              break;
            }
            else {
              x = x.getNext();
            }
          }
          return x;
        }

	/* Stubbed countNodes() -- to be implemented as Lab 4 requirement #2 */
      public int countNodes() {
		    int nodeCount = 1;
        SingLinked x = nextNode;
        while (x != null){
          nodeCount++;
          if (x.getNext() == null){
            break;
          }
          else {
            x = x.getNext();
          }
        }
		    return nodeCount;
	    }
}