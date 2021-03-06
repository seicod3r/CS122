//********************************************************************
//  SortableDVD.java       Author: Lewis/Loftus
//
//  Solution for Programming Project 10.5
//********************************************************************

import java.text.NumberFormat;

public class SortableDVD implements Comparable
{
   private String title, director;
   private int year;
   private double cost;
   private boolean bluRay;

   //-----------------------------------------------------------------
   //  Creates a new SortableDVD with the specified information.
   //-----------------------------------------------------------------
   public SortableDVD (String title, String director, int year,
      double cost, boolean bluRay)
   {
      this.title = title;
      this.director = director;
      this.year = year;
      this.cost = cost;
      this.bluRay = bluRay;
   }
   
   //-----------------------------------------------------------------
   //  Returns a string description of this SortableDVD.
   //-----------------------------------------------------------------
   public String toString()
   {
      //NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String description;

      //description = fmt.format(cost) + "\t" + year + "\t";
      description = cost + "\t" + year + "\t";
      description += title + "\t" + director;

      if (bluRay)
         description += "\t" + "Blu-Ray";

      return description;
   }

   //-----------------------------------------------------------------
   //  Determines the relationship to another SortableDVD, satisfying
   //  the Comparable interface. Sorts first by title name, then
   //  by year.
   //-----------------------------------------------------------------
   public int compareTo (Object obj)
   {
      SortableDVD other = (SortableDVD) obj;
      int result =0;
     // your code here to compare two DVDs by name. If same name, compare year.
      if(this.equals(obj)){
          if(this.year < other.year) result = -1;
          else if(this.year > other.year){result =1;}
          else{result = 0;}
      }
      else if(this.director.compareTo(other.director) < 0){ result = -1;}
      else{result= 1;}
      
      return result; // result=0 means same;result=-1 means the first one is smaller;result=1 means the second one is smaller;
   }
@Override
public boolean equals(Object obj)
{
	SortableDVD other = (SortableDVD)obj;
        boolean result;
     // compare the two movies
        if(this.director.compareTo(other.director) == 0){return true;}
        else result = false;
	return result; 
}

   //-----------------------------------------------------------------
   //  Returns the title name for this SortableDVD.
   //-----------------------------------------------------------------
   public String getTitle()
   {
      return title;
   }

   //-----------------------------------------------------------------
   //  Returns the year of this SortableDVD.
   //-----------------------------------------------------------------
   public int getYear()
   {
      return year;
   }
}