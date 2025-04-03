package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbgh implements dbhe {
    public static final cskc a = cskc.g("BugleCms", "CmsFolsomKeyManagerPage");
    public final babf b;
    public final Context c;
    public final ffss d;
    public final ffss e;
    private final ffsk f;
    private final String g;

    /* compiled from: PG */
    public interface a {
        dbfl fv();
    }

    public dbgh(babf babfVar, ffsk ffskVar, Context context) {
        babfVar.getClass();
        ffskVar.getClass();
        context.getClass();
        this.b = babfVar;
        this.f = ffskVar;
        this.c = context;
        this.g = "CmsFolsomKeyManager";
        this.d = ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.b, new dbgi(null, this));
        this.e = ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.b, new dbgj(null, this));
    }

    @Override // defpackage.dbhe
    public final String a() {
        return this.g;
    }

    public final void b(final ffsk ffskVar, final hho hhoVar, final String str, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        ffskVar.getClass();
        ffjiVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(413014568);
        if (i3 == 0) {
            i2 = (true != b.F(ffskVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hhoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjiVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(-1312675735);
            boolean F = b.F(ffjiVar) | ((i2 & 896) == 256) | b.F(ffskVar) | ((i2 & 112) == 32);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffix() { // from class: dbfz
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        axol.k(ffsk.this, null, new dbgb(hhoVar, str, ffjiVar, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hfdVar2 = b;
            dwfj.a((ffix) R, jfw.a(hvi.e, str.concat("Button")), false, null, null, null, null, null, hpx.d(-932426696, new dbgc(str), b), hfdVar2, 805306368, 508);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbga
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbgh dbghVar = dbgh.this;
                    ffsk ffskVar2 = ffskVar;
                    hho hhoVar2 = hhoVar;
                    String str2 = str;
                    dbghVar.b(ffskVar2, hhoVar2, str2, ffjiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    @Override // defpackage.dbhe
    public final void c(hho hhoVar, hfd hfdVar) {
        hvi c;
        hhoVar.getClass();
        hfdVar.v(1475206201);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = hgs.a(ffhe.a, hfdVar);
            hfdVar.y(f);
        }
        ffsk ffskVar = (ffsk) f;
        int i = huo.a;
        hun hunVar = hum.k;
        c = dix.c(hvi.e, dix.a(0, hfdVar, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
        ipn a2 = dyo.a(dxu.c, hunVar, hfdVar, 48);
        int a3 = hey.a(hfdVar);
        hgb c2 = hfdVar.c();
        hvi b = huz.b(hfdVar, c);
        int i2 = ist.a;
        ffix ffixVar = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a2, iss.e);
        hlc.b(hfdVar, c2, iss.d);
        ffjm ffjmVar = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
            Integer valueOf = Integer.valueOf(a3);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar);
        }
        hlc.b(hfdVar, b, iss.c);
        hfdVar.v(1882622801);
        boolean F = hfdVar.F(this);
        Object f2 = hfdVar.f();
        if (F || f2 == hfc.a) {
            f2 = new dbgd(this, null);
            hfdVar.y(f2);
        }
        hfdVar.o();
        b(ffskVar, hhoVar, "existsUsableFolsomKeys", (ffji) f2, hfdVar, 384);
        hfdVar.v(1882629828);
        boolean F2 = hfdVar.F(this);
        Object f3 = hfdVar.f();
        if (F2 || f3 == hfc.a) {
            f3 = new dbge(this, null);
            hfdVar.y(f3);
        }
        hfdVar.o();
        b(ffskVar, hhoVar, "setConsentAndGetEncryptionReadinessForBnr", (ffji) f3, hfdVar, 384);
        hfdVar.v(1882636223);
        boolean F3 = hfdVar.F(this);
        Object f4 = hfdVar.f();
        if (F3 || f4 == hfc.a) {
            f4 = new dbgf(this, null);
            hfdVar.y(f4);
        }
        hfdVar.o();
        b(ffskVar, hhoVar, "encryptCmsBackupAndUpdateCmsBoxState", (ffji) f4, hfdVar, 384);
        hfdVar.v(1882641695);
        boolean F4 = hfdVar.F(this);
        Object f5 = hfdVar.f();
        if (F4 || f5 == hfc.a) {
            f5 = new dbgg(this, null);
            hfdVar.y(f5);
        }
        hfdVar.o();
        b(ffskVar, hhoVar, "runStarlight", (ffji) f5, hfdVar, 384);
        hfdVar.n();
        hfdVar.o();
    }

    @Override // defpackage.dbhe
    public final /* synthetic */ void d(hfd hfdVar) {
        dbhb.a(this, hfdVar);
    }

    @Override // defpackage.dbhe
    public final /* synthetic */ void e(String str, hfd hfdVar) {
        dbhb.b(str, hfdVar);
    }
}
