package br.com.etecia.applista;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewLivros;
    List<Livros> lstLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lstLivros = new ArrayList<>();
        lstLivros.add(new Livros("A realidade de Madhu", "Ficção Científica", " Madhu é abduzida por uma nave intergaláctica", R.drawable.a_realidade));
        lstLivros.add(new Livros("O sol é para todos","Ficção","Um dos maiores clássicos da literatura mundial",R.drawable.sol_para_todos));
        lstLivros.add(new Livros("Eu e Esse Meu Coração", "Auto ajuda", "Eu e Esse Meu Coração", R.drawable.coracao));
        lstLivros.add(new Livros("Dieta", "Alimentação", "Este não é mais um livro de dieta: O novo e libertador estilo de vida alimentar para saúde e boa", R.drawable.dieta));
        lstLivros.add(new Livros("O dilema", "Auto ajuda", "O dilema do porco espinho", R.drawable.dilema));
        lstLivros.add(new Livros("Como fazer Amigos", "Auto ajuda", "Como fazer amigos", R.drawable.amigos));
        lstLivros.add(new Livros("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
        lstLivros.add(new Livros("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        lstLivros.add(new Livros("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        lstLivros.add(new Livros("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        lstLivros.add(new Livros("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        lstLivros.add(new Livros("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        lstLivros.add(new Livros("O dilema", "Auto ajuda", "O dilema do porco espinho", R.drawable.dilema));
        lstLivros.add(new Livros("Iracema", "Clássico", "Uma das histórias de amor mais aclamadas da literatura brasileira", R.drawable.a_realidade));
        lstLivros.add(new Livros("O Homem Que Sabia Javanês", "Clássico", "Uma chamada que muitos deixariam passar, Castelo enxergou uma oportunidade única.", R.drawable.ohomequesabia));
        lstLivros.add(new Livros("Como fazer Amigos", "Auto ajuda", "Como fazer amigos", R.drawable.amigos));
        lstLivros.add(new Livros("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
        lstLivros.add(new Livros("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        lstLivros.add(new Livros("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        lstLivros.add(new Livros("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        lstLivros.add(new Livros("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        lstLivros.add(new Livros("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        lstLivros.add(new Livros("O poder do agora", "Auto Ajuda", "Um guia para a iluminação espiritual ", R.drawable.poder_agora));
        lstLivros.add(new Livros("Pai rico, pai pobre para jovens", "Administração e Negócios", "o que a escola não ensina sobre dinheiro", R.drawable.pai));

        recyclerViewLivros = findViewById(R.id.idRecyclerLivros);

        recyclerViewLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));

        ListaAdapter adapter = new ListaAdapter(getApplicationContext(),lstLivros);

        recyclerViewLivros.setAdapter(adapter);





    }
}