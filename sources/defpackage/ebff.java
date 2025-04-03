package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebff {
    public static ebfe f(Drawable drawable) {
        ebcv ebcvVar = new ebcv();
        ebcvVar.a = drawable;
        ebcvVar.b(-1);
        ebcvVar.c(false);
        return ebcvVar;
    }

    public static ebff g(Drawable drawable) {
        ebfe f = f(drawable);
        f.c(true);
        return f.d();
    }

    public abstract int a();

    public abstract Drawable b();

    public abstract emxc c();

    public abstract boolean d();

    public final Drawable e(Context context, int i) {
        Drawable b = b() != null ? b() : ku.a(context, a());
        if (d()) {
            ebor.c(b, i);
        }
        return b;
    }
}
