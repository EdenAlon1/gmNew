package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyi implements cxq {
    private final dbv a;
    private final Object b;
    private final cyb c;
    private final cyb d;
    private final cyb e;
    private final Object f;
    private final long g;
    private final dcz h;

    public cyi(cyj cyjVar, dbv dbvVar, Object obj, cyb cybVar) {
        dcz a = cyjVar.a();
        this.h = a;
        this.a = dbvVar;
        this.b = obj;
        cyb cybVar2 = (cyb) dbvVar.b().invoke(obj);
        this.c = cybVar2;
        this.d = cyc.a(cybVar);
        this.f = dbvVar.a().invoke(a.a(cybVar2, cybVar));
        if (a.c == null) {
            a.c = cybVar2.c();
        }
        cyb cybVar3 = a.c;
        if (cybVar3 == null) {
            ffkj.c("velocityVector");
            cybVar3 = null;
        }
        int b = cybVar3.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            cyt cytVar = a.a;
            cybVar2.a(i);
            j = Math.max(j, cytVar.d(cybVar.a(i)));
        }
        this.g = j;
        cyb a2 = cyc.a(this.h.b(j, this.c, cybVar));
        this.e = a2;
        int b2 = a2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            cyb cybVar4 = this.e;
            float a3 = cybVar4.a(i2);
            float f = this.h.d;
            cybVar4.e(i2, ffmk.e(a3, -f, f));
        }
    }

    @Override // defpackage.cxq
    public final long a() {
        return this.g;
    }

    @Override // defpackage.cxq
    public final cyb b(long j) {
        return !cxp.a(this, j) ? this.h.b(j, this.c, this.d) : this.e;
    }

    @Override // defpackage.cxq
    public final dbv c() {
        return this.a;
    }

    @Override // defpackage.cxq
    public final Object d(long j) {
        if (cxp.a(this, j)) {
            return this.f;
        }
        dbv dbvVar = this.a;
        dcz dczVar = this.h;
        cyb cybVar = this.c;
        cyb cybVar2 = this.d;
        ffji a = dbvVar.a();
        if (dczVar.b == null) {
            dczVar.b = cybVar.c();
        }
        cyb cybVar3 = dczVar.b;
        cyb cybVar4 = null;
        if (cybVar3 == null) {
            ffkj.c("valueVector");
            cybVar3 = null;
        }
        int b = cybVar3.b();
        for (int i = 0; i < b; i++) {
            cyb cybVar5 = dczVar.b;
            if (cybVar5 == null) {
                ffkj.c("valueVector");
                cybVar5 = null;
            }
            cybVar5.e(i, dczVar.a.c(j, cybVar.a(i), cybVar2.a(i)));
        }
        cyb cybVar6 = dczVar.b;
        if (cybVar6 == null) {
            ffkj.c("valueVector");
        } else {
            cybVar4 = cybVar6;
        }
        return a.invoke(cybVar4);
    }

    @Override // defpackage.cxq
    public final /* synthetic */ boolean e(long j) {
        return cxp.a(this, j);
    }

    @Override // defpackage.cxq
    public final boolean f() {
        return false;
    }

    @Override // defpackage.cxq
    public final void g() {
    }
}
