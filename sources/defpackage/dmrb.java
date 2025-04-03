package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrb {
    public static final void a(dmms dmmsVar, final dmov dmovVar, dmnh dmnhVar, final boolean z, final dmpg dmpgVar, final float f, final hzi hziVar, dmpi dmpiVar, hfd hfdVar, final int i) {
        int i2;
        dmpg dmpgVar2;
        float f2;
        hfm hfmVar;
        hvi a;
        final dmms dmmsVar2 = dmmsVar;
        dmnh dmnhVar2 = dmnhVar;
        dmpi dmpiVar2 = dmpiVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1134096636);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmovVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmnhVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            dmpgVar2 = dmpgVar;
            i2 |= true != b.D(dmpgVar2) ? 8192 : 16384;
        } else {
            dmpgVar2 = dmpgVar;
        }
        if ((196608 & i) == 0) {
            f2 = f;
            i2 |= true != b.A(f2) ? 65536 : 131072;
        } else {
            f2 = f;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(hziVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.D(dmpiVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i4 = i2;
        if ((i4 & 4793491) == 4793490 && b.I()) {
            b.s();
        } else {
            int i5 = i4 >> 15;
            int i6 = i4 >> 3;
            int i7 = huo.a;
            hus husVar = hum.o;
            hve hveVar = hvi.e;
            ipn a2 = ebm.a(dxu.a, husVar, b, 48);
            int a3 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, hveVar);
            int i8 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            int i9 = i6 & 112;
            int i10 = i9 | 3078;
            int i11 = i5 & 896;
            hlc.b(b, b2, iss.c);
            boolean z2 = dmnhVar2.f;
            ebr ebrVar = ebr.a;
            if (z2 || (dmpiVar2.f && dmnhVar2.d == null)) {
                hfmVar = hfmVar2;
                b.v(31097606);
                ebv.a(ebs.o(hvi.e, 16.0f), b);
                hfmVar.Z();
            } else {
                b.v(31160381);
                hfmVar = hfmVar2;
                dmmi.g(dmnc.e, dmnhVar2, dmpiVar2, true, null, false, null, 0.0f, null, b, i10 | i11, 496);
                hfmVar.Z();
            }
            a = ebrVar.a(hvi.e, 1.0f, true);
            hvi u = ebs.u(a, dmkx.a(b), 0.0f, 2);
            ipn a4 = dyc.a(hum.d, false);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, u);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            hve hveVar2 = hvi.e;
            ipn a6 = ebm.a(dxu.a, hum.m, b, 0);
            int a7 = hey.a(b);
            hqb ai3 = hfmVar.ai();
            hvi b4 = huz.b(b, hveVar2);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a6, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf3 = Integer.valueOf(a7);
                hfmVar.ad(valueOf3);
                b.h(valueOf3, ffjmVar3);
            }
            hlc.b(b, b4, iss.c);
            int i12 = i4 << 3;
            int i13 = i10 | i11;
            dmmsVar2 = dmmsVar;
            dmmi.o(ebr.a, dmmsVar2, hziVar, dmpgVar2, f2, null, dmpiVar, b, (i6 & 7168) | (i12 & 112) | 6 | ((i4 >> 12) & 896) | (57344 & i6) | (i12 & 234881024), 112);
            b.n();
            b.n();
            int i14 = i4 << 6;
            int i15 = (458752 & i14) | i13 | (i14 & 3670016);
            dmnhVar2 = dmnhVar;
            dmpiVar2 = dmpiVar;
            dmmi.g(dmnc.d, dmnhVar2, dmpiVar2, true, null, z, dmpgVar, 0.0f, null, b, i15, 400);
            f(dmmsVar2, dmnhVar2, dmpiVar2, b, (i4 & 14) | i9 | i11);
            dmou.a(dmovVar, b, i6 & 14);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            final dmnh dmnhVar3 = dmnhVar2;
            final dmpi dmpiVar3 = dmpiVar2;
            L.d = new ffjm() { // from class: dmqu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar3 = dmms.this;
                    dmov dmovVar2 = dmovVar;
                    dmnh dmnhVar4 = dmnhVar3;
                    boolean z3 = z;
                    dmpg dmpgVar3 = dmpgVar;
                    float f3 = f;
                    hzi hziVar2 = hziVar;
                    dmrb.a(dmmsVar3, dmovVar2, dmnhVar4, z3, dmpgVar3, f3, hziVar2, dmpiVar3, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmms dmmsVar, final dmnh dmnhVar, final dmpg dmpgVar, final float f, final hho hhoVar, hfd hfdVar, final int i) {
        int i2;
        dmnh dmnhVar2;
        float f2;
        hho hhoVar2;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(1544238733);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            dmnhVar2 = dmnhVar;
            i2 |= true != b.D(dmnhVar2) ? 16 : 32;
        } else {
            dmnhVar2 = dmnhVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmpgVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            f2 = f;
            i2 |= true != b.A(f2) ? 1024 : 2048;
        } else {
            f2 = f;
        }
        if ((i & 24576) == 0) {
            hhoVar2 = hhoVar;
            i2 |= true != b.D(hhoVar2) ? 8192 : 16384;
        } else {
            hhoVar2 = hhoVar;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            int i4 = huo.a;
            hun hunVar = hum.k;
            hve hveVar = hvi.e;
            ipn a = dyo.a(dxu.c, hunVar, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dmml dmmlVar = dmmsVar.e;
            b.v(1142518931);
            if (dmmlVar != null) {
                String str = dmmlVar.a;
                hfmVar = hfmVar2;
                dmmi.e(str, dmpgVar, null, true, b, ((i2 >> 3) & 112) | 3072, 4);
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            dmmp dmmpVar = dmmsVar.a;
            b.v(1142524799);
            dmqe dmqeVar = dmmpVar.f;
            if (dmqeVar != null) {
                dmmi.d(dmqeVar, 12, b, 48, 0);
                ebv.a(ebs.e(hvi.e, 4.0f), b);
            }
            hfmVar.Z();
            c(dmmsVar, dmnhVar2, dmpgVar, f2, hhoVar2, b, i2 & 65534);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmqs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    dmnh dmnhVar3 = dmnhVar;
                    dmpg dmpgVar2 = dmpgVar;
                    float f3 = f;
                    dmrb.b(dmmsVar2, dmnhVar3, dmpgVar2, f3, hhoVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dmms dmmsVar, final dmnh dmnhVar, final dmpg dmpgVar, final float f, final hho hhoVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2049166182);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmnhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmpgVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(hhoVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            dmof dmofVar = dmmsVar.d;
            b.v(-553337912);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new hic(Boolean.valueOf(dmmsVar.a()), hla.a);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            boolean z = true;
            boolean z2 = dmnhVar.f;
            boolean booleanValue = ((Boolean) ((hho) R).a()).booleanValue();
            dmof dmofVar2 = dmmsVar.d;
            dmng dmngVar = dmnhVar.h;
            dmsk dmskVar = dmnhVar.b;
            if (dmskVar != null) {
                z = dmskVar.b;
            }
            long q = dmmi.q(z2, dmofVar.g.a, booleanValue, dmofVar2.g.b, dmpgVar, f, dmngVar.a, z, b);
            b.v(-553319790);
            if (dmnhVar.h.c) {
                dooq dooqVar = dooy.c(b).q;
                q = ((ibw) cwo.b(q, cxu.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, dooy.c(b).r.d, 2), b, 0, 12).a()).i;
            }
            hfmVar.Z();
            gpa.c(null, eqm.a, q, 0L, 0.0f, 0.0f, null, hpx.d(-889257365, new dmqv(dmmsVar, dmnhVar, hhoVar), b), b, 121);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmqr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    dmnh dmnhVar2 = dmnhVar;
                    dmpg dmpgVar2 = dmpgVar;
                    float f2 = f;
                    dmrb.c(dmmsVar2, dmnhVar2, dmpgVar2, f2, hhoVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dmms dmmsVar, final dmnh dmnhVar, final dmov dmovVar, final hzi hziVar, final boolean z, final dmpg dmpgVar, final float f, final boolean z2, final dmpi dmpiVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1550743378);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmnhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmovVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hziVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.E(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(dmpgVar) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i2 |= true != b.A(f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.E(z2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b.D(dmpiVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i2) == 38347922 && b.I()) {
            b.s();
        } else {
            b.v(496557440);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = ffkj.e(hziVar, hzi.a) ? new hzi() : hziVar;
                hfmVar.ad(R);
            }
            hzi hziVar2 = (hzi) R;
            hfmVar.Z();
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            int i5 = i2;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
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
            int i7 = i5 >> 12;
            dmmi.h(dmmsVar.c, null, f, true, b, (i7 & 896) | 3120, 0);
            dmmi.b(dmmsVar.b, z, dmpgVar, f, b, (i5 >> 9) & 8176);
            int i8 = i5 >> 3;
            a(dmmsVar, dmovVar, dmnhVar, z2, dmpgVar, f, hziVar2, dmpiVar, b, (i7 & 7168) | (i5 & 14) | 1572864 | (i8 & 112) | ((i5 << 3) & 896) | (57344 & i8) | (458752 & i8) | (29360128 & i8));
            b = b;
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmqq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    dmnh dmnhVar2 = dmnhVar;
                    dmov dmovVar2 = dmovVar;
                    hzi hziVar3 = hziVar;
                    boolean z3 = z;
                    dmpg dmpgVar2 = dmpgVar;
                    float f2 = f;
                    boolean z4 = z2;
                    dmrb.d(dmmsVar2, dmnhVar2, dmovVar2, hziVar3, z3, dmpgVar2, f2, z4, dmpiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dmms dmmsVar, final dmov dmovVar, final dmnh dmnhVar, final dmpg dmpgVar, final float f, final boolean z, final hvi hviVar, final hzi hziVar, final boolean z2, final dmpi dmpiVar, hfd hfdVar, final int i) {
        int i2;
        dmpg dmpgVar2;
        float f2;
        hfm hfmVar;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-407077583);
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
            f2 = f;
            i2 |= true != b.A(f2) ? 8192 : 16384;
        } else {
            f2 = f;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.E(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(hviVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.D(hziVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b.E(z2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != b.D(dmpiVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i4 = i2;
        if ((306783379 & i4) == 306783378 && b.I()) {
            b.s();
        } else {
            b.v(-272492807);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar2.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar2.Z();
            b.v(-272491072);
            if (((Boolean) hhoVar.a()).booleanValue()) {
                dmsk dmskVar = dmnhVar.b;
                if (dmskVar == null) {
                    throw new IllegalArgumentException("No way to handle recording events.");
                }
                hfmVar = hfmVar2;
                dmqd.j(dmskVar.a, dmskVar.c, dmpgVar2, f2, hviVar, b, ((i4 >> 6) & 57344) | ((i4 >> 3) & 8064));
            } else {
                hfmVar = hfmVar2;
            }
            int i5 = i4 >> 3;
            int i6 = i4 >> 6;
            int i7 = i5 & 7168;
            int i8 = i5 & 896;
            hfmVar.Z();
            hvi k = ((Boolean) hhoVar.a()).booleanValue() ? ebs.k(hvi.e, 0.0f) : eba.d(hviVar, 8.0f);
            int i9 = huo.a;
            ipn a = ebm.a(dxu.a, hum.o, b, 48);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, k);
            int i10 = ist.a;
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
            b = b;
            dmkw.a(ebr.a, dmpgVar, f, hpx.d(-1170129708, new dmqw(dmmsVar, dmnhVar, dmovVar, hziVar, z, dmpgVar, f, z2, dmpiVar), b), b, (i6 & 112) | 3078 | (i6 & 896));
            ebv.a(ebs.o(hvi.e, 8.0f), b);
            b(dmmsVar, dmnhVar, dmpgVar, f, hhoVar, b, (i4 & 14) | 24576 | (i5 & 112) | i8 | i7);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmqt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    dmov dmovVar2 = dmovVar;
                    dmnh dmnhVar2 = dmnhVar;
                    dmpg dmpgVar3 = dmpgVar;
                    float f3 = f;
                    boolean z3 = z;
                    hvi hviVar2 = hviVar;
                    hzi hziVar2 = hziVar;
                    boolean z4 = z2;
                    dmrb.e(dmmsVar2, dmovVar2, dmnhVar2, dmpgVar3, f3, z3, hviVar2, hziVar2, z4, dmpiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final dmms dmmsVar, final dmnh dmnhVar, final dmpi dmpiVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2123332100);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmnhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmpiVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            boolean z = !dmnhVar.h.b ? dmmsVar.a.b.length() != 0 : ffkj.e(dmnhVar.a, dmnd.a) || dmnhVar.a == dmnc.d || dmmsVar.a.b.length() != 0;
            if (dmnhVar.h.c) {
                b.v(1545011950);
                doos c = dooy.c(b);
                b.v(1019669726);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    dooq dooqVar = c.q;
                    R = cxu.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, c.r.f, 2);
                    hfmVar.ad(R);
                }
                dbu dbuVar = (dbu) R;
                hfmVar.Z();
                b.v(1019675486);
                Object R2 = hfmVar.R();
                if (R2 == hfc.a) {
                    dooq dooqVar2 = c.q;
                    R2 = cxu.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, c.r.f, 2);
                    hfmVar.ad(R2);
                }
                dbu dbuVar2 = (dbu) R2;
                hfmVar.Z();
                int i4 = huo.a;
                cue j = ctt.j(dbuVar, hum.k, 8);
                dooq dooqVar3 = c.q;
                cue a = j.a(ctt.n(cxu.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, c.r.f, 2), 0.0f, 0L, 6));
                cug p = ctt.p(dbuVar2, hum.k, 8);
                dooq dooqVar4 = c.q;
                cru.b(z, null, a, p.a(ctt.o(cxu.c(100, 0, c.r.b, 2), 0.0f, 0L, 6)), null, hpx.d(1561954217, new dmra(dmnhVar, dmpiVar, dbuVar, dbuVar2), b), b, 196608, 18);
                hfmVar.Z();
            } else if (z) {
                b.v(1547954067);
                dmmi.g(dmnc.c, dmnhVar, dmpiVar, true, null, false, null, 0.0f, null, b, (i2 & 112) | 3078 | (i2 & 896), 496);
                ((hfm) b).Z();
            } else {
                b.v(1548091490);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmqp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    dmnh dmnhVar2 = dmnhVar;
                    int i5 = i;
                    dmrb.f(dmmsVar2, dmnhVar2, dmpiVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
