package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjy {
    public final iui a;
    public final cmy b;
    public final cok c = new cok(2);
    private final jjg d;

    public jjy(iui iuiVar, jjg jjgVar, cmy cmyVar) {
        this.a = iuiVar;
        this.d = jjgVar;
        this.b = cmyVar;
    }

    public final jjw a() {
        jjn jjnVar = new jjn();
        return new jjw(this.d, false, this.a, jjnVar);
    }

    public final void b(jjp jjpVar, jjn jjnVar) {
        cok cokVar = this.c;
        Object[] objArr = cokVar.b;
        int i = cokVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((jjq) objArr[i2]).b(jjpVar, jjnVar);
        }
    }
}
