package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daq implements cxq {
    public Object a;
    public Object b;
    private final dcr c;
    private final dbv d;
    private cyb e;
    private cyb f;
    private final cyb g;
    private long h;
    private cyb i;

    public daq(cxt cxtVar, dbv dbvVar, Object obj, Object obj2, cyb cybVar) {
        this.c = cxtVar.a(dbvVar);
        this.d = dbvVar;
        this.a = obj2;
        this.b = obj;
        this.e = (cyb) dbvVar.b().invoke(obj);
        this.f = (cyb) dbvVar.b().invoke(obj2);
        this.g = cybVar != null ? cyc.a(cybVar) : ((cyb) dbvVar.b().invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.cxq
    public final long a() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long a = this.c.a(this.e, this.f, this.g);
        this.h = a;
        return a;
    }

    @Override // defpackage.cxq
    public final cyb b(long j) {
        if (!cxp.a(this, j)) {
            return this.c.d(j, this.e, this.f, this.g);
        }
        cyb cybVar = this.i;
        if (cybVar != null) {
            return cybVar;
        }
        cyb b = this.c.b(this.e, this.f, this.g);
        this.i = b;
        return b;
    }

    @Override // defpackage.cxq
    public final dbv c() {
        return this.d;
    }

    @Override // defpackage.cxq
    public final Object d(long j) {
        if (cxp.a(this, j)) {
            return this.a;
        }
        cyb c = this.c.c(j, this.e, this.f, this.g);
        int b = c.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(c.a(i))) {
                czx.b("AnimationVector cannot contain a NaN. " + c + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.d.a().invoke(c);
    }

    @Override // defpackage.cxq
    public final /* synthetic */ boolean e(long j) {
        return cxp.a(this, j);
    }

    @Override // defpackage.cxq
    public final boolean f() {
        return this.c.e();
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.b + " -> " + this.a + ",initial velocity: " + this.g + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.c;
    }

    public /* synthetic */ daq(cxt cxtVar, dbv dbvVar, Object obj, Object obj2) {
        this(cxtVar, dbvVar, obj, obj2, null);
    }

    @Override // defpackage.cxq
    public final void g() {
    }
}
