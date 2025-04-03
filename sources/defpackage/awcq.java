package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awcq {
    public final awcr a;
    public final Duration b;
    public final int c;

    public awcq(awcr awcrVar, int i, Duration duration) {
        awcrVar.getClass();
        this.a = awcrVar;
        this.c = i;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awcq)) {
            return false;
        }
        awcq awcqVar = (awcq) obj;
        return this.a == awcqVar.a && this.c == awcqVar.c && ffkj.e(this.b, awcqVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileProcessingStepData(stepName=");
        sb.append(this.a);
        sb.append(", executionStatus=");
        int i = this.c;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "FAILED" : "CANCELED" : "SUCCEEDED_AFTER_RETRY" : "SUCCEEDED"));
        sb.append(", executionLatency=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
