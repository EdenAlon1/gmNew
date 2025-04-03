package defpackage;

import android.os.Bundle;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhc {
    private final cqoh a;
    private Duration b = Duration.ZERO;
    private Instant c;

    public uhc(cqoh cqohVar) {
        this.a = cqohVar;
    }

    public final Duration a() {
        Instant instant = this.c;
        return (instant != null ? Duration.between(instant, this.a.f()) : Duration.ZERO).plus(this.b);
    }

    public final void b(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("usage_time")) {
            d();
        } else {
            this.b = Duration.ofMillis(bundle.getLong("usage_time"));
            d();
        }
    }

    public final void c(Bundle bundle) {
        Duration a = a();
        if (a.isZero()) {
            return;
        }
        bundle.putLong("usage_time", a.toMillis());
    }

    public final void d() {
        this.c = this.a.f();
    }
}
