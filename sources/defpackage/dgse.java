package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgse {
    private final List a = new CopyOnWriteArrayList();
    private final dgsd b;
    private Object c;

    public dgse(dgsd dgsdVar) {
        this.b = dgsdVar;
    }

    final void a(Object obj) {
        synchronized (this) {
            this.c = obj;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.a(it.next(), obj);
        }
    }

    public final void b(Object obj, emwl emwlVar) {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.a.isEmpty();
            this.a.add(obj);
        }
        if (isEmpty) {
            return;
        }
        synchronized (this) {
            Object obj2 = this.c;
            if (obj2 != null) {
                this.b.a(obj, obj2);
            }
        }
        dhrt.c(null);
    }

    public final void c(Object obj, emwl emwlVar) {
        synchronized (this) {
            this.a.remove(obj);
            if (this.a.isEmpty()) {
            } else {
                dhrt.c(true);
            }
        }
    }
}
