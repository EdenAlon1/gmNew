package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbj implements dazo {
    private static final cskc c = cskc.g("BugleCms", "OverviewPage");
    public final dbcd a;
    public final dbdj b;
    private final String d = "Overview";

    public dbbj(dbcd dbcdVar, dbdj dbdjVar) {
        this.a = dbcdVar;
        this.b = dbdjVar;
    }

    private static final hkx e(ffji ffjiVar, hfd hfdVar) {
        hfdVar.v(-1067481995);
        hfdVar.v(531622637);
        boolean F = hfdVar.F(ffjiVar);
        Object f = hfdVar.f();
        if (F || f == hfc.a) {
            f = new dbbh(ffjiVar, null);
            hfdVar.y(f);
        }
        hfdVar.o();
        hkx b = ddyy.b((ffji) f, hfdVar);
        hfdVar.o();
        return b;
    }

    @Override // defpackage.dazo
    public final String a() {
        return this.d;
    }

    @Override // defpackage.dazo
    public final void b(hfd hfdVar) {
        hfdVar.v(1988283477);
        dbar[] dbarVarArr = new dbar[7];
        hfdVar.v(850929150);
        boolean F = hfdVar.F(this);
        Object f = hfdVar.f();
        if (F || f == hfc.a) {
            f = new dbas(this, null);
            hfdVar.y(f);
        }
        ffji ffjiVar = (ffji) f;
        hfdVar.o();
        hfdVar.v(1353766746);
        hfdVar.v(1283967965);
        boolean F2 = hfdVar.F(ffjiVar);
        Object f2 = hfdVar.f();
        if (F2 || f2 == hfc.a) {
            f2 = new dbbi(ffjiVar, null);
            hfdVar.y(f2);
        }
        hfdVar.o();
        hkx b = ddyy.b((ffji) f2, hfdVar);
        hfdVar.o();
        dbarVarArr[0] = new dbar("Created at", b);
        hfdVar.v(850932607);
        boolean F3 = hfdVar.F(this);
        Object f3 = hfdVar.f();
        if (F3 || f3 == hfc.a) {
            f3 = new dbat(this, null);
            hfdVar.y(f3);
        }
        hfdVar.o();
        dbarVarArr[1] = new dbar("Messages", e((ffji) f3, hfdVar));
        hfdVar.v(850936579);
        boolean F4 = hfdVar.F(this);
        Object f4 = hfdVar.f();
        if (F4 || f4 == hfc.a) {
            f4 = new dbau(this, null);
            hfdVar.y(f4);
        }
        hfdVar.o();
        dbarVarArr[2] = new dbar("Participants", e((ffji) f4, hfdVar));
        hfdVar.v(850941028);
        boolean F5 = hfdVar.F(this);
        Object f5 = hfdVar.f();
        if (F5 || f5 == hfc.a) {
            f5 = new dbav(this, null);
            hfdVar.y(f5);
        }
        hfdVar.o();
        dbarVarArr[3] = new dbar("Conversations", e((ffji) f5, hfdVar));
        hfdVar.v(850944572);
        boolean F6 = hfdVar.F(this);
        Object f6 = hfdVar.f();
        if (F6 || f6 == hfc.a) {
            f6 = new dbaw(this, null);
            hfdVar.y(f6);
        }
        hfdVar.o();
        dbarVarArr[4] = new dbar("Files", e((ffji) f6, hfdVar));
        hfdVar.v(850948417);
        boolean F7 = hfdVar.F(this);
        Object f7 = hfdVar.f();
        if (F7 || f7 == hfc.a) {
            f7 = new dbax(this, null);
            hfdVar.y(f7);
        }
        hfdVar.o();
        dbarVarArr[5] = new dbar("Backup keys", e((ffji) f7, hfdVar));
        hfdVar.v(850952869);
        boolean F8 = hfdVar.F(this);
        Object f8 = hfdVar.f();
        if (F8 || f8 == hfc.a) {
            f8 = new dbay(this, null);
            hfdVar.y(f8);
        }
        hfdVar.o();
        dbarVarArr[6] = new dbar("Encryption keys", e((ffji) f8, hfdVar));
        c("CMS Box Stats", ffdx.g(dbarVarArr), hfdVar, 6);
        dbar[] dbarVarArr2 = new dbar[2];
        hfdVar.v(850959988);
        boolean F9 = hfdVar.F(this);
        Object f9 = hfdVar.f();
        if (F9 || f9 == hfc.a) {
            f9 = new dbbc(this, null);
            hfdVar.y(f9);
        }
        hfdVar.o();
        dbarVarArr2[0] = new dbar("Is Paused", ddyy.c((ffji) f9, hfdVar));
        hfdVar.v(850965559);
        boolean F10 = hfdVar.F(this);
        Object f10 = hfdVar.f();
        if (F10 || f10 == hfc.a) {
            f10 = new dbbg(this, null);
            hfdVar.y(f10);
        }
        hfdVar.o();
        dbarVarArr2[1] = new dbar("Has Queued Sync Requests", ddyy.c((ffji) f10, hfdVar));
        c("Telephony Forward Sync", ffdx.g(dbarVarArr2), hfdVar, 6);
        hfdVar.o();
    }

    public final void c(final String str, final List list, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(630928648);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(this) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            fim.a(eba.d(hvi.e, 10.0f), gft.a(b).r, 0.0f, hpx.d(-165722747, new dbaq(str, list, this), b), b, 1572870, 58);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbap
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbbj dbbjVar = dbbj.this;
                    String str2 = str;
                    int i4 = i;
                    dbbjVar.c(str2, list, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void d(final String str, final ddyq ddyqVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1847407983);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(ddyqVar) : b.F(ddyqVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i4 = huo.a;
            hus husVar = hum.n;
            hvi e = ebs.e(hvi.e, 40.0f);
            ipn a = ebm.a(dxu.a, husVar, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, e);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            if (ddyqVar instanceof ddyo) {
                b.v(-945457424);
                fmk.e(jfw.a(eba.j(hvi.e, 0.0f, 4.0f, 0.0f, 0.0f, 13), a.a(str, "Loader for '", "'")), 0L, 0L, b, 0);
                hfmVar.Z();
            } else if (ddyqVar instanceof ddyp) {
                b.v(755723827);
                dwjt.b(str + ": " + ((ddyp) ddyqVar).a, jfw.a(hvi.e, a.a(str, "Value for '", "'")), gft.a(b).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).j, b, 0, 0, 65528);
                b = b;
                hfmVar.Z();
            } else {
                if (!(ddyqVar instanceof ddyn)) {
                    b.v(-945458866);
                    hfmVar.Z();
                    throw new ffcd();
                }
                b.v(756002455);
                c.s(a.a(str, "Failed to load data for '", "'"), (Throwable) ((ddyn) ddyqVar).a);
                dwjt.b("Error", jfw.a(hvi.e, a.a(str, "Error for '", "'")), gft.a(b).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).j, b, 6, 0, 65528);
                b = b;
                hfmVar.Z();
            }
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbao
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbbj dbbjVar = dbbj.this;
                    String str2 = str;
                    int i6 = i;
                    dbbjVar.d(str2, ddyqVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
