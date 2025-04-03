package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qu {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static qu b;
    private ww c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter b2;
        synchronized (qu.class) {
            b2 = ww.b(i, mode);
        }
        return b2;
    }

    public static synchronized qu d() {
        qu quVar;
        synchronized (qu.class) {
            if (b == null) {
                f();
            }
            quVar = b;
        }
        return quVar;
    }

    public static synchronized void f() {
        synchronized (qu.class) {
            if (b == null) {
                qu quVar = new qu();
                b = quVar;
                quVar.c = ww.e();
                b.c.g(new qt());
            }
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(Context context) {
        this.c.f(context);
    }

    final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
