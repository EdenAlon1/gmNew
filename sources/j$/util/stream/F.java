package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
final class F implements X3 {
    final int a;
    final Object b;
    final Predicate c;
    final Supplier d;

    F(boolean z, EnumC0129o3 enumC0129o3, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : EnumC0124n3.r) | EnumC0124n3.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.X3
    public final Object a(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        Y3 y3 = (Y3) this.d.get();
        abstractC0060b.Q(spliterator, y3);
        Object obj = y3.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.X3
    public final Object b(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        return new L(this, EnumC0124n3.ORDERED.y(abstractC0060b.F()), abstractC0060b, spliterator).invoke();
    }

    @Override // j$.util.stream.X3
    public final int c() {
        return this.a;
    }
}
