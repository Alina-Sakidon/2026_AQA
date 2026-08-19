package hw13;

import hw12.BaseTest;
import hw15.DragAndDropPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class DragAndDropTest extends BaseTest {

    @Test
    public void drugAndDrop() {
        DragAndDropPage dragAndDropPage = openApp()
                .openDragAndDropPage()
                .drugAndDropSource();
        String changedHeader = dragAndDropPage.getChangedHeader();

        Assert.assertEquals(changedHeader, "B");
    }
}
