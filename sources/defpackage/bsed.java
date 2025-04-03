package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bsed implements Supplier {
    final /* synthetic */ bseh a;

    public bsed(bseh bsehVar) {
        this.a = bsehVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azsu azsuVar = this.a.B;
        if (azsuVar == null || azsuVar.equals(null)) {
            return null;
        }
        return azsv.b(this.a.B);
    }
}
