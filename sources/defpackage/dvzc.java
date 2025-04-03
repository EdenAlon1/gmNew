package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzc {
    public final Set a;
    private final dvyy b;

    public dvzc(Set set, dvyy dvyyVar) {
        this.a = set;
        this.b = dvyyVar;
    }

    public final void a(boolean z) {
        if (z) {
            return;
        }
        d(new IllegalStateException());
    }

    public final void b(Object obj) {
        if (this.a.isEmpty()) {
            return;
        }
        if (Log.isLoggable("GIL", 2)) {
            Log.v("GIL", "Inserted: ".concat(String.valueOf(String.valueOf(obj))));
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dvyz) it.next()).b(obj);
        }
    }

    public final void c(Object obj) {
        if (this.a.isEmpty()) {
            return;
        }
        if (Log.isLoggable("GIL", 2)) {
            Log.v("GIL", "Removed: ".concat(String.valueOf(String.valueOf(obj))));
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dvyz) it.next()).c(obj);
        }
    }

    public final void d(RuntimeException runtimeException) {
        this.b.a(runtimeException);
    }

    public final boolean e() {
        return !this.a.isEmpty();
    }

    public final void f(Object obj, int i, int i2) {
        if (this.a.isEmpty()) {
            return;
        }
        if (Log.isLoggable("GIL", 2)) {
            String valueOf = String.valueOf(obj);
            String a = epnz.a(i);
            if (i == 0) {
                throw null;
            }
            Log.v("GIL", "Visibility: " + valueOf + "; " + a + " -> " + epnz.a(i2));
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dvyz) it.next()).g(obj, i2);
        }
    }
}
