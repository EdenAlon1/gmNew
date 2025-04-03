package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rc extends PopupWindow {
    public rc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        yt l = yt.l(context, attributeSet, kt.u, i, 0);
        if (l.q(2)) {
            setOverlapAnchor(l.p(2, false));
        }
        setBackgroundDrawable(l.h(0));
        l.o();
    }
}
