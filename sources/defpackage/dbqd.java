package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqd extends dbqe {
    public final String a;
    public final Instant b;
    public final Instant c;
    public final int d;
    private final poj e;

    public dbqd(String str, Instant instant, poj pojVar, Instant instant2, int i) {
        this.a = str;
        this.b = instant;
        this.e = pojVar;
        this.c = instant2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbqd)) {
            return false;
        }
        dbqd dbqdVar = (dbqd) obj;
        return ffkj.e(this.a, dbqdVar.a) && ffkj.e(this.b, dbqdVar.b) && ffkj.e(this.e, dbqdVar.e) && ffkj.e(this.c, dbqdVar.c) && this.d == dbqdVar.d;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
        Instant instant = this.c;
        return (((hashCode * 31) + (instant == null ? 0 : instant.hashCode())) * 31) + this.d;
    }

    public final String toString() {
        return "ScheduledWorkerUiData(queueName=" + this.a + ", scheduledAtTime=" + this.b + ", constraints=" + this.e + ", minimumStartTime=" + this.c + ", pendingJobReason=" + this.d + ")";
    }
}
