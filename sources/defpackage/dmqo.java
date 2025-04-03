package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmqo {
    public static final void a(final dmms dmmsVar, final dmov dmovVar, final dmnh dmnhVar, final dmpg dmpgVar, final float f, final boolean z, final boolean z2, final hvi hviVar, final hzi hziVar, final dmpi dmpiVar, hfd hfdVar, final int i) {
        int i2;
        dmpg dmpgVar2;
        hfd hfdVar2;
        hfm hfmVar;
        boolean z3;
        hvi k;
        hfd hfdVar3;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-719282317);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmovVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmnhVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            dmpgVar2 = dmpgVar;
            i2 |= true != b.D(dmpgVar2) ? 1024 : 2048;
        } else {
            dmpgVar2 = dmpgVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.A(f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.E(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.E(z2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.D(hviVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b.D(hziVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != b.D(dmpiVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((306783379 & i2) == 306783378 && b.I()) {
            b.s();
            hfdVar3 = b;
        } else {
            b.v(-272519432);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar2.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar2.Z();
            b.v(-272517697);
            if (((Boolean) hhoVar.a()).booleanValue()) {
                dmsk dmskVar = dmnhVar.b;
                if (dmskVar == null) {
                    throw new IllegalArgumentException("No way to handle recording events.");
                }
                hfmVar = hfmVar2;
                dmqd.j(dmskVar.a, dmskVar.c, dmpgVar2, f, hviVar, b, ((i2 >> 3) & 8064) | ((i2 >> 9) & 57344));
                hfdVar2 = b;
            } else {
                hfdVar2 = b;
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            if (((Boolean) hhoVar.a()).booleanValue()) {
                z3 = true;
                k = ebs.k(hvi.e, 0.0f);
            } else {
                z3 = true;
                k = eba.i(hviVar, 0.0f, 8.0f, 1);
            }
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar2, 0);
            int a2 = hey.a(hfdVar2);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(hfdVar2, k);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar2.x();
            if (hfmVar.z) {
                hfdVar2.j(ffixVar);
            } else {
                hfdVar2.z();
            }
            hlc.b(hfdVar2, a, iss.e);
            hlc.b(hfdVar2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                hfdVar2.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar2, b2, iss.c);
            hus husVar = hum.o;
            hve hveVar = hvi.e;
            ipn a3 = ebm.a(dxu.a, husVar, hfdVar2, 48);
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
            dmmp dmmpVar = dmmsVar.a;
            hfdVar2.v(-1914437439);
            CharSequence charSequence = dmmpVar.b;
            boolean D = hfdVar2.D(charSequence);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                hic hicVar2 = new hic(false, hla.a);
                hfmVar.ad(hicVar2);
                R2 = hicVar2;
            }
            final hho hhoVar2 = (hho) R2;
            hfmVar.Z();
            hfdVar2.v(-1914434954);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                hic hicVar3 = new hic(false, hla.a);
                hfmVar.ad(hicVar3);
                R3 = hicVar3;
            }
            hho hhoVar3 = (hho) R3;
            hfmVar.Z();
            boolean z4 = (charSequence.length() <= 0 || ((Boolean) hhoVar2.a()).booleanValue()) ? false : z3;
            hfdVar2.v(-1914430609);
            boolean D2 = hfdVar2.D(hhoVar2);
            Object R4 = hfmVar.R();
            if (D2 || R4 == hfc.a) {
                R4 = new ffix() { // from class: dmqk
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        hho.this.b(true);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            hfd hfdVar4 = hfdVar2;
            c(z4, (ffix) R4, dmnhVar, ((Boolean) hhoVar3.a()).booleanValue(), dmmsVar, dmpiVar, hfdVar4, (57344 & (i2 << 12)) | (i2 & 896) | (458752 & (i2 >> 12)));
            int i6 = i2 >> 6;
            hfdVar3 = hfdVar4;
            dmkt.a(dmmsVar.c, dmpgVar, f, false, hpx.d(-1843359870, new dmqn(dmmsVar, z, dmpgVar, f, hziVar, dmpiVar, dmovVar, dmnhVar, hhoVar, z2, hhoVar3), hfdVar4), hfdVar3, (i6 & 112) | 24576 | (i6 & 896), 8);
            hfdVar3.n();
            hfdVar3.n();
        }
        hio L = hfdVar3.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmql
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    dmov dmovVar2 = dmovVar;
                    dmnh dmnhVar2 = dmnhVar;
                    dmpg dmpgVar3 = dmpgVar;
                    float f2 = f;
                    boolean z5 = z;
                    boolean z6 = z2;
                    hvi hviVar2 = hviVar;
                    hzi hziVar2 = hziVar;
                    dmqo.a(dmmsVar2, dmovVar2, dmnhVar2, dmpgVar3, f2, z5, z6, hviVar2, hziVar2, dmpiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmms dmmsVar, final dmov dmovVar, final dmnh dmnhVar, final hho hhoVar, final boolean z, final dmpg dmpgVar, final dmpi dmpiVar, hfd hfdVar, final int i) {
        int i2;
        dmms dmmsVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2004228756);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmovVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmnhVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hhoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.E(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(dmpgVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(dmpiVar) ? 524288 : 1048576;
        }
        if ((599187 & i2) == 599186 && b.I()) {
            b.s();
            dmmsVar2 = dmmsVar;
        } else {
            int i4 = i2 << 3;
            int i5 = i2 >> 12;
            int i6 = i2 >> 3;
            int i7 = (i6 & 112) | 6;
            b.v(199161015);
            int i8 = i5 & 896;
            int i9 = 458752 & i4;
            int i10 = i4 & 3670016;
            if (dmnhVar.f) {
                dmmi.g(dmnc.d, dmnhVar, dmpiVar, false, null, z, dmpgVar, 0.0f, null, b, i7 | i8 | i9 | i10, 408);
                int i11 = huo.a;
                hun hunVar = hum.k;
                hve hveVar = hvi.e;
                ipn a = dyo.a(dxu.c, hunVar, b, 48);
                int a2 = hey.a(b);
                hfm hfmVar = (hfm) b;
                hqb ai = hfmVar.ai();
                hvi b2 = huz.b(b, hveVar);
                int i12 = ist.a;
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
                dmmi.d(dmmsVar.a.f, 0, b, 0, 2);
                dmob.c(dmmsVar.d, false, false, null, b, 0, 14);
                b.n();
                hfmVar.Z();
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: dmqg
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dmms dmmsVar3 = dmms.this;
                            dmov dmovVar2 = dmovVar;
                            dmnh dmnhVar2 = dmnhVar;
                            hho hhoVar2 = hhoVar;
                            boolean z2 = z;
                            dmpg dmpgVar2 = dmpgVar;
                            dmqo.b(dmmsVar3, dmovVar2, dmnhVar2, hhoVar2, z2, dmpgVar2, dmpiVar, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            dmmsVar2 = dmmsVar;
            hfm hfmVar2 = (hfm) b;
            hfmVar2.Z();
            int i13 = i7 | i8;
            dmou.a(dmovVar, b, i6 & 14);
            dmmi.g(dmnc.d, dmnhVar, dmpiVar, false, null, z, dmpgVar, 0.0f, null, b, i13 | i9 | i10, 408);
            if ((!dmmsVar2.d.g.a || dmmsVar2.a()) && !((Boolean) hhoVar.a()).booleanValue()) {
                b.v(1879976832);
                int i14 = huo.a;
                hun hunVar2 = hum.k;
                hve hveVar2 = hvi.e;
                ipn a3 = dyo.a(dxu.c, hunVar2, b, 48);
                int a4 = hey.a(b);
                hqb ai2 = hfmVar2.ai();
                hvi b3 = huz.b(b, hveVar2);
                int i15 = ist.a;
                ffix ffixVar2 = iss.a;
                b.x();
                if (hfmVar2.z) {
                    b.j(ffixVar2);
                } else {
                    b.z();
                }
                hlc.b(b, a3, iss.e);
                hlc.b(b, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a4))) {
                    Integer valueOf2 = Integer.valueOf(a4);
                    hfmVar2.ad(valueOf2);
                    b.h(valueOf2, ffjmVar2);
                }
                hlc.b(b, b3, iss.c);
                dmmi.d(dmmsVar2.a.f, 0, b, 0, 2);
                dmob.c(dmmsVar2.d, false, false, null, b, 0, 14);
                b = b;
                b.n();
                hfmVar2.Z();
            } else {
                b.v(1879809339);
                dmmi.g(dmnc.f, dmnhVar, dmpiVar, false, hhoVar, false, null, 0.0f, null, b, i13 | (57344 & i4), 488);
                hfmVar2.Z();
            }
        }
        hio L2 = b.L();
        if (L2 != null) {
            final dmms dmmsVar3 = dmmsVar2;
            L2.d = new ffjm() { // from class: dmqh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar4 = dmms.this;
                    dmov dmovVar2 = dmovVar;
                    dmnh dmnhVar2 = dmnhVar;
                    hho hhoVar2 = hhoVar;
                    boolean z2 = z;
                    dmpg dmpgVar2 = dmpgVar;
                    dmqo.b(dmmsVar4, dmovVar2, dmnhVar2, hhoVar2, z2, dmpgVar2, dmpiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final ffix ffixVar, final dmnh dmnhVar, final boolean z2, final dmms dmmsVar, final dmpi dmpiVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-883297753);
        hfm hfmVar = (hfm) b;
        int i3 = hfmVar.z ? -hfmVar.u.s : hfmVar.s.h;
        if ((i & 6) == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmnhVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(dmpiVar) ? 65536 : 131072;
        }
        if ((66707 & i2) == 66706 && b.I()) {
            b.s();
        } else {
            int i4 = i2 >> 3;
            hvi i5 = eba.i(hvi.e, 4.0f, 0.0f, 2);
            if (z2) {
                i5 = i5.a(cry.b(hvi.e));
            }
            dxi dxiVar = dxu.a;
            int i6 = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, b, 0);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, i5);
            int i7 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
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
            b.v(-556950310);
            if (!z || dmnhVar.f) {
                int i8 = (i4 & 112) | 6;
                b.v(-556666816);
                b.v(120590399);
                int i9 = (i2 >> 9) & 896;
                if (dmnhVar.f) {
                    int i10 = i8 | i9;
                    int i11 = i3;
                    dmmi.g(dmnc.c, dmnhVar, dmpiVar, false, null, false, null, 0.0f, null, b, i10, 504);
                    if (i11 >= 0) {
                        if (hfmVar.z) {
                            hjv hjvVar = hfmVar.u;
                            while (hfmVar.z) {
                                hfmVar.Y(hjvVar.T(hjvVar.s));
                            }
                        }
                        hjq hjqVar = hfmVar.s;
                        while (true) {
                            int i12 = hjqVar.h;
                            if (i12 <= i11) {
                                break;
                            } else {
                                hfmVar.Y(hjqVar.B(i12));
                            }
                        }
                    } else {
                        int i13 = -i11;
                        hjv hjvVar2 = hfmVar.u;
                        while (true) {
                            int i14 = hjvVar2.s;
                            if (i14 <= i13) {
                                break;
                            } else {
                                hfmVar.Y(hjvVar2.T(i14));
                            }
                        }
                    }
                    hio L = b.L();
                    if (L != null) {
                        L.d = new ffjm() { // from class: dmqi
                            @Override // defpackage.ffjm
                            public final Object a(Object obj, Object obj2) {
                                ((Integer) obj2).intValue();
                                boolean z3 = z;
                                ffix ffixVar3 = ffixVar;
                                dmnh dmnhVar2 = dmnhVar;
                                boolean z4 = z2;
                                dmms dmmsVar2 = dmmsVar;
                                dmqo.c(z3, ffixVar3, dmnhVar2, z4, dmmsVar2, dmpiVar, (hfd) obj, hip.a(i | 1));
                                return ffcu.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                hfmVar.Z();
                int i15 = i8 | i9;
                dmmi.g(dmnc.e, dmnhVar, dmpiVar, false, null, false, null, 0.0f, null, b, i15, 504);
                dmmi.g(dmnc.c, dmnhVar, dmpiVar, false, null, false, null, 0.0f, null, b, i15, 504);
                hfmVar.Z();
            } else {
                b.v(-556915963);
                dwhl.b(ffixVar, null, false, null, null, dmkq.a, b, (i4 & 14) | 1572864, 62);
                b = b;
                hfmVar.Z();
            }
            hfmVar.Z();
            b.n();
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: dmqj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z3 = z;
                    ffix ffixVar3 = ffixVar;
                    dmnh dmnhVar2 = dmnhVar;
                    boolean z4 = z2;
                    dmms dmmsVar2 = dmmsVar;
                    dmqo.c(z3, ffixVar3, dmnhVar2, z4, dmmsVar2, dmpiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
