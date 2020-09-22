// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================

package hep.lcio.event;


/** The generic calorimeter hit for real data (or simulation thereof). 
 *  In order to reduce the file size you can suppress a (32-bit) pointer 
 *  tag stored with every hit by setting the flag(LCIO::RCHBIT_NO_PTR)==1. <br>
 *  <b>NB: If you apply this flag to reduce the file size
 *  you won't be able to point/refer to the RawCalorimeterHits, e.g. from an
 *  LCRelation object.</b>
 * 
 * @author gaede
 * @version $Id: RawCalorimeterHit.aid,v 1.4 2006-08-03 16:53:35 gaede Exp $
 */

public interface RawCalorimeterHit extends LCObject {

    /** Returns the detector specific (geometrical) cell id.
     */
    public int getCellID0();

    /** Returns the second detector specific (geometrical) cell id. Optional, check/set 
     *  flag(LCIO::RCHBIT_ID1)==1.
     */
    public int getCellID1();

    /** Returns the amplitude of the hit in ADC counts.
     */
    public int getAmplitude();

    /** Returns a time stamp for the hit. Optional, check/set 
     *  flag(LCIO::RCHBIT_TIME)==1.
     */
    public int getTimeStamp();
} // class or interface

