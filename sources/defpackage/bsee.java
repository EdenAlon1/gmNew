package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bsee implements Supplier {
    final /* synthetic */ bseh a;

    public bsee(bseh bsehVar) {
        this.a = bsehVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azcr azcrVar = this.a.C;
        if (azcrVar == null || azcrVar.equals(null)) {
            return null;
        }
        return azcs.b(this.a.C);
    }
}
