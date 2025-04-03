package defpackage;

import android.graphics.Point;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddzc {
    public static Point a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }
}
