package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxv implements hkx {
    public final dbv a;
    public cyb b;
    public long c;
    public long d;
    public boolean e;
    private final hho f;

    public cxv(dbv dbvVar, Object obj, cyb cybVar, long j, long j2, boolean z) {
        this.a = dbvVar;
        this.f = new hic(obj, hla.a);
        this.b = cybVar != null ? cyc.a(cybVar) : cxw.a(dbvVar, obj);
        this.c = j;
        this.d = j2;
        this.e = z;
    }

    @Override // defpackage.hkx
    public final Object a() {
        return this.f.a();
    }

    public final Object b() {
        return this.a.a().invoke(this.b);
    }

    public final void c(Object obj) {
        this.f.b(obj);
    }

    public final String toString() {
        return "AnimationState(value=" + a() + ", velocity=" + b() + ", isRunning=" + this.e + ", lastFrameTimeNanos=" + this.c + ", finishedTimeNanos=" + this.d + ')';
    }

    public /* synthetic */ cxv(dbv dbvVar, Object obj, cyb cybVar, int i) {
        this(dbvVar, obj, (i & 4) != 0 ? null : cybVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
