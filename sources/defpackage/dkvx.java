package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvx {
    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            dkty.u("Cannot be called from the main thread!", new Object[0]);
        }
    }

    public static List b(String str) {
        return Arrays.asList(str.split("\\s*,\\s*"));
    }
}
