package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyn {
    public static final hyh a(int i) {
        if (i == 1) {
            return new hyh(2);
        }
        if (i == 2) {
            return new hyh(1);
        }
        if (i == 17) {
            return new hyh(3);
        }
        if (i == 33) {
            return new hyh(5);
        }
        if (i == 66) {
            return new hyh(4);
        }
        if (i != 130) {
            return null;
        }
        return new hyh(6);
    }

    public static final iam b(View view, View view2) {
        view.getLocationInWindow(hym.a);
        int[] iArr = hym.a;
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int[] iArr2 = hym.a;
        int i3 = i - iArr2[0];
        float f = i3;
        float f2 = i2 - iArr2[1];
        return new iam(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final kah c(int i) {
        if (i == 0) {
            return kah.a;
        }
        if (i != 1) {
            return null;
        }
        return kah.b;
    }

    public static final Integer d(int i) {
        if (hyh.b(i, 5)) {
            return 33;
        }
        if (hyh.b(i, 6)) {
            return 130;
        }
        if (hyh.b(i, 3)) {
            return 17;
        }
        if (hyh.b(i, 4)) {
            return 66;
        }
        if (hyh.b(i, 1)) {
            return 2;
        }
        return !hyh.b(i, 2) ? null : 1;
    }

    public static final boolean e(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
