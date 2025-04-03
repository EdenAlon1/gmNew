package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.MapStyleOptions;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhbj {
    public final IGoogleMapDelegate a;
    private dhby b;

    public dhbj(IGoogleMapDelegate iGoogleMapDelegate) {
        new HashMap();
        new HashMap();
        dfwv.n(iGoogleMapDelegate);
        this.a = iGoogleMapDelegate;
    }

    public final dhby a() {
        try {
            if (this.b == null) {
                this.b = new dhby(this.a.getUiSettings());
            }
            return this.b;
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    public final void b(dhbd dhbdVar) {
        try {
            this.a.moveCamera(dhbdVar.a);
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    public final void c(boolean z) {
        try {
            this.a.setMyLocationEnabled(z);
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    public final void d(MapStyleOptions mapStyleOptions) {
        try {
            this.a.setMapStyle(mapStyleOptions);
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }
}
