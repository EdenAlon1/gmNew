package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bbwo implements Supplier {
    final /* synthetic */ bbwq a;

    public bbwo(bbwq bbwqVar) {
        this.a = bbwqVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azsu azsuVar = this.a.c;
        if (azsuVar == null || azsuVar.equals(null)) {
            return null;
        }
        return azsv.b(this.a.c);
    }
}
