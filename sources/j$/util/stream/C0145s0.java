package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0145s0 extends AbstractC0155u0 {
    final /* synthetic */ EnumC0160v0 c;
    final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0145s0(EnumC0160v0 enumC0160v0, Predicate predicate) {
        super(enumC0160v0);
        this.c = enumC0160v0;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        EnumC0160v0 enumC0160v0 = this.c;
        z = enumC0160v0.a;
        if (test == z) {
            this.a = true;
            z2 = enumC0160v0.b;
            this.b = z2;
        }
    }
}
