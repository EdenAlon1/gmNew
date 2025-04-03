package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chxh implements chye {
    public static final chig a = chig.c("Bugle.PhoneRegisterRefreshRpc.Response");
    public final ffbr b;
    public final chih c;
    private final chyd d;
    private final chpz e;
    private final aolr f;
    private final long g;
    private final Optional h;
    private final Callable i;
    private final Supplier j;
    private final ciii k;
    private final ffbr l;
    private String m = "";
    private long n = 0;

    static {
        entd.c("BugleNetwork");
    }

    public chxh(chyd chydVar, chpz chpzVar, chih chihVar, aolr aolrVar, ffbr ffbrVar, ffbr ffbrVar2, long j, Optional optional, Callable callable, Supplier supplier, ciii ciiiVar) {
        this.b = ffbrVar;
        this.d = chydVar;
        this.e = chpzVar;
        this.f = aolrVar;
        this.l = ffbrVar2;
        this.g = j;
        this.h = optional;
        this.i = callable;
        this.j = supplier;
        this.k = ciiiVar;
        this.c = chihVar;
    }

    public static choc m(fcbr fcbrVar) {
        if (!fcbrVar.k.contains(Integer.valueOf(cgye.ETOUFFEE.h))) {
            fcks fcksVar = fcbrVar.l;
            if (fcksVar == null) {
                fcksVar = fcks.a;
            }
            if (!fcksVar.b.contains(Integer.valueOf(cgye.ETOUFFEE.h))) {
                return choc.REGISTERED_WITHOUT_PREKEYS;
            }
        }
        return choc.REGISTERED_WITH_PREKEYS;
    }

    public static Optional n(fcbr fcbrVar) {
        if ((fcbrVar.b & 16) == 0) {
            return Optional.empty();
        }
        fceb fcebVar = fcbrVar.m;
        if (fcebVar == null) {
            fcebVar = fceb.a;
        }
        return Optional.of(fcebVar);
    }

    public static Optional o(fcbr fcbrVar) {
        if ((fcbrVar.b & 8) == 0) {
            return Optional.empty();
        }
        fcks fcksVar = fcbrVar.l;
        if (fcksVar == null) {
            fcksVar = fcks.a;
        }
        return Optional.of(fcksVar);
    }

    public static Optional p(fcbr fcbrVar) {
        if ((fcbrVar.b & 128) == 0) {
            return Optional.empty();
        }
        fcee fceeVar = fcbrVar.o;
        if (fceeVar == null) {
            fceeVar = fcee.b;
        }
        return Optional.of(fceeVar);
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.n;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.k;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        this.m = fcfoVar.c;
        chyc a2 = this.d.a(this.g, this.h, this.i, this.j);
        aoku r = this.f.r(q());
        chze a3 = a2.a();
        a3.i();
        a3.h();
        a3.g(r, 2);
        a3.e(r);
        a3.f(r);
        return a2.b(fcfoVar, a3);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(final chrv chrvVar, eyhs eyhsVar) {
        final fcbt fcbtVar = (fcbt) eyhsVar;
        final chpy a2 = this.e.a(q());
        final fcbr fcbrVar = fcbtVar.h;
        if (fcbrVar == null) {
            fcbrVar = fcbr.a;
        }
        return a2.d().i(new eroh() { // from class: chxf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                choc chocVar;
                fcbr fcbrVar2 = fcbrVar;
                choc chocVar2 = (choc) obj;
                choc m = chxh.m(fcbrVar2);
                if (m == choc.REGISTERED_WITHOUT_PREKEYS && chocVar2 == (chocVar = choc.REGISTERED_WITH_PREKEYS)) {
                    m = chocVar;
                }
                return chpy.this.i(m, chxh.p(fcbrVar2), chxh.n(fcbrVar2), chxh.o(fcbrVar2));
            }
        }, erpp.a).i(new eroh() { // from class: chxg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                chxh chxhVar = chxh.this;
                fcek b = cpta.b(((avkc) chxhVar.b.b()).c(chxhVar.q()));
                chrv chrvVar2 = chrvVar;
                return chxhVar.c.a(chxh.a, chrvVar2.d(b).f(fcbtVar));
            }
        }, erpp.a);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fcbv fcbvVar = (fcbv) eyhsVar;
        if (fcbvVar != null) {
            fcfq fcfqVar = fcbvVar.c;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.n = j;
        return erqt.i(fcbvVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "PhoneRegisterRefreshRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.m;
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void h(Throwable th) {
        ciim.c(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void i() {
        ciim.a(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void j() {
        ciim.b(this);
    }

    public final String q() {
        chxe chxeVar = (chxe) this.l.b();
        String str = this.k.a;
        chxeVar.a(str, 2);
        return str;
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
