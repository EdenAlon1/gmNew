package defpackage;

import androidx.car.app.model.Alert;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class engh {
    static int f(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        return i3 < 0 ? Alert.DURATION_SHOW_INDEFINITELY : i3;
    }

    public abstract void c(Object obj);

    public void e(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }
}
