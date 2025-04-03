package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chyo implements ciin {
    private final byte[] a;
    private final fcek b;
    private String c = "";
    private long d = 0;

    public chyo(byte[] bArr, fcek fcekVar) {
        this.a = bArr;
        this.b = fcekVar;
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
        this.c = fcfoVar.c;
        fccq fccqVar = (fccq) fccr.a.createBuilder();
        fccqVar.copyOnWrite();
        fccr fccrVar = (fccr) fccqVar.instance;
        fcfoVar.getClass();
        fccrVar.c = fcfoVar;
        fccrVar.b |= 1;
        eyee x = eyee.x(this.a);
        fccqVar.copyOnWrite();
        ((fccr) fccqVar.instance).d = x;
        fccqVar.copyOnWrite();
        fccr fccrVar2 = (fccr) fccqVar.instance;
        fcek fcekVar = this.b;
        fcekVar.getClass();
        fccrVar2.e = fcekVar;
        fccrVar2.b |= 2;
        return erqt.i((fccr) fccqVar.build());
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        fccr fccrVar = (fccr) eyhsVar;
        fbpc a = chrvVar.c.a();
        fdxk fdxkVar = a.a;
        febs febsVar = fbpd.d;
        if (febsVar == null) {
            synchronized (fbpd.class) {
                febsVar = fbpd.d;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.UNARY;
                    a2.d = febs.c("google.internal.communications.instantmessaging.v1.Pairing", "SetCloudStoreEncryptionKey");
                    a2.b();
                    fccr fccrVar2 = fccr.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(fccrVar2);
                    a2.b = new ffae(fcct.a);
                    febsVar = a2.a();
                    fbpd.d = febsVar;
                }
            }
        }
        return ffat.a(fdxkVar.a(febsVar, a.b), fccrVar);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        fcct fcctVar = (fcct) eyhsVar;
        if (fcctVar == null) {
            return erqt.h(new IllegalArgumentException("Set Cloud Store encryption key response is null"));
        }
        fcfq fcfqVar = fcctVar.b;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        this.d = fcfqVar.b;
        return erqt.i(true);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "SetCloudStoreEncryptionKeyRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.c;
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
