package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chwe implements chye {
    public final Optional a;
    public final ciih b;
    private final cqoh c;
    private final errl d;
    private final chzf e;
    private final chwa f;
    private final aslr g;
    private final long h;
    private final Supplier i;
    private final chln j;
    private String k = "";
    private long l = 0;

    public chwe(cqoh cqohVar, errl errlVar, chzf chzfVar, chwa chwaVar, aslr aslrVar, Supplier supplier, Optional optional, long j, ciih ciihVar, chln chlnVar) {
        this.c = cqohVar;
        this.d = errlVar;
        this.e = chzfVar;
        this.f = chwaVar;
        this.g = aslrVar;
        this.a = optional;
        this.h = j;
        this.i = supplier;
        this.b = ciihVar;
        this.j = chlnVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.l;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.b;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(final fcfo fcfoVar) {
        Object obj;
        this.k = fcfoVar.c;
        final chze a = this.e.a();
        a.j();
        a.l = chhp.b(fcfoVar.c);
        a.k(this.h);
        a.l();
        ListenableFuture b = a.b();
        if (this.b.a.equals("CMS")) {
            if (this.g.a()) {
                b = this.f.a().i(new eroh() { // from class: chwb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        chze chzeVar = chze.this;
                        chzeVar.n = (eyee) obj2;
                        return chzeVar.b();
                    }
                }, this.d);
            } else {
                a.n = eyee.b;
                b = a.b();
            }
        }
        final ListenableFuture listenableFuture = b;
        obj = this.i.get();
        final ListenableFuture listenableFuture2 = (ListenableFuture) obj;
        return elfr.d(listenableFuture, listenableFuture2).a(new Callable() { // from class: chwc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fcbq fcbqVar = (fcbq) erqt.q(listenableFuture);
                byte[] bArr = (byte[]) erqt.q(listenableFuture2);
                fcfo fcfoVar2 = fcfoVar;
                long a2 = a.a();
                fcfn fcfnVar = (fcfn) fcfoVar2.toBuilder();
                fcfnVar.copyOnWrite();
                ((fcfo) fcfnVar.instance).e = chwe.this.b.a;
                eyee x = eyee.x(bArr);
                fcfnVar.copyOnWrite();
                ((fcfo) fcfnVar.instance).f = x;
                fcfo fcfoVar3 = (fcfo) fcfnVar.build();
                fcbs fcbsVar = (fcbs) fcbt.a.createBuilder();
                fcbsVar.copyOnWrite();
                fcbt fcbtVar = (fcbt) fcbsVar.instance;
                fcfoVar3.getClass();
                fcbtVar.c = fcfoVar3;
                fcbtVar.b |= 1;
                fcbsVar.copyOnWrite();
                ((fcbt) fcbsVar.instance).e = a2;
                fcbsVar.copyOnWrite();
                fcbt fcbtVar2 = (fcbt) fcbsVar.instance;
                fcbr fcbrVar = (fcbr) fcbqVar.build();
                fcbrVar.getClass();
                fcbtVar2.h = fcbrVar;
                fcbtVar2.b |= 4;
                fcbsVar.copyOnWrite();
                ((fcbt) fcbsVar.instance).f = 2;
                return (fcbt) fcbsVar.build();
            }
        }, this.d);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        final fcbt fcbtVar = (fcbt) eyhsVar;
        this.a.isPresent();
        chmc chmcVar = (chmc) chmd.a.createBuilder();
        fcfo fcfoVar = fcbtVar.c;
        if (fcfoVar == null) {
            fcfoVar = fcfo.a;
        }
        chln chlnVar = this.j;
        String str = fcfoVar.c;
        chmcVar.copyOnWrite();
        chmd chmdVar = (chmd) chmcVar.instance;
        str.getClass();
        chmdVar.b = str;
        long epochMilli = this.c.f().toEpochMilli();
        chmcVar.copyOnWrite();
        ((chmd) chmcVar.instance).c = epochMilli;
        return chlnVar.f((chmd) chmcVar.build()).i(new eroh() { // from class: chwd
            /* JADX WARN: Type inference failed for: r2v4, types: [chkj, java.lang.Object] */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return chwe.this.a.get().b(fcbtVar);
            }
        }, this.d);
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
        this.l = j;
        return erqt.i(fcbvVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "GaiaRegisterRefreshRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.k;
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
