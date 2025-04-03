package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cghm {
    private final cggu a;
    private final cghg b;

    public cghm(cggu cgguVar, cghg cghgVar) {
        cgguVar.getClass();
        cghgVar.getClass();
        this.a = cgguVar;
        this.b = cghgVar;
    }

    public final Object a(ffgu ffguVar) {
        return this.a.c() ? Boolean.valueOf(this.a.e()) : this.b.b(ffguVar);
    }

    public final boolean b() {
        if (this.a.c()) {
            return this.a.e();
        }
        cghi cghiVar = (cghi) this.b.b.l();
        if ((cghiVar.b & 1) == 0) {
            return false;
        }
        cggw cggwVar = cghiVar.c;
        if (cggwVar == null) {
            cggwVar = cggw.a;
        }
        cggwVar.getClass();
        return cghg.c(cggwVar);
    }
}
