package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgbe {
    private final cqoh a;
    private final Map b;
    private final attl c;

    public cgbe(cqoh cqohVar, Map map, attl attlVar) {
        this.a = cqohVar;
        this.b = new HashMap(map);
        this.c = attlVar;
    }

    final long a(bted btedVar) {
        if (this.c.a() && btedVar.n().compareTo(Duration.ZERO) > 0) {
            return btedVar.n().plusMillis(btedVar.k()).toMillis();
        }
        cgbh cgbhVar = (cgbh) this.b.get(btedVar.m());
        if (cgbhVar == null) {
            return Long.MAX_VALUE;
        }
        btedVar.m();
        return cgbhVar.d().plusMillis(btedVar.k()).toMillis();
    }

    final Instant b(bted btedVar) {
        return Instant.ofEpochMilli(a(btedVar));
    }

    final boolean c(bted btedVar) {
        return b(btedVar).compareTo(this.a.f()) <= 0;
    }
}
