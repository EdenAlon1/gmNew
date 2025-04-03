package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffqu {
    public final ffss[] a;
    public final ffql b;

    public ffqu(ffss[] ffssVarArr) {
        this.a = ffssVarArr;
        this.b = new ffql(ffssVarArr.length, ffqo.a);
    }

    public final Object a(ffgu ffguVar) {
        ffte b;
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        int length = this.a.length;
        ffqs[] ffqsVarArr = new ffqs[length];
        for (int i = 0; i < length; i++) {
            ffss ffssVar = this.a[i];
            ffssVar.z();
            ffqs ffqsVar = new ffqs(this, ffrhVar);
            b = ffui.b(ffssVar, true, ffqsVar);
            ffqsVar.a = b;
            ffqsVarArr[i] = ffqsVar;
        }
        ffqt ffqtVar = new ffqt(ffqsVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            ffqsVarArr[i2].b.c(ffqtVar);
        }
        if (ffrhVar.k()) {
            ffqtVar.a();
        } else {
            ffrhVar.D(ffqtVar);
        }
        Object m = ffrhVar.m();
        if (m == ffhh.a) {
            ffguVar.getClass();
        }
        return m;
    }
}
