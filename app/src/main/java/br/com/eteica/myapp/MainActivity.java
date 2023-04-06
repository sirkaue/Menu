package br.com.eteica.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    MaterialToolbar idToolBar; // Declarando variável global que irá representar o XML no Java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idToolBar = findViewById(R.id.idToolBar); // Apresentando o XML para o Java

        // Criando clique no menu de navegação
        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cliquei no menu hambúrguer", Toast.LENGTH_SHORT).show();
            }
        });
        // Criando clique nos itens de menu
        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mFavorito:
                        Toast.makeText(getApplicationContext(), "Cliquei no menu favorito", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mBuscar:
                        Toast.makeText(getApplicationContext(), "Cliquei no menu buscar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mCompartilhar:
                        Toast.makeText(getApplicationContext(), "Cliquei no menu compartilhar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mSalvar:
                        Toast.makeText(getApplicationContext(), "Cliquei no menu salvar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mSair:
                        Toast.makeText(getApplicationContext(), "Cliquei no menu sair", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}