package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0065c extends AbstractC0075e {
    protected final AtomicReference h;
    protected volatile boolean i;

    protected AbstractC0065c(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        super(abstractC0060b, spliterator);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC0075e
    public final Object c() {
        if (!d()) {
            return super.c();
        }
        Object obj = this.h.get();
        return obj == null ? j() : obj;
    }

    @Override // j$.util.stream.AbstractC0075e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        CountedCompleter completer;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = AbstractC0075e.g(estimateSize);
            this.c = j;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC0065c abstractC0065c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = abstractC0065c.i;
            if (!z2) {
                completer = abstractC0065c.getCompleter();
                while (true) {
                    AbstractC0065c abstractC0065c2 = (AbstractC0065c) ((AbstractC0075e) completer);
                    if (z2 || abstractC0065c2 == null) {
                        break;
                    }
                    z2 = abstractC0065c2.i;
                    completer = abstractC0065c2.getCompleter();
                }
            }
            if (z2) {
                obj = abstractC0065c.j();
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC0065c abstractC0065c3 = (AbstractC0065c) abstractC0065c.e(trySplit);
            abstractC0065c.d = abstractC0065c3;
            AbstractC0065c abstractC0065c4 = (AbstractC0065c) abstractC0065c.e(spliterator);
            abstractC0065c.e = abstractC0065c4;
            abstractC0065c.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                abstractC0065c = abstractC0065c3;
                abstractC0065c3 = abstractC0065c4;
            } else {
                abstractC0065c = abstractC0065c4;
            }
            z = !z;
            abstractC0065c3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = abstractC0065c.a();
        abstractC0065c.f(obj);
        abstractC0065c.tryComplete();
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            j$.util.concurrent.m.a(this.h, null, obj);
        }
    }

    @Override // j$.util.stream.AbstractC0075e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.i = true;
    }

    protected final void i() {
        CountedCompleter completer;
        CountedCompleter completer2;
        completer = getCompleter();
        AbstractC0065c abstractC0065c = (AbstractC0065c) ((AbstractC0075e) completer);
        AbstractC0065c abstractC0065c2 = this;
        while (abstractC0065c != null) {
            if (abstractC0065c.d == abstractC0065c2) {
                AbstractC0065c abstractC0065c3 = (AbstractC0065c) abstractC0065c.e;
                if (!abstractC0065c3.i) {
                    abstractC0065c3.h();
                }
            }
            completer2 = abstractC0065c.getCompleter();
            AbstractC0065c abstractC0065c4 = (AbstractC0065c) ((AbstractC0075e) completer2);
            abstractC0065c2 = abstractC0065c;
            abstractC0065c = abstractC0065c4;
        }
    }

    protected abstract Object j();

    protected AbstractC0065c(AbstractC0065c abstractC0065c, Spliterator spliterator) {
        super(abstractC0065c, spliterator);
        this.h = abstractC0065c.h;
    }
}
