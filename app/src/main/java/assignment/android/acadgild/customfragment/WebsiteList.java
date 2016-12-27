package assignment.android.acadgild.customfragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by DivyaVipin on 12/26/2016.
 */
public class WebsiteList  extends ListFragment{
    String[] website=new String[]{"Youtube","Blogger","Twitter"};
    String[] websiteDescription=new String[]{"YouTube is an American video-sharing website","Publish your passions your way","Twitter is an online news and social networking service"};
    int[] images=new int[]{R.drawable.youtube,R.drawable.blogger,R.drawable.twitter};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<HashMap<String,String>> hashMapList=new ArrayList<HashMap<String, String>>();
        for (int i=0;i<3;i++)
        {
            HashMap<String,String> hm=new HashMap<String, String>();
            hm.put("name", "WebsiteName : " + website[i]);
            hm.put("des","WebsiteDescription : " + websiteDescription[i]);
            hm.put("image", Integer.toString(images[i]) );
            hashMapList.add(hm);
            String[] from = { "name","des","image" };

            int[] to = { R.id.txtViewName,R.id.txtViewDescription,R.id.imageViewWebsite};
            // Instantiating an adapter to store each items// R.layout.listview_layout defines the layout of each item

            SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(),hashMapList, R.layout.listview_layout, from, to);
            setListAdapter(adapter);
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
