package com.grapecity.documents.excel.examples.features.shape;

import com.grapecity.documents.excel.IWorksheet;
import com.grapecity.documents.excel.Workbook;
import com.grapecity.documents.excel.drawing.IShape;
import com.grapecity.documents.excel.drawing.chart.AutoShapeType;
import com.grapecity.documents.excel.examples.ExampleBase;
import com.grapecity.documents.excel.style.color.Color;

public class ConfigShapeWithSolidFill extends ExampleBase {

    @Override
    public void execute(Workbook workbook) {

        IWorksheet worksheet = workbook.getWorksheets().get(0);
        IShape shape = worksheet.getShapes().addShape(AutoShapeType.Parallelogram, 1, 1, 200, 100);
        shape.getFill().solid();
        shape.getFill().getColor().setRGB(Color.getRed());

    }

    @Override
    public boolean getShowViewer() {

        return false;

    }

    @Override
    public boolean getShowScreenshot() {

        return true;

    }

}
