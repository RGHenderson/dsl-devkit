/**
 */
package com.avaloq.tools.ddk.xtext.format.format;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.avaloq.tools.ddk.xtext.format.format.FormatFactory
 * @model kind="package"
 * @generated
 */
public interface FormatPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "format";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.avaloq.com/tools/ddk/xtext/format/Format";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "format";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FormatPackage eINSTANCE = com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl.init();

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.FormatConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatConfigurationImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getFormatConfiguration()
   * @generated
   */
  int FORMAT_CONFIGURATION = 0;

  /**
   * The feature id for the '<em><b>Target Grammar</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_CONFIGURATION__TARGET_GRAMMAR = 0;

  /**
   * The feature id for the '<em><b>Extended Format Configuration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_CONFIGURATION__EXTENDED_FORMAT_CONFIGURATION = 1;

  /**
   * The feature id for the '<em><b>Formatter Base Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_CONFIGURATION__FORMATTER_BASE_CLASS = 2;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_CONFIGURATION__CONSTANTS = 3;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_CONFIGURATION__RULES = 4;

  /**
   * The number of structural features of the '<em>Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_CONFIGURATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.ConstantImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 1;

  /**
   * The feature id for the '<em><b>Int Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__INT_TYPE = 0;

  /**
   * The feature id for the '<em><b>String Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__STRING_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = 2;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__INT_VALUE = 3;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__STRING_VALUE = 4;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.IntValueImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 2;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__LITERAL = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.StringValueImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 3;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__LITERAL = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__REFERENCE = 1;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.RuleImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getRule()
   * @generated
   */
  int RULE = 4;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__OVERRIDE = 0;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.GrammarRuleImpl <em>Grammar Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.GrammarRuleImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getGrammarRule()
   * @generated
   */
  int GRAMMAR_RULE = 5;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_RULE__OVERRIDE = RULE__OVERRIDE;

  /**
   * The feature id for the '<em><b>Target Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_RULE__TARGET_RULE = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_RULE__DIRECTIVES = RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Grammar Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.WildcardRuleImpl <em>Wildcard Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.WildcardRuleImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getWildcardRule()
   * @generated
   */
  int WILDCARD_RULE = 6;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_RULE__OVERRIDE = RULE__OVERRIDE;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_RULE__DIRECTIVES = RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Wildcard Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.GrammarRuleDirectiveImpl <em>Grammar Rule Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.GrammarRuleDirectiveImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getGrammarRuleDirective()
   * @generated
   */
  int GRAMMAR_RULE_DIRECTIVE = 7;

  /**
   * The number of structural features of the '<em>Grammar Rule Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.WildcardRuleDirectiveImpl <em>Wildcard Rule Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.WildcardRuleDirectiveImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getWildcardRuleDirective()
   * @generated
   */
  int WILDCARD_RULE_DIRECTIVE = 8;

  /**
   * The number of structural features of the '<em>Wildcard Rule Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_RULE_DIRECTIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.GrammarElementReferenceImpl <em>Grammar Element Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.GrammarElementReferenceImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getGrammarElementReference()
   * @generated
   */
  int GRAMMAR_ELEMENT_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ELEMENT_REFERENCE__ASSIGNMENT = 0;

  /**
   * The feature id for the '<em><b>Rule Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ELEMENT_REFERENCE__RULE_CALL = 1;

  /**
   * The feature id for the '<em><b>Self</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ELEMENT_REFERENCE__SELF = 2;

  /**
   * The feature id for the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ELEMENT_REFERENCE__RULE = 3;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ELEMENT_REFERENCE__KEYWORD = 4;

  /**
   * The number of structural features of the '<em>Grammar Element Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ELEMENT_REFERENCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.GrammarElementLookupImpl <em>Grammar Element Lookup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.GrammarElementLookupImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getGrammarElementLookup()
   * @generated
   */
  int GRAMMAR_ELEMENT_LOOKUP = 10;

  /**
   * The feature id for the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ELEMENT_LOOKUP__RULE = 0;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ELEMENT_LOOKUP__KEYWORD = 1;

  /**
   * The number of structural features of the '<em>Grammar Element Lookup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAMMAR_ELEMENT_LOOKUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.ContextFreeDirectiveImpl <em>Context Free Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.ContextFreeDirectiveImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getContextFreeDirective()
   * @generated
   */
  int CONTEXT_FREE_DIRECTIVE = 11;

  /**
   * The feature id for the '<em><b>Grammar Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FREE_DIRECTIVE__GRAMMAR_ELEMENTS = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Matcher List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FREE_DIRECTIVE__MATCHER_LIST = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Context Free Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FREE_DIRECTIVE_FEATURE_COUNT = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.SpecificDirectiveImpl <em>Specific Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.SpecificDirectiveImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getSpecificDirective()
   * @generated
   */
  int SPECIFIC_DIRECTIVE = 12;

  /**
   * The feature id for the '<em><b>Grammar Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIC_DIRECTIVE__GRAMMAR_ELEMENTS = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Matcher List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIC_DIRECTIVE__MATCHER_LIST = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Specific Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIC_DIRECTIVE_FEATURE_COUNT = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.MatcherListImpl <em>Matcher List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.MatcherListImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getMatcherList()
   * @generated
   */
  int MATCHER_LIST = 13;

  /**
   * The feature id for the '<em><b>Matchers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCHER_LIST__MATCHERS = 0;

  /**
   * The number of structural features of the '<em>Matcher List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCHER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.GroupBlockImpl <em>Group Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.GroupBlockImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getGroupBlock()
   * @generated
   */
  int GROUP_BLOCK = 14;

  /**
   * The feature id for the '<em><b>Grammar Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BLOCK__GRAMMAR_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Matcher List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BLOCK__MATCHER_LIST = 1;

  /**
   * The feature id for the '<em><b>Sub Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BLOCK__SUB_GROUP = 2;

  /**
   * The feature id for the '<em><b>Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BLOCK__DIRECTIVES = 3;

  /**
   * The number of structural features of the '<em>Group Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BLOCK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.KeywordPairImpl <em>Keyword Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.KeywordPairImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getKeywordPair()
   * @generated
   */
  int KEYWORD_PAIR = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD_PAIR__LEFT = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD_PAIR__RIGHT = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Left Matchers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD_PAIR__LEFT_MATCHERS = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right Matchers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD_PAIR__RIGHT_MATCHERS = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Keyword Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD_PAIR_FEATURE_COUNT = GRAMMAR_RULE_DIRECTIVE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.MatcherImpl <em>Matcher</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.MatcherImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getMatcher()
   * @generated
   */
  int MATCHER = 16;

  /**
   * The feature id for the '<em><b>Locator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCHER__LOCATOR = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCHER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCHER__CONDITION = 2;

  /**
   * The number of structural features of the '<em>Matcher</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCHER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.LocatorImpl <em>Locator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.LocatorImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getLocator()
   * @generated
   */
  int LOCATOR = 17;

  /**
   * The number of structural features of the '<em>Locator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.NoFormatLocatorImpl <em>No Format Locator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.NoFormatLocatorImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getNoFormatLocator()
   * @generated
   */
  int NO_FORMAT_LOCATOR = 18;

  /**
   * The number of structural features of the '<em>No Format Locator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_FORMAT_LOCATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.SpaceLocatorImpl <em>Space Locator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.SpaceLocatorImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getSpaceLocator()
   * @generated
   */
  int SPACE_LOCATOR = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE_LOCATOR__VALUE = LOCATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>No Space</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE_LOCATOR__NO_SPACE = LOCATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Space Locator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE_LOCATOR_FEATURE_COUNT = LOCATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.RightPaddingLocatorImpl <em>Right Padding Locator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.RightPaddingLocatorImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getRightPaddingLocator()
   * @generated
   */
  int RIGHT_PADDING_LOCATOR = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_PADDING_LOCATOR__VALUE = LOCATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Right Padding Locator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_PADDING_LOCATOR_FEATURE_COUNT = LOCATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.LinewrapLocatorImpl <em>Linewrap Locator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.LinewrapLocatorImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getLinewrapLocator()
   * @generated
   */
  int LINEWRAP_LOCATOR = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEWRAP_LOCATOR__VALUE = LOCATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Minimum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEWRAP_LOCATOR__MINIMUM = LOCATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEWRAP_LOCATOR__DEFAULT = LOCATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Maximum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEWRAP_LOCATOR__MAXIMUM = LOCATOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>No Linewrap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEWRAP_LOCATOR__NO_LINEWRAP = LOCATOR_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Linewrap Locator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEWRAP_LOCATOR_FEATURE_COUNT = LOCATOR_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.ColumnLocatorImpl <em>Column Locator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.ColumnLocatorImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getColumnLocator()
   * @generated
   */
  int COLUMN_LOCATOR = 22;

  /**
   * The feature id for the '<em><b>Fixed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LOCATOR__FIXED = LOCATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LOCATOR__VALUE = LOCATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LOCATOR__PARAMETER = LOCATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Relative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LOCATOR__RELATIVE = LOCATOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Nobreak</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LOCATOR__NOBREAK = LOCATOR_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Column Locator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LOCATOR_FEATURE_COUNT = LOCATOR_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.OffsetLocatorImpl <em>Offset Locator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.OffsetLocatorImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getOffsetLocator()
   * @generated
   */
  int OFFSET_LOCATOR = 23;

  /**
   * The feature id for the '<em><b>Fixed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET_LOCATOR__FIXED = LOCATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET_LOCATOR__VALUE = LOCATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Nobreak</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET_LOCATOR__NOBREAK = LOCATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Offset Locator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFSET_LOCATOR_FEATURE_COUNT = LOCATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.IndentLocatorImpl <em>Indent Locator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.IndentLocatorImpl
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getIndentLocator()
   * @generated
   */
  int INDENT_LOCATOR = 24;

  /**
   * The feature id for the '<em><b>Increment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_LOCATOR__INCREMENT = LOCATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_LOCATOR__VALUE = LOCATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_LOCATOR__PARAMETER = LOCATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Indent Locator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDENT_LOCATOR_FEATURE_COUNT = LOCATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.format.format.MatcherType <em>Matcher Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.format.format.MatcherType
   * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getMatcherType()
   * @generated
   */
  int MATCHER_TYPE = 25;


  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration
   * @generated
   */
  EClass getFormatConfiguration();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration#getTargetGrammar <em>Target Grammar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Grammar</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration#getTargetGrammar()
   * @see #getFormatConfiguration()
   * @generated
   */
  EReference getFormatConfiguration_TargetGrammar();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration#getExtendedFormatConfiguration <em>Extended Format Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extended Format Configuration</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration#getExtendedFormatConfiguration()
   * @see #getFormatConfiguration()
   * @generated
   */
  EReference getFormatConfiguration_ExtendedFormatConfiguration();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration#getFormatterBaseClass <em>Formatter Base Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Formatter Base Class</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration#getFormatterBaseClass()
   * @see #getFormatConfiguration()
   * @generated
   */
  EReference getFormatConfiguration_FormatterBaseClass();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration#getConstants()
   * @see #getFormatConfiguration()
   * @generated
   */
  EReference getFormatConfiguration_Constants();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.FormatConfiguration#getRules()
   * @see #getFormatConfiguration()
   * @generated
   */
  EReference getFormatConfiguration_Rules();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.Constant#isIntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Type</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Constant#isIntType()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_IntType();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.Constant#isStringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Type</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Constant#isStringType()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_StringType();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.Constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Constant#getName()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Name();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.Constant#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Constant#getIntValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_IntValue();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.Constant#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Constant#getStringValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_StringValue();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.IntValue#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.IntValue#getLiteral()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Literal();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.IntValue#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.IntValue#getReference()
   * @see #getIntValue()
   * @generated
   */
  EReference getIntValue_Reference();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.StringValue#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.StringValue#getLiteral()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Literal();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.StringValue#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.StringValue#getReference()
   * @see #getStringValue()
   * @generated
   */
  EReference getStringValue_Reference();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.Rule#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Rule#isOverride()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Override();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarRule <em>Grammar Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grammar Rule</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarRule
   * @generated
   */
  EClass getGrammarRule();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarRule#getTargetRule <em>Target Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Rule</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarRule#getTargetRule()
   * @see #getGrammarRule()
   * @generated
   */
  EReference getGrammarRule_TargetRule();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarRule#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarRule#getDirectives()
   * @see #getGrammarRule()
   * @generated
   */
  EReference getGrammarRule_Directives();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.WildcardRule <em>Wildcard Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard Rule</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.WildcardRule
   * @generated
   */
  EClass getWildcardRule();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.format.format.WildcardRule#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.WildcardRule#getDirectives()
   * @see #getWildcardRule()
   * @generated
   */
  EReference getWildcardRule_Directives();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarRuleDirective <em>Grammar Rule Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grammar Rule Directive</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarRuleDirective
   * @generated
   */
  EClass getGrammarRuleDirective();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.WildcardRuleDirective <em>Wildcard Rule Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard Rule Directive</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.WildcardRuleDirective
   * @generated
   */
  EClass getWildcardRuleDirective();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference <em>Grammar Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grammar Element Reference</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference
   * @generated
   */
  EClass getGrammarElementReference();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Assignment</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference#getAssignment()
   * @see #getGrammarElementReference()
   * @generated
   */
  EReference getGrammarElementReference_Assignment();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference#getRuleCall <em>Rule Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule Call</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference#getRuleCall()
   * @see #getGrammarElementReference()
   * @generated
   */
  EReference getGrammarElementReference_RuleCall();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference#getSelf <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Self</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference#getSelf()
   * @see #getGrammarElementReference()
   * @generated
   */
  EReference getGrammarElementReference_Self();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference#getRule()
   * @see #getGrammarElementReference()
   * @generated
   */
  EReference getGrammarElementReference_Rule();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Keyword</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementReference#getKeyword()
   * @see #getGrammarElementReference()
   * @generated
   */
  EReference getGrammarElementReference_Keyword();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementLookup <em>Grammar Element Lookup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grammar Element Lookup</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementLookup
   * @generated
   */
  EClass getGrammarElementLookup();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementLookup#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementLookup#getRule()
   * @see #getGrammarElementLookup()
   * @generated
   */
  EReference getGrammarElementLookup_Rule();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.GrammarElementLookup#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GrammarElementLookup#getKeyword()
   * @see #getGrammarElementLookup()
   * @generated
   */
  EAttribute getGrammarElementLookup_Keyword();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.ContextFreeDirective <em>Context Free Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Free Directive</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.ContextFreeDirective
   * @generated
   */
  EClass getContextFreeDirective();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.format.format.ContextFreeDirective#getGrammarElements <em>Grammar Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grammar Elements</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.ContextFreeDirective#getGrammarElements()
   * @see #getContextFreeDirective()
   * @generated
   */
  EReference getContextFreeDirective_GrammarElements();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.ContextFreeDirective#getMatcherList <em>Matcher List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Matcher List</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.ContextFreeDirective#getMatcherList()
   * @see #getContextFreeDirective()
   * @generated
   */
  EReference getContextFreeDirective_MatcherList();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.SpecificDirective <em>Specific Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specific Directive</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.SpecificDirective
   * @generated
   */
  EClass getSpecificDirective();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.format.format.SpecificDirective#getGrammarElements <em>Grammar Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grammar Elements</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.SpecificDirective#getGrammarElements()
   * @see #getSpecificDirective()
   * @generated
   */
  EReference getSpecificDirective_GrammarElements();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.SpecificDirective#getMatcherList <em>Matcher List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Matcher List</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.SpecificDirective#getMatcherList()
   * @see #getSpecificDirective()
   * @generated
   */
  EReference getSpecificDirective_MatcherList();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.MatcherList <em>Matcher List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matcher List</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.MatcherList
   * @generated
   */
  EClass getMatcherList();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.format.format.MatcherList#getMatchers <em>Matchers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Matchers</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.MatcherList#getMatchers()
   * @see #getMatcherList()
   * @generated
   */
  EReference getMatcherList_Matchers();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.GroupBlock <em>Group Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Block</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GroupBlock
   * @generated
   */
  EClass getGroupBlock();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.format.format.GroupBlock#getGrammarElement <em>Grammar Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Grammar Element</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GroupBlock#getGrammarElement()
   * @see #getGroupBlock()
   * @generated
   */
  EReference getGroupBlock_GrammarElement();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.GroupBlock#getMatcherList <em>Matcher List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Matcher List</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GroupBlock#getMatcherList()
   * @see #getGroupBlock()
   * @generated
   */
  EReference getGroupBlock_MatcherList();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.GroupBlock#getSubGroup <em>Sub Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Group</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GroupBlock#getSubGroup()
   * @see #getGroupBlock()
   * @generated
   */
  EReference getGroupBlock_SubGroup();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.format.format.GroupBlock#getDirectives <em>Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directives</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.GroupBlock#getDirectives()
   * @see #getGroupBlock()
   * @generated
   */
  EReference getGroupBlock_Directives();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.KeywordPair <em>Keyword Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Keyword Pair</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.KeywordPair
   * @generated
   */
  EClass getKeywordPair();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.KeywordPair#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.KeywordPair#getLeft()
   * @see #getKeywordPair()
   * @generated
   */
  EAttribute getKeywordPair_Left();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.KeywordPair#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.KeywordPair#getRight()
   * @see #getKeywordPair()
   * @generated
   */
  EAttribute getKeywordPair_Right();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.format.format.KeywordPair#getLeftMatchers <em>Left Matchers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Left Matchers</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.KeywordPair#getLeftMatchers()
   * @see #getKeywordPair()
   * @generated
   */
  EReference getKeywordPair_LeftMatchers();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.format.format.KeywordPair#getRightMatchers <em>Right Matchers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right Matchers</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.KeywordPair#getRightMatchers()
   * @see #getKeywordPair()
   * @generated
   */
  EReference getKeywordPair_RightMatchers();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.Matcher <em>Matcher</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matcher</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Matcher
   * @generated
   */
  EClass getMatcher();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.Matcher#getLocator <em>Locator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Locator</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Matcher#getLocator()
   * @see #getMatcher()
   * @generated
   */
  EReference getMatcher_Locator();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.Matcher#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Matcher#getType()
   * @see #getMatcher()
   * @generated
   */
  EAttribute getMatcher_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.Matcher#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Matcher#getCondition()
   * @see #getMatcher()
   * @generated
   */
  EReference getMatcher_Condition();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.Locator <em>Locator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Locator</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.Locator
   * @generated
   */
  EClass getLocator();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.NoFormatLocator <em>No Format Locator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Format Locator</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.NoFormatLocator
   * @generated
   */
  EClass getNoFormatLocator();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.SpaceLocator <em>Space Locator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Space Locator</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.SpaceLocator
   * @generated
   */
  EClass getSpaceLocator();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.SpaceLocator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.SpaceLocator#getValue()
   * @see #getSpaceLocator()
   * @generated
   */
  EReference getSpaceLocator_Value();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.SpaceLocator#isNoSpace <em>No Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Space</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.SpaceLocator#isNoSpace()
   * @see #getSpaceLocator()
   * @generated
   */
  EAttribute getSpaceLocator_NoSpace();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.RightPaddingLocator <em>Right Padding Locator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Padding Locator</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.RightPaddingLocator
   * @generated
   */
  EClass getRightPaddingLocator();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.RightPaddingLocator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.RightPaddingLocator#getValue()
   * @see #getRightPaddingLocator()
   * @generated
   */
  EReference getRightPaddingLocator_Value();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator <em>Linewrap Locator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linewrap Locator</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator
   * @generated
   */
  EClass getLinewrapLocator();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator#getValue()
   * @see #getLinewrapLocator()
   * @generated
   */
  EReference getLinewrapLocator_Value();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator#getMinimum <em>Minimum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Minimum</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator#getMinimum()
   * @see #getLinewrapLocator()
   * @generated
   */
  EReference getLinewrapLocator_Minimum();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator#getDefault()
   * @see #getLinewrapLocator()
   * @generated
   */
  EReference getLinewrapLocator_Default();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator#getMaximum <em>Maximum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Maximum</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator#getMaximum()
   * @see #getLinewrapLocator()
   * @generated
   */
  EReference getLinewrapLocator_Maximum();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator#isNoLinewrap <em>No Linewrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Linewrap</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.LinewrapLocator#isNoLinewrap()
   * @see #getLinewrapLocator()
   * @generated
   */
  EAttribute getLinewrapLocator_NoLinewrap();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator <em>Column Locator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Locator</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.ColumnLocator
   * @generated
   */
  EClass getColumnLocator();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isFixed <em>Fixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixed</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isFixed()
   * @see #getColumnLocator()
   * @generated
   */
  EAttribute getColumnLocator_Fixed();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#getValue()
   * @see #getColumnLocator()
   * @generated
   */
  EReference getColumnLocator_Value();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#getParameter()
   * @see #getColumnLocator()
   * @generated
   */
  EReference getColumnLocator_Parameter();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isRelative <em>Relative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relative</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isRelative()
   * @see #getColumnLocator()
   * @generated
   */
  EAttribute getColumnLocator_Relative();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isNobreak <em>Nobreak</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nobreak</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.ColumnLocator#isNobreak()
   * @see #getColumnLocator()
   * @generated
   */
  EAttribute getColumnLocator_Nobreak();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.OffsetLocator <em>Offset Locator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Offset Locator</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.OffsetLocator
   * @generated
   */
  EClass getOffsetLocator();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.OffsetLocator#isFixed <em>Fixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixed</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.OffsetLocator#isFixed()
   * @see #getOffsetLocator()
   * @generated
   */
  EAttribute getOffsetLocator_Fixed();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.OffsetLocator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.OffsetLocator#getValue()
   * @see #getOffsetLocator()
   * @generated
   */
  EReference getOffsetLocator_Value();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.OffsetLocator#isNobreak <em>Nobreak</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nobreak</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.OffsetLocator#isNobreak()
   * @see #getOffsetLocator()
   * @generated
   */
  EAttribute getOffsetLocator_Nobreak();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.format.format.IndentLocator <em>Indent Locator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indent Locator</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.IndentLocator
   * @generated
   */
  EClass getIndentLocator();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.format.format.IndentLocator#isIncrement <em>Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Increment</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.IndentLocator#isIncrement()
   * @see #getIndentLocator()
   * @generated
   */
  EAttribute getIndentLocator_Increment();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.IndentLocator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.IndentLocator#getValue()
   * @see #getIndentLocator()
   * @generated
   */
  EReference getIndentLocator_Value();

  /**
   * Returns the meta object for the containment reference '{@link com.avaloq.tools.ddk.xtext.format.format.IndentLocator#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.IndentLocator#getParameter()
   * @see #getIndentLocator()
   * @generated
   */
  EReference getIndentLocator_Parameter();

  /**
   * Returns the meta object for enum '{@link com.avaloq.tools.ddk.xtext.format.format.MatcherType <em>Matcher Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Matcher Type</em>'.
   * @see com.avaloq.tools.ddk.xtext.format.format.MatcherType
   * @generated
   */
  EEnum getMatcherType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FormatFactory getFormatFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.FormatConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatConfigurationImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getFormatConfiguration()
     * @generated
     */
    EClass FORMAT_CONFIGURATION = eINSTANCE.getFormatConfiguration();

    /**
     * The meta object literal for the '<em><b>Target Grammar</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAT_CONFIGURATION__TARGET_GRAMMAR = eINSTANCE.getFormatConfiguration_TargetGrammar();

    /**
     * The meta object literal for the '<em><b>Extended Format Configuration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAT_CONFIGURATION__EXTENDED_FORMAT_CONFIGURATION = eINSTANCE.getFormatConfiguration_ExtendedFormatConfiguration();

    /**
     * The meta object literal for the '<em><b>Formatter Base Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAT_CONFIGURATION__FORMATTER_BASE_CLASS = eINSTANCE.getFormatConfiguration_FormatterBaseClass();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAT_CONFIGURATION__CONSTANTS = eINSTANCE.getFormatConfiguration_Constants();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAT_CONFIGURATION__RULES = eINSTANCE.getFormatConfiguration_Rules();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.ConstantImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Int Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__INT_TYPE = eINSTANCE.getConstant_IntType();

    /**
     * The meta object literal for the '<em><b>String Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__STRING_TYPE = eINSTANCE.getConstant_StringType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__INT_VALUE = eINSTANCE.getConstant_IntValue();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__STRING_VALUE = eINSTANCE.getConstant_StringValue();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.IntValueImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__LITERAL = eINSTANCE.getIntValue_Literal();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INT_VALUE__REFERENCE = eINSTANCE.getIntValue_Reference();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.StringValueImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__LITERAL = eINSTANCE.getStringValue_Literal();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_VALUE__REFERENCE = eINSTANCE.getStringValue_Reference();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.RuleImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__OVERRIDE = eINSTANCE.getRule_Override();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.GrammarRuleImpl <em>Grammar Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.GrammarRuleImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getGrammarRule()
     * @generated
     */
    EClass GRAMMAR_RULE = eINSTANCE.getGrammarRule();

    /**
     * The meta object literal for the '<em><b>Target Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR_RULE__TARGET_RULE = eINSTANCE.getGrammarRule_TargetRule();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR_RULE__DIRECTIVES = eINSTANCE.getGrammarRule_Directives();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.WildcardRuleImpl <em>Wildcard Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.WildcardRuleImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getWildcardRule()
     * @generated
     */
    EClass WILDCARD_RULE = eINSTANCE.getWildcardRule();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WILDCARD_RULE__DIRECTIVES = eINSTANCE.getWildcardRule_Directives();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.GrammarRuleDirectiveImpl <em>Grammar Rule Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.GrammarRuleDirectiveImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getGrammarRuleDirective()
     * @generated
     */
    EClass GRAMMAR_RULE_DIRECTIVE = eINSTANCE.getGrammarRuleDirective();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.WildcardRuleDirectiveImpl <em>Wildcard Rule Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.WildcardRuleDirectiveImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getWildcardRuleDirective()
     * @generated
     */
    EClass WILDCARD_RULE_DIRECTIVE = eINSTANCE.getWildcardRuleDirective();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.GrammarElementReferenceImpl <em>Grammar Element Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.GrammarElementReferenceImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getGrammarElementReference()
     * @generated
     */
    EClass GRAMMAR_ELEMENT_REFERENCE = eINSTANCE.getGrammarElementReference();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR_ELEMENT_REFERENCE__ASSIGNMENT = eINSTANCE.getGrammarElementReference_Assignment();

    /**
     * The meta object literal for the '<em><b>Rule Call</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR_ELEMENT_REFERENCE__RULE_CALL = eINSTANCE.getGrammarElementReference_RuleCall();

    /**
     * The meta object literal for the '<em><b>Self</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR_ELEMENT_REFERENCE__SELF = eINSTANCE.getGrammarElementReference_Self();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR_ELEMENT_REFERENCE__RULE = eINSTANCE.getGrammarElementReference_Rule();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR_ELEMENT_REFERENCE__KEYWORD = eINSTANCE.getGrammarElementReference_Keyword();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.GrammarElementLookupImpl <em>Grammar Element Lookup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.GrammarElementLookupImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getGrammarElementLookup()
     * @generated
     */
    EClass GRAMMAR_ELEMENT_LOOKUP = eINSTANCE.getGrammarElementLookup();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAMMAR_ELEMENT_LOOKUP__RULE = eINSTANCE.getGrammarElementLookup_Rule();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAMMAR_ELEMENT_LOOKUP__KEYWORD = eINSTANCE.getGrammarElementLookup_Keyword();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.ContextFreeDirectiveImpl <em>Context Free Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.ContextFreeDirectiveImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getContextFreeDirective()
     * @generated
     */
    EClass CONTEXT_FREE_DIRECTIVE = eINSTANCE.getContextFreeDirective();

    /**
     * The meta object literal for the '<em><b>Grammar Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_FREE_DIRECTIVE__GRAMMAR_ELEMENTS = eINSTANCE.getContextFreeDirective_GrammarElements();

    /**
     * The meta object literal for the '<em><b>Matcher List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_FREE_DIRECTIVE__MATCHER_LIST = eINSTANCE.getContextFreeDirective_MatcherList();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.SpecificDirectiveImpl <em>Specific Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.SpecificDirectiveImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getSpecificDirective()
     * @generated
     */
    EClass SPECIFIC_DIRECTIVE = eINSTANCE.getSpecificDirective();

    /**
     * The meta object literal for the '<em><b>Grammar Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFIC_DIRECTIVE__GRAMMAR_ELEMENTS = eINSTANCE.getSpecificDirective_GrammarElements();

    /**
     * The meta object literal for the '<em><b>Matcher List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFIC_DIRECTIVE__MATCHER_LIST = eINSTANCE.getSpecificDirective_MatcherList();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.MatcherListImpl <em>Matcher List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.MatcherListImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getMatcherList()
     * @generated
     */
    EClass MATCHER_LIST = eINSTANCE.getMatcherList();

    /**
     * The meta object literal for the '<em><b>Matchers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCHER_LIST__MATCHERS = eINSTANCE.getMatcherList_Matchers();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.GroupBlockImpl <em>Group Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.GroupBlockImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getGroupBlock()
     * @generated
     */
    EClass GROUP_BLOCK = eINSTANCE.getGroupBlock();

    /**
     * The meta object literal for the '<em><b>Grammar Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BLOCK__GRAMMAR_ELEMENT = eINSTANCE.getGroupBlock_GrammarElement();

    /**
     * The meta object literal for the '<em><b>Matcher List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BLOCK__MATCHER_LIST = eINSTANCE.getGroupBlock_MatcherList();

    /**
     * The meta object literal for the '<em><b>Sub Group</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BLOCK__SUB_GROUP = eINSTANCE.getGroupBlock_SubGroup();

    /**
     * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BLOCK__DIRECTIVES = eINSTANCE.getGroupBlock_Directives();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.KeywordPairImpl <em>Keyword Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.KeywordPairImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getKeywordPair()
     * @generated
     */
    EClass KEYWORD_PAIR = eINSTANCE.getKeywordPair();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEYWORD_PAIR__LEFT = eINSTANCE.getKeywordPair_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEYWORD_PAIR__RIGHT = eINSTANCE.getKeywordPair_Right();

    /**
     * The meta object literal for the '<em><b>Left Matchers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEYWORD_PAIR__LEFT_MATCHERS = eINSTANCE.getKeywordPair_LeftMatchers();

    /**
     * The meta object literal for the '<em><b>Right Matchers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEYWORD_PAIR__RIGHT_MATCHERS = eINSTANCE.getKeywordPair_RightMatchers();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.MatcherImpl <em>Matcher</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.MatcherImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getMatcher()
     * @generated
     */
    EClass MATCHER = eINSTANCE.getMatcher();

    /**
     * The meta object literal for the '<em><b>Locator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCHER__LOCATOR = eINSTANCE.getMatcher_Locator();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATCHER__TYPE = eINSTANCE.getMatcher_Type();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCHER__CONDITION = eINSTANCE.getMatcher_Condition();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.LocatorImpl <em>Locator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.LocatorImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getLocator()
     * @generated
     */
    EClass LOCATOR = eINSTANCE.getLocator();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.NoFormatLocatorImpl <em>No Format Locator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.NoFormatLocatorImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getNoFormatLocator()
     * @generated
     */
    EClass NO_FORMAT_LOCATOR = eINSTANCE.getNoFormatLocator();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.SpaceLocatorImpl <em>Space Locator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.SpaceLocatorImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getSpaceLocator()
     * @generated
     */
    EClass SPACE_LOCATOR = eINSTANCE.getSpaceLocator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPACE_LOCATOR__VALUE = eINSTANCE.getSpaceLocator_Value();

    /**
     * The meta object literal for the '<em><b>No Space</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPACE_LOCATOR__NO_SPACE = eINSTANCE.getSpaceLocator_NoSpace();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.RightPaddingLocatorImpl <em>Right Padding Locator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.RightPaddingLocatorImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getRightPaddingLocator()
     * @generated
     */
    EClass RIGHT_PADDING_LOCATOR = eINSTANCE.getRightPaddingLocator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_PADDING_LOCATOR__VALUE = eINSTANCE.getRightPaddingLocator_Value();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.LinewrapLocatorImpl <em>Linewrap Locator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.LinewrapLocatorImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getLinewrapLocator()
     * @generated
     */
    EClass LINEWRAP_LOCATOR = eINSTANCE.getLinewrapLocator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEWRAP_LOCATOR__VALUE = eINSTANCE.getLinewrapLocator_Value();

    /**
     * The meta object literal for the '<em><b>Minimum</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEWRAP_LOCATOR__MINIMUM = eINSTANCE.getLinewrapLocator_Minimum();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEWRAP_LOCATOR__DEFAULT = eINSTANCE.getLinewrapLocator_Default();

    /**
     * The meta object literal for the '<em><b>Maximum</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEWRAP_LOCATOR__MAXIMUM = eINSTANCE.getLinewrapLocator_Maximum();

    /**
     * The meta object literal for the '<em><b>No Linewrap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINEWRAP_LOCATOR__NO_LINEWRAP = eINSTANCE.getLinewrapLocator_NoLinewrap();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.ColumnLocatorImpl <em>Column Locator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.ColumnLocatorImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getColumnLocator()
     * @generated
     */
    EClass COLUMN_LOCATOR = eINSTANCE.getColumnLocator();

    /**
     * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_LOCATOR__FIXED = eINSTANCE.getColumnLocator_Fixed();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_LOCATOR__VALUE = eINSTANCE.getColumnLocator_Value();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_LOCATOR__PARAMETER = eINSTANCE.getColumnLocator_Parameter();

    /**
     * The meta object literal for the '<em><b>Relative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_LOCATOR__RELATIVE = eINSTANCE.getColumnLocator_Relative();

    /**
     * The meta object literal for the '<em><b>Nobreak</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_LOCATOR__NOBREAK = eINSTANCE.getColumnLocator_Nobreak();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.OffsetLocatorImpl <em>Offset Locator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.OffsetLocatorImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getOffsetLocator()
     * @generated
     */
    EClass OFFSET_LOCATOR = eINSTANCE.getOffsetLocator();

    /**
     * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OFFSET_LOCATOR__FIXED = eINSTANCE.getOffsetLocator_Fixed();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OFFSET_LOCATOR__VALUE = eINSTANCE.getOffsetLocator_Value();

    /**
     * The meta object literal for the '<em><b>Nobreak</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OFFSET_LOCATOR__NOBREAK = eINSTANCE.getOffsetLocator_Nobreak();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.impl.IndentLocatorImpl <em>Indent Locator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.IndentLocatorImpl
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getIndentLocator()
     * @generated
     */
    EClass INDENT_LOCATOR = eINSTANCE.getIndentLocator();

    /**
     * The meta object literal for the '<em><b>Increment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDENT_LOCATOR__INCREMENT = eINSTANCE.getIndentLocator_Increment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDENT_LOCATOR__VALUE = eINSTANCE.getIndentLocator_Value();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDENT_LOCATOR__PARAMETER = eINSTANCE.getIndentLocator_Parameter();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.format.format.MatcherType <em>Matcher Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.format.format.MatcherType
     * @see com.avaloq.tools.ddk.xtext.format.format.impl.FormatPackageImpl#getMatcherType()
     * @generated
     */
    EEnum MATCHER_TYPE = eINSTANCE.getMatcherType();

  }

} //FormatPackage
