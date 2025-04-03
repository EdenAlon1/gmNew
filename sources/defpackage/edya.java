package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edya implements ekrm {
    private static final enru a = enru.c("com/google/android/libraries/privatetelemetry/mobalt/workers/uploader/LogUploader");
    private final boolean b;
    private final edwv c;
    private final edva d;
    private final dlpw e;

    public edya(boolean z, edwv edwvVar, edva edvaVar, dlpw dlpwVar) {
        this.b = z;
        this.c = edwvVar;
        this.d = edvaVar;
        this.e = dlpwVar;
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl elflVar;
        if (!this.b) {
            return this.d.a(this.e.f());
        }
        ((enrr) ((enrr) a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/workers/uploader/LogUploader", "sync", 41, "LogUploader.java")).q("Mobalt: enqueue sending logs to the Cobalt Server");
        final edwv edwvVar = this.c;
        if (edwvVar.f) {
            ((enrr) ((enrr) edwv.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl", "generateAggregatedObservations", 129, "MobaltPeriodicJobImpl.java")).q("Mobalt: start sending logs to the Cobalt Server");
            ((efkw) edwvVar.n.b.get()).a(Integer.valueOf(edwvVar.c), Integer.valueOf((int) edwvVar.d));
            final elfl b = edwvVar.g.b(edwvVar.l.f());
            elfl b2 = elfo.m(b, edwvVar.m.a()).b(new erog() { // from class: edws
                /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
                @Override // defpackage.erog
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        Method dump skipped, instructions count: 680
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.edws.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, edwvVar.j);
            b2.k(new edwu(edwvVar), edwvVar.j);
            elflVar = b2;
        } else {
            elflVar = edwvVar.g.a(edwvVar.l.f());
        }
        ejjz.c(elflVar, "Mobalt: failure in enqueued sending logs to the Cobalt server", new Object[0]);
        return erre.a;
    }
}
