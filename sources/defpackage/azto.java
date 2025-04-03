package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azto implements Supplier {
    final /* synthetic */ aztp a;

    public azto(aztp aztpVar) {
        this.a = aztpVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azsu azsuVar = this.a.e;
        if (azsuVar == null || azsuVar.equals(null)) {
            return null;
        }
        return azsv.b(this.a.e);
    }
}
