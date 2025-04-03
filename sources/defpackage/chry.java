package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chry implements chye {
    public final chyd a;
    public final long b;
    public final Optional c;
    public final Callable d;
    private final elfl e;
    private final ciil f;
    private final errl g;
    private String h = "";
    private long i = 0;

    public chry(chyd chydVar, errl errlVar, long j, Optional optional, Callable callable, elfl elflVar, ciil ciilVar) {
        this.a = chydVar;
        this.c = optional;
        this.b = j;
        this.d = callable;
        this.e = elflVar;
        this.f = ciilVar;
        this.g = errlVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.i;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.f;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(final fcfo fcfoVar) {
        this.h = fcfoVar.c;
        return this.e.i(new eroh() { // from class: chrw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final fcek fcekVar = (fcek) obj;
                Supplier supplier = new Supplier() { // from class: chrx
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return fcek.this;
                    }
                };
                chry chryVar = chry.this;
                chyc a = chryVar.a.a(chryVar.b, chryVar.c, chryVar.d, supplier);
                return a.b(fcfoVar, a.a());
            }
        }, this.g);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        return chrvVar.b().a().c((fcbt) eyhsVar);
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
        this.i = j;
        return erqt.i(fcbvVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "RegisterRefreshRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.h;
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

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
