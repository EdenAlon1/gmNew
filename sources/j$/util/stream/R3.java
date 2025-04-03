package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
final class R3 extends AbstractC0134p3 {
    @Override // j$.util.stream.AbstractC0134p3
    final void d() {
        C0084f3 c0084f3 = new C0084f3();
        this.h = c0084f3;
        this.e = this.b.R(new C0055a(10, c0084f3));
        this.f = new C0055a(11, this);
    }

    @Override // j$.util.stream.AbstractC0134p3
    final AbstractC0134p3 e(Spliterator spliterator) {
        return new R3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        consumer.getClass();
        c();
        C0055a c0055a = new C0055a(12, consumer);
        this.b.Q(this.d, c0055a);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean a = a();
        if (!a) {
            return a;
        }
        C0084f3 c0084f3 = (C0084f3) this.h;
        long j = this.g;
        if (c0084f3.c != 0) {
            if (j >= c0084f3.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= c0084f3.c; i++) {
                long j2 = c0084f3.d[i];
                Object[] objArr = c0084f3.f[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= c0084f3.b) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = c0084f3.e[(int) j];
        consumer.o(obj);
        return a;
    }
}
