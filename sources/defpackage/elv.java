package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elv {
    public final ehp a = new ehp();
    private final cop b;
    private Object c;
    private ehp d;

    public elv() {
        long[] jArr = cpg.a;
        this.b = new cop((byte[]) null);
    }

    public final ehp a(Object obj) {
        ehp ehpVar = this.d;
        if (this.c == obj && ehpVar != null) {
            return ehpVar;
        }
        cop copVar = this.b;
        Object f = copVar.f(obj);
        if (f == null) {
            ehp ehpVar2 = this.a;
            ehp ehpVar3 = new ehp();
            ehpVar3.a = ehpVar2.a;
            ehpVar3.b = ehpVar2.b;
            copVar.e(obj, ehpVar3);
            f = ehpVar3;
        }
        ehp ehpVar4 = (ehp) f;
        this.c = obj;
        this.d = ehpVar4;
        return ehpVar4;
    }
}
