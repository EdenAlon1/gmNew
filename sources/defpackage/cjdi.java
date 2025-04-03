package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdi {
    public final cqoh a;

    public cjdi(cqoh cqohVar) {
        cqohVar.getClass();
        this.a = cqohVar;
    }

    public final boolean a(long j) {
        long epochMilli = this.a.f().toEpochMilli();
        Object e = ctjd.Z.e();
        e.getClass();
        long longValue = j + ((Number) e).longValue();
        Object e2 = ctjd.aa.e();
        e2.getClass();
        return longValue <= epochMilli && epochMilli <= ((Number) e2).longValue() + longValue;
    }
}
