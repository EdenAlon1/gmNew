package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alzv {
    private final Context a;
    private final ctyx b;

    public alzv(Context context, ctyx ctyxVar) {
        this.a = context;
        this.b = ctyxVar;
    }

    final alzw a(int i, int i2, Object obj, Object obj2) {
        Resources resources = this.a.getResources();
        return new alzw(this.b, resources.getString(i), resources.getBoolean(i2), obj, obj2);
    }
}
