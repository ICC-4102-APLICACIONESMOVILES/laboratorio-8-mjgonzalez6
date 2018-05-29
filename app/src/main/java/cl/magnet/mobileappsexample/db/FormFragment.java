package cl.magnet.mobileappsexample.db;

import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cl.magnet.mobileappsexample.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FormFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FormFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FormFragment extends Fragment {

    private FormViewModel mFormviewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Button save = (Button) getActivity().findViewById(R.id.button_save);
        return inflater.inflate(R.layout.fragment_form, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mFormviewModel = ViewModelProviders.of(this).get(FormViewModel.class);

        super.onViewCreated(view, savedInstanceState);

        Button save = (Button) getActivity().findViewById(R.id.button_save);
        final EditText name = (EditText) getActivity().findViewById(R.id.name);
        final EditText date = (EditText) getActivity().findViewById(R.id.date);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().equals("") || date.getText().toString().equals("")) {
                    Toast.makeText(getActivity(), "Faltan datos por completar", Toast.LENGTH_LONG).show();
                } else {

                    String nameString = name.getText().toString();
                    String dateString = date.getText().toString();

                    Form form = new Form();
                    form.setName(nameString);
                    form.setDate(dateString);



                    Toast.makeText(getActivity(), "Formulario Guardado con exito", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}











