package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyr {
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hfd r13, final int r14) {
        /*
            r0 = 2096887977(0x7cfbf8a9, float:1.04664795E37)
            hfd r10 = r13.b(r0)
            if (r14 != 0) goto L15
            boolean r13 = r10.I()
            r14 = 0
            if (r13 != 0) goto L11
            goto L15
        L11:
            r10.s()
            goto L8a
        L15:
            hik r13 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b
            java.lang.Object r13 = r10.e(r13)
            android.content.Context r13 = (android.content.Context) r13
            r0 = 2132087426(0x7f151282, float:1.9815107E38)
            java.lang.String r0 = defpackage.jii.a(r0, r10)
            hve r1 = defpackage.hvi.e
            fxz r2 = defpackage.gft.a(r10)
            long r2 = r2.a
            eql r4 = defpackage.eqm.a
            hvi r1 = defpackage.dee.a(r1, r2, r4)
            r2 = -1261750169(0xffffffffb4cb3867, float:-3.7852735E-7)
            r10.v(r2)
            boolean r2 = r10.D(r0)
            r3 = r10
            hfm r3 = (defpackage.hfm) r3
            java.lang.Object r4 = r3.R()
            if (r2 != 0) goto L49
            java.lang.Object r2 = defpackage.hfc.a
            if (r4 != r2) goto L51
        L49:
            dpyo r4 = new dpyo
            r4.<init>()
            r3.ad(r4)
        L51:
            ffji r4 = (defpackage.ffji) r4
            r3.Z()
            hvi r2 = defpackage.jjs.b(r1, r4)
            r0 = -1261748144(0xffffffffb4cb4050, float:-3.785849E-7)
            r10.v(r0)
            boolean r0 = r10.F(r13)
            java.lang.Object r1 = r3.R()
            if (r0 != 0) goto L6e
            java.lang.Object r0 = defpackage.hfc.a
            if (r1 != r0) goto L76
        L6e:
            dpyp r1 = new dpyp
            r1.<init>()
            r3.ad(r1)
        L76:
            ffix r1 = (defpackage.ffix) r1
            r3.Z()
            ffjn r9 = defpackage.dpyl.a
            r11 = 805306368(0x30000000, float:4.656613E-10)
            r12 = 508(0x1fc, float:7.12E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            defpackage.dwfj.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L8a:
            hio r13 = r10.L()
            if (r13 == 0) goto L97
            dpyq r0 = new dpyq
            r0.<init>()
            r13.d = r0
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpyr.a(hfd, int):void");
    }

    public static final boolean b(Context context, String str) {
        context.getClass();
        return koa.c(context, str) == 0;
    }

    public static final void c(final hvi hviVar, final dpym dpymVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        String a;
        hfd hfdVar2;
        dpymVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1758067918);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dpymVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            d = ebs.d(eba.i(hviVar, 50.0f, 0.0f, 2), 1.0f);
            int i4 = huo.a;
            ipn a2 = dyo.a(dxu.e, hum.k, b, 54);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
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
            int ordinal = dpymVar.ordinal();
            if (ordinal == 0) {
                b.v(176961926);
                a = jii.a(R.string.enable_camera_permission_rationale, b);
                hfmVar.Z();
            } else {
                if (ordinal != 1) {
                    b.v(176960654);
                    hfmVar.Z();
                    throw new ffcd();
                }
                b.v(176964519);
                a = jii.a(R.string.enable_gallery_permission_rationale, b);
                hfmVar.Z();
            }
            grl.b(a, null, gft.a(b).q, 0L, null, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b).g, b, 0, 0, 65018);
            hfdVar2 = b;
            ebv.a(ebs.e(hvi.e, 24.0f), hfdVar2);
            a(hfdVar2, 0);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpyn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i6 = i;
                    dpyr.c(hviVar2, dpymVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
