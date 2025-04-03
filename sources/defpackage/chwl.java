package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chwl implements ciin {
    private final csto a;
    private String b = "";
    private long c = 0;
    private final ffbr d;
    private final chyv e;

    public chwl(csto cstoVar, ffbr ffbrVar, chyv chyvVar) {
        this.a = cstoVar;
        this.d = ffbrVar;
        this.e = chyvVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return ciil.c;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        ((bzea) this.d.b()).c(((cstl) this.a).c, fcfoVar.c);
        this.b = fcfoVar.c;
        fbzh fbzhVar = (fbzh) fbzi.a.createBuilder();
        fbzhVar.copyOnWrite();
        fbzi fbziVar = (fbzi) fbzhVar.instance;
        fcfoVar.getClass();
        fbziVar.c = fcfoVar;
        fbziVar.b |= 1;
        eyee x = eyee.x(((cstl) this.a).a);
        fbzhVar.copyOnWrite();
        ((fbzi) fbzhVar.instance).d = x;
        return erqt.i((fbzi) fbzhVar.build());
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        fbzi fbziVar = (fbzi) eyhsVar;
        fbpc a = chrvVar.c.a();
        fdxk fdxkVar = a.a;
        febs febsVar = fbpd.a;
        if (febsVar == null) {
            synchronized (fbpd.class) {
                febsVar = fbpd.a;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.UNARY;
                    a2.d = febs.c("google.internal.communications.instantmessaging.v1.Pairing", "GetPairingData");
                    a2.b();
                    fbzi fbziVar2 = fbzi.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(fbziVar2);
                    a2.b = new ffae(fbzk.a);
                    febsVar = a2.a();
                    fbpd.a = febsVar;
                }
            }
        }
        return ffat.a(fdxkVar.a(febsVar, a.b), fbziVar);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        fbzk fbzkVar = (fbzk) eyhsVar;
        if (fbzkVar == null) {
            return erqt.h(new IllegalArgumentException("Pairing response is null"));
        }
        fcfq fcfqVar = fbzkVar.c;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        this.c = fcfqVar.b;
        if ((fbzkVar.b & 2) == 0) {
            return erqt.h(new IllegalArgumentException("Pairing response has no ID"));
        }
        byte[] I = fbzkVar.d.I();
        if (I == null) {
            return erqt.h(new IllegalArgumentException("Paring payload is null"));
        }
        try {
            csjy.c("Bugle", "Retrieved pairing data.");
            return erqt.i(fbzkVar);
        } catch (eygu unused) {
            return erqt.h(new IllegalArgumentException("Failed to parse payload data"));
        }
    }

    @Override // defpackage.ciin
    public final String f() {
        return "GetPairingDataRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.b;
    }

    @Override // defpackage.ciin
    public final void h(Throwable th) {
        csjy.o("BugleNetwork", "Failed to make RPC call: className=%s requestId=%s, responseId=%d", "GetPairingDataRpcHandler", this.b, Long.valueOf(this.c));
        if (chfh.a(th) == Status.Code.UNAVAILABLE) {
            this.e.a();
        }
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
