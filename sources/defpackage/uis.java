package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uis implements dqlv {
    private final /* synthetic */ uls a;

    public uis(alcb alcbVar, final uot uotVar, Supplier supplier) {
        this.a = new uls(alcbVar, supplier, new ffji() { // from class: uir
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                VCardContentItem vCardContentItem = (VCardContentItem) obj;
                vCardContentItem.getClass();
                MessagePartCoreData a = uot.this.a(vCardContentItem, (dcle) uiv.a.a());
                a.getClass();
                return a;
            }
        });
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        return this.a.a((VCardContentItem) doxsVar, ffguVar);
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void c(doxs doxsVar) {
        ((VCardContentItem) doxsVar).getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
        this.a.d((VCardContentItem) doxsVar);
    }

    @Override // defpackage.dqlv
    public final void b() {
    }
}
