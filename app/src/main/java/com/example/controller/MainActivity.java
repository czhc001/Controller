package com.example.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button id1, id0, st0, st1, le0, le1, loc1, loc0;
    //String address = "http://[aaaa:bbbb:cccc:dddd:389f:3443:f457:aa5]:9601";
    String address = "http://192.168.137.1:9600";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id1 = findViewById(R.id.identity_1);
        id1.setOnClickListener(this);
        id0 = findViewById(R.id.identity_0);
        id0.setOnClickListener(this);
        st0 = findViewById(R.id.step_0);
        st0.setOnClickListener(this);
        le0 = findViewById(R.id.leave_0);
        le0.setOnClickListener(this);
        le1 = findViewById(R.id.leave_1);
        le1.setOnClickListener(this);
        st1 = findViewById(R.id.step_1);
        st1.setOnClickListener(this);
        loc1 = findViewById(R.id.loc_1);
        loc1.setOnClickListener(this);
        loc0 = findViewById(R.id.loc_0);
        loc0.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.identity_1:{
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        HttpPost postR = new HttpPost(address);
                        JSONObject object = new JSONObject();
                        StringEntity entity = null;
                        try{
                            object.put("Operation","C");
                            object.put("content","id1");
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                        try{
                            entity = new StringEntity(object.toString(),"utf-8");
                            //Log.e("res",object.toString());
                        }catch(UnsupportedEncodingException e){
                            e.printStackTrace();
                        }
                        HttpClient client = new DefaultHttpClient();
                        postR.setEntity(entity);
                        try {
                            client.execute(postR);
                        }catch(Exception io){
                        io.printStackTrace();
                        }
                    }
                }).start();
            }break;
            case R.id.identity_0:{
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        HttpPost postR = new HttpPost(address);
                        JSONObject object = new JSONObject();
                        StringEntity entity = null;
                        try{
                            object.put("Operation","C");
                            object.put("content","id0");
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                        try{
                            entity = new StringEntity(object.toString(),"utf-8");
                            //Log.e("res",object.toString());
                        }catch(UnsupportedEncodingException e){
                            e.printStackTrace();
                        }
                        HttpClient client = new DefaultHttpClient();
                        postR.setEntity(entity);
                        try {
                            client.execute(postR);
                        }catch(Exception io){
                            io.printStackTrace();
                        }
                    }
                }).start();
            }break;
            case R.id.step_0:{
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        HttpPost postR = new HttpPost(address);
                        JSONObject object = new JSONObject();
                        StringEntity entity = null;
                        try{
                            object.put("Operation","C");
                            object.put("content","st0");
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                        try{
                            entity = new StringEntity(object.toString(),"utf-8");
                            //Log.e("res",object.toString());
                        }catch(UnsupportedEncodingException e){
                            e.printStackTrace();
                        }
                        HttpClient client = new DefaultHttpClient();
                        postR.setEntity(entity);
                        try {
                            client.execute(postR);
                        }catch(Exception io){
                            io.printStackTrace();
                        }
                    }
                }).start();
            }break;
            case R.id.step_1:{
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        HttpPost postR = new HttpPost(address);
                        JSONObject object = new JSONObject();
                        StringEntity entity = null;
                        try{
                            object.put("Operation","C");
                            object.put("content","st1");
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                        try{
                            entity = new StringEntity(object.toString(),"utf-8");
                            //Log.e("res",object.toString());
                        }catch(UnsupportedEncodingException e){
                            e.printStackTrace();
                        }
                        HttpClient client = new DefaultHttpClient();
                        postR.setEntity(entity);
                        try {
                            client.execute(postR);
                        }catch(Exception io){
                            io.printStackTrace();
                        }
                    }
                }).start();
            }break;
            case R.id.leave_0:{
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        HttpPost postR = new HttpPost(address);
                        JSONObject object = new JSONObject();
                        StringEntity entity = null;
                        try{
                            object.put("Operation","C");
                            object.put("content","le0");
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                        try{
                            entity = new StringEntity(object.toString(),"utf-8");
                            //Log.e("res",object.toString());
                        }catch(UnsupportedEncodingException e){
                            e.printStackTrace();
                        }
                        HttpClient client = new DefaultHttpClient();
                        postR.setEntity(entity);
                        try {
                            client.execute(postR);
                        }catch(Exception io){
                            io.printStackTrace();
                        }
                    }
                }).start();
            }break;
            case R.id.leave_1:{
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        HttpPost postR = new HttpPost(address);
                        JSONObject object = new JSONObject();
                        StringEntity entity = null;
                        try{
                            object.put("Operation","C");
                            object.put("content","le1");
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                        try{
                            entity = new StringEntity(object.toString(),"utf-8");
                            //Log.e("res",object.toString());
                        }catch(UnsupportedEncodingException e){
                            e.printStackTrace();
                        }
                        HttpClient client = new DefaultHttpClient();
                        postR.setEntity(entity);
                        try {
                            client.execute(postR);
                        }catch(Exception io){
                            io.printStackTrace();
                        }
                    }
                }).start();
            }break;
            case R.id.loc_1:{
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        HttpPost postR = new HttpPost(address);
                        JSONObject object = new JSONObject();
                        StringEntity entity = null;
                        try{
                            object.put("Operation","C");
                            object.put("content","lc1");
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                        try{
                            entity = new StringEntity(object.toString(),"utf-8");
                            //Log.e("res",object.toString());
                        }catch(UnsupportedEncodingException e){
                            e.printStackTrace();
                        }
                        HttpClient client = new DefaultHttpClient();
                        postR.setEntity(entity);
                        try {
                            client.execute(postR);
                        }catch(Exception io){
                            io.printStackTrace();
                        }
                    }
                }).start();
            }break;
            case R.id.loc_0:{
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        HttpPost postR = new HttpPost(address);
                        JSONObject object = new JSONObject();
                        StringEntity entity = null;
                        try{
                            object.put("Operation","C");
                            object.put("content","lc0");
                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                        try{
                            entity = new StringEntity(object.toString(),"utf-8");
                            //Log.e("res",object.toString());
                        }catch(UnsupportedEncodingException e){
                            e.printStackTrace();
                        }
                        HttpClient client = new DefaultHttpClient();
                        postR.setEntity(entity);
                        try {
                            client.execute(postR);
                        }catch(Exception io){
                            io.printStackTrace();
                        }
                    }
                }).start();
            }break;

        }
    }
}
