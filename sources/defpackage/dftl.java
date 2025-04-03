package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dftl {
    public Bundle b;
    private final Map c = DesugarCollections.synchronizedMap(new cmh());
    public int a = 0;

    final void a(int i, int i2, Intent intent) {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((dfth) it.next()).c(i, i2, intent);
        }
    }

    final void b(Bundle bundle) {
        this.a = 1;
        this.b = bundle;
        for (Map.Entry entry : this.c.entrySet()) {
            ((dfth) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void c() {
        this.a = 5;
        for (dfth dfthVar : this.c.values()) {
        }
    }

    final void d() {
        this.a = 3;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((dfth) it.next()).h();
        }
    }

    final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((dfth) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void f() {
        this.a = 2;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((dfth) it.next()).i();
        }
    }

    final void g() {
        this.a = 4;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((dfth) it.next()).j();
        }
    }

    final void h() {
        for (dfth dfthVar : this.c.values()) {
        }
    }

    final void i(dfth dfthVar) {
        if (this.c.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        this.c.put("ConnectionlessLifecycleHelper", dfthVar);
        if (this.a > 0) {
            new dgxx(Looper.getMainLooper()).post(new dftk(this, dfthVar));
        }
    }

    final dfth j(Class cls) {
        return (dfth) cls.cast(this.c.get("ConnectionlessLifecycleHelper"));
    }
}
