package com.cod3f1re.tienda.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cod3f1re.tienda.R;
import com.cod3f1re.tienda.databinding.ActivityMainBinding;
import com.cod3f1re.tienda.databinding.FragmentListaBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ListaFragment extends Fragment {

    private FragmentListaBinding fragmentListaBinding;

    FloatingActionButton fab;

    public ListaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentListaBinding = FragmentListaBinding.inflate(inflater, container, false);
        View view = fragmentListaBinding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentListaBinding.fab.setOnClickListener(view1 -> irADetalles());
    }

    void irADetalles(){
        ListaFragmentDirections.ActionDetalles action = ListaFragmentDirections.actionDetalles();
        action.setDogUuid(5);
        Navigation.findNavController(fragmentListaBinding.fab).navigate(action);
    }
}