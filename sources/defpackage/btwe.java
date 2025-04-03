package defpackage;

import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class btwe implements Supplier {
    final /* synthetic */ btwf a;

    public btwe(btwf btwfVar) {
        this.a = btwfVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        UUID uuid = this.a.b;
        if (uuid == null || uuid.equals(bdhh.b())) {
            return null;
        }
        return bdhh.a(this.a.b);
    }
}
