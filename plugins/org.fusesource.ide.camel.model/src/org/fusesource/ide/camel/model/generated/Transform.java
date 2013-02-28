/*******************************************************************************
 * Copyright (c) 2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

/**
 * NOTE - this file is auto-generated using Scalate. 
 * 
 * DO NOT EDIT!
 */
package org.fusesource.ide.camel.model.generated;

import java.util.Map;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.model.TransformDefinition;
import org.apache.camel.model.language.ExpressionDefinition;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.fusesource.ide.camel.model.AbstractNode;
import org.fusesource.ide.camel.model.ExpressionPropertyDescriptor;
import org.fusesource.ide.camel.model.RouteContainer;
import org.fusesource.ide.camel.model.util.Objects;
import org.fusesource.ide.commons.properties.BooleanPropertyDescriptor;
import org.fusesource.ide.commons.properties.ComplexPropertyDescriptor;
import org.fusesource.ide.commons.properties.ComplexUnionPropertyDescriptor;
import org.fusesource.ide.commons.properties.EnumPropertyDescriptor;
import org.fusesource.ide.commons.properties.ListPropertyDescriptor;
import org.fusesource.ide.commons.properties.UnionTypeValue;

/**
 * The Node class for Camel's TransformDefinition
 */
public class Transform extends AbstractNode {

	public static final String PROPERTY_EXPRESSION = "Transform.Expression";
	
	private ExpressionDefinition expression;
	
    public Transform() {
    }		
	
    public Transform(TransformDefinition definition, RouteContainer parent) {

      super(parent);
    	loadPropertiesFromCamelDefinition(definition);
    	loadChildrenFromCamelDefinition(definition);
    }


    /* (non-Javadoc)
     * @see org.fusesource.ide.camel.model.AbstractNode#getIconName()
     */
    @Override
    public String getIconName() {
    	return "transform.png";
    }
    
  	@Override
  	public String getDocumentationFileName() {
  		return "transformEIP";
  	}
  	
  	@Override
  	public String getCategoryName() {
  		return "Transformation";
  	}


	

	/**
	 * @return the expression
	 */
	public ExpressionDefinition getExpression() {
		return this.expression;
	}
	
	/**
	 * @param expression the expression to set
	 */
	public void setExpression(ExpressionDefinition expression) {
		ExpressionDefinition oldValue = this.expression;
		this.expression = expression;
		if (!isSame(oldValue, expression)) {
		    firePropertyChange(PROPERTY_EXPRESSION, oldValue, expression);
		}
	}


	
	/*
	 * (non-Javadoc)
	 * @see org.fusesource.ide.camel.model.AbstractNode#addCustomProperties(java.util.Map)
	 */
	@Override
	protected void addCustomProperties(Map<String, PropertyDescriptor> descriptors) {
		super.addCustomProperties(descriptors);
		
  
  	PropertyDescriptor descExpression = new ExpressionPropertyDescriptor(PROPERTY_EXPRESSION, Messages.propertyLabelTransformExpression);
  		descriptors.put(PROPERTY_EXPRESSION, descExpression);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void setPropertyValue(Object id, Object value) {
		if (PROPERTY_EXPRESSION.equals(id)) {
			setExpression(Objects.convertTo(value, ExpressionDefinition.class));
		}    else {
			super.setPropertyValue(id, value);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.fusesource.ide.camel.model.AbstractNode#getPropertyValue(java.lang.Object)
	 */
	@Override
	public Object getPropertyValue(Object id) {
		if (PROPERTY_EXPRESSION.equals(id)) {
			return this.getExpression();
		}    else {
			return super.getPropertyValue(id);
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ProcessorDefinition createCamelDefinition() {
		TransformDefinition answer = new TransformDefinition();
    answer.setExpression(toXmlPropertyValue(PROPERTY_EXPRESSION, this.getExpression()));
        super.savePropertiesToCamelDefinition(answer);
		return answer;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class<?> getCamelDefinitionClass() {
	  return TransformDefinition.class;
  }

	@SuppressWarnings("rawtypes")
	@Override
	protected void loadPropertiesFromCamelDefinition(ProcessorDefinition processor) {
    super.loadPropertiesFromCamelDefinition(processor);
    
    if (processor instanceof TransformDefinition) {
      TransformDefinition node = (TransformDefinition) processor;
      this.setExpression(node.getExpression());
    } else {
      throw new IllegalArgumentException("ProcessorDefinition not an instanceof TransformDefinition. Was " + processor.getClass().getName());
    }
	}
}
 
      
