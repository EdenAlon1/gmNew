package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class buzn implements Supplier {
    final /* synthetic */ buzp a;

    public buzn(buzp buzpVar) {
        this.a = buzpVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bdhk bdhkVar = this.a.a;
        if (bdhkVar == null || bdhkVar.equals(bdhk.a)) {
            return null;
        }
        return Long.valueOf(bdhk.a(this.a.a));
    }
}
