package linh.com.androidfragmentstatepageradaptervsfragmentpageradapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends BaseFragment {

    public static Fragment2 newInstance() {
        return new Fragment2();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_2, null, false);
        Log.i(TAG, "onCreateView");
        return rootView;
    }
}