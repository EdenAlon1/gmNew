package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfs implements dvfm {
    public static final entd a = entd.c("GnpSdk");
    public final fazb b;
    public final String c;
    public final dvmq d;
    public final errl e;
    public final fazb f;
    private final ffbr g;

    public dvfs(fazb fazbVar, String str, ffbr ffbrVar, dvmq dvmqVar, errl errlVar, fazb fazbVar2) {
        this.b = fazbVar;
        this.c = str;
        this.g = ffbrVar;
        this.d = dvmqVar;
        this.e = errlVar;
        this.f = fazbVar2;
    }

    @Override // defpackage.dvfm
    public final ListenableFuture a(final evwj evwjVar) {
        final ffbr ffbrVar = this.g;
        ffbrVar.getClass();
        final ListenableFuture submit = this.e.submit(eldl.m(new Callable() { // from class: dvfp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Boolean) ffbr.this.b();
            }
        }));
        return erny.g(erny.g(erqc.o(submit), eldl.d(new eroh() { // from class: dvfn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    ((ensz) ((ensz) dvfs.a.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/events/impl/EventsHelperImpl", "reportClearCutEvent", 82, "EventsHelperImpl.java")).q("GrowthKit is disabled by Phenotype flag.");
                    return erre.a;
                }
                evwj evwjVar2 = evwjVar;
                final dvfs dvfsVar = dvfs.this;
                ListenableFuture e = dvfsVar.d.e(evwjVar2);
                eakf.b(e, new emxs() { // from class: dvfq
                    @Override // defpackage.emxs
                    public final void a(Object obj2) {
                        dvfs dvfsVar2 = dvfs.this;
                        ((ears) dvfsVar2.f.b()).h(dvfsVar2.c, "OK");
                    }
                }, new emxs() { // from class: dvfr
                    @Override // defpackage.emxs
                    public final void a(Object obj2) {
                        ((ensz) ((ensz) ((ensz) dvfs.a.j()).g((Throwable) obj2)).h("com/google/android/libraries/internal/growth/growthkit/internal/events/impl/EventsHelperImpl", "addClearcutEventToStore", 155, "EventsHelperImpl.java")).q("Failed to log clearcut event.");
                        dvfs dvfsVar2 = dvfs.this;
                        ((ears) dvfsVar2.f.b()).h(dvfsVar2.c, "ERROR");
                    }
                }, dvfsVar.e);
                return e;
            }
        }), this.e), eldl.d(new eroh() { // from class: dvfo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) erqt.q(submit)).booleanValue()) {
                    return erqt.i(false);
                }
                return ((dvhq) dvfs.this.b.b()).a(evwjVar);
            }
        }), this.e);
    }
}
