package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhbn extends dggn {
    public final List d = new ArrayList();
    protected dggf e;
    private final ViewGroup f;
    private final Context g;
    private final GoogleMapOptions h;

    public dhbn(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f = viewGroup;
        this.g = context;
        this.h = googleMapOptions;
    }

    @Override // defpackage.dggn
    protected final void l(dggf dggfVar) {
        this.e = dggfVar;
        if (dggfVar == null || this.a != null) {
            return;
        }
        try {
            dhbp.a(this.g);
            IMapViewDelegate newMapViewDelegate = dhcb.a(this.g).newMapViewDelegate(ObjectWrapper.wrap(this.g), this.h);
            if (newMapViewDelegate == null) {
                return;
            }
            this.e.a(new dhbm(this.f, newMapViewDelegate));
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((dhbm) this.a).getMapAsync((dhbq) it.next());
            }
            this.d.clear();
        } catch (RemoteException e) {
            throw new dhcw(e);
        } catch (dfqc unused) {
        }
    }
}
