package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupa {
    public static boolean a(int i) {
        if (Log.isLoggable("FirebaseAppIndex", i)) {
            return true;
        }
        return Log.isLoggable("FirebaseAppIndex", i);
    }

    public static void b(String str) {
        if (a(3)) {
            Log.d("FirebaseAppIndex", str);
        }
    }
}
