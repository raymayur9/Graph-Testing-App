package com.example.graphtesting

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.graphtesting.databinding.ActivityMainBinding
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.utils.ColorTemplate

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Bar Chart
        val barList: ArrayList<BarEntry> = ArrayList()
        barList.add(BarEntry(1f, 6f))
        barList.add(BarEntry(2f, 8f))
        barList.add(BarEntry(3f, 3f))
        barList.add(BarEntry(4f, 10f))
        barList.add(BarEntry(5f, 4f))

        val barDataSet: BarDataSet = BarDataSet(barList, "Bar Chart")
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS, 250)
        barDataSet.valueTextColor = Color.BLACK
        barDataSet.valueTextSize = 15f

        val barData: BarData = BarData(barDataSet)

        binding.barChart.data = barData
        binding.barChart.description.text = "Bar Chart"
        binding.barChart.setFitBars(true)
        binding.barChart.animateXY(1000, 1000)


        // Line Chart
        val lineList: ArrayList<Entry> = ArrayList()
        lineList.add(Entry(1f, 6f))
        lineList.add(Entry(2f, 8f))
        lineList.add(Entry(3f, 3f))
        lineList.add(Entry(4f, 10f))
        lineList.add(Entry(5f, 4f))

        val lineDataSet: LineDataSet = LineDataSet(lineList, "Line Chart")
        lineDataSet.setColors(ColorTemplate.MATERIAL_COLORS, 250)
        lineDataSet.valueTextColor = Color.BLACK
        lineDataSet.valueTextSize = 15f

        val lineData: LineData = LineData(lineDataSet)

        binding.lineChart.data = lineData
        binding.lineChart.description.text = "Line Chart"
        binding.lineChart.animateXY(1000, 1000)

        // Pie Chart
        val pieList: ArrayList<PieEntry> = ArrayList()
        pieList.add(PieEntry(6f))
        pieList.add(PieEntry(8f))
        pieList.add(PieEntry(3f))
        pieList.add(PieEntry(10f))
        pieList.add(PieEntry(4f))

        val pieDataSet: PieDataSet = PieDataSet(pieList, "Pie Chart")
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS, 250)
        pieDataSet.valueTextColor = Color.BLACK
        pieDataSet.valueTextSize = 15f

        val pieData: PieData = PieData(pieDataSet)

        binding.pieChart.data = pieData
        binding.pieChart.description.text = "Pie Chart"
        binding.pieChart.animateXY(1000, 1000)
    }
}