package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class btfv implements Supplier {
    final /* synthetic */ btfw a;

    public btfv(btfw btfwVar) {
        this.a = btfwVar;
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
