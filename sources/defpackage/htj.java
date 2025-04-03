package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class htj {
    public final hsv a;
    public int b;
    public Map.Entry c;
    public Map.Entry d;
    private final Iterator e;

    public htj(hsv hsvVar, Iterator it) {
        this.a = hsvVar;
        this.e = it;
        this.b = hsvVar.a();
        a();
    }

    protected final void a() {
        this.c = this.d;
        Iterator it = this.e;
        this.d = ((hoi) it).c ? (Map.Entry) it.next() : null;
    }

    public final boolean hasNext() {
        return this.d != null;
    }

    public final void remove() {
        if (this.a.a() != this.b) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.c;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.a.remove(entry.getKey());
        this.c = null;
        this.b = this.a.a();
    }
}
