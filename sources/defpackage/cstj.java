package defpackage;

import j$.util.Objects;
import j$.util.Optional;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cstj {
    public static final emyl a = cfvl.w("cms_no_qr_backup_key");
    public final ffbr b;
    public final cibf c;
    public final errl d;
    public final ffbr e;
    public final chyv f;
    public final ffbr g;
    public final ffbr h;
    private final ffbr i;
    private final Optional j;
    private final bzgd k;

    public cstj(ffbr ffbrVar, ffbr ffbrVar2, Optional optional, cibf cibfVar, errl errlVar, bzgd bzgdVar, ffbr ffbrVar3, chyw chywVar, chhw chhwVar, chyp chypVar, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.i = ffbrVar;
        this.b = ffbrVar2;
        this.j = optional;
        this.c = cibfVar;
        this.d = errlVar;
        this.k = bzgdVar;
        this.e = ffbrVar3;
        this.f = chywVar.a(chhwVar, chypVar);
        this.g = ffbrVar4;
        this.h = ffbrVar5;
    }

    final elfl a(fbzk fbzkVar, csto cstoVar, esls eslsVar) {
        int i;
        int a2;
        int a3;
        csjy.c("BugleDitto", "Get phone relay mode CreateRelayPairingRpcHandler");
        fbyt fbytVar = (fbyt) fbyu.a.createBuilder();
        if (eslsVar != null) {
            boolean z = true;
            if (!eslsVar.f && (((a2 = eslp.a((i = eslsVar.g))) == 0 || a2 != 4) && ((a3 = eslp.a(i)) == 0 || a3 != 5))) {
                z = false;
            }
            fbytVar.copyOnWrite();
            ((fbyu) fbytVar.instance).b = z;
        }
        fcek fcekVar = fbzkVar.e;
        if (fcekVar == null) {
            fcekVar = fcek.a;
        }
        return elfo.e(new chsc(fcekVar, (fbyu) fbytVar.build(), eyee.b, cstoVar, this.e, this.f));
    }

    final void b(cstm cstmVar) {
        if (cstmVar == null) {
            csjy.f("BugleDitto", "Relay response is null");
            return;
        }
        bzgd bzgdVar = this.k;
        fcek c = cstmVar.c();
        esls b = cstmVar.b();
        bcyo a2 = cstmVar.a();
        String[] strArr = bsve.a;
        bsrw bsrwVar = new bsrw();
        bsrwVar.e(c.c);
        if (b != null) {
            bsrwVar.c(eyee.A(b.b).I());
            bsrwVar.l(b.d);
            bsrwVar.m(b.e);
            bsrwVar.b(b.c);
            bsrwVar.f(bzgd.e(b));
            bsrwVar.k(bzgd.x(b));
        }
        bsrwVar.d(bzgdVar.e.f().toEpochMilli());
        byte[] bArr = a2.d;
        if (bArr != null) {
            bsrwVar.h(bArr);
        }
        byte[] bArr2 = a2.e;
        if (bArr2 != null) {
            bsrwVar.j(bArr2);
        }
        bsrwVar.a().v();
        ((cbgf) bzgdVar.f.b()).g();
        cibf cibfVar = this.c;
        if (!Objects.equals((fcek) cibfVar.b.getAndSet(null), cstmVar.c())) {
            ensk j = cibf.a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/common/PairingDesktopObserver", "onNewDesktopPairingSuccess", 49, "PairingDesktopObserver.java")).q("Pairing desktop ID and successful paired desktop ID don't match.");
        }
        csjy.c("BugleDitto", "Received desktop ID, pairing successful");
        if (this.j.isPresent()) {
            ((cilk) this.j.get()).d();
        }
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            return;
        }
        try {
            ((chep) this.b.b()).a(new chyo(((crzd) this.i.b()).d(cstmVar.c()), cstmVar.c()));
        } catch (GeneralSecurityException unused) {
            csjy.f("BugleDitto", "Failed to send backup key");
        }
    }
}
