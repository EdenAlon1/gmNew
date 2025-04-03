package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euua {
    private static euua c;
    public Boolean a = null;
    public Boolean b = null;

    private euua() {
    }

    public static synchronized euua a() {
        euua euuaVar;
        synchronized (euua.class) {
            if (c == null) {
                c = new euua();
            }
            euuaVar = c;
        }
        return euuaVar;
    }

    final boolean b(Context context) {
        if (this.a == null) {
            this.a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.a.booleanValue();
    }
}
