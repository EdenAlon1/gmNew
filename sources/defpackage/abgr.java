package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgr {
    public static final void a(final abgn abgnVar, hfd hfdVar, final int i) {
        int i2;
        fr I;
        int i3 = i & 6;
        hfd b = hfdVar.b(-897278471);
        if (i3 == 0) {
            i2 = (true != b.F(abgnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            View view = (View) b.e(AndroidCompositionLocals_androidKt.g);
            Context context = (Context) b.e(AndroidCompositionLocals_androidKt.b);
            b.v(-169238937);
            boolean D = b.D(view);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            fr frVar = null;
            if (D || R == hfc.a) {
                try {
                    R = fr.f(view);
                } catch (IllegalStateException unused) {
                    R = null;
                }
                hfmVar.ad(R);
            }
            ea eaVar = (ea) R;
            hfmVar.Z();
            b.v(-169230793);
            boolean D2 = b.D(eaVar) | b.D(context);
            Object R2 = hfmVar.R();
            if (D2 || R2 == hfc.a) {
                if (eaVar == null || (I = eaVar.I()) == null) {
                    eg egVar = context instanceof eg ? (eg) context : null;
                    if (egVar != null) {
                        frVar = egVar.a();
                    }
                } else {
                    frVar = I;
                }
                hfmVar.ad(frVar);
                R2 = frVar;
            }
            final fr frVar2 = (fr) R2;
            hfmVar.Z();
            final fflb fflbVar = new fflb();
            if (frVar2 != null) {
                ea h = frVar2.h("ReactionPickerFragment");
                if (h != null) {
                    cg cgVar = new cg(frVar2);
                    cgVar.n(h);
                    cgVar.c();
                }
                fflbVar.a = abhi.a(abgnVar.a);
                ((abgu) fflbVar.a).t(frVar2, "ReactionPickerFragment");
                ((abgu) fflbVar.a).H().l = abgnVar.b;
                ((abgu) fflbVar.a).H().k = abgnVar.c;
                ((abgu) fflbVar.a).H().m = abgnVar.d;
                ((abgu) fflbVar.a).H().n = abgnVar.e;
                ffji ffjiVar = abgnVar.f;
                if (ffjiVar != null) {
                    ((abgu) fflbVar.a).H().o = ffjiVar;
                }
            }
            hgs.c(context, new ffji() { // from class: abgo
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ((hgp) obj).getClass();
                    return new abgq(fr.this, fflbVar);
                }
            }, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abgp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    abgr.a(abgn.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
