package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dypi {
    public int c = 0;
    public int d = 0;
    public final Set a = DesugarCollections.synchronizedSet(new HashSet());
    private final Handler e = new Handler(Looper.getMainLooper());
    public final AtomicBoolean b = new AtomicBoolean(false);

    public final void a() {
        if (this.b.get()) {
            return;
        }
        this.b.set(true);
        this.e.postDelayed(new Runnable() { // from class: dyph
            @Override // java.lang.Runnable
            public final void run() {
                dypi dypiVar = dypi.this;
                int i = dypiVar.d != 3 ? dypiVar.c : 3;
                Iterator it = dypiVar.a.iterator();
                while (it.hasNext()) {
                    ((dyit) it.next()).h(i);
                }
                dypiVar.b.set(false);
            }
        }, 500L);
    }
}
