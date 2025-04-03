package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbz {
    public static final Point a(Integer num, Integer num2, Point point) {
        if (num == null || num2 == null || point == null) {
            return point;
        }
        double intValue = num2.intValue() / num.intValue();
        if (intValue > point.y / point.x) {
            int g = ffmk.g(point.x, num.intValue());
            return new Point(g, ffln.a(g * intValue));
        }
        int g2 = ffmk.g(point.y, num2.intValue());
        return new Point(ffln.a(g2 / intValue), g2);
    }
}
