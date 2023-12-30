package br.com.navigationdrawer.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.navigationdrawer.R;
import mehdi.sakout.aboutpage.AboutPage;


public class sobreFragment extends Fragment {

    public sobreFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String descricao = "Texto de exemplo para uma descrição.";
        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Contatos:")
                .addEmail("steven.adm@hotmail.com", "Envie um e-mail")
                .addGitHub("stevensantosguimaraes", "GitHub")
                .addWebsite("https://www.linkedin.com/in/steven-santos-guimaraes/", "LinkedIn")
                .create();
        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }

}