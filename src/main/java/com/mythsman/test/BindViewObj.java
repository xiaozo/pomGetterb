package com.mythsman.test;

import com.sun.tools.javac.tree.JCTree;

import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

public class BindViewObj {
    public Element typeElement;
    public JCTree.JCVariableDecl tree;

    public BindViewObj(Element typeElement, JCTree.JCVariableDecl tree) {
        this.typeElement = typeElement;
        this.tree = tree;
    }

    public Element getTypeElement() {
        return typeElement;
    }

    public JCTree.JCVariableDecl getTree() {
        return tree;
    }

    public void setTypeElement(TypeElement typeElement) {
        this.typeElement = typeElement;
    }

    public void setTree(JCTree.JCVariableDecl tree) {
        this.tree = tree;
    }
}
