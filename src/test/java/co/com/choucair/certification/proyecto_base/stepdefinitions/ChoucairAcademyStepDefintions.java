package co.com.choucair.certification.proyecto_base.stepdefinitions;

import co.com.choucair.certification.proyecto_base.tasks.Buscar;
import co.com.choucair.certification.proyecto_base.tasks.Login;
import co.com.choucair.certification.proyecto_base.tasks.OpenUp;
import co.com.choucair.certification.proyecto_base.questions.Answer;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Rose want to learn automation at the Academy choucair$")
    public void thanRoseWantToLearnAutomationAtTheAcademyChoucair() throws Exception {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), Login.onThePage());
    }

    @When("^she search for the course (.*) on the Choucair Academy platform$")
    public void sheSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(String course) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(course));
    }

    @Then("^she finds the course called (.*)$")
    public void sheFindsTheCourseCalledRecursosAutomatizaciónBancolombia(String question) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
