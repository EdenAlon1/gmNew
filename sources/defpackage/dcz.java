package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcz {
    public final cyt a;
    public cyb b;
    public cyb c;
    public final float d;
    private cyb e;

    public dcz(cyt cytVar) {
        this.a = cytVar;
        this.d = cytVar.a();
    }

    public final cyb a(cyb cybVar, cyb cybVar2) {
        if (this.e == null) {
            this.e = cybVar.c();
        }
        cyb cybVar3 = this.e;
        if (cybVar3 == null) {
            ffkj.c("targetVector");
            cybVar3 = null;
        }
        int b = cybVar3.b();
        for (int i = 0; i < b; i++) {
            cyb cybVar4 = this.e;
            if (cybVar4 == null) {
                ffkj.c("targetVector");
                cybVar4 = null;
            }
            cybVar4.e(i, this.a.b(cybVar.a(i), cybVar2.a(i)));
        }
        cyb cybVar5 = this.e;
        if (cybVar5 != null) {
            return cybVar5;
        }
        ffkj.c("targetVector");
        return null;
    }

    public final cyb b(long j, cyb cybVar, cyb cybVar2) {
        if (this.c == null) {
            this.c = cybVar.c();
        }
        cyb cybVar3 = this.c;
        if (cybVar3 == null) {
            ffkj.c("velocityVector");
            cybVar3 = null;
        }
        int b = cybVar3.b();
        for (int i = 0; i < b; i++) {
            cyb cybVar4 = this.c;
            if (cybVar4 == null) {
                ffkj.c("velocityVector");
                cybVar4 = null;
            }
            cyt cytVar = this.a;
            cybVar.a(i);
            cybVar4.e(i, cytVar.e(j, cybVar2.a(i)));
        }
        cyb cybVar5 = this.c;
        if (cybVar5 != null) {
            return cybVar5;
        }
        ffkj.c("velocityVector");
        return null;
    }
}
