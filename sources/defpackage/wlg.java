package defpackage;

import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlg implements drjb {
    public final ea a;
    public final ffbr b;
    public final ffbr c;
    public final ffsk d;
    public final ffbr e;
    public final Optional f;
    public final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;

    public wlg(ea eaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar, ffbr ffbrVar4, Optional optional, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        ffskVar.getClass();
        optional.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.a = eaVar;
        this.b = ffbrVar;
        this.h = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffskVar;
        this.e = ffbrVar4;
        this.f = optional;
        this.g = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
    }

    public final void a(hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-317080228);
        if (i3 == 0) {
            i2 = (true != b.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            ffcu ffcuVar = ffcu.a;
            b.v(2086463860);
            boolean F = b.F(this);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new wld(this, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(ffcuVar, (ffjm) R, b);
            final drja drjaVar = (drja) hkf.a(((dris) this.i.b()).a, b).a();
            boolean z = !((asuf) this.j.b()).a();
            elew elewVar = (elew) this.h.b();
            b.v(2086477817);
            boolean F2 = b.F(this);
            Object R2 = hfmVar.R();
            if (F2 || R2 == hfc.a) {
                R2 = new ffix() { // from class: wku
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        elhh.a(wlg.this.a, new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/policies/privacy/")));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            ffix a = elewVar.a("MagicComposeOnboarding.onPrivacyPolicyClick", (ffix) R2);
            elew elewVar2 = (elew) this.h.b();
            b.v(2086485380);
            boolean F3 = b.F(this);
            Object R3 = hfmVar.R();
            if (F3 || R3 == hfc.a) {
                R3 = new ffix() { // from class: wkv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        Uri parse = Uri.parse("https://support.google.com/messages?p=magic_compose");
                        parse.getClass();
                        elhh.a(wlg.this.a, new Intent("android.intent.action.VIEW", parse));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            ffix a2 = elewVar2.a("MagicComposeOnboarding.onLearnMoreClick", (ffix) R3);
            elew elewVar3 = (elew) this.h.b();
            b.v(2086494141);
            boolean F4 = b.F(this);
            Object R4 = hfmVar.R();
            if (F4 || R4 == hfc.a) {
                R4 = new ffix() { // from class: wkw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        wlg wlgVar = wlg.this;
                        ((akvg) wlgVar.c.b()).h(wlgVar.a.A());
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            ffix a3 = elewVar3.a("MagicComposeOnboarding.onSettingsClick", (ffix) R4);
            elew elewVar4 = (elew) this.h.b();
            b.v(2086500760);
            boolean F5 = b.F(this) | b.F(drjaVar);
            Object R5 = hfmVar.R();
            if (F5 || R5 == hfc.a) {
                R5 = new ffix() { // from class: wkx
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        final ffji ffjiVar = new ffji() { // from class: wkq
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                wmf wmfVar = (wmf) obj;
                                wmfVar.getClass();
                                wmfVar.o(4);
                                return ffcu.a;
                            }
                        };
                        Consumer consumer = new Consumer() { // from class: wkr
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                ffji.this.invoke(obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                return Consumer$CC.$default$andThen(this, consumer2);
                            }
                        };
                        wlg wlgVar = wlg.this;
                        wlgVar.f.ifPresent(consumer);
                        drjaVar.e.invoke();
                        axol.k(wlgVar.d, null, new wlf(wlgVar, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R5);
            }
            hfmVar.Z();
            ffix a4 = elewVar4.a("MagicComposeOnboarding.onboardingDismissed", (ffix) R5);
            elew elewVar5 = (elew) this.h.b();
            b.v(2086534997);
            boolean F6 = b.F(this);
            Object R6 = hfmVar.R();
            if (F6 || R6 == hfc.a) {
                R6 = new ffix() { // from class: wky
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        final ffji ffjiVar = new ffji() { // from class: wks
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                wmf wmfVar = (wmf) obj;
                                wmfVar.getClass();
                                wmfVar.o(3);
                                return ffcu.a;
                            }
                        };
                        Consumer consumer = new Consumer() { // from class: wkt
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                ffji.this.invoke(obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                return Consumer$CC.$default$andThen(this, consumer2);
                            }
                        };
                        wlg wlgVar = wlg.this;
                        wlgVar.f.ifPresent(consumer);
                        ((woi) wlgVar.b.b()).c(true);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R6);
            }
            hfmVar.Z();
            wnm.b(z, a, a2, a3, a4, elewVar5.a("MagicComposeOnboarding.userOnboarded", (ffix) R6), b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: wkz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    wlg.this.a((hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    @Override // defpackage.drjb
    public final void b(drhe drheVar, hfd hfdVar) {
        hfd hfdVar2;
        hfdVar.v(-814582619);
        if (drheVar.b) {
            hfdVar.v(-507540851);
            a(hfdVar, 0);
            hfdVar.o();
            hfdVar2 = hfdVar;
        } else {
            hfdVar.v(-507499435);
            hfdVar2 = hfdVar;
            cwoi.a(null, null, false, null, false, hpx.d(615509213, new wla(this), hfdVar), hfdVar2, 196608, 31);
            hfdVar2.o();
        }
        hfdVar2.o();
    }
}
