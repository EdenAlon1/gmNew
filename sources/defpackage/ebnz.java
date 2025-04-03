package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebnz {
    public static Object a(Context context, Class cls) {
        context.getClass();
        for (int i = 0; i < 1000; i++) {
            if (cls.isInstance(context)) {
                return cls.cast(context);
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
