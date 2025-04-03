package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rax {
    private static final rao a = new rav();
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final kst d;

    public rax(kst kstVar) {
        this.d = kstVar;
    }

    private final rao f(raw rawVar) {
        rao b = rawVar.b.b(this);
        rkf.f(b);
        return b;
    }

    private final void g(Class cls, Class cls2, rap rapVar, boolean z) {
        this.b.add(z ? this.b.size() : 0, new raw(cls, cls2, rapVar));
    }

    public final synchronized rao a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (raw rawVar : this.b) {
                if (this.c.contains(rawVar)) {
                    z = true;
                } else if (rawVar.a(cls) && rawVar.a.isAssignableFrom(cls2)) {
                    this.c.add(rawVar);
                    arrayList.add(f(rawVar));
                    this.c.remove(rawVar);
                }
            }
            if (arrayList.size() > 1) {
                return new rau(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (rao) arrayList.get(0);
            }
            if (!z) {
                throw new qqh(cls, cls2);
            }
            return a;
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (raw rawVar : this.b) {
                if (!this.c.contains(rawVar) && rawVar.a(cls)) {
                    this.c.add(rawVar);
                    arrayList.add(f(rawVar));
                    this.c.remove(rawVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (raw rawVar : this.b) {
            if (!arrayList.contains(rawVar.a) && rawVar.a(cls)) {
                arrayList.add(rawVar.a);
            }
        }
        return arrayList;
    }

    final synchronized void d(Class cls, Class cls2, rap rapVar) {
        g(cls, cls2, rapVar, true);
    }

    final synchronized void e(Class cls, Class cls2, rap rapVar) {
        g(cls, cls2, rapVar, false);
    }
}
