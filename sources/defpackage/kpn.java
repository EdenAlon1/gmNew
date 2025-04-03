package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kpn {
    public static Handler e() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(int i);

    public abstract void b(Typeface typeface);

    public final void c(final int i) {
        e().post(new Runnable() { // from class: kpm
            @Override // java.lang.Runnable
            public final void run() {
                kpn.this.a(i);
            }
        });
    }

    public final void d(final Typeface typeface) {
        e().post(new Runnable() { // from class: kpl
            @Override // java.lang.Runnable
            public final void run() {
                kpn.this.b(typeface);
            }
        });
    }
}
