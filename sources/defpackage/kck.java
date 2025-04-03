package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kck extends hvh implements ViewTreeObserver.OnGlobalFocusChangeListener, hzg {
    private ViewTreeObserver a;
    private final ffji b = new kci(this);
    private final ffji c = new kcj(this);

    private final FocusTargetNode a() {
        if (!this.p.z) {
            imn.c("visitLocalDescendants called on an unattached node");
        }
        hvh hvhVar = this.p;
        if ((hvhVar.r & 1024) != 0) {
            boolean z = false;
            for (hvh hvhVar2 = hvhVar.t; hvhVar2 != null; hvhVar2 = hvhVar2.t) {
                if ((hvhVar2.q & 1024) != 0) {
                    hvh hvhVar3 = hvhVar2;
                    hne hneVar = null;
                    while (hvhVar3 != null) {
                        if (hvhVar3 instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) hvhVar3;
                            if (z) {
                                return focusTargetNode;
                            }
                            z = true;
                        } else if ((hvhVar3.q & 1024) != 0 && (hvhVar3 instanceof isz)) {
                            int i = 0;
                            for (hvh hvhVar4 = ((isz) hvhVar3).n; hvhVar4 != null; hvhVar4 = hvhVar4.t) {
                                if ((hvhVar4.q & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        hvhVar3 = hvhVar4;
                                    } else {
                                        if (hneVar == null) {
                                            hneVar = new hne(new hvh[16]);
                                        }
                                        if (hvhVar3 != null) {
                                            hneVar.n(hvhVar3);
                                        }
                                        hneVar.n(hvhVar4);
                                        hvhVar3 = null;
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        hvhVar3 = isx.a(hneVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // defpackage.hvh
    public final void dT() {
        ViewTreeObserver viewTreeObserver = isy.a(this).getViewTreeObserver();
        this.a = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (isx.d(this).l == null) {
            return;
        }
        View a = kch.a(this);
        hyv hyvVar = ((AndroidComposeView) isx.f(this)).d;
        iwx f = isx.f(this);
        boolean z = (view == null || ffkj.e(view, f) || !kch.b(a, view)) ? false : true;
        boolean z2 = (view2 == null || ffkj.e(view2, f) || !kch.b(a, view2)) ? false : true;
        if (z) {
            if (z2) {
                return;
            }
        } else if (z2) {
            FocusTargetNode a2 = a();
            if (a2.g().a()) {
                return;
            }
            hzv.a(a2);
            return;
        }
        if (z && a().g().b()) {
            hyvVar.g(false, false, 8);
        }
    }

    @Override // defpackage.hzg
    public final void p(hzc hzcVar) {
        hzcVar.a(false);
        hzcVar.b(this.b);
        hzcVar.c(this.c);
    }

    @Override // defpackage.hvh
    public final void t() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.a = null;
        isy.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
