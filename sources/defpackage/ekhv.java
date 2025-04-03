package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekhv {

    /* compiled from: PG */
    public interface a {
        ekjr ez();
    }

    public static Object a(Context context, Class cls, eisx eisxVar) {
        try {
            return cls.cast(((a) ekhw.a(context.getApplicationContext(), a.class)).ez().a(eisxVar));
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", e);
        }
    }
}
