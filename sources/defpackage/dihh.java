package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dihh {
    public static ContentResolver a;
    protected final String b;
    protected final Object c;

    protected dihh(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static dihh c(String str) {
        return new dihf(str, false);
    }

    public abstract Object a();
}
