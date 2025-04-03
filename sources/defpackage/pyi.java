package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyi {
    public final String a;
    public final pqp b;
    public final pot c;
    public final long d;
    public final long e;
    public final long f;
    public final poj g;
    public final int h;
    public final poa i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public pyi(String str, pqp pqpVar, pot potVar, long j, long j2, long j3, poj pojVar, int i, poa poaVar, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        pqpVar.getClass();
        potVar.getClass();
        poaVar.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = pqpVar;
        this.c = potVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = pojVar;
        this.h = i;
        this.i = poaVar;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyi)) {
            return false;
        }
        pyi pyiVar = (pyi) obj;
        return ffkj.e(this.a, pyiVar.a) && this.b == pyiVar.b && ffkj.e(this.c, pyiVar.c) && this.d == pyiVar.d && this.e == pyiVar.e && this.f == pyiVar.f && ffkj.e(this.g, pyiVar.g) && this.h == pyiVar.h && this.i == pyiVar.i && this.j == pyiVar.j && this.k == pyiVar.k && this.l == pyiVar.l && this.m == pyiVar.m && this.n == pyiVar.n && this.o == pyiVar.o && ffkj.e(this.p, pyiVar.p) && ffkj.e(this.q, pyiVar.q);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        poj pojVar = this.g;
        long j = this.f;
        int a = (((((((((((hashCode * 31) + pyh.a(this.d)) * 31) + pyh.a(this.e)) * 31) + pyh.a(j)) * 31) + pojVar.hashCode()) * 31) + this.h) * 31) + this.i.hashCode();
        List list = this.p;
        long j2 = this.n;
        return (((((((((((((((a * 31) + pyh.a(this.j)) * 31) + pyh.a(this.k)) * 31) + this.l) * 31) + this.m) * 31) + pyh.a(j2)) * 31) + this.o) * 31) + list.hashCode()) * 31) + this.q.hashCode();
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
