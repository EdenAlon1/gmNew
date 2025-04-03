package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jeh {
    public static final View a(View view, View view2, int i) {
        int nextFocusForwardId;
        if (i == 1) {
            if (view.getId() != -1) {
                return c(view2, view, new jef(view2, view));
            }
            return null;
        }
        if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return b(view2, view, nextFocusForwardId);
        }
        return null;
    }

    public static final View b(View view, View view2, int i) {
        return c(view, view2, new jeg(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.View c(android.view.View r4, android.view.View r5, defpackage.ffji r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = d(r5, r6, r1)
            if (r1 != 0) goto L1d
            if (r5 != r4) goto Lb
            goto L1d
        Lb:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L16
            goto L1c
        L16:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1c:
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jeh.c(android.view.View, android.view.View, ffji):android.view.View");
    }

    private static final View d(View view, ffji ffjiVar, View view2) {
        View d;
        if (((Boolean) ffjiVar.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (d = d(childAt, ffjiVar, view2)) != null) {
                return d;
            }
        }
        return null;
    }
}
