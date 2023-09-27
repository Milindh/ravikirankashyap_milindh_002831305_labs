/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Milindh R Kashyap
 */
public class VitalSignHistory 
{
    
    private ArrayList<VitalSigns> history;
    
    public VitalSignHistory()
    {
        this.history = new ArrayList<VitalSigns>();
        
    }

    public ArrayList<VitalSigns> getHistory() 
    {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) 
    {
        this.history = history;
    }
    
    public VitalSigns addNewVital()
    {
        VitalSigns newVitals = new VitalSigns();
        history.add(newVitals);
        return newVitals;
    }
    
    public void deleteVitals(VitalSigns selectedVitals)
    {
        int vs = 0;
        history.remove(vs);
        
        
        
    }

//    public void deleteVitalsByDate(String dateToDelete) 
//    {
//    for (Iterator<VitalSigns> iterator = vitalSignsList.iterator(); iterator.hasNext();) 
//    {
//        VitalSigns vitalSigns = iterator.next();
//        if (vitalSigns.getDate().equals(dateToDelete))
//        {
//            iterator.remove(); // Remove the matching item
//        }
//    }
//}
}
