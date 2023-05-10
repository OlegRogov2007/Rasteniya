package com.example.rasteniya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Flower> flowers=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    private void setFlowersData(){
        flowers.add(new Flower("Кувшинка","Хорошо известное растение с крупными плавающими на воде сердцевидно-овальными или сердцевидно-округлыми листьями" +
                " и крупными, как бы плавающими на воде цветками" ,R.drawable.kuvshinka));
        flowers.add(new Flower("Мать-и-мачеха","Многолетнее травянистое растение с мелкими желтыми язычковыми цветками," +
                " собранными в корзинки." ,R.drawable.mat_macheha));
        flowers.add(new Flower("Подсолнух","Однолетнее растение с прямостоячим, грубым, покрытым жесткими волосками стеблем высотой от 0,6 до 2,5 м и мощной корневой системой," +
                " проникающей в почву на глубину до 2 — 3 м." ,R.drawable.podsolnuh));
        flowers.add(new Flower("Ромашка","Имеет тонкий стебель и узкие зеленые листья. " +
                "Цветки состоят из яркой желтой сердцевины и вытянутых белоснежных лепестков. Они собраны в корзиночки" ,R.drawable.romashka));
        flowers.add(new Flower("Роза","относится к роду Шиповник семейства Разноцветные. Само растение является кустарником," +
                " размер которого может сильно колебаться от 15 см и свыше 2 метров." +
                " Ветки растения покрыты шипами, а листья имеют зеленый окрас и являются непарноперистыми" ,R.drawable.rosa));
    }
}