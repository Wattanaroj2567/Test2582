package com.example.lab10androidintent;  // กำหนด package สำหรับแอป

import androidx.appcompat.app.AppCompatActivity;  // นำเข้า AppCompatActivity เพื่อสร้าง activity หลัก
import android.content.Intent;  // นำเข้า Intent สำหรับส่งและรับข้อมูลระหว่าง activity
import android.os.Bundle;  // ใช้สำหรับจัดการข้อมูลระหว่างการหมุนจอหรือการเปลี่ยนสถานะของ activity
import android.widget.ImageView;  // ใช้สำหรับแสดงผลรูปภาพใน layout
import android.widget.TextView;  // ใช้สำหรับแสดงผลข้อความใน layout

import java.util.Objects;  // ใช้ในการเปรียบเทียบค่า null อย่างปลอดภัย

public class animals_detils extends AppCompatActivity {  // คลาส animals_detils ซึ่งสืบทอดจาก AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // ฟังก์ชันที่ถูกเรียกเมื่อ activity ถูกสร้าง
        super.onCreate(savedInstanceState);  // เรียกใช้งานฟังก์ชัน onCreate ของคลาสแม่
        setContentView(R.layout.activity_animals_detils);  // กำหนด layout ที่จะใช้ใน activity นี้

        // get parameters
        // รับค่าพารามิเตอร์ที่ถูกส่งมาจาก activity ก่อนหน้า
        Intent intent = getIntent();  // รับ Intent จาก activity ก่อนหน้า
        String fruitName = intent.getStringExtra("fruitName");  // รับชื่อสัตว์จากพารามิเตอร์ fruitName
        String fruitImg = intent.getStringExtra("fruitImg");  // รับชื่อรูปภาพจากพารามิเตอร์ fruitImg

        // ตัดสินใจว่าจะนำรูปใดมาแสดง ขึ้นอยู่กับค่า fruitImg ที่รับมา
        ImageView imageView = findViewById(R.id.imageView);  // เชื่อมต่อ ImageView ใน layout กับโค้ด
        switch (Objects.requireNonNull(fruitImg)){  // ใช้ switch case เพื่อตรวจสอบว่า fruitImg เป็นค่าใด
            case "deer": imageView.setImageResource(R.drawable.deer); break;  // แสดงรูปกวางถ้า fruitImg เป็น deer
            case "giraffe": imageView.setImageResource(R.drawable.giraffe); break;  // แสดงรูปยีราฟถ้า fruitImg เป็น giraffe
            case "penguin": imageView.setImageResource(R.drawable.penguin); break;  // แสดงรูปแพนกวินถ้า fruitImg เป็น penguin
            case "squirrel": imageView.setImageResource(R.drawable.squirrel); break;  // แสดงรูปกระรอกถ้า fruitImg เป็น squirrel
            case "tiger": imageView.setImageResource(R.drawable.tiger); break;  // แสดงรูปเสือถ้า fruitImg เป็น tiger
            default: imageView.setImageResource(R.drawable.deer);  // ถ้าไม่มีค่า match, แสดงรูปกวางเป็นค่าเริ่มต้น
        }

        TextView textView = findViewById(R.id.textView);  // เชื่อมต่อ TextView ใน layout กับโค้ด
        textView.setText(fruitName);  // แสดงชื่อสัตว์ใน TextView ที่รับมาจาก fruitName
    }
}
