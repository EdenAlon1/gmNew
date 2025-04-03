package defpackage;

import android.util.LruCache;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzxo {
    private static WeakReference a = new WeakReference(null);

    public dzxo() {
        new LruCache(50);
    }

    public static synchronized void a() {
        synchronized (dzxo.class) {
            if (((dzxo) a.get()) == null) {
                a = new WeakReference(new dzxo());
            }
        }
    }
}
