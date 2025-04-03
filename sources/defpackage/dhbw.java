package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhbw extends dggn {
    public final List d = new ArrayList();
    protected dggf e;
    private final ea f;
    private Activity g;

    public dhbw(ea eaVar) {
        this.f = eaVar;
    }

    @Override // defpackage.dggn
    protected final void l(dggf dggfVar) {
        this.e = dggfVar;
        m();
    }

    public final void m() {
        Activity activity = this.g;
        if (activity == null || this.e == null || this.a != null) {
            return;
        }
        try {
            dhbp.a(activity);
            IMapFragmentDelegate newMapFragmentDelegate = dhcb.a(this.g).newMapFragmentDelegate(ObjectWrapper.wrap(this.g));
            if (newMapFragmentDelegate == null) {
                return;
            }
            this.e.a(new dhbv(this.f, newMapFragmentDelegate));
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((dhbv) this.a).getMapAsync((dhbq) it.next());
            }
            this.d.clear();
        } catch (RemoteException e) {
            throw new dhcw(e);
        } catch (dfqc unused) {
        }
    }

    public final void n(Activity activity) {
        this.g = activity;
        m();
    }
}
