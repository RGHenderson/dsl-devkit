/**
 */
package com.avaloq.tools.ddk.xtext.format.format.util;

import com.avaloq.tools.ddk.xtext.format.format.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.avaloq.tools.ddk.xtext.format.format.FormatPackage
 * @generated
 */
public class FormatAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FormatPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormatAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FormatPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormatSwitch<Adapter> modelSwitch =
    new FormatSwitch<Adapter>()
    {
      @Override
      public Adapter caseFormatConfiguration(FormatConfiguration object)
      {
        return createFormatConfigurationAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseIntValue(IntValue object)
      {
        return createIntValueAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseGrammarRule(GrammarRule object)
      {
        return createGrammarRuleAdapter();
      }
      @Override
      public Adapter caseWildcardRule(WildcardRule object)
      {
        return createWildcardRuleAdapter();
      }
      @Override
      public Adapter caseGrammarRuleDirective(GrammarRuleDirective object)
      {
        return createGrammarRuleDirectiveAdapter();
      }
      @Override
      public Adapter caseWildcardRuleDirective(WildcardRuleDirective object)
      {
        return createWildcardRuleDirectiveAdapter();
      }
      @Override
      public Adapter caseGrammarElementReference(GrammarElementReference object)
      {
        return createGrammarElementReferenceAdapter();
      }
      @Override
      public Adapter caseGrammarElementLookup(GrammarElementLookup object)
      {
        return createGrammarElementLookupAdapter();
      }
      @Override
      public Adapter caseContextFreeDirective(ContextFreeDirective object)
      {
        return createContextFreeDirectiveAdapter();
      }
      @Override
      public Adapter caseSpecificDirective(SpecificDirective object)
      {
        return createSpecificDirectiveAdapter();
      }
      @Override
      public Adapter caseMatcherList(MatcherList object)
      {
        return createMatcherListAdapter();
      }
      @Override
      public Adapter caseGroupBlock(GroupBlock object)
      {
        return createGroupBlockAdapter();
      }
      @Override
      public Adapter caseKeywordPair(KeywordPair object)
      {
        return createKeywordPairAdapter();
      }
      @Override
      public Adapter caseMatcher(Matcher object)
      {
        return createMatcherAdapter();
      }
      @Override
      public Adapter caseLocator(Locator object)
      {
        return createLocatorAdapter();
      }
      @Override
      public Adapter caseNoFormatLocator(NoFormatLocator object)
      {
        return createNoFormatLocatorAdapter();
      }
      @Override
      public Adapter caseSpaceLocator(SpaceLocator object)
      {
        return createSpaceLocatorAdapter();
      }
      @Override
      public Adapter caseRightPaddingLocator(RightPaddingLocator object)
      {
        return createRightPaddingLocatorAdapter();
      }
      @Override
      public Adapter caseLinewrapLocator(LinewrapLocator object)
      {
        return createLinewrapLocatorAdapter();
      }
      @Override
      public Adapter caseColumnLocator(ColumnLocator object)
      {
        return createColumnLocatorAdapter();
      }
      @Override
      public Adapter caseOffsetLocator(OffsetLocator object)
      {
        return createOffsetLocatorAdapter();
      }
      @Override
      public Adapter caseIndentLocator(IndentLocator object)
      {
        return createIndentLocatorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration
   * @generated
   */
  public Adapter createFormatConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.IntValue
   * @generated
   */
  public Adapter createIntValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarRule <em>Grammar Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarRule
   * @generated
   */
  public Adapter createGrammarRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.WildcardRule <em>Wildcard Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.WildcardRule
   * @generated
   */
  public Adapter createWildcardRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarRuleDirective <em>Grammar Rule Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarRuleDirective
   * @generated
   */
  public Adapter createGrammarRuleDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.WildcardRuleDirective <em>Wildcard Rule Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.WildcardRuleDirective
   * @generated
   */
  public Adapter createWildcardRuleDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference <em>Grammar Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference
   * @generated
   */
  public Adapter createGrammarElementReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementLookup <em>Grammar Element Lookup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementLookup
   * @generated
   */
  public Adapter createGrammarElementLookupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.ContextFreeDirective <em>Context Free Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.ContextFreeDirective
   * @generated
   */
  public Adapter createContextFreeDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.SpecificDirective <em>Specific Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.SpecificDirective
   * @generated
   */
  public Adapter createSpecificDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.MatcherList <em>Matcher List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.MatcherList
   * @generated
   */
  public Adapter createMatcherListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.GroupBlock <em>Group Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.GroupBlock
   * @generated
   */
  public Adapter createGroupBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.KeywordPair <em>Keyword Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.KeywordPair
   * @generated
   */
  public Adapter createKeywordPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.Matcher <em>Matcher</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.Matcher
   * @generated
   */
  public Adapter createMatcherAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.Locator <em>Locator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.Locator
   * @generated
   */
  public Adapter createLocatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.NoFormatLocator <em>No Format Locator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.NoFormatLocator
   * @generated
   */
  public Adapter createNoFormatLocatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.SpaceLocator <em>Space Locator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.SpaceLocator
   * @generated
   */
  public Adapter createSpaceLocatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.RightPaddingLocator <em>Right Padding Locator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.RightPaddingLocator
   * @generated
   */
  public Adapter createRightPaddingLocatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator <em>Linewrap Locator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator
   * @generated
   */
  public Adapter createLinewrapLocatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator <em>Column Locator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.ColumnLocator
   * @generated
   */
  public Adapter createColumnLocatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.OffsetLocator <em>Offset Locator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.OffsetLocator
   * @generated
   */
  public Adapter createOffsetLocatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.avaloq.tools.ddk.xtext.format.format.IndentLocator <em>Indent Locator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.avaloq.tools.ddk.xtext.format.format.IndentLocator
   * @generated
   */
  public Adapter createIndentLocatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FormatAdapterFactory
