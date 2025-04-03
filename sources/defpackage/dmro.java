package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmro {
    public static final void a(final dmms dmmsVar, final hzi hziVar, final dmpg dmpgVar, final float f, final dmpi dmpiVar, hfd hfdVar, final int i) {
        int i2;
        hzi hziVar2;
        dmpg dmpgVar2;
        dmpi dmpiVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1897801932);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            hziVar2 = hziVar;
            i2 |= true != b.D(hziVar2) ? 16 : 32;
        } else {
            hziVar2 = hziVar;
        }
        if ((i & 384) == 0) {
            dmpgVar2 = dmpgVar;
            i2 |= true != b.D(dmpgVar2) ? 128 : 256;
        } else {
            dmpgVar2 = dmpgVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            dmpiVar2 = dmpiVar;
            i2 |= true != b.D(dmpiVar2) ? 8192 : 16384;
        } else {
            dmpiVar2 = dmpiVar;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            b.v(-716773943);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            int i4 = huo.a;
            hus husVar = hum.o;
            hve hveVar = hvi.e;
            ipn a = ebm.a(dxu.a, husVar, b, 48);
            int a2 = hey.a(b);
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
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            int i6 = i2;
            ebr ebrVar = ebr.a;
            ebv.a(ebs.o(hvi.e, 16.0f), b);
            b.v(-553287093);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffji() { // from class: dmrk
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        hzo hzoVar = (hzo) obj;
                        hzoVar.getClass();
                        hho.this.b(Boolean.valueOf(hzoVar.b()));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            int i7 = i6 << 3;
            dmmi.o(ebrVar, dmmsVar, hziVar2, dmpgVar2, f, (ffji) R2, dmpiVar2, b, ((i6 << 12) & 234881024) | (i7 & 57344) | (i7 & 112) | 196614 | (i7 & 896) | (i7 & 7168), 96);
            dmmp dmmpVar = dmmsVar.a;
            b.v(-553281392);
            dmqe dmqeVar = dmmpVar.f;
            if (dmqeVar != null) {
                hvi i8 = eba.i(ebs.e(hvi.e, 48.0f), 16.0f, 0.0f, 2);
                ipn a3 = dyc.a(hum.e, false);
                int a4 = hey.a(b);
                hqb ai2 = hfmVar.ai();
                hvi b3 = huz.b(b, i8);
                ffix ffixVar2 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar2);
                } else {
                    b.z();
                }
                hlc.b(b, a3, iss.e);
                hlc.b(b, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                    Integer valueOf2 = Integer.valueOf(a4);
                    hfmVar.ad(valueOf2);
                    b.h(valueOf2, ffjmVar2);
                }
                hlc.b(b, b3, iss.c);
                dmmi.d(dmqeVar, 12, b, 48, 0);
                b.n();
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmrl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    hzi hziVar3 = hziVar;
                    dmpg dmpgVar3 = dmpgVar;
                    float f2 = f;
                    dmro.a(dmmsVar2, hziVar3, dmpgVar3, f2, dmpiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmms dmmsVar, final dmpg dmpgVar, final float f, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-410429381);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmpgVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.A(f) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            gpa.c(null, eqm.a, dmmi.q(false, false, true, dmmsVar.d.g.b, dmpgVar, f, dmrq.VOICE_BUTTON_BACKGROUND_DEFAULT, true, b), 0L, 0.0f, 0.0f, null, hpx.d(1314578560, new dmrm(dmmsVar), b), b, 121);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmrj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    dmpg dmpgVar2 = dmpgVar;
                    int i4 = i;
                    dmro.b(dmmsVar2, dmpgVar2, f, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(dmms dmmsVar, dmpg dmpgVar, float f, final hvi hviVar, final hzi hziVar, final dmpi dmpiVar, hfd hfdVar, final int i) {
        int i2;
        hzi hziVar2;
        dmpi dmpiVar2;
        dmms dmmsVar2;
        hfd hfdVar2;
        final dmpg dmpgVar2 = dmpgVar;
        final float f2 = f;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-320620138);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmpgVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.A(f2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            hziVar2 = hziVar;
            i2 |= true != b.D(hziVar2) ? 8192 : 16384;
        } else {
            hziVar2 = hziVar;
        }
        if ((196608 & i) == 0) {
            dmpiVar2 = dmpiVar;
            i2 |= true != b.D(dmpiVar2) ? 65536 : 131072;
        } else {
            dmpiVar2 = dmpiVar;
        }
        int i4 = i2;
        if ((74899 & i4) == 74898 && b.I()) {
            b.s();
            dmmsVar2 = dmmsVar;
            hfdVar2 = b;
        } else {
            hvi d = eba.d(hviVar, 8.0f);
            int i5 = huo.a;
            ipn a = ebm.a(dxu.a, hum.o, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
            int i6 = ist.a;
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
            ebr ebrVar = ebr.a;
            dmrn dmrnVar = new dmrn(dmmsVar, f2, dmpgVar2, hziVar2, dmpiVar2);
            dmmsVar2 = dmmsVar;
            hfdVar2 = b;
            dmkw.a(ebrVar, dmpgVar, f, hpx.d(-1887742381, dmrnVar, b), hfdVar2, (i4 & 112) | 3078 | (i4 & 896));
            f2 = f;
            dmpgVar2 = dmpgVar;
            ebv.a(ebs.o(hvi.e, 8.0f), hfdVar2);
            hun hunVar = hum.k;
            hve hveVar = hvi.e;
            ipn a3 = dyo.a(dxu.c, hunVar, hfdVar2, 48);
            int a4 = hey.a(hfdVar2);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(hfdVar2, hveVar);
            ffix ffixVar2 = iss.a;
            hfdVar2.x();
            if (hfmVar.z) {
                hfdVar2.j(ffixVar2);
            } else {
                hfdVar2.z();
            }
            hlc.b(hfdVar2, a3, iss.e);
            hlc.b(hfdVar2, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfmVar.ad(valueOf2);
                hfdVar2.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar2, b3, iss.c);
            b(dmmsVar2, dmpgVar2, f2, hfdVar2, i4 & 1022);
            hfdVar2.n();
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            final dmms dmmsVar3 = dmmsVar2;
            L.d = new ffjm() { // from class: dmri
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar4 = dmms.this;
                    dmpg dmpgVar3 = dmpgVar2;
                    float f3 = f2;
                    hvi hviVar2 = hviVar;
                    hzi hziVar3 = hziVar;
                    dmro.c(dmmsVar4, dmpgVar3, f3, hviVar2, hziVar3, dmpiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
