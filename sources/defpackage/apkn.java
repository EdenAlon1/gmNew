package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apkn {
    public final String a;
    public final aplf b;
    public final long c;
    public final Instant d;
    public final Instant e;

    public apkn(String str, aplf aplfVar, long j, Instant instant, Instant instant2) {
        aplfVar.getClass();
        this.a = str;
        this.b = aplfVar;
        this.c = j;
        this.d = instant;
        this.e = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apkn)) {
            return false;
        }
        apkn apknVar = (apkn) obj;
        return ffkj.e(this.a, apknVar.a) && this.b == apknVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EmergencySession(emergencyDestination=" + this.a + ", sessionType=" + this.b + ", refillDurationMs=" + this.c + ", startTime=" + this.d + ", endTime=" + this.e + ")";
    }
}
