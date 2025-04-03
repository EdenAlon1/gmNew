package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awdz implements Supplier {
    final /* synthetic */ awea a;

    public awdz(awea aweaVar) {
        this.a = aweaVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        awap awapVar = this.a.a;
        if (awapVar == null || awapVar.equals(null)) {
            return null;
        }
        return awao.b(this.a.a);
    }
}
