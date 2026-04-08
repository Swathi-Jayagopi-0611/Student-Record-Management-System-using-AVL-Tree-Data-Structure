package com.assignment.trees;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class AVLVisualization {

    public static void main(String[] args) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(12000, "Insert", "100");
        dataset.addValue(45000, "Insert", "1000");
        dataset.addValue(120000, "Insert", "10000");

        dataset.addValue(5000, "Search", "100");
        dataset.addValue(7000, "Search", "1000");
        dataset.addValue(9000, "Search", "10000");

        dataset.addValue(6000, "Delete", "100");
        dataset.addValue(8500, "Delete", "1000");
        dataset.addValue(11000, "Delete", "10000");

        JFreeChart chart = ChartFactory.createLineChart(
                "AVL Tree Performance",
                "Dataset Size",
                "Execution Time (ns)",
                dataset
        );

        ChartFrame frame = new ChartFrame("AVL Performance Graph", chart);
        frame.setVisible(true);
        frame.setSize(800, 600);
    }
}