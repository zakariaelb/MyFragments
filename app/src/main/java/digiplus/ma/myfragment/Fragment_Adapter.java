package digiplus.ma.myfragment;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Adapter extends FragmentPagerAdapter {

    public Fragment_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new LundiFragment();
        } else if (position == 1){
            return new MardiFragment();
        } else {
            return new MercrediFragment();

        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
