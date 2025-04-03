package defpackage;

import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnav {
    public static final void a(final ffix ffixVar, final String str, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        long f;
        hfm hfmVar;
        long f2;
        int i3 = i & 6;
        hfd b = hfdVar.b(552974201);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.v(-1234139924);
            int i4 = i2 & 14;
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (i4 == 4 || R == hfc.a) {
                R = new dnaq(ffixVar);
                hfmVar2.ad(R);
            }
            hfmVar2.Z();
            hvi a = ilv.a(hviVar, ffixVar, (PointerInputEventHandler) R);
            int i5 = huo.a;
            ipn a2 = dyc.a(hum.e, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, a);
            int i6 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar2);
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
            hlc.b(b, b2, iss.c);
            dyi dyiVar = dyi.a;
            c = ebs.c(hvi.e, 1.0f);
            hvi a4 = dyiVar.a(c, hum.e);
            ipn a5 = dyo.a(dxu.e, hum.k, b, 54);
            int a6 = hey.a(b);
            hqb ai2 = hfmVar2.ai();
            hvi b3 = huz.b(b, a4);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfmVar2.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            hvi k = ebs.k(hvi.e, 48.0f);
            f = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), 0.3f, ibw.f(ibw.a));
            hvi a7 = dee.a(k, f, eqm.a);
            ipn a8 = dyc.a(hum.e, false);
            int a9 = hey.a(b);
            hqb ai3 = hfmVar2.ai();
            hvi b4 = huz.b(b, a7);
            ffix ffixVar4 = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar4);
            } else {
                b.z();
            }
            hlc.b(b, a8, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a9))) {
                Integer valueOf3 = Integer.valueOf(a9);
                hfmVar2.ad(valueOf3);
                b.h(valueOf3, ffjmVar3);
            }
            hlc.b(b, b4, iss.c);
            dwho.a(dnaa.a(dmzz.eu, b), null, ebs.k(hvi.e, 24.0f), ibw.d, b, 3456, 0);
            b.n();
            b.v(425780591);
            if (str != null) {
                ebv.a(ebs.e(hvi.e, 4.0f), b);
                jpo jpoVar = gft.d(b).n;
                long j = ibw.d;
                hve hveVar = hvi.e;
                f2 = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), 0.3f, ibw.f(ibw.a));
                hfmVar = hfmVar2;
                dwjt.b(str, eba.e(dee.a(hveVar, f2, eqm.a(50)), 8.0f, 2.0f), j, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, jpoVar, b, ((i2 >> 3) & 14) | 384, 0, 65016);
                b = b;
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnam
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar5 = ffix.this;
                    String str2 = str;
                    int i7 = i;
                    dnav.a(ffixVar5, str2, hviVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final ffix ffixVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        int i3 = i & 6;
        hfd b = hfdVar.b(721514269);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i4 = huo.a;
            ipn a = dyc.a(hum.i, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
            int i5 = ist.a;
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
            hvi j = eba.j(ebs.m(hvi.e, 56.0f, 50.0f), 0.0f, 0.0f, 8.0f, 2.0f, 3);
            b.v(-1200379302);
            int i6 = i2 & 14;
            Object R = hfmVar.R();
            if (i6 == 4 || R == hfc.a) {
                R = new dnas(ffixVar);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi a3 = ilv.a(j, ffixVar, (PointerInputEventHandler) R);
            ipn a4 = dyc.a(hum.e, false);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, a3);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
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
            hvi m = ebs.m(hvi.e, 32.0f, 20.0f);
            f = iby.f(ibw.d(r4), ibw.c(r4), ibw.b(r4), 0.3f, ibw.f(ibw.a));
            dwho.a(dnaa.a(dmzz.et, b), jii.a(R.string.masked_glide_image_toggle, b), dee.a(m, f, eqm.a(50)), ibw.d, b, 3072, 0);
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnao
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar4 = ffix.this;
                    int i7 = i;
                    dnav.b(ffixVar4, hviVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final Uri uri, final String str, final hvi hviVar, final Uri uri2, final Uri uri3, huo huoVar, final inp inpVar, inp inpVar2, float f, final Integer num, final Integer num2, final dnal dnalVar, final rdi rdiVar, ffix ffixVar, final String str2, final ffix ffixVar2, boolean z, hfd hfdVar, final int i, final int i2, final int i3) {
        int i4;
        Uri uri4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        hvi hviVar2;
        hvi d;
        long f2;
        boolean z4;
        hfd hfdVar2;
        final ffix ffixVar3;
        final huo huoVar2;
        final inp inpVar3;
        final boolean z5;
        final float f3;
        hvi c;
        hvi c2;
        hvi a;
        hvi a2;
        hfd b = hfdVar.b(-1407448235);
        if ((i & 6) == 0) {
            i4 = (true != b.F(uri) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            uri4 = uri2;
            i4 |= true != b.F(uri4) ? 1024 : 2048;
        } else {
            uri4 = uri2;
        }
        if ((i & 24576) == 0) {
            i4 |= true != b.F(uri3) ? 8192 : 16384;
        }
        int i7 = i4 | 1769472;
        if ((i & 12582912) == 0) {
            i5 = 12582912;
            i7 |= true != b.D(inpVar) ? 4194304 : 8388608;
        } else {
            i5 = 12582912;
        }
        int i8 = i2 | 6;
        if ((i2 & 48) == 0) {
            i8 |= true != b.D(num) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i8 |= true != b.D(num2) ? 128 : 256;
        }
        int i9 = 1797120 | i8;
        if ((i2 & i5) == 0) {
            z2 = true;
            i9 |= true == ((i2 & 16777216) == 0 ? b.D(dnalVar) : b.F(dnalVar)) ? 8388608 : 4194304;
        } else {
            z2 = true;
        }
        if ((i2 & 100663296) == 0) {
            i9 |= z2 != b.F(rdiVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i2 & 805306368) == 0) {
            i9 |= true != b.F(ffixVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i10 = i9;
        if ((i3 & 6) == 0) {
            z3 = true;
            i6 = i3 | (true != b.D(str2) ? 2 : 4);
        } else {
            z3 = true;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= z3 == b.F(ffixVar2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= z3 == b.E(z) ? 256 : 128;
        }
        int i11 = 905969664 | i7;
        if ((i11 & 306783379) == 306783378 && (i10 & 306783379) == 306783378 && (i6 & 147) == 146 && b.I()) {
            b.s();
            huoVar2 = huoVar;
            f3 = f;
            ffixVar3 = ffixVar;
            z5 = z;
            hfdVar2 = b;
            inpVar3 = inpVar2;
        } else {
            int i12 = huo.a;
            huo huoVar3 = hum.e;
            inp inpVar4 = ino.a;
            if (z) {
                hve hveVar = hvi.e;
                hveVar.getClass();
                hviVar2 = hviVar.a(huz.g(hveVar, new doap()));
            } else {
                hviVar2 = hviVar;
            }
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(b);
            hfm hfmVar = (hfm) b;
            int i13 = i6;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar2);
            int i14 = ist.a;
            ffix ffixVar4 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar4);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dyi dyiVar = dyi.a;
            hkx b3 = cxo.b((ffixVar2 != null || z) ? 80.0f : 0.0f, null, b, 384, 10);
            d = ebs.d(hvi.e, 1.0f);
            if (Build.VERSION.SDK_INT >= 31) {
                b.v(-807260532);
                if (ffixVar2 != null) {
                    z4 = z;
                } else if (z) {
                    z4 = true;
                } else {
                    z4 = false;
                    hfmVar.Z();
                }
                a = hxg.a(hvi.e, d(b3), r6, new hxh(hxh.a).b);
                a2 = dee.a(a, gft.a(b).v, idb.a);
                d = d.a(a2);
                hfmVar.Z();
            } else {
                b.v(-807031876);
                f2 = iby.f(ibw.d(r12), ibw.c(r12), ibw.b(r12), d(b3) / 80.0f, ibw.f(gft.a(b).v));
                d = d.a(new hva("com.google.android.libraries.communications.ux.components.image.foreground", new ibw(f2), new dnau(f2)));
                hfmVar.Z();
                z4 = z;
            }
            dnac.a(uri, str, d, uri4, uri3, huoVar3, inpVar, inpVar4, 1.0f, num, num2, null, null, null, dnalVar, rdiVar, b, i11 & 2147482750, i10 & 268435454, 0);
            hfdVar2 = b;
            hfdVar2.v(389633650);
            if (ffixVar2 != null) {
                c2 = ebs.c(hvi.e, 1.0f);
                a(ffixVar2, str2, c2, hfdVar2, 384 | ((i13 >> 3) & 14) | ((i13 << 3) & 112));
            }
            hfmVar.Z();
            hfdVar2.v(389637808);
            if (ffixVar != null) {
                c = ebs.c(hvi.e, 1.0f);
                ffixVar3 = ffixVar;
                b(ffixVar3, dyiVar.a(c, hum.i), hfdVar2, (i10 >> 27) & 14);
            } else {
                ffixVar3 = ffixVar;
            }
            hfmVar.Z();
            hfdVar2.n();
            huoVar2 = huoVar3;
            inpVar3 = inpVar4;
            z5 = z4;
            f3 = 1.0f;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnan
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Uri uri5 = uri;
                    String str3 = str;
                    hvi hviVar3 = hviVar;
                    Uri uri6 = uri2;
                    Uri uri7 = uri3;
                    huo huoVar4 = huoVar2;
                    inp inpVar5 = inpVar;
                    inp inpVar6 = inpVar3;
                    float f4 = f3;
                    Integer num3 = num;
                    Integer num4 = num2;
                    dnal dnalVar2 = dnalVar;
                    rdi rdiVar2 = rdiVar;
                    ffix ffixVar5 = ffixVar3;
                    String str4 = str2;
                    int i15 = i;
                    ffix ffixVar6 = ffixVar2;
                    int i16 = i2;
                    int a5 = hip.a(i15 | 1);
                    int a6 = hip.a(i16);
                    dnav.c(uri5, str3, hviVar3, uri6, uri7, huoVar4, inpVar5, inpVar6, f4, num3, num4, dnalVar2, rdiVar2, ffixVar5, str4, ffixVar6, z5, (hfd) obj, a5, a6, hip.a(i3));
                    return ffcu.a;
                }
            };
        }
    }

    private static final float d(hkx hkxVar) {
        return ((jzq) hkxVar.a()).a;
    }
}
