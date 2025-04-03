package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crlu {
    public static int a(Context context, int i) {
        return b(context, i).data;
    }

    public static TypedValue b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        csix.k(context.getTheme().resolveAttribute(i, typedValue, true));
        return typedValue;
    }
}
