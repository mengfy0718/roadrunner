/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  A list of {@link CompartmentType} objects.
 <p>
 * <p>
 * The various ListOf___ classes in SBML
 * are merely containers used for organizing the main components of an SBML
 * model.  In libSBML's implementation, ListOf___
 * classes are derived from the
 * intermediate utility class {@link ListOf}, which
 * is not defined by the SBML specifications but serves as a useful
 * programmatic construct.  {@link ListOf} is itself is in turn derived from {@link SBase},
 * which provides all of the various ListOf___
 * classes with common features
 * defined by the SBML specification, such as 'metaid' attributes and
 * annotations.
 <p>
 * The relationship between the lists and the rest of an SBML model is
 * illustrated by the following (for SBML Level&nbsp;2 Version&nbsp;4):
 <p>
 * <figure>
  <object type="image/svg+xml" data="listof-illustration.svg" class="centered"></object>
</figure>

 <p>
 * Readers may wonder about the motivations for using the ListOf___
 * containers in SBML.  A simpler approach in XML might be to place the
 * components all directly at the top level of the model definition.  The
 * choice made in SBML is to group them within XML elements named after
 * ListOf<em>Classname</em>, in part because it helps organize the
 * components.  More importantly, the fact that the container classes are
 * derived from {@link SBase} means that software tools can add information <em>about</em>
 * the lists themselves into each list container's 'annotation'.
 <p>
 * @see ListOfFunctionDefinitions
 * @see ListOfUnitDefinitions
 * @see ListOfCompartmentTypes
 * @see ListOfSpeciesTypes
 * @see ListOfCompartments
 * @see ListOfSpecies
 * @see ListOfParameters
 * @see ListOfInitialAssignments
 * @see ListOfRules
 * @see ListOfConstraints
 * @see ListOfReactions
 * @see ListOfEvents
 */

public class ListOfCompartmentTypes extends ListOf {
   private long swigCPtr;

   protected ListOfCompartmentTypes(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfCompartmentTypes_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfCompartmentTypes obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfCompartmentTypes obj)
   {
     long ptr = 0;

     if (obj != null)
     {
       ptr             = obj.swigCPtr;
       obj.swigCMemOwn = false;
     }

     return ptr;
   }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsbmlJNI.delete_ListOfCompartmentTypes(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ListOfCompartmentTypes} object.
   <p>
   * The object is constructed such that it is valid for the given SBML
   * Level and Version combination.
   <p>
   * @param level the SBML Level
   <p>
   * @param version the Version within the SBML Level
   */ public
 ListOfCompartmentTypes(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfCompartmentTypes__SWIG_0(level, version), true);
  }

  
/**
   * Creates a new {@link ListOfCompartmentTypes} object.
   <p>
   * The object is constructed such that it is valid for the SBML Level and
   * Version combination determined by the {@link SBMLNamespaces} object in 
   * <code>sbmlns</code>.
   <p>
   * @param sbmlns an {@link SBMLNamespaces} object that is used to determine the
   * characteristics of the {@link ListOfCompartmentTypes} object to be created.
   */ public
 ListOfCompartmentTypes(SBMLNamespaces sbmlns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfCompartmentTypes__SWIG_1(SBMLNamespaces.getCPtr(sbmlns), sbmlns), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOfCompartmentTypes} object.
   <p>
   * @return the (deep) copy of this {@link ListOfCompartmentTypes} object.
   */ public
 ListOfCompartmentTypes cloneObject() {
    long cPtr = libsbmlJNI.ListOfCompartmentTypes_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfCompartmentTypes(cPtr, true);
  }

  
/**
   * Returns the libSBML type code for the objects contained in this {@link ListOf}
   * (i.e., {@link CompartmentType} objects, if the list is non-empty).
   <p>
   * <p>
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters &ldquo;<code>SBML_</code>&rdquo;.
 * In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.    Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the <code>getPackageName()</code>
 * method on the object.
   <p>
   * @return the SBML type code for the objects contained in this {@link ListOf}
   * instance: {@link libsbmlConstants#SBML_COMPARTMENT_TYPE SBML_COMPARTMENT_TYPE} (default).
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.ListOfCompartmentTypes_getItemTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this object.
   <p>
   * For {@link ListOfCompartmentTypes}, the XML element name is 
   * <code>'listOfCompartmentTypes'.</code>
   <p>
   * @return the name of this element, i.e., <code>'listOfCompartmentTypes'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfCompartmentTypes_getElementName(swigCPtr, this);
  }

  
/**
   * Get a {@link CompartmentType} object from the {@link ListOfCompartmentTypes}.
   <p>
   * @param n the index number of the {@link CompartmentType} object to get.
   <p>
   * @return the nth {@link CompartmentType} object in this {@link ListOfCompartmentTypes}.
   <p>
   * @see #size()
   */ public
 CompartmentType get(long n) {
    long cPtr = libsbmlJNI.ListOfCompartmentTypes_get__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new CompartmentType(cPtr, false);
  }

  
/**
   * Get a {@link CompartmentType} object from the {@link ListOfCompartmentTypes}
   * based on its identifier.
   <p>
   * @param sid a string representing the identifier
   * of the {@link CompartmentType} object to get.
   <p>
   * @return {@link CompartmentType} object in this {@link ListOfCompartmentTypes}
   * with the given <code>sid</code> or <code>null</code> if no such
   * {@link CompartmentType} object exists.
   <p>
   * @see #get(long n)
   * @see #size()
   */ public
 CompartmentType get(String sid) {
    long cPtr = libsbmlJNI.ListOfCompartmentTypes_get__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new CompartmentType(cPtr, false);
  }

  
/**
   * Removes the nth item from this {@link ListOfCompartmentTypes} items
   * and returns a pointer to it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   <p>
   * @param n the index of the item to remove
   <p>
   * @see #size()
   */ public
 CompartmentType remove(long n) {
    long cPtr = libsbmlJNI.ListOfCompartmentTypes_remove__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new CompartmentType(cPtr, true);
  }

  
/**
   * Removes item in this {@link ListOfCompartmentTypes} items with the given identifier.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   * If none of the items in this list have the identifier <code>sid</code>, then 
   * <code>null</code> is returned.
   <p>
   * @param sid the identifier of the item to remove
   <p>
   * @return the item removed.  As mentioned above, the caller owns the
   * returned item.
   */ public
 CompartmentType remove(String sid) {
    long cPtr = libsbmlJNI.ListOfCompartmentTypes_remove__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new CompartmentType(cPtr, true);
  }

}
