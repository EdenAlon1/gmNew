package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cebf implements ceac {
    public static final entd a = entd.c("BugleCms");
    private static final ensn b = new ensn("unregister_reason", String.class, false, false);
    private final cgxw c;

    public cebf(cgxw cgxwVar) {
        this.c = cgxwVar;
    }

    @Override // defpackage.ceac
    public final elfl a(int i, final ceal cealVar) {
        ensn a2 = ceab.a(cealVar);
        ensz enszVar = (ensz) a.h();
        enszVar.Y(a2, Integer.valueOf(i));
        enszVar.Y(b, Integer.toString(1));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsUnregisterTachyonStep", "doWork", 49, "CmsUnregisterTachyonStep.java")).q("Doing Tachyon gaia unregister");
        return this.c.o().h(new emwl() { // from class: cebd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) cebf.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsUnregisterTachyonStep", "doWork", 55, "CmsUnregisterTachyonStep.java")).q("Tachyon gaia unregister completed successfully");
                ceaf ceafVar = (ceaf) ceal.this.toBuilder();
                ceafVar.copyOnWrite();
                ceal cealVar2 = (ceal) ceafVar.instance;
                cealVar2.f = 2;
                cealVar2.c |= 4;
                return (ceal) ceafVar.build();
            }
        }, erpp.a).f(Throwable.class, new eroh() { // from class: cebe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                entd entdVar = cebf.a;
                if (!Status.c(th).getCode().equals(Status.Code.UNAUTHENTICATED)) {
                    return elfo.d(th);
                }
                ceal cealVar2 = ceal.this;
                ((ensz) cebf.a.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsUnregisterTachyonStep", "handleException", 65, "CmsUnregisterTachyonStep.java")).q("UNAUTHENTICATED from Tachyon");
                ((ensz) ((ensz) cebf.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsUnregisterTachyonStep", "handleException", 66, "CmsUnregisterTachyonStep.java")).q("Tachyon gaia unregister completed successfully");
                ceaf ceafVar = (ceaf) cealVar2.toBuilder();
                ceafVar.copyOnWrite();
                ceal cealVar3 = (ceal) ceafVar.instance;
                cealVar3.f = 2;
                cealVar3.c |= 4;
                return elfo.e((ceal) ceafVar.build());
            }
        }, erpp.a);
    }
}
