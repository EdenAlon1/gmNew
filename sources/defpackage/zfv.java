package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfv {
    private static final dmmk a = new dmmk(ffel.a, new ffji() { // from class: zfn
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            return ffcu.a;
        }
    }, new ffji() { // from class: zfo
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            ((Integer) obj).intValue();
            return ffcu.a;
        }
    });

    public static final void a(final dlut dlutVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-704691465);
        if (i3 == 0) {
            i2 = (true != b.D(dlutVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi e = eba.e(d, 30.0f, 20.0f);
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.d, false);
            int a3 = hey.a(b);
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
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dlur.e(dlutVar, null, 0L, null, null, 0L, null, false, null, b, i2 & 14, 510);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zfp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    zfv.a(dlut.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final zfw zfwVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1476726928);
        if (i3 == 0) {
            i2 = (true != b.F(zfwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            final fflb fflbVar = new fflb();
            fflbVar.a = "";
            final dsjn dsjnVar = new dsjn(new dqnl() { // from class: zfr
                @Override // defpackage.dqnl
                public final void a(String str) {
                    str.getClass();
                    fflb.this.a = str;
                }
            }, zfwVar.e, 2);
            zkh.b(new zkk(new dmms(new dmmp(dsjnVar, (CharSequence) "", jii.a(R.string.full_screen_message_compose_row_text_hint, b), (Integer) null, false, new dmmo(false, ersy.a("bugle.use_send_ime_action_in_compose_row", "bugle"), 3), 56), a, new dmof(dmzz.dm, new ffix() { // from class: zfs
                @Override // defpackage.ffix
                public final Object invoke() {
                    zfw zfwVar2 = zfw.this;
                    axol.k(zfwVar2.a, null, new zfu(zfwVar2, fflbVar, dsjnVar, null), 3);
                    return ffcu.a;
                }
            }, (ffix) null, (String) null, false, (dmoe) null, 124), new dmmr(avah.a())), ersy.a("bugle.fix_text_on_white_background", "bugle"), ersy.a("bugle.show_spacer_for_null_shortcuts", "bugle")), null, null, b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zft
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    zfv.b(zfw.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dspk dspkVar, final hvi hviVar, final zfw zfwVar, hfd hfdVar, final int i) {
        int i2;
        boolean z;
        Boolean valueOf;
        hvi d;
        hvi a2;
        hviVar.getClass();
        int i3 = i & 48;
        hfd b = hfdVar.b(-856871384);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(zfwVar) ? 128 : 256;
        }
        if ((i2 & 145) == 144 && b.I()) {
            b.s();
        } else {
            b.v(245428937);
            if (zfwVar == null) {
                valueOf = null;
            } else {
                b.v(2104910503);
                hkx b2 = hkt.b(zfwVar.c.b, null, null, b, 2);
                hkx a3 = hkf.a(zfwVar.c.f, b);
                zjv zjvVar = (zjv) b2.a();
                if (zjvVar != null && zjvVar.c) {
                    xsb xsbVar = (xsb) a3.a();
                    if ((xsbVar != null ? xsbVar.a : null) != null) {
                        z = true;
                        ((hfm) b).Z();
                        valueOf = Boolean.valueOf(z);
                    }
                }
                z = false;
                ((hfm) b).Z();
                valueOf = Boolean.valueOf(z);
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
            hvi a4 = ecs.a(ecs.b(hviVar));
            if (!booleanValue) {
                a4 = a4.a(ebs.e(hvi.e, 72.0f));
            }
            if (booleanValue) {
                a4 = a4.a(ebs.u(hvi.e, 72.0f, 0.0f, 2));
            }
            d = ebs.d(eba.e(a4, 8.0f, 5.0f), 1.0f);
            int i4 = huo.a;
            ipn a5 = ebm.a(dxu.a, hum.n, b, 48);
            int a6 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, d);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar);
            }
            hlc.b(b, b3, iss.c);
            ebr ebrVar = ebr.a;
            b.v(960305386);
            if (zfwVar != null) {
                hkx a7 = hkf.a(zfwVar.c.f, b);
                dmha dmhaVar = (dmha) hkt.b(zfwVar.c.e, null, null, b, 2).a();
                b.v(960313355);
                if (dmhaVar != null) {
                    dmgz.b(dmhaVar, eba.j(hvi.e, 8.0f, 0.0f, 0.0f, 0.0f, 14), b, 48);
                }
                hfmVar.Z();
                zjv zjvVar2 = (zjv) hkt.b(zfwVar.c.b, null, null, b, 2).a();
                if (zjvVar2 != null && zjvVar2.c) {
                    b.v(-294783800);
                    xsb d2 = d(a7);
                    dlut dlutVar = d2 != null ? d2.a : null;
                    if (dlutVar != null) {
                        b.v(-294637635);
                        a(dlutVar, b, 0);
                        hfmVar.Z();
                    } else {
                        b.v(-294576472);
                        b(zfwVar, b, (i2 >> 6) & 14);
                        hfmVar.Z();
                    }
                    hfmVar.Z();
                } else if (d(a7) == null) {
                    b.v(-294470390);
                    dsly.a(b, 0);
                    dofi dofiVar = (dofi) hkt.b(zfwVar.c.d, null, null, b, 2).a();
                    if (dofiVar != null) {
                        a2 = ebrVar.a(hvi.e, 1.0f, true);
                        ebv.a(a2, b);
                        dofe.c(dofiVar, null, b, 0, 2);
                    }
                    hfmVar.Z();
                } else {
                    b.v(-294114572);
                    dsly.a(b, 0);
                    hfmVar.Z();
                }
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zfq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dspk dspkVar2 = dspk.this;
                    hvi hviVar2 = hviVar;
                    int i6 = i;
                    zfv.c(dspkVar2, hviVar2, zfwVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final xsb d(hkx hkxVar) {
        return (xsb) hkxVar.a();
    }
}
