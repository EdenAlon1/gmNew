package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtca {
    public final dtbw a;
    public final Duration b;
    public final long c;
    public final jpo d;

    public dtca(dtbw dtbwVar, Duration duration, long j, jpo jpoVar) {
        jpoVar.getClass();
        this.a = dtbwVar;
        this.b = duration;
        this.c = j;
        this.d = jpoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtca)) {
            return false;
        }
        dtca dtcaVar = (dtca) obj;
        if (!ffkj.e(this.a, dtcaVar.a) || !ffkj.e(this.b, dtcaVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = dtcaVar.c;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffkj.e(this.d, dtcaVar.d);
    }

    public final int hashCode() {
        dtbw dtbwVar = this.a;
        int hashCode = ((dtbwVar == null ? 0 : dtbwVar.hashCode()) * 31) + this.b.hashCode();
        long j = this.c;
        long j2 = ibw.a;
        return (((hashCode * 31) + ffco.a(j)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TimerData(dotData=" + this.a + ", time=" + this.b + ", textColor=" + ibw.g(this.c) + ", textStyle=" + this.d + ")";
    }

    public /* synthetic */ dtca(Duration duration, long j, jpo jpoVar) {
        this(null, duration, j, jpoVar);
    }
}
