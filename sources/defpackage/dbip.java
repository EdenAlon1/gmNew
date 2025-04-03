package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbip implements dbhe {
    public static final cskc a = cskc.g("BugleCms", "KeyRetrievalClientPage");
    public final dbfy b;
    public final Activity c;
    public adg d;
    private final Context e;
    private final String f;

    public dbip(dbfy dbfyVar, Context context) {
        context.getClass();
        this.b = dbfyVar;
        this.e = context;
        this.f = "KeyRetrievalClient";
        this.c = (Activity) context;
    }

    public static final void f(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final boolean g(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }

    @Override // defpackage.dbhe
    public final String a() {
        return this.f;
    }

    public final void b(final List list, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        igz igzVar;
        ffjiVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1592285038);
        if (i3 == 0) {
            i2 = (true != b.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-473424774);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            b.v(-473422889);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                hic hicVar2 = new hic("", hla.a);
                hfmVar.ad(hicVar2);
                R2 = hicVar2;
            }
            final hho hhoVar2 = (hho) R2;
            hfmVar.Z();
            if (g(hhoVar)) {
                igzVar = fqo.a;
                if (igzVar == null) {
                    igx igxVar = new igx("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    List list2 = iii.a;
                    idl idlVar = new idl(ibw.a);
                    ArrayList arrayList = new ArrayList(32);
                    iha.i(7.41f, 15.41f, arrayList);
                    iha.g(12.0f, 10.83f, arrayList);
                    iha.h(4.59f, 4.58f, arrayList);
                    iha.g(18.0f, 14.0f, arrayList);
                    iha.h(-6.0f, -6.0f, arrayList);
                    iha.h(-6.0f, 6.0f, arrayList);
                    iha.b(arrayList);
                    igxVar.c(arrayList, 0, "", idlVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                    fqo.a = igxVar.a();
                    igzVar = fqo.a;
                    igzVar.getClass();
                }
            } else {
                igzVar = fqn.a;
                if (igzVar == null) {
                    igx igxVar2 = new igx("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    List list3 = iii.a;
                    idl idlVar2 = new idl(ibw.a);
                    ArrayList arrayList2 = new ArrayList(32);
                    iha.i(7.41f, 8.59f, arrayList2);
                    iha.g(12.0f, 13.17f, arrayList2);
                    iha.h(4.59f, -4.58f, arrayList2);
                    iha.g(18.0f, 10.0f, arrayList2);
                    iha.h(-6.0f, 6.0f, arrayList2);
                    iha.h(-6.0f, -6.0f, arrayList2);
                    iha.h(1.41f, -1.41f, arrayList2);
                    iha.b(arrayList2);
                    igxVar2.c(arrayList2, 0, "", idlVar2, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                    fqn.a = igxVar2.a();
                    igzVar = fqn.a;
                    igzVar.getClass();
                }
            }
            hve hveVar = hvi.e;
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            String str = (String) hhoVar2.a();
            b.v(184302796);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                R3 = new ffji() { // from class: dbhf
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        String str2 = (String) obj;
                        str2.getClass();
                        hho.this.b(str2);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            flu.d(str, (ffji) R3, null, false, null, dbha.m, hpx.d(2111539407, new dbhw(igzVar, hhoVar), b), null, null, null, 0, 0, null, null, b, 806879280, 0);
            b = b;
            boolean g = g(hhoVar);
            b.v(184314987);
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                R4 = new ffix() { // from class: dbhm
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dbip.f(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            fil.a(g, (ffix) R4, jfw.a(hvi.e, "accountDropdownMenu"), 0L, null, null, hpx.d(-777556405, new dbhz(list, ffjiVar, hhoVar), b), b, 1573296);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbhn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbip dbipVar = dbip.this;
                    List list4 = list;
                    int i6 = i;
                    dbipVar.b(list4, ffjiVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    @Override // defpackage.dbhe
    public final void c(final hho hhoVar, hfd hfdVar) {
        hvi c;
        hhoVar.getClass();
        hfdVar.v(-151791179);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = hgs.a(ffhe.a, hfdVar);
            hfdVar.y(f);
        }
        final ffsk ffskVar = (ffsk) f;
        ArrayList arrayList = new ArrayList();
        hfdVar.v(1161757055);
        boolean F = hfdVar.F(arrayList) | hfdVar.F(this);
        Object f2 = hfdVar.f();
        if (F || f2 == hfc.a) {
            f2 = new dbia(arrayList, this, null);
            hfdVar.y(f2);
        }
        hfdVar.o();
        axol.k(ffskVar, null, (ffjm) f2, 3);
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
            Object valueOf = Integer.valueOf(a3);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar);
        }
        hlc.b(hfdVar, b, iss.c);
        hus husVar = hum.n;
        hve hveVar = hvi.e;
        ipn a4 = ebm.a(dxu.a, husVar, hfdVar, 48);
        int a5 = hey.a(hfdVar);
        hgb c3 = hfdVar.c();
        hvi b2 = huz.b(hfdVar, hveVar);
        ffix ffixVar2 = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar2);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a4, iss.e);
        hlc.b(hfdVar, c3, iss.d);
        ffjm ffjmVar2 = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
            Object valueOf2 = Integer.valueOf(a5);
            hfdVar.y(valueOf2);
            hfdVar.h(valueOf2, ffjmVar2);
        }
        hlc.b(hfdVar, b2, iss.c);
        hfdVar.v(559439015);
        boolean F2 = hfdVar.F(ffskVar) | hfdVar.F(this) | hfdVar.D(hhoVar);
        Object f3 = hfdVar.f();
        if (F2 || f3 == hfc.a) {
            f3 = new ffji() { // from class: dbho
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    eixn eixnVar = (eixn) obj;
                    eixnVar.getClass();
                    axol.k(ffsk.this, null, new dbib(this, eixnVar, hhoVar, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f3);
        }
        hfdVar.o();
        b(arrayList, (ffji) f3, hfdVar, 0);
        hfdVar.n();
        hve hveVar2 = hvi.e;
        ipn a6 = ebm.a(dxu.a, hum.m, hfdVar, 0);
        int a7 = hey.a(hfdVar);
        hgb c4 = hfdVar.c();
        hvi b3 = huz.b(hfdVar, hveVar2);
        ffix ffixVar3 = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar3);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a6, iss.e);
        hlc.b(hfdVar, c4, iss.d);
        ffjm ffjmVar3 = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a7))) {
            Object valueOf3 = Integer.valueOf(a7);
            hfdVar.y(valueOf3);
            hfdVar.h(valueOf3, ffjmVar3);
        }
        hlc.b(hfdVar, b3, iss.c);
        hfdVar.v(559449008);
        boolean F3 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f4 = hfdVar.f();
        if (F3 || f4 == hfc.a) {
            f4 = new ffix() { // from class: dbhs
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbic(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f4);
        }
        hfdVar.o();
        dwfj.a((ffix) f4, jfw.a(hvi.e, "getConsentButton"), false, null, null, null, null, null, dbha.a, hfdVar, 805306416, 508);
        hfdVar.v(559461071);
        boolean F4 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f5 = hfdVar.f();
        if (F4 || f5 == hfc.a) {
            f5 = new ffix() { // from class: dbht
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbid(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f5);
        }
        hfdVar.o();
        dwfj.a((ffix) f5, jfw.a(hvi.e, "resetSecurityDomainButton"), false, null, null, null, null, null, dbha.b, hfdVar, 805306416, 508);
        hfdVar.n();
        hve hveVar3 = hvi.e;
        ipn a8 = ebm.a(dxu.a, hum.m, hfdVar, 0);
        int a9 = hey.a(hfdVar);
        hgb c5 = hfdVar.c();
        hvi b4 = huz.b(hfdVar, hveVar3);
        ffix ffixVar4 = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar4);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a8, iss.e);
        hlc.b(hfdVar, c5, iss.d);
        ffjm ffjmVar4 = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a9))) {
            Object valueOf4 = Integer.valueOf(a9);
            hfdVar.y(valueOf4);
            hfdVar.h(valueOf4, ffjmVar4);
        }
        hlc.b(hfdVar, b4, iss.c);
        dwjt.b("setConsent: ", eba.j(hvi.e, 0.0f, 20.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 54, 0, 131068);
        hfdVar.v(559476873);
        boolean F5 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f6 = hfdVar.f();
        if (F5 || f6 == hfc.a) {
            f6 = new ffix() { // from class: dbhu
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbie(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f6);
        }
        hfdVar.o();
        dwfj.a((ffix) f6, jfw.a(hvi.e, "setConsentButtonTrue"), false, null, null, null, null, null, dbha.c, hfdVar, 805306416, 508);
        hfdVar.v(559488619);
        boolean F6 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f7 = hfdVar.f();
        if (F6 || f7 == hfc.a) {
            f7 = new ffix() { // from class: dbhg
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbif(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f7);
        }
        hfdVar.o();
        dwfj.a((ffix) f7, jfw.a(hvi.e, "setConsentButtonFalse"), false, null, null, null, null, null, dbha.d, hfdVar, 805306416, 508);
        hfdVar.n();
        hve hveVar4 = hvi.e;
        ipn a10 = ebm.a(dxu.a, hum.m, hfdVar, 0);
        int a11 = hey.a(hfdVar);
        hgb c6 = hfdVar.c();
        hvi b5 = huz.b(hfdVar, hveVar4);
        ffix ffixVar5 = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar5);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a10, iss.e);
        hlc.b(hfdVar, c6, iss.d);
        ffjm ffjmVar5 = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a11))) {
            Object valueOf5 = Integer.valueOf(a11);
            hfdVar.y(valueOf5);
            hfdVar.h(valueOf5, ffjmVar5);
        }
        hlc.b(hfdVar, b5, iss.c);
        hfdVar.v(559501155);
        boolean F7 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f8 = hfdVar.f();
        if (F7 || f8 == hfc.a) {
            f8 = new ffix() { // from class: dbhh
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbig(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f8);
        }
        hfdVar.o();
        dwfj.a((ffix) f8, jfw.a(hvi.e, "getSyncStatusButton"), false, null, null, null, null, null, dbha.e, hfdVar, 805306416, 508);
        hfdVar.v(559512989);
        boolean F8 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f9 = hfdVar.f();
        if (F8 || f9 == hfc.a) {
            f9 = new ffix() { // from class: dbhi
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbih(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f9);
        }
        hfdVar.o();
        dwfj.a((ffix) f9, jfw.a(hvi.e, "listVaultsButton"), false, null, null, null, null, null, dbha.f, hfdVar, 805306416, 508);
        hfdVar.v(559524541);
        boolean F9 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f10 = hfdVar.f();
        if (F9 || f10 == hfc.a) {
            f10 = new ffix() { // from class: dbhj
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbii(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f10);
        }
        hfdVar.o();
        dwfj.a((ffix) f10, jfw.a(hvi.e, "getEligibilityButton"), false, null, null, null, null, null, dbha.g, hfdVar, 805306416, 508);
        hfdVar.n();
        hfdVar.v(-891244360);
        boolean F10 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f11 = hfdVar.f();
        if (F10 || f11 == hfc.a) {
            f11 = new ffix() { // from class: dbhk
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbij(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f11);
        }
        hfdVar.o();
        dwfj.a((ffix) f11, jfw.a(hvi.e, "listRecoveredSecurityDomainsButton"), false, null, null, null, null, null, dbha.h, hfdVar, 805306416, 508);
        hfdVar.v(-891231310);
        boolean F11 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f12 = hfdVar.f();
        if (F11 || f12 == hfc.a) {
            f12 = new ffix() { // from class: dbhl
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbik(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f12);
        }
        hfdVar.o();
        dwfj.a((ffix) f12, jfw.a(hvi.e, "listSecurityDomainMembersButton"), false, null, null, null, null, null, dbha.i, hfdVar, 805306416, 508);
        fjp.a(null, 0L, 0.0f, hfdVar, 0, 15);
        hve hveVar5 = hvi.e;
        ipn a12 = ebm.a(dxu.a, hum.m, hfdVar, 0);
        int a13 = hey.a(hfdVar);
        hgb c7 = hfdVar.c();
        hvi b6 = huz.b(hfdVar, hveVar5);
        ffix ffixVar6 = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar6);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a12, iss.e);
        hlc.b(hfdVar, c7, iss.d);
        ffjm ffjmVar6 = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a13))) {
            Object valueOf6 = Integer.valueOf(a13);
            hfdVar.y(valueOf6);
            hfdVar.h(valueOf6, ffjmVar6);
        }
        hlc.b(hfdVar, b6, iss.c);
        hfdVar.v(559566749);
        boolean F12 = hfdVar.F(this) | hfdVar.F(ffskVar) | hfdVar.D(hhoVar);
        Object f13 = hfdVar.f();
        if (F12 || f13 == hfc.a) {
            f13 = new ffix() { // from class: dbhp
                @Override // defpackage.ffix
                public final Object invoke() {
                    dbip dbipVar = dbip.this;
                    eg egVar = (eg) dbipVar.c;
                    dbip.a.p("Launching for set new LSKF");
                    axol.k(ffskVar, null, new dbim(dbipVar, egVar, new Intent("android.app.action.SET_NEW_PASSWORD"), hhoVar, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f13);
        }
        hfdVar.o();
        dwfj.a((ffix) f13, jfw.a(hvi.e, "Set LSKF"), false, null, null, null, null, null, dbha.j, hfdVar, 805306416, 508);
        hfdVar.v(559597305);
        boolean F13 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f14 = hfdVar.f();
        if (F13 || f14 == hfc.a) {
            f14 = new ffix() { // from class: dbhq
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbin(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f14);
        }
        hfdVar.o();
        dwfj.a((ffix) f14, jfw.a(hvi.e, "Zuul recoverKey"), false, null, null, null, null, null, dbha.k, hfdVar, 805306416, 508);
        hfdVar.v(559626620);
        boolean F14 = hfdVar.F(ffskVar) | hfdVar.D(hhoVar) | hfdVar.F(this);
        Object f15 = hfdVar.f();
        if (F14 || f15 == hfc.a) {
            f15 = new ffix() { // from class: dbhr
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new dbio(hhoVar, this, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f15);
        }
        hfdVar.o();
        dwfj.a((ffix) f15, jfw.a(hvi.e, "markLocalKeysAsStaleButton"), false, null, null, null, null, null, dbha.l, hfdVar, 805306416, 508);
        hfdVar.n();
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
