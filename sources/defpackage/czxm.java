package defpackage;

import android.text.SpannableStringBuilder;
import com.android.vcard.VCardConstants;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czxm {
    public static final void a(final ffix ffixVar, final hvi hviVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-909976578);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hvi h = ebs.h(hviVar, 48.0f);
            b.v(1437543118);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi j = eba.j(dfb.c(h, (dwn) R, fmn.a(false, 18.0f, 4), false, null, new jjj(0), ffixVar, 12), 0.0f, 18.0f, 16.0f, 0.0f, 9);
            int i5 = huo.a;
            ipn a = dyc.a(hum.c, false);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i6 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            ffjmVar.a(b, Integer.valueOf((i4 >> 6) & 14));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: czxh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    hvi hviVar2 = hviVar;
                    int i7 = i;
                    czxm.a(ffixVar3, hviVar2, ffjmVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final jlm b(czxn czxnVar, boolean z, hfd hfdVar, int i) {
        String spannableStringBuilder;
        hfdVar.v(200771501);
        SpannableStringBuilder spannableStringBuilder2 = czxnVar.a;
        Object obj = ffdo.L(spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), Object.class)).get(0);
        int spanStart = spannableStringBuilder2.getSpanStart(obj);
        int spanEnd = spannableStringBuilder2.getSpanEnd(obj);
        long j = gft.a(hfdVar).a;
        boolean z2 = ((i & 2) == 0) & z;
        List b = ffdx.b(new jlk(new jou(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, z2 ? jyk.b : jyk.a, null, 61438), spanStart, spanEnd));
        if (z2) {
            spannableStringBuilder = czxnVar.a.toString();
            if (spanStart <= spanEnd && spanStart >= 0 && spanEnd <= spannableStringBuilder.length()) {
                String substring = spannableStringBuilder.substring(0, spanStart);
                substring.getClass();
                String substring2 = spannableStringBuilder.substring(spanStart, spanEnd);
                substring2.getClass();
                String a = new ffpa("\\s").a(substring2, " ");
                String substring3 = spannableStringBuilder.substring(spanEnd);
                substring3.getClass();
                spannableStringBuilder = substring + a + substring3;
            }
        } else {
            spannableStringBuilder = czxnVar.a.toString();
        }
        jlj jljVar = new jlj((byte[]) null);
        jljVar.e(new jlm(spannableStringBuilder, b, 4));
        jljVar.a.add(new jli(new jox(czxnVar.b), spanStart, spanEnd, VCardConstants.PROPERTY_URL));
        jlm b2 = jljVar.b();
        hfdVar.o();
        return b2;
    }

    public static final void c(final czxn czxnVar, final ffix ffixVar, final ffix ffixVar2, hvi hviVar, float f, hfd hfdVar, final int i) {
        int i2;
        long j;
        hfd hfdVar2;
        final hvi hviVar2;
        final float f2;
        ffixVar.getClass();
        ffixVar2.getClass();
        hfd b = hfdVar.b(-1838700521);
        if ((i & 6) == 0) {
            i2 = (true != b.F(czxnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar2) ? 128 : 256;
        }
        int i3 = i2 | 27648;
        if ((i3 & 9363) == 9362 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            f2 = f;
            hfdVar2 = b;
        } else {
            hve hveVar = hvi.e;
            hvi j2 = eba.j(hveVar, 22.0f, 0.0f, 22.0f, 0.0f, 10);
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j2);
            int i5 = ist.a;
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
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
            dyi dyiVar = dyi.a;
            hvi a3 = dyiVar.a(ebs.u(eba.j(hvi.e, 0.0f, 8.0f, 0.0f, 8.0f, 5), 36.0f, 0.0f, 2), hum.a);
            eql b3 = eqm.b(12.0f);
            if (((Boolean) b.e(fyc.b)).booleanValue()) {
                b.v(-1798657200);
                j = gft.a(b).p;
                hfmVar.Z();
            } else {
                b.v(-1798596316);
                j = gft.a(b).I;
                hfmVar.Z();
            }
            hfdVar2 = b;
            gpa.c(a3, b3, j, 0L, true == ((Boolean) b.e(fyc.b)).booleanValue() ? 2.0f : 0.0f, 0.0f, null, hpx.d(-1184098154, new czxl(czxnVar, ffixVar2), b), hfdVar2, 104);
            a(ffixVar, dyiVar.a(hvi.e, hum.c), czwp.a, hfdVar2, ((i3 >> 3) & 14) | 384);
            hfdVar2.n();
            hviVar2 = hveVar;
            f2 = 22.0f;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: czxi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    czxn czxnVar2 = czxn.this;
                    ffix ffixVar4 = ffixVar;
                    ffix ffixVar5 = ffixVar2;
                    hvi hviVar3 = hviVar2;
                    czxm.c(czxnVar2, ffixVar4, ffixVar5, hviVar3, f2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
