package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class buzo implements Supplier {
    final /* synthetic */ buzp a;

    public buzo(buzp buzpVar) {
        this.a = buzpVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Instant instant = this.a.b;
        if (instant == null || instant.equals(Instant.EPOCH)) {
            return null;
        }
        return Long.valueOf(bdgt.a(this.a.b));
    }
}
