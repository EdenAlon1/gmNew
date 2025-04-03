package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecby {
    public final ViewTreeObserver.OnPreDrawListener a;
    public final View b;
    public final View c;
    public emxc d;
    public final ecbj e;

    public ecby(View view, ecbj ecbjVar) {
        this.c = view;
        View rootView = view.getRootView();
        this.b = rootView;
        this.d = a(view);
        this.e = ecbjVar;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ecbx
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                ecby ecbyVar = ecby.this;
                emxc a = ecby.a(ecbyVar.c);
                if (!a.g() || a.equals(ecbyVar.d)) {
                    return true;
                }
                ecbyVar.d = a;
                ecbj ecbjVar2 = ecbyVar.e;
                Object c = ecbyVar.d.c();
                ecbm ecbmVar = ecbjVar2.a;
                TooltipView tooltipView = ecbmVar.d;
                if (tooltipView == null) {
                    return true;
                }
                tooltipView.b((Rect) c);
                ecbmVar.d.requestLayout();
                return true;
            }
        };
        this.a = onPreDrawListener;
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }
    }

    public static emxc a(View view) {
        View rootView = view.getRootView();
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        while (view != rootView) {
            View view2 = (View) view.getParent();
            if (view2 == null) {
                return emux.a;
            }
            rect.offset(view.getLeft() - view2.getScrollX(), view.getTop() - view2.getScrollY());
            view = view2;
        }
        return emxc.j(rect);
    }
}
