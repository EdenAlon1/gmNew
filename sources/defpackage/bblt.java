package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bblt implements Supplier {
    final /* synthetic */ bblu a;

    public bblt(bblu bbluVar) {
        this.a = bbluVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azsu azsuVar = this.a.b;
        if (azsuVar == null || azsuVar.equals(null)) {
            return null;
        }
        return azsv.b(this.a.b);
    }
}
