# Binary Tree Data Structure – Java Implementation

This repository contains a simple implementation of a **Binary Tree** in Java, including:

- Node structure (`Node.java`)
- Tree operations (`Tree.java`)
- BFS and DFS traversals
- Level-order (top-down & bottom-up)
- Maximum depth calculation
- Binary Tree construction from traversals (LeetCode style)
- Main driver class (`MainImplementation.java`) to test all operations

This project was created as part of my learning practice for Tree Data Structures.

---

## 🚀 Features Implemented

### 🌳 **Tree Creation**
- Create a tree with a root node
- Insert nodes to the left or right of any given node

---

## 🔁 **Tree Traversals**

### **DFS Traversals**
- **InOrder** (Left → Root → Right)
- **PreOrder** (Root → Left → Right)
- **PostOrder** (Left → Right → Root)

### **BFS Traversal (Level Order)**
- `BFS2()` → Top → Bottom  
- `BFS()` → Bottom → Top (LeetCode 107 style)

These traversals use a queue (`LinkedList`) to process nodes level-by-level.

---

## 🧱 Construction of Binary Tree from Traversals  
This project also includes working implementations (learning versions) for:

### **LeetCode 105 – Construct Binary Tree from Preorder & Inorder Traversal**
Concept:
- Preorder gives: **Root first**
- Locate root in inorder → splits left subtree & right subtree  
- Recursively build left then right  
- Uses `rootIndex + 1` for left subtree root  
- Uses `rootIndex + (mid - left) + 1` for right subtree root

Purpose:
- Helps understand recursion, index math, and tree building.

---

### **LeetCode 106 – Construct Binary Tree from Inorder & Postorder Traversal**
Concept:
- Postorder gives: **Root last**
- Locate root in inorder → splits left subtree & right subtree  
- **Build right subtree first** because postorder = Left → Right → Root  
- Right subtree root index = `ri - 1`  
- Left subtree root index = `ri - (right - mid) - 1`

Purpose:
- Reinforces inorder-based tree splitting and reverse subtree construction logic.

Both constructions helped me deeply understand how traversal orders relate to tree shape.

---

