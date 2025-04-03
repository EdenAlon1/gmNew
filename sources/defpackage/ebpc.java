package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebpc {
    protected abstract int a();

    protected abstract int c();

    public abstract int d();

    protected abstract boolean e();

    public final Context f(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{a()});
        try {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(new ContextThemeWrapper(context, obtainStyledAttributes.getResourceId(0, c())), d());
            if (e() && ehdq.a()) {
                TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(ehdq.a);
                int resourceId = obtainStyledAttributes2.getResourceId(0, 0);
                obtainStyledAttributes2.recycle();
                if (resourceId != 0) {
                    contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, resourceId);
                }
            }
            return contextThemeWrapper;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
