package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uji implements dqlv {
    private final /* synthetic */ uls a;

    public uji(alcb alcbVar, final uot uotVar, Supplier supplier) {
        this.a = new uls(alcbVar, supplier, new ffji() { // from class: ujh
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                FileContentItem fileContentItem = (FileContentItem) obj;
                fileContentItem.getClass();
                MessagePartCoreData a = uot.this.a(fileContentItem, (dcle) ujl.a.a());
                a.getClass();
                return a;
            }
        });
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        return this.a.a((FileContentItem) doxsVar, ffguVar);
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void c(doxs doxsVar) {
        ((FileContentItem) doxsVar).getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
        this.a.d((FileContentItem) doxsVar);
    }

    @Override // defpackage.dqlv
    public final void b() {
    }
}
