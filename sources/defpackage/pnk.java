package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pnk implements pnj {
    public static final pnk b = new pnk();

    private pnk() {
    }

    @Override // defpackage.pnj
    public final Rect a(Activity activity) {
        boolean isInMultiWindowMode;
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        isInMultiWindowMode = activity.isInMultiWindowMode();
        if (!isInMultiWindowMode) {
            defaultDisplay.getClass();
            Point a = pnt.a(defaultDisplay);
            int a2 = pno.a(activity);
            if (rect.bottom + a2 == a.y) {
                rect.bottom += a2;
                return rect;
            }
            if (rect.right + a2 == a.x) {
                rect.right += a2;
            }
        }
        return rect;
    }
}
