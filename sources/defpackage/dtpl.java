package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpl {
    public final String a;
    private final Map b;
    private final int c;
    private final int d;

    public dtpl(String str, Map map, int i, int i2) {
        this.a = str;
        this.b = map;
        this.c = i;
        this.d = i2;
    }

    public final dtpd a() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (dtpd dtpdVar : this.b.values()) {
            j += dtpdVar.a();
            j2 += dtpdVar.c();
            j3 += dtpdVar.b();
        }
        return new dtoz(j, j2, j3);
    }

    public final String toString() {
        return "ThreadPoolStatsSnapshot{threadPoolName='" + this.a + "', startedTaskCount=" + this.c + ", finishedTaskCount=" + this.d + ", taskSchedStats=" + this.b + ", aggregatedSchedStats=" + a() + '}';
    }
}
