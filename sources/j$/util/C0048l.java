package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0048l implements Iterator, A {
    public final /* synthetic */ int a = 0;
    private final Iterator b;

    public C0048l(C0049m c0049m) {
        this.b = c0049m.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.A
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                Iterator$EL.forEachRemaining(this.b, consumer);
                break;
            default:
                Iterator$EL.forEachRemaining(this.b, new C0052p(consumer));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C0053q((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0048l(C0054s c0054s) {
        this.b = c0054s.a.iterator();
    }
}
