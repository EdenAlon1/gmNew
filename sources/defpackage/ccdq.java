package defpackage;

import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccdq implements ccdo {
    private final ffbr a;

    public ccdq(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    private static final cfkl d(ccce ccceVar, boolean z, Duration duration) {
        boolean z2 = true;
        if (!duration.isZero() && !z) {
            z2 = false;
        }
        emxf.m(z2, "initialDelay should only be set for retries");
        cetp cetpVar = new cetp();
        cetpVar.b = ccceVar.c + "," + ccceVar.d + "," + ccceVar.e + "," + ccceVar.f;
        cetpVar.a = ccceVar.g ? "initial" : z ? "incremental-retry" : (ccceVar.f & ccue.a(33)) == ccue.a(33) ? "incremental-update" : "incremental";
        cetpVar.c = duration;
        return cetpVar.a();
    }

    @Override // defpackage.ccdo
    public final int a() {
        cfba a = cfbf.a();
        a.z("countInitialBackupWork");
        a.e(new Function() { // from class: ccdp
            public final /* synthetic */ String a = "cms_backup-initial";

            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfbe cfbeVar = (cfbe) obj;
                cfbeVar.g(this.a);
                return cfbeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a.b().i();
    }

    @Override // defpackage.ccdo
    public final ceyr b(ccce ccceVar, Duration duration) {
        return ceyr.h("cms_backup", ccceVar, d(ccceVar, true, duration));
    }

    @Override // defpackage.ccdo
    public final void c(ccce ccceVar) {
        ((cevh) ((cccl) this.a.b()).a.b()).a(ceyr.h("cms_backup", ccceVar, d(ccceVar, false, Duration.ZERO)));
    }
}
