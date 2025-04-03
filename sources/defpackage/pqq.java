package defpackage;

import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqq {
    public final UUID a;
    public final pqp b;
    public final Set c;
    public final poj d;
    private final pot e;
    private final pot f;
    private final int g;
    private final int h;
    private final long i;
    private final pqo j;
    private final long k;
    private final int l;

    public pqq(UUID uuid, pqp pqpVar, Set set, pot potVar, pot potVar2, int i, int i2, poj pojVar, long j, pqo pqoVar, long j2, int i3) {
        potVar2.getClass();
        this.a = uuid;
        this.b = pqpVar;
        this.c = set;
        this.e = potVar;
        this.f = potVar2;
        this.g = i;
        this.h = i2;
        this.d = pojVar;
        this.i = j;
        this.j = pqoVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ffkj.e(getClass(), obj.getClass())) {
            return false;
        }
        pqq pqqVar = (pqq) obj;
        if (this.g == pqqVar.g && this.h == pqqVar.h && ffkj.e(this.a, pqqVar.a) && this.b == pqqVar.b && ffkj.e(this.e, pqqVar.e) && ffkj.e(this.d, pqqVar.d) && this.i == pqqVar.i && ffkj.e(this.j, pqqVar.j) && this.k == pqqVar.k && this.l == pqqVar.l && ffkj.e(this.c, pqqVar.c)) {
            return ffkj.e(this.f, pqqVar.f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.d.hashCode();
        pqo pqoVar = this.j;
        return (((((((hashCode * 31) + pqm.a(this.i)) * 31) + (pqoVar != null ? pqoVar.hashCode() : 0)) * 31) + pqm.a(this.k)) * 31) + this.l;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.e + ", tags=" + this.c + ", progress=" + this.f + ", runAttemptCount=" + this.g + ", generation=" + this.h + ", constraints=" + this.d + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
