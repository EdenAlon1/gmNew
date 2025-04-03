package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
final class W3 extends T3 implements Stream.Builder {
    Object b;
    C0084f3 c;

    W3(Object obj) {
        this.b = obj;
        this.a = -2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.b = obj;
            this.a = i + 1;
        } else {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            if (this.c == null) {
                C0084f3 c0084f3 = new C0084f3();
                this.c = c0084f3;
                c0084f3.accept(this.b);
                this.a++;
            }
            this.c.accept(obj);
        }
    }

    @Override // j$.util.stream.Stream.Builder
    public final Stream.Builder add(Object obj) {
        accept(obj);
        return this;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Stream.Builder
    public final Stream build() {
        int i = this.a;
        if (i < 0) {
            throw new IllegalStateException();
        }
        this.a = (-i) - 1;
        return i < 2 ? StreamSupport.stream(this, false) : StreamSupport.stream(this.c.spliterator(), false);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        if (this.a == -2) {
            consumer.accept(this.b);
            this.a = -1;
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.a != -2) {
            return false;
        }
        consumer.accept(this.b);
        this.a = -1;
        return true;
    }
}
