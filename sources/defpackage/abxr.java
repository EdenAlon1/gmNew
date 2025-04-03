package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abxr implements ciin {
    private final ezfu a;
    private final String b = UUID.randomUUID().toString();
    private String c;
    private long d;

    public abxr(ezfu ezfuVar) {
        this.a = ezfuVar;
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
    public final /* bridge */ /* synthetic */ ListenableFuture c(fcfo fcfoVar) {
        this.c = fcfoVar.c;
        fbzu fbzuVar = (fbzu) fbzv.a.createBuilder();
        fbzuVar.copyOnWrite();
        fbzv fbzvVar = (fbzv) fbzuVar.instance;
        fcfoVar.getClass();
        fbzvVar.f = fcfoVar;
        fbzvVar.b |= 4;
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fgtg fgtgVar = fgtg.MESSAGES_DATA_DONATION;
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).b = fgtgVar.a();
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).c = "dds";
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).d = "Bugle";
        fbzuVar.copyOnWrite();
        fbzv fbzvVar2 = (fbzv) fbzuVar.instance;
        fcek fcekVar = (fcek) fcejVar.build();
        fcekVar.getClass();
        fbzvVar2.c = fcekVar;
        fbzvVar2.b |= 1;
        fbzq fbzqVar = (fbzq) fbzt.a.createBuilder();
        fbzqVar.copyOnWrite();
        fbzt fbztVar = (fbzt) fbzqVar.instance;
        String str = this.b;
        str.getClass();
        fbztVar.c = str;
        fbzr fbzrVar = fbzr.USER;
        fbzqVar.copyOnWrite();
        ((fbzt) fbzqVar.instance).k = fbzrVar.a();
        fbzs fbzsVar = fbzs.MESSAGES_DATA_DONATION;
        fbzqVar.copyOnWrite();
        ((fbzt) fbzqVar.instance).d = fbzsVar.a();
        eyee byteString = this.a.toByteString();
        fbzqVar.copyOnWrite();
        ((fbzt) fbzqVar.instance).e = byteString;
        fbzuVar.copyOnWrite();
        fbzv fbzvVar3 = (fbzv) fbzuVar.instance;
        fbzt fbztVar2 = (fbzt) fbzqVar.build();
        fbztVar2.getClass();
        fbzvVar3.e = fbztVar2;
        fbzvVar3.b |= 2;
        return elfo.e((fbzv) fbzuVar.build());
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        return chrvVar.a().e((fbzv) eyhsVar);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fbzx fbzxVar = (fbzx) eyhsVar;
        if (fbzxVar == null) {
            j = 0;
        } else {
            fcfq fcfqVar = fbzxVar.b;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        }
        this.d = j;
        return elfo.e(fbzxVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "DonationRpcHandler";
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
