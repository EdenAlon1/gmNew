package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxto implements Supplier {
    final /* synthetic */ bxtp a;

    public bxto(bxtp bxtpVar) {
        this.a = bxtpVar;
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
