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
import android.widget.TextView;

import com.cod3f1re.tienda.R;
import com.cod3f1re.tienda.databinding.FragmentDetallesBinding;
import com.cod3f1re.tienda.databinding.FragmentListaBinding;

public class DetallesFragment extends Fragment {

    private FragmentDetallesBinding fragmentDetallesBinding;
    private int dogUuid;
    TextView tv1;

    public DetallesFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentDetallesBinding = FragmentDetallesBinding.inflate(inflater,container,false);
        return fragmentDetallesBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tv1 = fragmentDetallesBinding.titulo1;

        if (getArguments() != null){
            dogUuid = DetallesFragmentArgs.fromBundle(getArguments()).getDogUuid();
            tv1.setText(String.valueOf(dogUuid));
        }

        fragmentDetallesBinding.fab.setOnClickListener(view1 -> irALista());
    }

    void irALista(){
        NavDirections action = DetallesFragmentDirections.actionLista();
        Navigation.findNavController(fragmentDetallesBinding.fab).navigate(action);
    }

}