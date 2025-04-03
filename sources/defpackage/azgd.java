package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azgd implements Supplier {
    final /* synthetic */ azge a;

    public azgd(azge azgeVar) {
        this.a = azgeVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azcr azcrVar = this.a.b;
        if (azcrVar == null || azcrVar.equals(null)) {
            return null;
        }
        return azcs.b(this.a.b);
    }
}
