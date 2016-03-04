import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.WordUtils;
import org.junit.*;
import static org.junit.Assert.*;

public class BandTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
    public void all_emptyAtFirst() {
      assertEquals(Band.all().size(), 0);
    }

  @Test
  public void equals_returnsTrueIfNamesAretheSame() {
    Band firstBand = new Band("Brand New");
    Band secondBand = new Band("Brand New");
    assertTrue(firstBand.equals(secondBand));
  }

  @Test
  public void save_savesIntoDatabase_true() {
    Band myBand = new Band("Brand New");
    myBand.save();
    assertTrue(Band.all().get(0).equals(myBand));
  }
///
  @Test
  public void save_assignsIdToObject() {
    Band myBand = new Band("Brand New");
    myBand.save();
    Band savedBand = Band.all().get(0);
    assertEquals(myBand.getId(), savedBand.getId());
  }

}
