package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azhu implements Supplier {
    final /* synthetic */ azhv a;

    public azhu(azhv azhvVar) {
        this.a = azhvVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azcr azcrVar = this.a.a;
        if (azcrVar == null || azcrVar.equals(null)) {
            return null;
        }
        return azcs.b(this.a.a);
    }
}
