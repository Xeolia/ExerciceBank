import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class saveMoney {
    private Person person;

    @Given("In order to save money")
    public void inOrderToSaveMoney() {
        person = new Person();
        person.createAccount();

    }

    @When("As a bank client")
    public void asABankClient() {
        person.getAccount();
    }

    @Then("Make a deposit in my account")
    public void makeADepositInMyAccount() {
        person.makeDeposit(50,"Compte perso");
    }
}
