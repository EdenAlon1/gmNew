package defpackage;

import android.content.Context;
import android.view.PointerIcon;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuh {
    public final PointerIcon a;

    private kuh(PointerIcon pointerIcon) {
        this.a = pointerIcon;
    }

    public static kuh a(Context context) {
        PointerIcon systemIcon;
        systemIcon = PointerIcon.getSystemIcon(context, 1002);
        return new kuh(systemIcon);
    }
}
