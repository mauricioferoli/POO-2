// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.FlyerResource;
// </editor-fold>

class Flyer extends SFlyer {

    /* Construct new Flyer */
    public Flyer(FlyerResource resource) {
        super(resource);
    }
    public void volar(){
        this.move(MoveDirection.UP, 10);
    }
}
