/*******************************************************************************
 * Copyright (c) 2010 Martin Schnabel <mb0@mb0.org>.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.axdt.as3.model;

import junit.textui.TestRunner;

import org.axdt.as3.As3EFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>As3 Bitwise Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class As3BitwiseExpressionTest extends As3BinaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(As3BitwiseExpressionTest.class);
	}

	/**
	 * Constructs a new As3 Bitwise Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public As3BitwiseExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this As3 Bitwise Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected As3BitwiseExpression getFixture() {
		return (As3BitwiseExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(As3EFactory.eINSTANCE.createAs3BitwiseExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	@Override
	public void testResolveType() {
		assertProxyType("avm:/types/int", getFixture().resolveType());
	}

} //As3BitwiseExpressionTest
