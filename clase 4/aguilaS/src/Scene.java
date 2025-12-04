// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.sims2.AdultPersonResource;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.resources.sims2.MaleAdultHairShortCenterSpike;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.resources.sims2.MaleAdultFullBodyOutfitMayor;
import org.lgna.story.resources.sims2.Gender;
import static org.lgna.common.ThreadUtilities.eachInTogether;
// </editor-fold>

class Scene extends SScene {

    /* Construct new Scene */
    public Scene() {
        super();
    }

    /* Event listeners */
    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });
    }

    /* Funciones_y_procedimientos_para_esta_escena */
    public void myFirstMethod() {
        eachInTogether((Eagle i) -> {
            i.aletear();
            adultPerson.say("a volar");
            eagle2.say("hola mundo");
            eagle2.setOpacity(0);
            eagle.volar();
        }, this.aguilas);
    }
    /* Fin_de_las_funciones_y_procedimientos_para_esta_escena */

    // <editor-fold defaultstate="collapsed" desc="/* campos_de_la_escena */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final AdultPerson adultPerson = new AdultPerson((new AdultPersonResource(Gender.MALE, (new Color(0.62, 0.4, 0.227)), BaseEyeColor.DARK_BLUE, MaleAdultHairShortCenterSpike.BLOND, 0.344016, MaleAdultFullBodyOutfitMayor.RED_TIE_MAYOR, BaseFace.HUMAN_03)));
    private final Eagle eagle = new Eagle();
    private final Eagle eagle2 = new Eagle();
    private Eagle[] aguilas = new Eagle[]{this.eagle, this.eagle2};
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Configuración_de_escena */">
    private void performCustomSetup() {
// Make adjustments to the starting scene, in a way not available in the Scene editor
    }

    private void performGeneratedSetUp() {
// DO NOT EDIT
// This code is automatically generated.  Any work you perform in this method will be overwritten.
// DO NOT EDIT
        this.setAtmosphereColor(new Color(0.588, 0.886, 0.988));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.BLACK);
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.GRASS);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.098017, 0.0));
        this.camera.setPositionRelativeToVehicle(new Position(0.0, 1.561, -7.846));
        this.adultPerson.setPaint(Color.WHITE);
        this.adultPerson.setOpacity(1.0);
        this.adultPerson.setName("adultPerson");
        this.adultPerson.setVehicle(this);
        this.adultPerson.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.adultPerson.setPositionRelativeToVehicle(new Position(-0.988, 0.0, -1.735));
        this.eagle.setPaint(Color.WHITE);
        this.eagle.setOpacity(1.0);
        this.eagle.setName("eagle");
        this.eagle.setVehicle(this);
        this.eagle.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.eagle.setPositionRelativeToVehicle(new Position(0.585, 0.0, -1.594));
        this.eagle2.setPaint(Color.WHITE);
        this.eagle2.setOpacity(1.0);
        this.eagle2.setName("eagle2");
        this.eagle2.setVehicle(this);
        this.eagle2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.eagle2.setPositionRelativeToVehicle(new Position(2.18, 0.0, -1.447));
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Funciones_y_procedimientos_para_multiples_escenas */">
    @Override
    protected void handleActiveChanged(Boolean isActive, Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public AdultPerson getAdultPerson() {
        return this.adultPerson;
    }

    public Eagle getEagle() {
        return this.eagle;
    }

    public Eagle getEagle2() {
        return this.eagle2;
    }

    public Eagle getAguilas(Integer index) {
        return this.aguilas[index];
    }

    public Eagle[] getAguilas() {
        return this.aguilas;
    }

    public void setAguilas(Integer index, Eagle value) {
        this.aguilas[index] = value;
    }

    public void setAguilas(Eagle[] aguilas) {
        this.aguilas = aguilas;
    }
    // </editor-fold>
}
