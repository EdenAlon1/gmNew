package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eqd implements idh {
    public final eqe a;
    public final eqe b;
    public final eqe c;
    public final eqe d;

    public eqd(eqe eqeVar, eqe eqeVar2, eqe eqeVar3, eqe eqeVar4) {
        this.a = eqeVar;
        this.b = eqeVar2;
        this.c = eqeVar3;
        this.d = eqeVar4;
    }

    public static /* synthetic */ eqd d(eqd eqdVar, eqe eqeVar, eqe eqeVar2, eqe eqeVar3, eqe eqeVar4, int i) {
        if ((i & 1) != 0) {
            eqeVar = eqdVar.a;
        }
        if ((i & 2) != 0) {
            eqeVar2 = eqdVar.b;
        }
        if ((i & 4) != 0) {
            eqeVar3 = eqdVar.c;
        }
        if ((i & 8) != 0) {
            eqeVar4 = eqdVar.d;
        }
        return eqdVar.b(eqeVar, eqeVar2, eqeVar3, eqeVar4);
    }

    @Override // defpackage.idh
    public final icr a(long j, kah kahVar, jzn jznVar) {
        eqe eqeVar = this.d;
        eqe eqeVar2 = this.c;
        eqe eqeVar3 = this.b;
        float a = this.a.a(j, jznVar);
        float a2 = eqeVar3.a(j, jznVar);
        float a3 = eqeVar2.a(j, jznVar);
        float a4 = eqeVar.a(j, jznVar);
        float f = a + a4;
        float b = iar.b(j);
        if (f > b) {
            float f2 = b / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > b) {
            float f4 = b / f3;
            a2 *= f4;
            a3 *= f4;
        }
        float f5 = a2;
        if (a < 0.0f || f5 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            dwv.c("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + f5 + ", bottomEnd = " + a3 + ", bottomStart = " + a4 + ")!");
        }
        return c(j, a, f5, a3, a4, kahVar);
    }

    public abstract eqd b(eqe eqeVar, eqe eqeVar2, eqe eqeVar3, eqe eqeVar4);

    public abstract icr c(long j, float f, float f2, float f3, float f4, kah kahVar);
}
