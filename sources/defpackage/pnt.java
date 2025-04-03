package defpackage;

import android.graphics.Point;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnt {
    public static final Point a(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
