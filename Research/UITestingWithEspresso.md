## Helpful code on testing activities using Espresso

***Add this rule after declaring your class:***

// Replace 'CurrentActivity' with the activity you are testing </br>
**@Rule** </br>
**public ActivityTestRule<CurrentActivity> mActivityTestRule = new ActivityTestRule<CurrentActivity>(CurrentActivity.class);**

***Example:***

public class CurrentActivityTest {

   &nbsp;&nbsp;&nbsp;</t>**@Rule** </br>
   &nbsp;&nbsp;&nbsp;**public CurrentActivityTestRule<CurrentActivity> mActivityTestRule = new ActivityTestRule<CurrentActivity>(CurrentActivity.class);**
   
   &nbsp;&nbsp;&nbsp;... // rest of the code

}

##

***Input data on an EditText box:***

**Espresso.onView(withId(R.id.editText1)).perform(typeText(testData));**

***Example:***

@Test </br>
public void testInputBox() {

   &nbsp;&nbsp;&nbsp;String testData = "sample";

   &nbsp;&nbsp;&nbsp;**Espresso.onView(withId(R.id.editText1)).perform(typeText(testData));** // 'performs' the typing on id:editText1 text field</br>
   &nbsp;&nbsp;&nbsp;Espresso.closeSoftKeyboard(); // closes the keyboard

}

***Clicking a button:***

**Espresso.onView(withId(R.id.button1)).perform(click());**

***Example:***

@Test </br>
public void testClickButton() {

   &nbsp;&nbsp;&nbsp;String testData = "sample";

   &nbsp;&nbsp;&nbsp;Espresso.onView(withId(R.id.editText1)).perform(typeText(testData)); // 'performs' the typing on id:editText1 text field</br>
   &nbsp;&nbsp;&nbsp;Espresso.closeSoftKeyboard(); // closes the keyboard
   
   &nbsp;&nbsp;&nbsp;**Espresso.onView(withId(R.id.button1)).perform(click());** // clicks the button with id:button1

}

##

***Checking the error message from an EditText***

// asserts if editText1 displayed an error message, and it matches the error message inside hasErrorText() </br>
**Espresso.onView(withId(R.id.editText1)).check(matches(hasErrorText("Invalid input")));**

***Example:***

@Test </br>
public void testErrorMessage() {

   &nbsp;&nbsp;&nbsp;String testData = "sample";

   &nbsp;&nbsp;&nbsp;Espresso.onView(withId(R.id.editText1)).perform(typeText(testData)); // 'performs' the typing on id:editText1 text field</br>
   &nbsp;&nbsp;&nbsp;Espresso.closeSoftKeyboard(); // closes the keyboard
   
   &nbsp;&nbsp;&nbsp;Espresso.onView(withId(R.id.button1)).perform(click()); // clicks the button with id:button1
   
   &nbsp;&nbsp;&nbsp;// assume that the data inside editText1 is invalid, and button1 sets an error message to editText1
   
   &nbsp;&nbsp;&nbsp;**Espresso.onView(withId(R.id.editText1)).check(matches(hasErrorText("Invalid input")));** // asserts error message

}

##

***Checking if a toast message is displayed***

// R.string.toast_sampleMessage is a string value from strings.xml which contains the toast message
**Espresso.onView(withText(R.string.toast_sampleMessage)).inRoot(withDecorView(not(mActivityTestRule.getActivity().getWindow().getDecorView()))).check(matches(isDisplayed()));**

***Example:***

@Test </br>
public void testToastMessage() {

   &nbsp;&nbsp;&nbsp;String testData = "sample";

   &nbsp;&nbsp;&nbsp;Espresso.onView(withId(R.id.editText1)).perform(typeText(testData)); // 'performs' the typing on id:editText1 text field</br>
   &nbsp;&nbsp;&nbsp;Espresso.closeSoftKeyboard(); // closes the keyboard
   
   &nbsp;&nbsp;&nbsp;Espresso.onView(withId(R.id.button1)).perform(click()); // clicks the button with id:button1
   
   &nbsp;&nbsp;&nbsp;**Espresso.onView(withText(R.string.toast_sampleMessage)).inRoot(withDecorView(not(mActivityTestRule.getActivity().getWindow().getDecorView()))).check(matches(isDisplayed()));** // asserts if toast message is displayed

}

##

***Checking if the specified activity is the one currently on display***

Note: usually used when you expect an activity to be launched, so you check if the correct activity is displayed

// add this code to your **setUp()** </br>
**Intents.init();**

// add this code to your **tearDown()** </br>
**Intents.release();**

// launching an activity can take a while, so idling the app is recommended before making the assertion </br>
**Thread.sleep(2000);** // idle test for 2 milliseconds (2 seconds) before assertion </br>
**intended(hasComponent(SpecifiedActivity.class.getName()));** // assert if specified activity is launched

***Example:***

@Before </br>
public void setUp() throws Exception {

   &nbsp;&nbsp;&nbsp;**Intents.init();**

}

@Test
public void testLaunchAnotherActivity() throws InterruptedException {

   &nbsp;&nbsp;&nbsp;Espresso.onView(withId(R.id.button_launchActivity)).perform(click()); // assume button_launchActivity launches another activity

   &nbsp;&nbsp;&nbsp;**Thread.sleep(2000);** // idle test for 2 milliseconds (2 seconds) before assertion </br>
   &nbsp;&nbsp;&nbsp;**intended(hasComponent(SpecifiedActivity.class.getName()));** // assert if specified activity is launched

}

@After </br>
public void tearDown() throws Exception {

   &nbsp;&nbsp;&nbsp;**Intents.release();**

}
