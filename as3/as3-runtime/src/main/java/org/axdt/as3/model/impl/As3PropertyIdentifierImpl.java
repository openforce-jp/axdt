/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model.impl;

import org.axdt.as3.As3EPackage;
import org.axdt.as3.model.As3Operation;
import org.axdt.as3.model.As3PropertyIdentifier;
import org.axdt.avm.AvmEFactory;
import org.axdt.avm.model.AvmExecutable;
import org.axdt.avm.model.AvmReferable;
import org.axdt.avm.model.AvmType;
import org.axdt.avm.model.AvmTypeReference;
import org.axdt.avm.model.AvmVariable;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>As3 Property Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class As3PropertyIdentifierImpl extends As3SimpleIdentifierImpl implements As3PropertyIdentifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected As3PropertyIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As3EPackage.Literals.AS3_PROPERTY_IDENTIFIER;
	}

	@Override
	public AvmType resolveType() {
		AvmReferable ref = getReference();
		if (ref == null && name == null)
			return AvmEFactory.eINSTANCE.createAvmNull();
		// TODO when should a avm type resolve to Class ?
		if (ref instanceof AvmType) {
			return (AvmType) ref;
		} else if (ref instanceof AvmVariable) {
			AvmTypeReference typeRef = ((AvmVariable) ref).getType();
			if (typeRef != null)
			return typeRef.getType();
		} else if (ref instanceof AvmExecutable) {
			if (ref instanceof As3Operation) {
				As3Operation operation = (As3Operation) ref;
				if (operation.isGetter())
					return operation.getReturnType().getType();
			}
			return getClassProxy("Function");
		}
		return AvmEFactory.eINSTANCE.createAvmGeneric();
	}
} //As3PropertyIdentifierImpl
