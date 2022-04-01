import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class makeWithdrawal {
    private Person person;

    @Given("In order to retrieve some or all of my savings")
    public void inOrderToRetrieveSomeOrAllOfMySavings() {
        person = new Person();
        person.consultAccount();
    }

    @Then("I want to make a withdrawal from my account")
    public void iWantToMakeAWithdrawalFromMyAccount() {
        person.makeWithdrawal(50,"Compte perso");
    }
}
