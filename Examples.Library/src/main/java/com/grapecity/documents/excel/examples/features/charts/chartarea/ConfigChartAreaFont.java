package com.grapecity.documents.excel.examples.features.charts.chartarea;

import com.grapecity.documents.excel.IWorksheet;
import com.grapecity.documents.excel.Workbook;
import com.grapecity.documents.excel.drawing.IChartArea;
import com.grapecity.documents.excel.drawing.IShape;
import com.grapecity.documents.excel.drawing.chart.ChartType;
import com.grapecity.documents.excel.drawing.chart.RowCol;
import com.grapecity.documents.excel.examples.ExampleBase;
import com.grapecity.documents.excel.style.color.Color;

public class ConfigChartAreaFont extends ExampleBase {

    @Override
    public void execute(Workbook workbook) {

        IWorksheet worksheet = workbook.getWorksheets().get(0);

        IShape shape = worksheet.getShapes().addChart(ChartType.ColumnClustered, 250, 20, 360, 230);
        worksheet.getRange("A1:D6").setValue(new Object[][]{
                {null, "S1", "S2", "S3"},
                {"Item1", 10, 25, 25},
                {"Item2", -51, -36, 27},
                {"Item3", 52, -85, -30},
                {"Item4", 22, 65, 65},
                {"Item5", 23, 69, 69}
        });
        shape.getChart().getSeriesCollection().add(worksheet.getRange("A1:D6"), RowCol.Columns, true, true);
        IChartArea chartarea = shape.getChart().getChartArea();

        //Font
        chartarea.getFont().getColor().setRGB(Color.getMediumSeaGreen());
        chartarea.getFont().setName("Times New Roman");
        chartarea.getFont().setSize(12);
        //rounded corners.
        chartarea.setRoundedCorners(true);

    }

}
