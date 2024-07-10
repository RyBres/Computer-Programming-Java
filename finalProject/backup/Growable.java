/**
Contains abstract methods that can be called by methods in Tree.

Growable: Able to be cultivated or grown.
The three important processes that occur in a plant can be found here, in addition to the process of plant growth.

*/

public interface Growable
{
   public abstract void Grow();
   public abstract void Photosynthesis();
   public abstract void Respiration();
   public abstract void Transpiration();
}