package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egyp {
    public static final Rect a = new Rect();

    public static void a(View view, View view2, int i, int i2, int i3) {
        if (view2 == null) {
            return;
        }
        view2.post(new egyo(view, view2, i, i2, i3));
    }
}
