package defpackage;

import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enfn extends enfd implements Queue {
    protected enfn() {
    }

    @Override // defpackage.enfd
    protected /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    protected abstract Queue c();

    @Override // java.util.Queue
    public final Object element() {
        return c().element();
    }

    public boolean offer(Object obj) {
        return c().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return c().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return c().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return c().remove();
    }
}
