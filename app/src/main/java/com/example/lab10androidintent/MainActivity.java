package com.example.lab10androidintent;  // กำหนด package สำหรับแอปนี้

import androidx.appcompat.app.AppCompatActivity;  // นำเข้า AppCompatActivity สำหรับสร้าง activity หลัก
import androidx.core.content.ContextCompat;  // ใช้สำหรับเข้าถึง resource ต่างๆ ใน context
import android.content.Intent;  // นำเข้า Intent สำหรับส่งข้อมูลระหว่าง activity
import android.os.Bundle;  // นำเข้า Bundle เพื่อบันทึกสถานะของ activity
import android.view.View;  // ใช้สำหรับควบคุมและจัดการ event ที่เกิดขึ้นใน view
import android.widget.ImageView;  // ใช้สำหรับแสดงภาพใน layout

public class MainActivity extends AppCompatActivity {  // กำหนดคลาสหลักชื่อ MainActivity ที่สืบทอดจาก AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // ฟังก์ชันที่ถูกเรียกเมื่อ activity ถูกสร้าง
        super.onCreate(savedInstanceState);  // เรียกใช้ onCreate ของคลาสแม่
        setContentView(R.layout.activity_main);  // กำหนด layout ที่จะใช้สำหรับ activity นี้ (activity_main.xml)

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);  // ผูก imageView1 กับ ImageView ใน layout
        imageView1.setOnClickListener(new View.OnClickListener() {  // กำหนด event เมื่อ imageView1 ถูกคลิก
            @Override
            public void onClick(View v) {  // เมธอดที่ทำงานเมื่อมีการคลิกที่ imageView1
                Intent intent = new Intent(MainActivity.this, animals_detils.class);  // สร้าง Intent เพื่อส่งข้อมูลไปยัง activity animals_detils
                intent.putExtra("fruitName", "กวาง");  // ส่งข้อมูลชื่อสัตว์ไปยัง activity ถัดไป
                // Lab 09 - send img id to the next page
                intent.putExtra("fruitImg", "deer");  // ส่งชื่อไฟล์รูปภาพไปยัง activity ถัดไป
                startActivity(intent);  // เรียก activity ใหม่
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);  // ผูก imageView2 กับ ImageView ใน layout
        imageView2.setOnClickListener(new View.OnClickListener() {  // กำหนด event เมื่อ imageView2 ถูกคลิก
            @Override
            public void onClick(View v) {  // เมธอดที่ทำงานเมื่อมีการคลิกที่ imageView2
                Intent intent = new Intent(MainActivity.this, animals_detils.class);  // สร้าง Intent เพื่อส่งข้อมูลไปยัง activity animals_detils
                intent.putExtra("fruitName", "ยีราฟ");  // ส่งข้อมูลชื่อสัตว์ไปยัง activity ถัดไป
                // Lab 09 - send img id to the next page
                intent.putExtra("fruitImg", "giraffe");  // ส่งชื่อไฟล์รูปภาพไปยัง activity ถัดไป
                startActivity(intent);  // เรียก activity ใหม่
            }
        });

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);  // ผูก imageView3 กับ ImageView ใน layout
        imageView3.setOnClickListener(new View.OnClickListener() {  // กำหนด event เมื่อ imageView3 ถูกคลิก
            @Override
            public void onClick(View v) {  // เมธอดที่ทำงานเมื่อมีการคลิกที่ imageView3
                Intent intent = new Intent(MainActivity.this, animals_detils.class);  // สร้าง Intent เพื่อส่งข้อมูลไปยัง activity animals_detils
                intent.putExtra("fruitName", "แพนกวิน");  // ส่งข้อมูลชื่อสัตว์ไปยัง activity ถัดไป
                // Lab 09 - send img id to the next page
                intent.putExtra("fruitImg", "penguin");  // ส่งชื่อไฟล์รูปภาพไปยัง activity ถัดไป
                startActivity(intent);  // เรียก activity ใหม่
            }
        });

        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);  // ผูก imageView4 กับ ImageView ใน layout
        imageView4.setOnClickListener(new View.OnClickListener() {  // กำหนด event เมื่อ imageView4 ถูกคลิก
            @Override
            public void onClick(View v) {  // เมธอดที่ทำงานเมื่อมีการคลิกที่ imageView4
                Intent intent = new Intent(MainActivity.this, animals_detils.class);  // สร้าง Intent เพื่อส่งข้อมูลไปยัง activity animals_detils
                intent.putExtra("fruitName", "กระรอก");  // ส่งข้อมูลชื่อสัตว์ไปยัง activity ถัดไป
                // Lab 09 - send img id to the next page
                intent.putExtra("fruitImg", "squirrel");  // ส่งชื่อไฟล์รูปภาพไปยัง activity ถัดไป
                startActivity(intent);  // เรียก activity ใหม่
            }
        });

        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);  // ผูก imageView5 กับ ImageView ใน layout
        imageView5.setOnClickListener(new View.OnClickListener() {  // กำหนด event เมื่อ imageView5 ถูกคลิก
            @Override
            public void onClick(View v) {  // เมธอดที่ทำงานเมื่อมีการคลิกที่ imageView5
                Intent intent = new Intent(MainActivity.this, animals_detils.class);  // สร้าง Intent เพื่อส่งข้อมูลไปยัง activity animals_detils
                intent.putExtra("fruitName", "เสือ");  // ส่งข้อมูลชื่อสัตว์ไปยัง activity ถัดไป
                // Lab 09 - send img id to the next page
                intent.putExtra("fruitImg", "tiger");  // ส่งชื่อไฟล์รูปภาพไปยัง activity ถัดไป
                startActivity(intent);  // เรียก activity ใหม่
            }
        });
    }
}
