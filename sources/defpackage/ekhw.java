package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekhw {
    public static Object a(Context context, Class cls) {
        Object applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof fbas)) {
            throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
        }
        try {
            return cls.cast(((fbas) applicationContext).aX());
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
        }
    }
}
