package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxs {
    public final long a;
    public final hho b;
    public cyb c;
    public long d;
    private final dbv f;
    private final ffix g;
    public long e = Long.MIN_VALUE;
    private final hho h = new hic(true, hla.a);

    public cxs(Object obj, dbv dbvVar, cyb cybVar, long j, long j2, ffix ffixVar) {
        this.f = dbvVar;
        this.a = j2;
        this.g = ffixVar;
        this.b = new hic(obj, hla.a);
        this.c = cyc.a(cybVar);
        this.d = j;
    }

    public final Object a() {
        return this.b.a();
    }

    public final Object b() {
        return this.f.a().invoke(this.c);
    }

    public final void c() {
        e();
        this.g.invoke();
    }

    public final boolean d() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public final void e() {
        this.h.b(false);
    }
}
