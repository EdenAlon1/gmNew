package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fidx {
    public static SharedPreferences a;

    static {
        fiem b = fiem.b();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(fidy.a);
            b.close();
            a = defaultSharedPreferences;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
