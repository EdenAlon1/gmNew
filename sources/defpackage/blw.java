package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public class blw {
    final aob a;
    private final int b;
    private final ArrayDeque c;
    private final Object d = new Object();

    public blw(int i, aob aobVar) {
        this.b = i;
        this.c = new ArrayDeque(i);
        this.a = aobVar;
    }

    public final Object a() {
        Object removeLast;
        synchronized (this.d) {
            removeLast = this.c.removeLast();
        }
        return removeLast;
    }

    public final void b(Object obj) {
        Object a;
        synchronized (this.d) {
            a = this.c.size() >= this.b ? a() : null;
            this.c.addFirst(obj);
        }
        if (this.a == null || a == null) {
            return;
        }
        aob.a(a);
    }

    public final boolean c() {
        boolean isEmpty;
        synchronized (this.d) {
            isEmpty = this.c.isEmpty();
        }
        return isEmpty;
    }
}
