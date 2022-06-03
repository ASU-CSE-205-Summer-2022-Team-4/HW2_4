//******************************************************************************
// ABSTRACT CLASS: Amphibian (Amphibian.java)
//
// DESCRIPTION
// Amphibian is the abstract superclass for all Amphibian subclasses; this main
// include Frog, Tadpole, etc, all of which inherit from Amphibian.
// This abstract class implements the MakeSound interface, the method makeSound()
// of which to be implement in concrete subclasses.
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Summer 2022 C-Session
// Homework 2
//
// Group 4
// AUTHOR: David McConnell  dmcconn7    dmcconn7@asu.edu
// AUTHOR: Lia Moua         amoua       amoua@asu.edu
// AUTHOR: Arsal Akhtar     akakhta2    akakhta2@asu.edu
// AUTHOR: Kari McBride     kemcbri2    kemcbri2@asu.edu
//******************************************************************************
/**
 * The abstract superclass for all types of Amphibians. Abstract class does not
 * implement makeSound(), forcing concrete subclasses to implement instead.
 */
public abstract class Amphibian implements MakesSound {
}
