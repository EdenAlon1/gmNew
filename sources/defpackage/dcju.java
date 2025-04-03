package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentCategoryView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import com.google.android.gms.maps.MapView;
import com.google.android.material.snackbar.Snackbar;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcju extends dcad implements dcjp {
    public final dcjq a;
    private LocationContentCategoryView b;
    private final LocationManager c;
    private final ctud d;
    private final ffbr m;
    private final dbxy n;
    private final bcpw o;
    private MapView p;
    private boolean q;
    private boolean r;
    private final cskx s;
    private final Activity t;

    public dcju(cskx cskxVar, LocationManager locationManager, ctud ctudVar, ffbr ffbrVar, dcjr dcjrVar, eg egVar, dbxy dbxyVar, ContentGridView contentGridView, int i, bcpw bcpwVar) {
        super(eymn.LOCATION, contentGridView, i);
        this.q = false;
        this.r = false;
        this.s = cskxVar;
        this.c = locationManager;
        this.d = ctudVar;
        this.m = ffbrVar;
        crjx crjxVar = (crjx) dcjrVar.a.b();
        crjxVar.getClass();
        ctud ctudVar2 = (ctud) dcjrVar.b.b();
        ctudVar2.getClass();
        egVar.getClass();
        this.a = new dcjq(crjxVar, ctudVar2, egVar, dbxyVar, this, bcpwVar);
        this.n = dbxyVar;
        this.o = bcpwVar;
        this.t = egVar;
    }

    private final synchronized void B() {
        if (this.b == null || this.p == null) {
            return;
        }
        l(null);
        this.p.a();
        MapView mapView = this.p;
        dcjq dcjqVar = this.a;
        dfwv.e("getMapAsync() must be called on the main thread");
        dfwv.o(dcjqVar, "callback must not be null.");
        dhbn dhbnVar = mapView.a;
        dggo dggoVar = dhbnVar.a;
        if (dggoVar != null) {
            ((dhbm) dggoVar).getMapAsync(dcjqVar);
        } else {
            dhbnVar.d.add(dcjqVar);
        }
    }

    private final void C() {
        bcpw bcpwVar = this.o;
        this.n.m(eptm.CATEGORY_HEADER, ((bcvr) bcpwVar.a()).n());
    }

    private final void D() {
        Snackbar.q(this.t.findViewById(R.id.content), com.google.android.apps.messaging.R.string.location_intent_error, 0).i();
    }

    private final boolean E() {
        LocationManager locationManager = this.c;
        if (locationManager != null) {
            return locationManager.isProviderEnabled("gps") || this.c.isProviderEnabled("network");
        }
        csjy.n("Bugle", "LocationContentCategory: LocationManager is null!");
        return false;
    }

    public final boolean A() {
        return E() && this.d.j();
    }

    @Override // defpackage.dcae
    public final int a() {
        return com.google.android.apps.messaging.R.dimen.c2o_location_item_height;
    }

    @Override // defpackage.dcae
    public final int b() {
        return com.google.android.apps.messaging.R.string.c2o_category_location_content_description;
    }

    @Override // defpackage.dcae
    protected final int c() {
        return com.google.android.apps.messaging.R.drawable.quantum_gm_ic_location_on_white_24;
    }

    @Override // defpackage.dcae
    public final Set d() {
        HashSet hashSet = new HashSet();
        hashSet.add(125);
        return hashSet;
    }

    @Override // defpackage.dcae
    public final void f(cxqz cxqzVar) {
        if (cxqzVar.c == null) {
            return;
        }
        bcpw bcpwVar = this.o;
        if (bcpwVar == null || ((bcvr) bcpwVar.a()).o() != 3) {
            String stringExtra = cxqzVar.c.getStringExtra("location_url");
            if (stringExtra == null) {
                D();
                return;
            }
            if (((Boolean) cful.o.e()).booleanValue()) {
                uev uevVar = new uev(stringExtra);
                dbzn dbznVar = this.a.d;
                if (dbznVar != null) {
                    dbznVar.j(uevVar, dcjq.a, true);
                    return;
                }
                return;
            }
            dcjz dcjzVar = new dcjz(stringExtra);
            dbzn dbznVar2 = this.a.d;
            if (dbznVar2 != null) {
                dbznVar2.i(dcjzVar, true);
                return;
            }
            return;
        }
        Intent intent = cxqzVar.c;
        if (!((Boolean) cful.o.e()).booleanValue()) {
            LocationContentItem locationContentItem = new LocationContentItem(intent.getData(), (MessagePartCoreData) intent.getParcelableExtra("location_message_part"));
            dbzn dbznVar3 = this.a.d;
            if (dbznVar3 != null) {
                dbznVar3.b(locationContentItem, dcjq.a, true);
                return;
            }
            return;
        }
        ufn o = ufo.o(intent);
        if (o == null) {
            D();
            return;
        }
        ((uet) o).b = new Size(800, 400);
        dcjq dcjqVar = this.a;
        ufo a = o.a();
        dbzn dbznVar4 = dcjqVar.d;
        if (dbznVar4 != null) {
            dbznVar4.a(a, dcjq.a, true);
        }
    }

    @Override // defpackage.dcae
    public final void g(Bundle bundle) {
        if (this.p == null || !A()) {
            return;
        }
        l(bundle);
    }

    @Override // defpackage.dcad, defpackage.dcae
    public final void gB(View view) {
        super.gB(view);
        LocationContentCategoryView locationContentCategoryView = (LocationContentCategoryView) LayoutInflater.from(view.getContext()).inflate(com.google.android.apps.messaging.R.layout.compose2o_location_category_view_m2, (ViewGroup) this.e, false);
        this.b = locationContentCategoryView;
        if (locationContentCategoryView != null) {
            this.p = (MapView) locationContentCategoryView.findViewById(com.google.android.apps.messaging.R.id.location_content_map_view);
            this.r = false;
            if (A()) {
                l(null);
            }
            LocationContentCategoryView locationContentCategoryView2 = this.b;
            locationContentCategoryView2.a = new dcai(this.a, -1);
            locationContentCategoryView2.e(this.q);
            this.e.removeAllViews();
            this.e.addView(this.b);
            View findViewById = this.b.findViewById(com.google.android.apps.messaging.R.id.location_category_permission_view);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: dcjs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        dcju.this.y();
                    }
                });
                findViewById.setAccessibilityDelegate(this.f);
            }
            this.b.setAccessibilityDelegate(this.f);
        }
        if (this.s.a(view.getContext()) && A() && this.b != null) {
            B();
        } else {
            z(false);
        }
    }

    @Override // defpackage.dcae
    public final void h() {
        if (this.p != null && A()) {
            this.p.a.b();
        }
        dcjq dcjqVar = this.a;
        dgym dgymVar = dcjqVar.c;
        if (dgymVar != null) {
            dgymVar.d(dcjqVar.g);
            dcjqVar.c = null;
        }
    }

    @Override // defpackage.dcae
    public final void i(Bundle bundle) {
        if (this.p == null || !A()) {
            return;
        }
        this.p.a.f(bundle);
    }

    @Override // defpackage.dcat
    public final void j() {
        if (this.d.j()) {
            C();
        } else {
            y();
        }
    }

    @Override // defpackage.dcjp
    public final void k() {
        LocationContentCategoryView locationContentCategoryView = this.b;
        if (locationContentCategoryView != null) {
            this.q = true;
            locationContentCategoryView.e(true);
        }
    }

    public final void l(Bundle bundle) {
        if (this.r) {
            return;
        }
        MapView mapView = this.p;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mapView.a.a(bundle);
            if (mapView.a.a == null) {
                dggn.k(mapView);
            }
            StrictMode.setThreadPolicy(threadPolicy);
            this.r = true;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    @Override // defpackage.dcae
    public final boolean m() {
        return true;
    }

    @Override // defpackage.dcae
    public final void q() {
        if (this.p == null || !A()) {
            return;
        }
        this.p.a.c();
    }

    @Override // defpackage.dcae
    public final void r() {
        if (this.p != null && A()) {
            this.p.a.d();
        }
        dcjq dcjqVar = this.a;
        dcjqVar.i = false;
        dhbj dhbjVar = dcjqVar.b;
        if (dhbjVar != null) {
            dhbjVar.c(false);
        }
        dgym dgymVar = dcjqVar.c;
        if (dgymVar != null) {
            dgymVar.d(dcjqVar.g);
        }
    }

    @Override // defpackage.dcae
    public final void s() {
        if (this.p != null && A()) {
            this.p.a.e();
        }
        dcjq dcjqVar = this.a;
        dcjqVar.i = true;
        dhbj dhbjVar = dcjqVar.b;
        if (dhbjVar != null) {
            dhbjVar.c(dcjqVar.j.j());
        }
        dcjqVar.d();
    }

    @Override // defpackage.dcae
    public final void t() {
        if (this.p == null || !A()) {
            return;
        }
        l(null);
        this.p.a();
    }

    @Override // defpackage.dcae
    public final void u() {
        if (this.p == null || !A()) {
            return;
        }
        this.p.a.h();
    }

    @Override // defpackage.dcae
    public final void v(dbzn dbznVar) {
        this.i = dbznVar;
        this.a.d = dbznVar;
    }

    public final void y() {
        if (!this.d.j()) {
            ((ctuk) this.m.b()).f(new dcjt(this));
        } else {
            if (E()) {
                return;
            }
            C();
        }
    }

    public final void z(boolean z) {
        LocationContentCategoryView locationContentCategoryView = this.b;
        if (locationContentCategoryView != null) {
            locationContentCategoryView.c.setVisibility(true != z ? 8 : 0);
            locationContentCategoryView.b.setVisibility(true != z ? 0 : 8);
            if (!z || this.p == null) {
                return;
            }
            B();
        }
    }
}
