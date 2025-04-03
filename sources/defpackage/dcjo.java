package defpackage;

import android.location.Location;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcjo implements dgyt {
    final WeakReference a;

    public dcjo(dcjq dcjqVar) {
        this.a = new WeakReference(dcjqVar);
    }

    @Override // defpackage.dgyt
    public final void h(Location location) {
        dcjq dcjqVar = (dcjq) this.a.get();
        if (dcjqVar != null) {
            if (dcjqVar.e == null && location != null) {
                dcjqVar.h.k();
            }
            dcjqVar.e = location;
            dhbj dhbjVar = dcjqVar.b;
            if (dhbjVar == null && dcjqVar.e != null) {
                dcjqVar.f = true;
            } else if (dhbjVar != null) {
                dcjqVar.a();
            }
        }
    }
}
