package defpackage;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgw {
    public static final bgw a = new bgw(new ArrayMap());
    protected final Map b;

    public bgw(Map map) {
        this.b = map;
    }

    public final Object c(String str) {
        return this.b.get(str);
    }

    public final Set d() {
        return this.b.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
