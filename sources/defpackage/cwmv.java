package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwmv {
    public static final /* synthetic */ int a = 0;
    private static final fxz b = fyc.e(cwms.A, cwms.C, cwms.B, cwms.D, cwms.E, cwms.F, cwms.H, cwms.G, cwms.I, cwms.J, cwms.L, cwms.K, cwms.M, cwms.T, cwms.U, cwms.N, cwms.P, cwms.O, cwms.Q, 0, cwms.R, cwms.S, cwms.W, cwms.Y, cwms.X, cwms.Z, cwms.V, 0, 0, 0, 0, 0, 0, 0, 0, 0, -133693440, 15);
    private static final fxz c = fyc.f(cwms.a, cwms.c, cwms.b, cwms.d, cwms.e, cwms.f, cwms.h, cwms.g, cwms.i, cwms.j, cwms.l, cwms.k, cwms.m, cwms.t, cwms.u, cwms.n, cwms.p, cwms.o, cwms.q, 0, cwms.r, cwms.s, cwms.w, cwms.y, cwms.x, cwms.z, cwms.v, 0, 0, 0, 0, 0, 0, 0, 0, 0, -133693440, 15);

    @ffbs
    public static final void a(final boolean z, final boolean z2, ffjm ffjmVar, hfd hfdVar, final int i) {
        fxz fxzVar;
        fxz fxzVar2;
        fxz fxzVar3;
        final ffjm ffjmVar2;
        ffjmVar.getClass();
        int i2 = i & 6;
        hfd b2 = hfdVar.b(1423714961);
        int i3 = (i2 == 0 ? i | 2 : i) | 48;
        final boolean z3 = true;
        if ((i & 384) == 0) {
            i3 |= true != b2.F(ffjmVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b2.I()) {
            b2.s();
            ffjmVar2 = ffjmVar;
        } else {
            int i4 = i3 & (-15);
            b2.t();
            if ((i & 1) == 0 || b2.G()) {
                z = dfq.a(b2);
                z2 = true;
            } else {
                b2.s();
            }
            b2.l();
            b2.v(-760704859);
            if (z2 && Build.VERSION.SDK_INT >= 31) {
                Context context = (Context) b2.e(AndroidCompositionLocals_androidKt.b);
                if (z) {
                    fxzVar2 = gdp.b(context);
                    fxzVar3 = fxzVar2;
                } else {
                    fxzVar = gdp.c(context);
                    fxzVar3 = fxzVar;
                    z3 = false;
                }
            } else if (z) {
                fxzVar2 = b;
                fxzVar3 = fxzVar2;
            } else {
                fxzVar = c;
                fxzVar3 = fxzVar;
                z3 = false;
            }
            hfm hfmVar = (hfm) b2;
            hfmVar.Z();
            final View view = (View) b2.e(AndroidCompositionLocals_androidKt.g);
            b2.v(-760694452);
            if (!view.isInEditMode()) {
                b2.v(-760693185);
                boolean F = b2.F(view) | b2.E(z3);
                Object R = hfmVar.R();
                if (F || R == hfc.a) {
                    R = new ffix() { // from class: cwmt
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            kxp kxpVar;
                            int i5 = cwmv.a;
                            int[] iArr = kvo.a;
                            int i6 = Build.VERSION.SDK_INT;
                            View view2 = view;
                            if (i6 >= 30) {
                                kxpVar = kvj.b(view2);
                            } else {
                                Context context2 = view2.getContext();
                                while (true) {
                                    if (!(context2 instanceof ContextWrapper)) {
                                        break;
                                    }
                                    if (context2 instanceof Activity) {
                                        Window window = ((Activity) context2).getWindow();
                                        if (window != null) {
                                            kxpVar = new kxp(window, view2);
                                        }
                                    } else {
                                        context2 = ((ContextWrapper) context2).getBaseContext();
                                    }
                                }
                                kxpVar = null;
                            }
                            if (kxpVar != null) {
                                kxpVar.b(!z3);
                            }
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                hgs.i((ffix) R, b2);
            }
            hfmVar.Z();
            ffjmVar2 = ffjmVar;
            gga.c(fxzVar3, null, cwmw.a, ffjmVar2, b2, ((i4 << 3) & 7168) | 384);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwmu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z4 = z;
                    int i5 = i;
                    boolean z5 = z2;
                    int a2 = hip.a(i5 | 1);
                    cwmv.a(z4, z5, ffjmVar2, (hfd) obj, a2);
                    return ffcu.a;
                }
            };
        }
    }
}
