package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0165w0 implements X3 {
    final EnumC0160v0 a;
    final Supplier b;

    C0165w0(EnumC0129o3 enumC0129o3, EnumC0160v0 enumC0160v0, Supplier supplier) {
        this.a = enumC0160v0;
        this.b = supplier;
    }

    @Override // j$.util.stream.X3
    public final Object a(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        AbstractC0155u0 abstractC0155u0 = (AbstractC0155u0) this.b.get();
        abstractC0060b.Q(spliterator, abstractC0155u0);
        return Boolean.valueOf(abstractC0155u0.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.X3
    public final Object b(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        return (Boolean) new C0170x0(this, abstractC0060b, spliterator).invoke();
    }

    @Override // j$.util.stream.X3
    public final int c() {
        return EnumC0124n3.u | EnumC0124n3.r;
    }
}
