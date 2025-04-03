package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class exby {
    public static exbw j() {
        exav exavVar = new exav();
        exavVar.c(0);
        exavVar.b(0);
        exavVar.d(0);
        exavVar.e(0);
        return exavVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract Drawable e();

    public abstract exbx f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public final boolean k() {
        return (d() & 2) == 2;
    }

    public final boolean l() {
        return (k() || (d() & 1) == 1) ? false : true;
    }
}
