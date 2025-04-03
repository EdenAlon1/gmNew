package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpwc extends ceut {
    public static final entd a = entd.c("BugleTelephony");
    public final cpvp b;
    public final ffbr c;
    private final cqoh d;
    private final cins e;
    private final errm f;

    public cpwc(cqoh cqohVar, cpvp cpvpVar, cins cinsVar, errm errmVar, ffbr ffbrVar) {
        this.d = cqohVar;
        this.b = cpvpVar;
        this.e = cinsVar;
        this.f = errmVar;
        this.c = ffbrVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.b(cevc.FOREGROUND_SERVICE);
        ((ceti) l).b = this.e.b();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ReverseTelephonySyncWorkItemHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cpwe.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        cpwe cpweVar = (cpwe) eyhsVar;
        eyev eyevVar = cpweVar.d;
        if (eyevVar == null) {
            eyevVar = eyev.a;
        }
        long b = eyki.b(eyevVar);
        eyja eyjaVar = cpweVar.c;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        long b2 = eykm.b(eyjaVar) + b;
        long epochMilli = this.d.f().toEpochMilli();
        return (b2 > epochMilli ? elfl.g(this.f.schedule(eldl.m(new Callable() { // from class: cpvx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = cpwc.a;
                return null;
            }
        }), b2 - epochMilli, TimeUnit.MILLISECONDS)) : elfo.e(null)).i(new eroh() { // from class: cpvz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cpvp cpvpVar = cpwc.this.b;
                return elfo.f(new Runnable() { // from class: cpva
                    @Override // java.lang.Runnable
                    public final void run() {
                        cpvp.this.d(1, Optional.empty());
                    }
                }, cpvpVar.d);
            }
        }, this.f).h(new emwl() { // from class: cpwa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = cpwc.a;
                return ceyt.i();
            }
        }, erpp.a).f(Throwable.class, new eroh() { // from class: cpwb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                ((ensz) ((ensz) ((ensz) cpwc.a.i()).g(th)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySyncWorkItemHandler", "processPendingWorkItemAsync", 'E', "ReverseTelephonySyncWorkItemHandler.java")).q("ReverseTelephonySyncWorkItemHandler failed");
                return ((cfyt) cpwc.this.c.b()).b(th).h(new emwl() { // from class: cpvy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = cpwc.a;
                        return ceyt.m();
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }
}
