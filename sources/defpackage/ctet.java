package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctet {
    static int a(ctel ctelVar) {
        return ctelVar.a(24, 0);
    }

    public static Point b(ctel ctelVar) {
        int a = a(ctelVar);
        Point point = new Point(ctelVar.a(18, -1), ctelVar.a(19, -1));
        if (a % 180 != 0) {
            point.set(point.y, point.x);
        }
        return point;
    }
}
