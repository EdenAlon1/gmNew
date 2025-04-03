package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfip {
    public final long a;
    public final List b;
    public final int c;

    public cfip(long j, List list, int i) {
        this.a = j;
        this.b = list;
        this.c = i;
    }

    public static /* synthetic */ cfip a(cfip cfipVar, List list, int i, int i2) {
        long j = (i2 & 1) != 0 ? cfipVar.a : 0L;
        if ((i2 & 2) != 0) {
            list = cfipVar.b;
        }
        if ((i2 & 4) != 0) {
            i = cfipVar.c;
        }
        list.getClass();
        return new cfip(j, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfip)) {
            return false;
        }
        cfip cfipVar = (cfip) obj;
        return this.a == cfipVar.a && ffkj.e(this.b, cfipVar.b) && this.c == cfipVar.c;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "ActiveWorkerStats(startedAtTimeMillis=" + this.a + ", currentlyExecutingItems=" + this.b + ", completedWorkItems=" + this.c + ")";
    }
}
