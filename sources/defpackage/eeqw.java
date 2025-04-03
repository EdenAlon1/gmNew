package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeqw extends ea implements lon {
    public LicenseMenuActivity a;
    private ArrayAdapter b;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.lon
    public final lox a(int i, Bundle bundle) {
        return new eequ(G());
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        loo.a(G()).b(54321);
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        eg G = G();
        this.b = new ArrayAdapter(G, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        loo.a(G).c(54321, null, this);
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.b);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: eeqv
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                eeqs eeqsVar = (eeqs) adapterView.getItemAtPosition(i);
                LicenseMenuActivity licenseMenuActivity = eeqw.this.a;
                if (licenseMenuActivity != null) {
                    Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                    intent.putExtra("license", eeqsVar);
                    licenseMenuActivity.startActivity(intent);
                }
            }
        });
    }

    @Override // defpackage.lon
    public final /* bridge */ /* synthetic */ void b(lox loxVar, Object obj) {
        this.b.clear();
        this.b.addAll((List) obj);
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.lon
    public final void c(lox loxVar) {
        this.b.clear();
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        eg G = G();
        if (G instanceof LicenseMenuActivity) {
            this.a = (LicenseMenuActivity) G;
        }
    }

    @Override // defpackage.ea
    public final void j() {
        super.j();
        this.a = null;
    }
}
