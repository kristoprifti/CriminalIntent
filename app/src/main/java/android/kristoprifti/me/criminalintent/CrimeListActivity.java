package android.kristoprifti.me.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by k.prifti on 22.7.2016 г..
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
