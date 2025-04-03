package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chsc implements ciin {
    private static final entd a = entd.c("BugleDitto");
    private final fcek b;
    private String c = "";
    private long d = 0;
    private final csto e;
    private final ffbr f;
    private final fbyu g;
    private final eyee h;
    private final chyv i;

    public chsc(fcek fcekVar, fbyu fbyuVar, eyee eyeeVar, csto cstoVar, ffbr ffbrVar, chyv chyvVar) {
        this.b = fcekVar;
        this.e = cstoVar;
        this.f = ffbrVar;
        this.g = fbyuVar;
        this.h = eyeeVar;
        this.i = chyvVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.d;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return ciil.c;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        ((bzea) this.f.b()).o(((cstl) this.e).c, fcfoVar.c);
        this.c = fcfoVar.c;
        fbyp fbypVar = (fbyp) fbyq.a.createBuilder();
        fbypVar.copyOnWrite();
        fbyq fbyqVar = (fbyq) fbypVar.instance;
        fcfoVar.getClass();
        fbyqVar.c = fcfoVar;
        fbyqVar.b |= 1;
        fbypVar.copyOnWrite();
        fbyq fbyqVar2 = (fbyq) fbypVar.instance;
        fcek fcekVar = this.b;
        fcekVar.getClass();
        fbyqVar2.d = fcekVar;
        fbyqVar2.b |= 2;
        fbypVar.copyOnWrite();
        fbyq fbyqVar3 = (fbyq) fbypVar.instance;
        eyee eyeeVar = this.h;
        eyeeVar.getClass();
        fbyqVar3.f = eyeeVar;
        fbypVar.copyOnWrite();
        fbyq fbyqVar4 = (fbyq) fbypVar.instance;
        fbyu fbyuVar = this.g;
        fbyuVar.getClass();
        fbyqVar4.e = fbyuVar;
        fbyqVar4.b |= 4;
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cdii.F, Integer.valueOf(this.h.d()));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/net/handler/CreateRelayPairingRpcHandler", "createRequest", 75, "CreateRelayPairingRpcHandler.java")).q("Pairing included Ditto info and client extensions");
        return erqt.i((fbyq) fbypVar.build());
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        fbyq fbyqVar = (fbyq) eyhsVar;
        fbpc a2 = chrvVar.c.a();
        fdxk fdxkVar = a2.a;
        febs febsVar = fbpd.b;
        if (febsVar == null) {
            synchronized (fbpd.class) {
                febsVar = fbpd.b;
                if (febsVar == null) {
                    febp a3 = febs.a();
                    a3.c = febr.UNARY;
                    a3.d = febs.c("google.internal.communications.instantmessaging.v1.Pairing", "CreateRelayPairing");
                    a3.b();
                    fbyq fbyqVar2 = fbyq.a;
                    eyfc eyfcVar = ffag.a;
                    a3.a = new ffae(fbyqVar2);
                    a3.b = new ffae(fbys.a);
                    febsVar = a3.a();
                    fbpd.b = febsVar;
                }
            }
        }
        return ffat.a(fdxkVar.a(febsVar, a2.b), fbyqVar);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        fbys fbysVar = (fbys) eyhsVar;
        if (fbysVar == null) {
            return erqt.h(new IllegalArgumentException("Relay pairing response is null"));
        }
        fcfq fcfqVar = fbysVar.c;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        this.d = fcfqVar.b;
        if ((fbysVar.b & 2) == 0) {
            return erqt.h(new IllegalArgumentException("Relay pairing response has no ID"));
        }
        fcek fcekVar = fbysVar.d;
        if (fcekVar == null) {
            fcekVar = fcek.a;
        }
        return erqt.i(fcekVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "CreateRelayPairingRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.c;
    }

    @Override // defpackage.ciin
    public final void h(Throwable th) {
        csjy.o("BugleNetwork", "Failed to make RPC call: className=%s requestId=%s, responseId=%d", "CreateRelayPairingRpcHandler", this.c, Long.valueOf(this.d));
        if (chfh.a(th) == Status.Code.UNAVAILABLE) {
            this.i.a();
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
