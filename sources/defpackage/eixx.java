package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eixx extends eixo {
    static final Duration b = Duration.ofDays(365);
    public static final /* synthetic */ int e = 0;
    public final eiyx c;
    public final ScheduledExecutorService d;
    private final eiyk f;
    private final eiyh g;
    private final ejvb h;
    private final ffbr i;
    private final dlpw j;

    public eixx(eiyk eiykVar, eiyx eiyxVar, eiyh eiyhVar, ejvb ejvbVar, ffbr ffbrVar, dlpw dlpwVar, ScheduledExecutorService scheduledExecutorService) {
        this.f = eiykVar;
        this.c = eiyxVar;
        this.g = eiyhVar;
        this.h = ejvbVar;
        this.i = ffbrVar;
        this.j = dlpwVar;
        this.d = scheduledExecutorService;
    }

    @Override // defpackage.eixo
    public final ejuh a(final eisx eisxVar) {
        return new ejuy(this.h, new eros() { // from class: eixv
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(elfr.j(eixx.this.c(eisxVar), new emwl() { // from class: eixp
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ((eixn) obj).b();
                    }
                }, erpp.a));
            }
        }, "com.google.apps.tiktok.account.data.AllAccounts");
    }

    @Override // defpackage.eixo
    public final /* bridge */ /* synthetic */ ejuh b() {
        return (eiyj) this.i.b();
    }

    @Override // defpackage.eixo
    public final ListenableFuture c(eisx eisxVar) {
        return elfr.j(this.f.c(eisxVar), new emwl() { // from class: eixq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eixn eixnVar = (eixn) obj;
                int i = eixx.e;
                emxf.a(eixnVar.c() == 2);
                return eixnVar;
            }
        }, erpp.a);
    }

    @Override // defpackage.eixo
    public final ListenableFuture d(final Duration duration) {
        boolean z = true;
        emxf.b(!duration.isNegative(), "maxAge cannot be negative");
        if (!duration.equals(a) && duration.compareTo(b) > 0) {
            z = false;
        }
        emxf.b(z, "Instead of a custom long Duration, use AccountDataService#DONT_CARE");
        final Instant f = this.j.f();
        return elfr.f(j(duration, f), IllegalStateException.class, new eroh() { // from class: eixr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final eixx eixxVar = eixx.this;
                final Duration duration2 = duration;
                final Instant instant = f;
                emyl b2 = eldl.b(new emyl() { // from class: eixw
                    @Override // defpackage.emyl
                    public final Object get() {
                        final eixx eixxVar2 = eixx.this;
                        eiyx eiyxVar = eixxVar2.c;
                        ListenableFuture a = eiyxVar.a();
                        eiyxVar.d(a);
                        final Duration duration3 = duration2;
                        final Instant instant2 = instant;
                        return elfr.k(a, new eroh() { // from class: eixu
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return eixx.this.j(duration3, instant2);
                            }
                        }, eixxVar2.d);
                    }
                });
                Logger logger = eogi.a;
                eogf eogfVar = new eogf();
                eogfVar.a = emxc.j(eixxVar.d);
                Duration duration3 = eofx.d;
                return eogfVar.a(b2, new eofs(3), emxl.ALWAYS_TRUE);
            }
        }, this.d);
    }

    @Override // defpackage.eixo
    public final ListenableFuture e() {
        return this.f.f();
    }

    @Override // defpackage.eixo
    public final ListenableFuture f() {
        return this.f.g();
    }

    @Override // defpackage.eixo
    public final ListenableFuture g() {
        return this.g.b();
    }

    @Override // defpackage.eixo
    public final ListenableFuture h(eisx eisxVar) {
        return elfr.j(this.f.c(eisxVar), new emwl() { // from class: eixs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = eixx.e;
                return Boolean.valueOf(((eixn) obj).c() == 2);
            }
        }, erpp.a);
    }

    @Override // defpackage.eixo
    public final eixn i(eisx eisxVar) {
        return this.f.j(eisxVar);
    }

    public final ListenableFuture j(final Duration duration, final Instant instant) {
        eiyk eiykVar = this.f;
        final ListenableFuture e2 = this.c.e();
        final ListenableFuture e3 = eiykVar.e();
        return elfr.d(e2, e3).a(new Callable() { // from class: eixt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = eixx.e;
                eize eizeVar = (eize) erqt.q(ListenableFuture.this);
                if ((eizeVar.b & 1) != 0) {
                    Duration duration2 = duration;
                    if (Instant.ofEpochMilli(eizeVar.c).isAfter(instant.minus(duration2))) {
                        return (List) erqt.q(e3);
                    }
                }
                throw new IllegalStateException("Cannot get fresh accounts after retries");
            }
        }, this.d);
    }
}
