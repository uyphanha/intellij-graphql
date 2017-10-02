package com.intellij.lang.graphql.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.lang.graphql.psi.GraphQLNamedElement;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;

public abstract class GraphQLNamedElementImpl extends GraphQLElementImpl implements GraphQLNamedElement {
  public GraphQLNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override public String getName() {
    PsiElement identifier = getNameIdentifier();
    if (identifier == null) return null;

    ASTNode identifierNode = identifier.getNode();
    if (identifierNode == null) return null;

    return identifierNode.getText();
  }

  @Override public PsiElement setName(@NotNull String newName) throws IncorrectOperationException {
    throw new IncorrectOperationException("GraphQLNamedElement does not support setName");
  }
}
