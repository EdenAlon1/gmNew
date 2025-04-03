package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjd implements yjq {
    public final alxv a;
    public final Instant b;
    public final yjc c;

    public yjd(alxv alxvVar, Instant instant, yjc yjcVar) {
        this.a = alxvVar;
        this.b = instant;
        this.c = yjcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjd)) {
            return false;
        }
        yjd yjdVar = (yjd) obj;
        return ffkj.e(this.a, yjdVar.a) && ffkj.e(this.b, yjdVar.b) && ffkj.e(this.c, yjdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Instant instant = this.b;
        return ((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MapiPreparedMessage(envelope=" + this.a + ", scheduledTime=" + this.b + ", loggingEnvelope=" + this.c + ")";
    }
}
