package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajvc {
    public static final void a(Context context, final String str, final ajvh ajvhVar, final ajvg ajvgVar, final ffbr ffbrVar, ffix ffixVar, final Boolean bool, hfd hfdVar, final int i) {
        final Context context2;
        int i2;
        String str2;
        float a;
        hvi a2;
        hvi e;
        hfd hfdVar2;
        ffix ffixVar2 = ffixVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1362241183);
        if (i3 == 0) {
            context2 = context;
            i2 = (true != b.F(context2) ? 2 : 4) | i;
        } else {
            context2 = context;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= true != b.D(str2) ? 16 : 32;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(ajvhVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(ajvgVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffbrVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffixVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(bool) ? 524288 : 1048576;
        }
        if ((599187 & i2) == 599186 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            boolean z = ffixVar2 == null;
            if (z) {
                b.v(249519601);
                a = jif.a(R.dimen.snippet_message_corner_radius, b);
                ((hfm) b).Z();
            } else {
                b.v(249521711);
                a = jif.a(R.dimen.snippet_draft_corner_radius, b);
                ((hfm) b).Z();
            }
            float a3 = jif.a(R.dimen.snippet_message_corner_radius, b) - jif.a(R.dimen.snippet_background_padding, b);
            eql c = eqm.c(a, a, 0.0f, 0.0f);
            eql c2 = z ? eqm.c(a3, a3, 0.0f, 0.0f) : c;
            b.v(249540883);
            float a4 = z ? 0.0f : jif.a(R.dimen.snippet_extra_start_padding, b);
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            int i4 = (z && (bool == null || bool.booleanValue())) ? 4 : 1;
            hve hveVar = hvi.e;
            hvi c3 = dek.c(z ? ebs.y(hvi.e) : hvi.e, 1.0f, gft.a(b).v, c);
            b.v(249554201);
            hvi f = z ? eba.f(hvi.e, jif.a(R.dimen.snippet_background_padding, b), jif.a(R.dimen.snippet_background_padding, b), jif.a(R.dimen.snippet_background_padding, b), jif.a(R.dimen.snippet_background_padding, b)) : hvi.e;
            hfmVar.Z();
            hvi j = eba.j(dee.a(c3.a(f), gft.a(b).v, c2).a(z ? hvi.e : ebs.d(hvi.e, 1.0f)), a4, jif.a(R.dimen.snippet_vertical_padding, b), 0.0f, jif.a(R.dimen.snippet_vertical_padding, b), 4);
            dxi dxiVar = dxu.a;
            int i5 = huo.a;
            ipn a5 = ebm.a(dxiVar, hum.m, b, 0);
            int a6 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i6 = ist.a;
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf = Integer.valueOf(a6);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ebr ebrVar = ebr.a;
            b.v(-1493649227);
            if (ajvgVar != null) {
                ajve.a(eba.j(hvi.e, jif.a(R.dimen.snippet_thumbnail_start_padding, b), jif.a(R.dimen.snippet_thumbnail_vertical_padding, b), 0.0f, jif.a(R.dimen.snippet_thumbnail_vertical_padding, b), 4), ajvgVar, ffbrVar, b, (i2 >> 6) & 896);
            }
            hfmVar.Z();
            if (z) {
                b.v(-1493633449);
                e = ebs.u(hvi.e, jif.a(R.dimen.snippet_text_column_height, b), 0.0f, 2);
                hfmVar.Z();
            } else {
                b.v(-1493630283);
                a2 = ebrVar.a(hvi.e, 1.0f, true);
                e = ebs.e(a2, jif.a(R.dimen.snippet_text_column_height, b));
                hfmVar.Z();
            }
            hvi f2 = eba.f(e, jif.a(R.dimen.snippet_text_start_padding, b), jif.a(R.dimen.snippet_text_vertical_padding, b), jif.a(R.dimen.snippet_text_end_padding, b), jif.a(R.dimen.snippet_text_vertical_padding, b));
            ipn a7 = dyo.a(dxu.e, hum.j, b, 6);
            int a8 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, f2);
            ffix ffixVar4 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar4);
            } else {
                b.z();
            }
            hlc.b(b, a7, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a8))) {
                Integer valueOf2 = Integer.valueOf(a8);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            long c4 = kal.c(12);
            Typeface a9 = crlw.a(context2);
            a9.getClass();
            jsf a10 = jrr.a(a9);
            grl.b(str2, ebs.e(hvi.e, jif.a(R.dimen.snippet_title_text_height, b)).a(z ? hvi.e : ebs.d(hvi.e, 1.0f)), gft.a(b).u, c4, null, jsy.f, a10, 0L, null, 0L, 2, false, 1, 0, null, null, b, ((i2 >> 3) & 14) | 199680, 3120, 120720);
            hfdVar2 = b;
            String str3 = ajvhVar.a;
            int i7 = ajvhVar.b;
            long c5 = kal.c(14);
            Typeface b4 = crlw.b(context2);
            b4.getClass();
            jsf a11 = jrr.a(b4);
            jsy jsyVar = jsy.e;
            jpo y = jpo.y((jpo) hfdVar2.e(grl.a), 0L, 0L, null, null, null, null, kal.a(0.5d), null, 0, 0, kal.c(18), null, null, 0, 16646015);
            grl.b(str3, z ? ebs.y(hvi.e) : ebs.d(hvi.e, 1.0f), gft.a(hfdVar2).u, c5, new jss(i7), jsyVar, a11, 0L, null, 0L, 2, false, i4, 0, null, y, hfdVar2, 199680, 48, 55168);
            hfdVar2.n();
            hfdVar2.v(-1493582383);
            if (ffixVar2 == null) {
                ffixVar2 = null;
            } else {
                ajun.a(ffixVar2, hfdVar2, 0);
            }
            hfmVar.Z();
            hfdVar2.n();
        }
        final ffix ffixVar5 = ffixVar2;
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ajvb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Context context3 = context2;
                    String str4 = str;
                    ajvh ajvhVar2 = ajvhVar;
                    ajvg ajvgVar2 = ajvgVar;
                    ffbr ffbrVar2 = ffbrVar;
                    ffix ffixVar6 = ffixVar5;
                    ajvc.a(context3, str4, ajvhVar2, ajvgVar2, ffbrVar2, ffixVar6, bool, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
