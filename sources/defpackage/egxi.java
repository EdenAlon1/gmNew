package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egxi implements ffjm {
    final /* synthetic */ egub a;
    final /* synthetic */ god b;
    final /* synthetic */ Account c;
    final /* synthetic */ String d;
    final /* synthetic */ egsa e;
    final /* synthetic */ egse f;

    public egxi(egub egubVar, god godVar, Account account, String str, egsa egsaVar, egse egseVar) {
        this.a = egubVar;
        this.b = godVar;
        this.c = account;
        this.d = str;
        this.e = egsaVar;
        this.f = egseVar;
    }

    public static final void b(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void c(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        final hho hhoVar;
        hvi d;
        egtq egtqVar;
        hho hhoVar2;
        ada adaVar;
        egtn egtnVar;
        Account account;
        String str;
        hho hhoVar3;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            egtq egtqVar2 = (egtq) this.a.e.a();
            Object[] objArr = new Object[0];
            hfdVar.v(2079416997);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffix() { // from class: egwp
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return new hic(false, hla.a);
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            final hho hhoVar4 = (hho) hqr.c(objArr, null, (ffix) f, hfdVar, 3072, 6);
            Object[] objArr2 = new Object[0];
            hfdVar.v(2079419621);
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = new ffix() { // from class: egwu
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return new hic(false, hla.a);
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            final hho hhoVar5 = (hho) hqr.c(objArr2, null, (ffix) f2, hfdVar, 3072, 6);
            final String a = jii.a(R.string.pqe_banner_offline, hfdVar);
            Object f3 = hfdVar.f();
            if (f3 == hfc.a) {
                f3 = hgs.a(ffhe.a, hfdVar);
                hfdVar.y(f3);
            }
            final ffsk ffskVar = (ffsk) f3;
            hfdVar.v(2079425871);
            boolean D = hfdVar.D(this.b) | hfdVar.F(this.a) | hfdVar.D(hhoVar4) | hfdVar.F(ffskVar) | hfdVar.D(a);
            final god godVar = this.b;
            final egub egubVar = this.a;
            Object f4 = hfdVar.f();
            if (D || f4 == hfc.a) {
                f4 = new ffix() { // from class: egwv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        god godVar2 = god.this;
                        goa a2 = godVar2.a();
                        if (a2 != null) {
                            a2.a();
                        }
                        if (((egsw) egubVar.a).i.a()) {
                            egxi.b(hhoVar4, true);
                        } else {
                            ffqy.d(ffskVar, null, null, new egxh(godVar2, a, null), 3);
                        }
                        return ffcu.a;
                    }
                };
                hhoVar = hhoVar4;
                hfdVar.y(f4);
            } else {
                hhoVar = hhoVar4;
            }
            ffix ffixVar = (ffix) f4;
            hfdVar.o();
            String a2 = jii.a(R.string.pqe_uploading_photo, hfdVar);
            hfdVar.v(2079439559);
            boolean D2 = hfdVar.D(hhoVar);
            Object f5 = hfdVar.f();
            if (D2 || f5 == hfc.a) {
                f5 = new ffix() { // from class: egww
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        egxi.b(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f5);
            }
            ffix ffixVar2 = (ffix) f5;
            hfdVar.o();
            final egub egubVar2 = this.a;
            hfdVar.v(-1081499869);
            ael aelVar = new ael();
            hfdVar.v(1779475238);
            boolean F = hfdVar.F(egubVar2);
            Object f6 = hfdVar.f();
            if (F || f6 == hfc.a) {
                f6 = new ffji() { // from class: egwc
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        ade adeVar = (ade) obj3;
                        adeVar.getClass();
                        Intent intent = adeVar.b;
                        String stringExtra = intent != null ? intent.getStringExtra("result.updatedProfileName") : null;
                        if (stringExtra != null && !ffpc.J(stringExtra)) {
                            egub egubVar3 = egub.this;
                            ffqy.d(egubVar3.b, null, null, new egtx(egubVar3, stringExtra, null), 3);
                        }
                        return ffcu.a;
                    }
                };
                hfdVar.y(f6);
            }
            hfdVar.o();
            final ada a3 = aco.a(aelVar, (ffji) f6, hfdVar);
            hfdVar.o();
            ada d2 = egxj.d(this.a, ffixVar2, false, hfdVar);
            final ada d3 = egxj.d(this.a, ffixVar2, true, hfdVar);
            hfdVar.v(2079450018);
            boolean F2 = hfdVar.F(a3) | hfdVar.F(this.a) | hfdVar.F(this.c);
            final Account account2 = this.c;
            Object f7 = hfdVar.f();
            if (F2 || f7 == hfc.a) {
                f7 = new ffix() { // from class: egwx
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ada.this.c(egub.b(account2, ewom.PROFILE_NAME_EDIT_SCREEN, ffew.c(new ffcf("source", "profile_primitive"))));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f7);
            }
            ffix ffixVar3 = (ffix) f7;
            hfdVar.o();
            d = ebs.d(hvi.e, 1.0f);
            hvi b = cry.b(ebs.u(d, 228.0f, 0.0f, 2));
            int i = huo.a;
            god godVar2 = this.b;
            hho hhoVar6 = hhoVar;
            final egub egubVar3 = this.a;
            final Account account3 = this.c;
            String str2 = this.d;
            egsa egsaVar = this.e;
            egse egseVar = this.f;
            ipn a4 = dyo.a(dxu.e, hum.k, hfdVar, 54);
            int a5 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b2 = huz.b(hfdVar, b);
            int i2 = ist.a;
            ffix ffixVar4 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar4);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b2, iss.c);
            if (egtqVar2 instanceof egto) {
                hfdVar.v(1858640294);
                dwij.a(null, 0L, 0.0f, 0L, 0, 0.0f, hfdVar, 0, 63);
                hfdVar.o();
            } else if (egtqVar2 instanceof egtl) {
                hfdVar.v(1858774989);
                egtl egtlVar = (egtl) egtqVar2;
                egxj.b(egtlVar.a, egtlVar.b, ffixVar, ffixVar3, true, true, true, null, hfdVar, 1794048, 128);
                hfdVar.v(1722539898);
                boolean D3 = hfdVar.D(godVar2) | hfdVar.F(d2) | hfdVar.F(egubVar3) | hfdVar.F(account3) | hfdVar.F(egtqVar2) | hfdVar.D(str2);
                Object f8 = hfdVar.f();
                if (D3 || f8 == hfc.a) {
                    egxb egxbVar = new egxb(godVar2, d2, egubVar3, account3, egtqVar2, str2, null);
                    hfdVar.y(egxbVar);
                    f8 = egxbVar;
                }
                hfdVar.o();
                hgs.g(true, (ffjm) f8, hfdVar);
                hfdVar.o();
            } else if (egtqVar2 instanceof egtk) {
                hfdVar.v(1859813830);
                goa a6 = godVar2.a();
                if (a6 != null) {
                    a6.a();
                }
                dwho.a(jie.a(R.drawable.gs_warning_vd_theme_24, hfdVar, 0), null, ebs.k(hvi.e, 100.0f), gft.a(hfdVar).A, hfdVar, 432, 0);
                ebv.a(ebs.e(hvi.e, 16.0f), hfdVar);
                dwjt.b(jii.a(R.string.pqe_something_went_wrong, hfdVar), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131070);
                hfdVar = hfdVar;
                ebv.a(ebs.e(hvi.e, 16.0f), hfdVar);
                if (egsaVar.b()) {
                    hfdVar.v(1860294919);
                    egth.a(241556, hpx.d(-1276056177, new egxd(egubVar3, account3), hfdVar), hfdVar, 54);
                    hfdVar.o();
                } else {
                    hfdVar.v(1860566944);
                    hfdVar.v(1722587182);
                    boolean F3 = hfdVar.F(egubVar3) | hfdVar.F(account3);
                    Object f9 = hfdVar.f();
                    if (F3 || f9 == hfc.a) {
                        f9 = new ffix() { // from class: egwy
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                egub.this.a(account3);
                                return ffcu.a;
                            }
                        };
                        hfdVar.y(f9);
                    }
                    hfdVar.o();
                    dwfj.c((ffix) f9, null, false, null, null, null, null, eguk.b, hfdVar, 805306368, 510);
                    hfdVar.o();
                }
                hfdVar.o();
            } else if (egtqVar2 instanceof egtp) {
                hfdVar.v(1860789710);
                egtp egtpVar = (egtp) egtqVar2;
                egxj.b(egtpVar.a, egtpVar.b, ffixVar, ffixVar3, true, true, true, null, hfdVar, 1794048, 128);
                hfdVar.v(1722604858);
                boolean D4 = hfdVar.D(godVar2) | hfdVar.D(a2);
                Object f10 = hfdVar.f();
                if (D4 || f10 == hfc.a) {
                    f10 = new egxe(godVar2, a2, null);
                    hfdVar.y(f10);
                }
                hfdVar.o();
                hgs.g(true, (ffjm) f10, hfdVar);
                hfdVar.o();
            } else {
                if (!(egtqVar2 instanceof egtn)) {
                    hfdVar.v(1722527451);
                    hfdVar.o();
                    throw new ffcd();
                }
                hfdVar.v(1861453203);
                egtn egtnVar2 = (egtn) egtqVar2;
                egxj.b(egtnVar2.a, egtnVar2.b, ffixVar, ffixVar3, egtnVar2.c, false, egtnVar2.h, egtnVar2.d, hfdVar, 196608, 0);
                hfdVar.v(1722626173);
                if (((Boolean) hhoVar5.a()).booleanValue()) {
                    hfdVar.v(1722628658);
                    boolean D5 = hfdVar.D(hhoVar5);
                    Object f11 = hfdVar.f();
                    if (D5 || f11 == hfc.a) {
                        f11 = new ffix() { // from class: egwz
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                egxi.c(hho.this, false);
                                return ffcu.a;
                            }
                        };
                        hfdVar.y(f11);
                    }
                    hfdVar.o();
                    hhoVar2 = hhoVar5;
                    egtqVar = egtqVar2;
                    egtnVar = egtnVar2;
                    account = account3;
                    str = str2;
                    adaVar = d2;
                    hhoVar3 = hhoVar6;
                    dweq.a((ffix) f11, hpx.d(-172579965, new egxg(hhoVar5), hfdVar), null, null, null, null, eguk.d, null, 0L, 0.0f, 0L, 0L, 0L, null, hfdVar, 1572912, 0, 16316);
                    hfdVar = hfdVar;
                } else {
                    egtqVar = egtqVar2;
                    hhoVar2 = hhoVar5;
                    adaVar = d2;
                    egtnVar = egtnVar2;
                    account = account3;
                    str = str2;
                    hhoVar3 = hhoVar6;
                }
                hfdVar.o();
                if (((Boolean) hhoVar3.a()).booleanValue()) {
                    Uri uri = egtnVar.g;
                    boolean z = egtnVar.f;
                    boolean z2 = ((Boolean) egsaVar.b.a()).booleanValue() ? egtnVar.e : true;
                    hfdVar.v(1722675153);
                    final hho hhoVar7 = hhoVar2;
                    boolean D6 = hfdVar.D(hhoVar7);
                    Object f12 = hfdVar.f();
                    if (D6 || f12 == hfc.a) {
                        f12 = new ffix() { // from class: egxa
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                egxi.c(hho.this, true);
                                return ffcu.a;
                            }
                        };
                        hfdVar.y(f12);
                    }
                    ffix ffixVar5 = (ffix) f12;
                    hfdVar.o();
                    hfdVar.v(1722647943);
                    final ada adaVar2 = adaVar;
                    final Account account4 = account;
                    final String str3 = str;
                    boolean F4 = hfdVar.F(adaVar2) | hfdVar.F(egubVar3) | hfdVar.F(account4) | hfdVar.D(str3);
                    Object f13 = hfdVar.f();
                    if (F4 || f13 == hfc.a) {
                        f13 = new ffji() { // from class: egwq
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj3) {
                                ewom ewomVar = (ewom) obj3;
                                ewomVar.getClass();
                                ffga ffgaVar = new ffga();
                                ffgaVar.put("hostSurface", "pqe");
                                ffgaVar.put("cau", "true");
                                ffgaVar.put("hostId", str3);
                                ada.this.c(egub.b(account4, ewomVar, ffew.b(ffgaVar)));
                                return ffcu.a;
                            }
                        };
                        hfdVar.y(f13);
                    }
                    ffji ffjiVar = (ffji) f13;
                    hfdVar.o();
                    hfdVar.v(1722678052);
                    boolean F5 = hfdVar.F(d3) | hfdVar.F(egubVar3) | hfdVar.F(account4) | hfdVar.D(str3);
                    Object f14 = hfdVar.f();
                    if (F5 || f14 == hfc.a) {
                        f14 = new ffji() { // from class: egwr
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj3) {
                                ewom ewomVar = (ewom) obj3;
                                ewomVar.getClass();
                                ffga ffgaVar = new ffga();
                                ffgaVar.put("hostSurface", "pqe");
                                ffgaVar.put("cau", "true");
                                ffgaVar.put("hostId", str3);
                                ada.this.c(egub.b(account4, ewomVar, ffew.b(ffgaVar)));
                                return ffcu.a;
                            }
                        };
                        hfdVar.y(f14);
                    }
                    ffji ffjiVar2 = (ffji) f14;
                    hfdVar.o();
                    hfdVar.v(1722664213);
                    final hho hhoVar8 = hhoVar3;
                    boolean D7 = hfdVar.D(hhoVar8) | hfdVar.F(egubVar3);
                    Object f15 = hfdVar.f();
                    if (D7 || f15 == hfc.a) {
                        f15 = new ffji() { // from class: egws
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj3) {
                                Uri uri2 = (Uri) obj3;
                                uri2.getClass();
                                egxi.b(hhoVar8, false);
                                egub egubVar4 = egub.this;
                                ffqy.d(egubVar4.c, null, null, new egua(egubVar4, uri2, null), 3);
                                return ffcu.a;
                            }
                        };
                        hfdVar.y(f15);
                    }
                    ffji ffjiVar3 = (ffji) f15;
                    hfdVar.o();
                    hfdVar.v(1722670273);
                    final egtq egtqVar3 = egtqVar;
                    boolean D8 = hfdVar.D(hhoVar8) | hfdVar.F(egubVar3) | hfdVar.F(egtqVar3);
                    Object f16 = hfdVar.f();
                    if (D8 || f16 == hfc.a) {
                        f16 = new ffix() { // from class: egwt
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                egxi.b(hhoVar8, false);
                                Uri uri2 = ((egtn) egtqVar3).g;
                                egub egubVar4 = egub.this;
                                ffqy.d(egubVar4.c, null, null, new egtz(egubVar4, uri2, null), 3);
                                return ffcu.a;
                            }
                        };
                        hfdVar.y(f16);
                    }
                    hfdVar.o();
                    hfd hfdVar2 = hfdVar;
                    egvv.d(ffixVar5, ffixVar2, ffjiVar, ffjiVar2, z, egseVar, ffjiVar3, uri, (ffix) f16, z2, hfdVar2, 0);
                    hfdVar = hfdVar2;
                }
                hfdVar.o();
            }
            hfdVar.n();
        }
        return ffcu.a;
    }
}
