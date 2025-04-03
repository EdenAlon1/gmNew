package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0089g3 extends Spliterators.AbstractSpliterator {
    Object d;
    boolean e;
    boolean f;
    final /* synthetic */ UnaryOperator g;
    final /* synthetic */ Object h;
    final /* synthetic */ Predicate i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0089g3(Object obj, Predicate predicate, UnaryOperator unaryOperator) {
        super(Long.MAX_VALUE, 1040);
        this.g = unaryOperator;
        this.h = obj;
        this.i = predicate;
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        if (this.f) {
            return;
        }
        this.f = true;
        boolean z = this.e;
        UnaryOperator unaryOperator = this.g;
        this.d = null;
        for (Object apply = z ? unaryOperator.apply(this.d) : this.h; this.i.test(apply); apply = unaryOperator.apply(apply)) {
            consumer.accept(apply);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        if (this.f) {
            return false;
        }
        if (this.e) {
            obj = this.g.apply(this.d);
        } else {
            this.e = true;
            obj = this.h;
        }
        if (this.i.test(obj)) {
            this.d = obj;
            consumer.accept(obj);
            return true;
        }
        this.d = null;
        this.f = true;
        return false;
    }
}
