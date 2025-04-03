package defpackage;

import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avtk implements avtj {
    final /* synthetic */ Supplier a;

    public avtk(Supplier supplier) {
        this.a = supplier;
    }

    @Override // defpackage.avtj
    public final Duration a() {
        Object obj;
        obj = this.a.get();
        return ((avtj) obj).a();
    }

    @Override // defpackage.avtj
    public final Duration b() {
        Object obj;
        obj = this.a.get();
        return ((avtj) obj).b();
    }
}
