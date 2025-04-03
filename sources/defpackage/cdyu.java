package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdyu implements ceac {
    public static final entd a = entd.c("BugleCms");
    private final Context b;
    private final errl c;

    public cdyu(Context context, errl errlVar) {
        this.b = context;
        this.c = errlVar;
    }

    @Override // defpackage.ceac
    public final elfl a(final int i, final ceal cealVar) {
        final pqs a2 = pqr.a(this.b);
        final ensn a3 = ceab.a(cealVar);
        ensz enszVar = (ensz) a.h();
        enszVar.Y(a3, Integer.valueOf(i));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CancelCmsWorkManagerWorkStep", "doWork", 44, "CancelCmsWorkManagerWorkStep.java")).q("Canceling CMS work manager work while disabling feature");
        return elfl.g(((pqc) a2.b("CmsInitialWork")).c).i(new eroh() { // from class: cdyr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = cdyu.a;
                return ((pqc) pqs.this.a("MediaRestore")).c;
            }
        }, this.c).i(new eroh() { // from class: cdys
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = cdyu.a;
                return ((pqc) pqs.this.a("CmsMediaUpload")).c;
            }
        }, this.c).h(new emwl() { // from class: cdyt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensz enszVar2 = (ensz) cdyu.a.h();
                enszVar2.Y(ensn.this, Integer.valueOf(i));
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CancelCmsWorkManagerWorkStep", "doWork", 63, "CancelCmsWorkManagerWorkStep.java")).q("Canceled CMS work manager work.");
                ceaf ceafVar = (ceaf) cealVar.toBuilder();
                ceafVar.copyOnWrite();
                ceal cealVar2 = (ceal) ceafVar.instance;
                cealVar2.f = 2;
                cealVar2.c |= 4;
                return (ceal) ceafVar.build();
            }
        }, this.c);
    }
}
