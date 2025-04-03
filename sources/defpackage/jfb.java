package defpackage;

import android.view.MotionEvent;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfb {
    public static final jfb a = new jfb();

    private jfb() {
    }

    public final boolean a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        if ((Float.floatToRawIntBits(rawX) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
            return false;
        }
        rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }
}
