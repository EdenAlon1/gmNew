package defpackage;

import android.content.Context;
import android.support.v4.app.FragmentContainerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dshv {
    public static final void a(ViewGroup viewGroup, ffji ffjiVar) {
        if (viewGroup instanceof FragmentContainerView) {
            ffjiVar.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, ffjiVar);
            }
        }
    }

    public static final void b(final ffjn ffjnVar, final hvi hviVar, ffji ffjiVar, final ffji ffjiVar2, hfd hfdVar, final int i) {
        int i2;
        Object obj;
        final ffji ffjiVar3;
        ffjnVar.getClass();
        hfd b = hfdVar.b(261744271);
        if ((i & 6) == 0) {
            i2 = (true != b.F(ffjnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            i3 |= true != b.E(false) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != b.F(ffjiVar2) ? 65536 : 131072;
        }
        if ((74899 & i3) == 74898 && b.I()) {
            b.s();
            ffjiVar3 = ffjiVar;
        } else {
            b.v(-906812808);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: dshp
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        ((View) obj2).getClass();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            final ffji ffjiVar4 = (ffji) R;
            hfmVar.Z();
            View view = (View) b.e(AndroidCompositionLocals_androidKt.g);
            b.v(-906800250);
            boolean D = b.D(view);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                try {
                    obj = fr.f(view);
                } catch (IllegalStateException unused) {
                    obj = null;
                }
                R2 = obj;
                hfmVar.ad(R2);
            }
            final ea eaVar = (ea) R2;
            hfmVar.Z();
            b.v(-906792212);
            boolean D2 = b.D(view);
            Object R3 = hfmVar.R();
            if (D2 || R3 == hfc.a) {
                R3 = new ffji() { // from class: dshq
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        LayoutInflater from;
                        Context context = (Context) obj2;
                        context.getClass();
                        ea eaVar2 = ea.this;
                        if (eaVar2 == null || (from = eaVar2.K()) == null) {
                            from = LayoutInflater.from(context);
                        }
                        ffjn ffjnVar2 = ffjnVar;
                        from.getClass();
                        return (View) ffjnVar2.a(from, new FrameLayout(context), false);
                    }
                };
                hfmVar.ad(R3);
            }
            ffji ffjiVar5 = (ffji) R3;
            hfmVar.Z();
            final Context context = (Context) b.e(AndroidCompositionLocals_androidKt.b);
            b.v(-906777345);
            hfmVar.Z();
            b.v(-906774609);
            boolean F = ((i3 & 7168) == 2048) | b.F(eaVar) | b.F(context);
            Object R4 = hfmVar.R();
            if (F || R4 == hfc.a) {
                R4 = new ffji() { // from class: dshr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        fr I;
                        View view2 = (View) obj2;
                        view2.getClass();
                        ffji.this.invoke(view2);
                        final fr frVar = null;
                        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                        if (viewGroup != null) {
                            ea eaVar2 = eaVar;
                            if (eaVar2 == null || (I = eaVar2.I()) == null) {
                                Context context2 = context;
                                eg egVar = context2 instanceof eg ? (eg) context2 : null;
                                if (egVar != null) {
                                    frVar = egVar.a();
                                }
                            } else {
                                frVar = I;
                            }
                            dshv.a(viewGroup, new ffji() { // from class: dshu
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj3) {
                                    FragmentContainerView fragmentContainerView = (FragmentContainerView) obj3;
                                    fragmentContainerView.getClass();
                                    fr frVar2 = fr.this;
                                    ea g = frVar2 != null ? frVar2.g(fragmentContainerView.getId()) : null;
                                    if (g != null && !frVar2.ai()) {
                                        cg cgVar = new cg(frVar2);
                                        cgVar.n(g);
                                        cgVar.j();
                                    }
                                    return ffcu.a;
                                }
                            });
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R4);
            }
            ffji ffjiVar6 = (ffji) R4;
            hfmVar.Z();
            b.v(-906746219);
            boolean F2 = ((57344 & i3) == 16384) | b.F(eaVar);
            boolean z = (458752 & i3) == 131072;
            Object R5 = hfmVar.R();
            if ((F2 | z) || R5 == hfc.a) {
                R5 = new ffji() { // from class: dshs
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        ffji.this.invoke(view2);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R5);
            }
            hfmVar.Z();
            kcg.c(ffjiVar5, hviVar, ffjiVar6, (ffji) R5, b, i3 & 112, 0);
            ffjiVar3 = ffjiVar4;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsht
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ffjn ffjnVar2 = ffjn.this;
                    hvi hviVar2 = hviVar;
                    ffji ffjiVar7 = ffjiVar3;
                    dshv.b(ffjnVar2, hviVar2, ffjiVar7, ffjiVar2, (hfd) obj2, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
