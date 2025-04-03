package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izf extends ffkk implements ffji {
    final /* synthetic */ AndroidComposeView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izf(AndroidComposeView androidComposeView) {
        super(1);
        this.a = androidComposeView;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        hyh hyhVar;
        KeyEvent keyEvent = ((iix) obj).a;
        long b = iiz.b(keyEvent);
        if (iiw.a(b, iiw.b)) {
            hyhVar = new hyh(2);
        } else if (iiw.a(b, iiw.c)) {
            hyhVar = new hyh(1);
        } else if (iiw.a(b, iiw.k)) {
            hyhVar = new hyh(true != keyEvent.isShiftPressed() ? 1 : 2);
        } else {
            hyhVar = iiw.a(b, iiw.g) ? new hyh(4) : iiw.a(b, iiw.f) ? new hyh(3) : (iiw.a(b, iiw.d) || iiw.a(b, iiw.r)) ? new hyh(5) : (iiw.a(b, iiw.e) || iiw.a(b, iiw.s)) ? new hyh(6) : (iiw.a(b, iiw.h) || iiw.a(b, iiw.m) || iiw.a(b, iiw.t)) ? new hyh(7) : (iiw.a(b, iiw.a) || iiw.a(b, iiw.o)) ? new hyh(8) : null;
        }
        if (hyhVar == null || !iiy.a(iiz.a(keyEvent), 2)) {
            return false;
        }
        AndroidComposeView androidComposeView = this.a;
        Integer d = hyn.d(hyhVar.a);
        if (androidComposeView.hasFocus() && d != null && this.a.P(hyhVar.a)) {
            return true;
        }
        AndroidComposeView androidComposeView2 = this.a;
        int i = hyhVar.a;
        iam D = androidComposeView2.D();
        Boolean d2 = androidComposeView2.d.d(i, D, new ize(hyhVar));
        if (d2 == null || d2.booleanValue()) {
            return true;
        }
        if (!hzb.a(hyhVar.a)) {
            return false;
        }
        if (d != null) {
            View C = this.a.C(d.intValue());
            if (true == ffkj.e(C, this.a)) {
                C = null;
            }
            if (C != null) {
                Rect a = D != null ? icz.a(D) : null;
                if (a == null) {
                    throw new IllegalStateException("Invalid rect");
                }
                View rootView = this.a.getRootView();
                rootView.getClass();
                ViewGroup viewGroup = (ViewGroup) rootView;
                viewGroup.offsetDescendantRectToMyCoords(this.a, a);
                viewGroup.offsetRectIntoDescendantCoords(C, a);
                if (hyn.e(C, d, a)) {
                    return true;
                }
            }
        }
        if (!this.a.d.g(false, false, hyhVar.a)) {
            return true;
        }
        Boolean d3 = this.a.d.d(hyhVar.a, null, new izd(hyhVar));
        return Boolean.valueOf(d3 != null ? d3.booleanValue() : true);
    }
}
