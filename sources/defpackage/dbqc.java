package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqc extends dbqe {
    public final String a;
    public final Instant b;
    public final int c;
    public final int d;
    public final int e;

    public dbqc(String str, Instant instant, int i, int i2, int i3) {
        str.getClass();
        this.a = str;
        this.b = instant;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbqc)) {
            return false;
        }
        dbqc dbqcVar = (dbqc) obj;
        return ffkj.e(this.a, dbqcVar.a) && ffkj.e(this.b, dbqcVar.b) && this.c == dbqcVar.c && this.d == dbqcVar.d && this.e == dbqcVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "RunningWorkerUiData(queueName=" + this.a + ", startTime=" + this.b + ", inQueue=" + this.c + ", currentlyExecuting=" + this.d + ", succeededSoFar=" + this.e + ")";
    }
}
