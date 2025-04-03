package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulo implements dqlv {
    private final /* synthetic */ uls a;
    private final alcb b;
    private final uot c;
    private final Supplier d;

    public ulo(alcb alcbVar, final uot uotVar, Supplier supplier) {
        this.a = new uls(alcbVar, supplier, new ffji() { // from class: uln
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                LocationContentItem locationContentItem = (LocationContentItem) obj;
                locationContentItem.getClass();
                MessagePartCoreData a = uot.this.a(locationContentItem, ulr.a());
                a.getClass();
                return a;
            }
        });
        this.b = alcbVar;
        this.c = uotVar;
        this.d = supplier;
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        Object obj;
        LocationContentItem locationContentItem = (LocationContentItem) doxsVar;
        MessagePartCoreData a = this.c.a(locationContentItem, ulr.a());
        obj = this.d.get();
        ugl uglVar = (ugl) obj;
        if (uglVar.e().b()) {
            uglVar.f(a);
        } else {
            uglVar.g(locationContentItem.a.W());
        }
        this.b.g(a.O(), -1);
        return dqmj.a;
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void c(doxs doxsVar) {
        ((LocationContentItem) doxsVar).getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
        this.a.d((LocationContentItem) doxsVar);
    }

    @Override // defpackage.dqlv
    public final void b() {
    }
}
