package defpackage;

import android.app.Activity;
import android.location.Location;
import android.os.RemoteException;
import android.os.WorkSource;
import androidx.car.app.model.Alert;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjq implements dhbq, dcah {
    public static final dcle a = dcle.b(epts.LOCATION, eptu.EXPANDED);
    public dhbj b;
    public dgym c;
    public dbzn d;
    public Location e;
    public boolean f = false;
    public final dgyt g = new dcjo(this);
    public final dcjp h;
    public boolean i;
    public final ctud j;
    private final dbxy k;
    private final eg l;
    private final bcpw m;
    private final crjx n;

    public dcjq(crjx crjxVar, ctud ctudVar, eg egVar, dbxy dbxyVar, dcjp dcjpVar, bcpw bcpwVar) {
        this.n = crjxVar;
        this.j = ctudVar;
        this.l = egVar;
        this.k = dbxyVar;
        this.m = bcpwVar;
        this.h = dcjpVar;
    }

    public final void a() {
        Location location;
        try {
            dhbj dhbjVar = this.b;
            if (dhbjVar == null || (location = this.e) == null) {
                return;
            }
            try {
                dhbjVar.b(new dhbd(dhbe.a().newLatLng(new LatLng(location.getLatitude(), this.e.getLongitude()))));
            } catch (RemoteException e) {
                throw new dhcw(e);
            }
        } catch (Exception e2) {
            csjy.p("Bugle", e2, "LocationCategoryPresenter: failed to move camera.");
        }
    }

    final void b(boolean z) {
        if (z) {
            d();
        }
    }

    @Override // defpackage.dhbq
    public final void c(dhbj dhbjVar) {
        dhbj dhbjVar2 = this.b;
        this.b = dhbjVar;
        try {
            try {
                dhbjVar.b(new dhbd(dhbe.a().zoomTo(17.0f)));
            } catch (RemoteException e) {
                throw new dhcw(e);
            }
        } catch (Exception e2) {
            csjy.p("Bugle", e2, "LocationCategoryPresenter: failed to move camera.");
        }
        if (this.i && this.j.j()) {
            dhbjVar.c(true);
        }
        dhbjVar.a().a();
        try {
            dhbjVar.a().a.setMapToolbarEnabled(false);
            try {
                dhbjVar.a.setBuildingsEnabled(true);
                try {
                    dhbjVar.a.setIndoorEnabled(true);
                    try {
                        dhbjVar.a().a.setAllGesturesEnabled(false);
                        if (this.n.g()) {
                            dhbjVar.d(MapStyleOptions.a(this.l));
                        }
                        a();
                        if (this.f) {
                            this.f = false;
                            this.h.k();
                        }
                        if (dhbjVar2 != null) {
                            dhbjVar2.c(false);
                        }
                    } catch (RemoteException e3) {
                        throw new dhcw(e3);
                    }
                } catch (RemoteException e4) {
                    throw new dhcw(e4);
                }
            } catch (RemoteException e5) {
                throw new dhcw(e5);
            }
        } catch (RemoteException e6) {
            throw new dhcw(e6);
        }
    }

    public final void d() {
        if (this.i) {
            if (!this.j.j()) {
                csjy.i("Bugle", "LocationCategoryPresenter: Cannot request location updates, permission not granted");
                return;
            }
            eg egVar = this.l;
            int i = dgyx.a;
            this.c = new dgzr((Activity) egVar);
            LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Alert.DURATION_SHOW_INDEFINITELY, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
            locationRequest.c(5000L);
            locationRequest.c(2000L);
            Object obj = this.c;
            ((dgzr) obj).e(locationRequest, this.g, ((dfra) obj).i);
        }
    }

    @Override // defpackage.dcah
    public final void e(dcal dcalVar, int i) {
        bcpw bcpwVar = this.m;
        this.k.m(eptm.EXPAND, ((bcvr) bcpwVar.a()).n());
    }

    @Override // defpackage.dcah
    public final /* synthetic */ void g() {
    }
}
