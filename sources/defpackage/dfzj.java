package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfzj {
    private static final dfzj a = new dfzj();
    private dfzi b = null;

    public static dfzi b(Context context) {
        return a.a(context);
    }

    public final synchronized dfzi a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new dfzi(context);
        }
        return this.b;
    }
}
