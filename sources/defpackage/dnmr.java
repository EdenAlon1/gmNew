package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmr {
    public static final Point a(Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        float intValue;
        float f;
        int intValue2;
        if (i4 == 3) {
            double intValue3 = num2.intValue();
            double intValue4 = num.intValue();
            double a = ffmk.a(i / num.intValue(), i3 / intValue3);
            return new Point(ffmk.g((int) (intValue4 * a), i), ffmk.g((int) (a * num2.intValue()), i2));
        }
        if (num.intValue() > i || num2.intValue() > i2) {
            float f2 = i;
            float f3 = i2;
            intValue = f2 / f3 < ((float) num.intValue()) / ((float) num2.intValue()) ? f2 / num.intValue() : f3 / num2.intValue();
        } else if (i4 == 2) {
            if (num.intValue() > num2.intValue()) {
                f = i;
                intValue2 = num.intValue();
            } else {
                f = i2;
                intValue2 = num2.intValue();
            }
            intValue = f / intValue2;
        } else {
            intValue = (num.intValue() < i3 || num2.intValue() < i3) ? i3 / Math.min(num.intValue(), num2.intValue()) : 1.0f;
        }
        float f4 = i;
        if (num.intValue() * intValue > f4) {
            return new Point(i, (int) (num2.intValue() * (f4 / num.intValue())));
        }
        float f5 = i2;
        if (num2.intValue() * intValue > f5) {
            return new Point((int) (num.intValue() * (f5 / num2.intValue())), i2);
        }
        if (z) {
            return new Point(ffmk.i((int) (num.intValue() * intValue), i3, Math.max(i3, i)), ffmk.i((int) (num2.intValue() * intValue), i3, Math.max(i3, i2)));
        }
        return new Point(ffmk.i((int) (num.intValue() * intValue), i3, i), ffmk.i((int) (num2.intValue() * intValue), i3, i2));
    }
}
