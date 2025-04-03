package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvbz implements Supplier {
    final /* synthetic */ bvca a;

    public bvbz(bvca bvcaVar) {
        this.a = bvcaVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Instant instant = this.a.a;
        if (instant == null || instant.equals(Instant.EPOCH)) {
            return null;
        }
        return Long.valueOf(bdgt.a(this.a.a));
    }
}
