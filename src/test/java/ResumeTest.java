import org.junit.Test;

import java.util.Date;

/**
 * Тесты для объектной модели резюме.
 * TDD: Test-driven development, TDD, Разработка через тестирование
 */
public class ResumeTest {
    /**
     * Пример резюме
     */
    @Test
    public void testResume1() {
        Resume resume = new Resume();
        resume.name = "Test";
        resume.date = new Date();

    }

}
