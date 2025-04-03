package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcy implements dcr {
    private final cyd a;
    private cyb b;
    private cyb c;
    private cyb d;

    public dcy(cyd cydVar) {
        this.a = cydVar;
    }

    @Override // defpackage.dcr
    public final long a(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        int b = cybVar.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, this.a.a(i).e(cybVar.a(i), cybVar2.a(i), cybVar3.a(i)));
        }
        return j;
    }

    @Override // defpackage.dcr
    public final cyb b(cyb cybVar, cyb cybVar2, cyb cybVar3) {
        if (this.d == null) {
            this.d = cybVar3.c();
        }
        cyb cybVar4 = this.d;
        if (cybVar4 == null) {
            ffkj.c("endVelocityVector");
            cybVar4 = null;
        }
        int b = cybVar4.b();
        for (int i = 0; i < b; i++) {
            cyb cybVar5 = this.d;
            if (cybVar5 == null) {
                ffkj.c("endVelocityVector");
                cybVar5 = null;
            }
            cybVar5.e(i, this.a.a(i).b(cybVar.a(i), cybVar2.a(i), cybVar3.a(i)));
        }
        cyb cybVar6 = this.d;
        if (cybVar6 != null) {
            return cybVar6;
        }
        ffkj.c("endVelocityVector");
        return null;
    }

    @Override // defpackage.dcr
    public final cyb c(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        if (this.b == null) {
            this.b = cybVar.c();
        }
        cyb cybVar4 = this.b;
        if (cybVar4 == null) {
            ffkj.c("valueVector");
            cybVar4 = null;
        }
        int b = cybVar4.b();
        for (int i = 0; i < b; i++) {
            cyb cybVar5 = this.b;
            if (cybVar5 == null) {
                ffkj.c("valueVector");
                cybVar5 = null;
            }
            cybVar5.e(i, this.a.a(i).c(j, cybVar.a(i), cybVar2.a(i), cybVar3.a(i)));
        }
        cyb cybVar6 = this.b;
        if (cybVar6 != null) {
            return cybVar6;
        }
        ffkj.c("valueVector");
        return null;
    }

    @Override // defpackage.dcr
    public final cyb d(long j, cyb cybVar, cyb cybVar2, cyb cybVar3) {
        if (this.c == null) {
            this.c = cybVar3.c();
        }
        cyb cybVar4 = this.c;
        if (cybVar4 == null) {
            ffkj.c("velocityVector");
            cybVar4 = null;
        }
        int b = cybVar4.b();
        for (int i = 0; i < b; i++) {
            cyb cybVar5 = this.c;
            if (cybVar5 == null) {
                ffkj.c("velocityVector");
                cybVar5 = null;
            }
            cybVar5.e(i, this.a.a(i).d(j, cybVar.a(i), cybVar2.a(i), cybVar3.a(i)));
        }
        cyb cybVar6 = this.c;
        if (cybVar6 != null) {
            return cybVar6;
        }
        ffkj.c("velocityVector");
        return null;
    }

    @Override // defpackage.dcr
    public final /* synthetic */ boolean e() {
        return false;
    }

    public dcy(cys cysVar) {
        this(new dcx(cysVar));
    }
}
