package defpackage;

import android.hardware.Camera;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcpf {
    static Camera.Size a(float f, List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Tried to select resolution with no size options.");
        }
        Camera.Size size = (Camera.Size) list.get(0);
        int i = size.width * size.height;
        float b = b(f, size.width, size.height);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size2 = (Camera.Size) it.next();
            int i2 = size2.width * size2.height;
            float b2 = b(f, size2.width, size2.height);
            if (Math.abs(b - b2) < 0.01d) {
                if (i2 > i) {
                    size = size2;
                    i = i2;
                    b = b2;
                }
            } else if (b2 < b) {
                size = size2;
                i = i2;
                b = b2;
            }
        }
        return size;
    }

    private static float b(float f, int i, int i2) {
        if (i2 > 0) {
            return Math.abs(f - (i / i2));
        }
        return Float.MAX_VALUE;
    }
}
