import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by d.tyufanov on 08.11.2014.
 */
public class TestResume extends Assert {
    //initialisation resume
    Resume testResume = new Resume();
    EducationDescription educationDescription = new EducationDescription();
    WorkDescription workDescription = new WorkDescription();

    @Before
    public void setUp() throws Exception {
        //set some personal data
        testResume.personalData.setFirstName("Denis");
        testResume.personalData.setLastName("Tyufanov");
        testResume.personalData.setEmail("denist2001@list.ru");
        testResume.personalData.setLanguages(Languages.Russian);
        //set some professional data
        testResume.professionData.setTitle("Android developer");
        testResume.professionData.setLevel("Печальный \"/");
        testResume.professionData.setSheduleWork(SheduleWork.FULL_TIME);
        //set education data
        educationDescription.year = 2003;
        educationDescription.description = "Санкт-Петербургский Государственный Институт Точной Механики и Оптики";
        workDescription.city = "Saint Petersburg";
        workDescription.name = "i-FREE";
        workDescription.site = "www.i-free.com";
        workDescription.setStartMonth(Month.DECEMBER);
        workDescription.setStartYear(2020); //Wery crazy number for year value
        testResume.education.add(educationDescription);
        testResume.experience.add(workDescription);
    }

    @Test
    public void testResumeClass () {
        //print to screen different information
        System.out.println("Personal data: " + testResume.personalData.getFirstName() + " "
        + testResume.personalData.getMiddleName() + " " + testResume.personalData.getLastName());
        System.out.println("");
        assertEquals("denist2001@list.ru", testResume.personalData.getEmail());
        assertEquals("Denis", testResume.personalData.getFirstName());
        assertEquals("", testResume.personalData.getMiddleName());
        assertEquals("Tyufanov", testResume.personalData.getLastName());
        assertEquals(SheduleWork.FULL_TIME, testResume.professionData.getSheduleWork());
        assertEquals("Печальный \"/", testResume.professionData.getLevel());
        assertNotEquals(0, workDescription.getStartYear());
    }

    @After
    public void tearDown() throws Exception {
        testResume = null;
    }
}