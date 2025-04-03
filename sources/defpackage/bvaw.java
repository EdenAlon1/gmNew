package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvaw implements Supplier {
    final /* synthetic */ bvax a;

    public bvaw(bvax bvaxVar) {
        this.a = bvaxVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bdhl bdhlVar = this.a.b;
        if (bdhlVar == null || bdhlVar.equals(bdhl.a)) {
            return null;
        }
        return bdhl.d(this.a.b);
    }
}
