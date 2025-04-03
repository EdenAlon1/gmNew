package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwjm implements Supplier {
    final /* synthetic */ bwjn a;

    public bwjm(bwjn bwjnVar) {
        this.a = bwjnVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        cjlk cjlkVar = this.a.a;
        if (cjlkVar == null || cjlkVar.equals(null)) {
            return null;
        }
        return cjlv.b(this.a.a);
    }
}
