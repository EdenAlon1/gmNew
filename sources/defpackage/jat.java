package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jat {
    public static final jat a = new jat();

    private jat() {
    }

    public static final PointerIcon b(Context context, ikq ikqVar) {
        PointerIcon systemIcon;
        PointerIcon systemIcon2;
        if (ikqVar instanceof ijr) {
            throw null;
        }
        if (ikqVar instanceof ijs) {
            systemIcon2 = PointerIcon.getSystemIcon(context, ((ijs) ikqVar).a);
            return systemIcon2;
        }
        systemIcon = PointerIcon.getSystemIcon(context, 1000);
        return systemIcon;
    }

    public final void a(View view, ikq ikqVar) {
        PointerIcon pointerIcon;
        PointerIcon b = b(view.getContext(), ikqVar);
        pointerIcon = view.getPointerIcon();
        if (ffkj.e(pointerIcon, b)) {
            return;
        }
        view.setPointerIcon(b);
    }
}
