package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rff extends qqt {
    public static rff b() {
        rff rffVar = new rff();
        rffVar.e(new rjb());
        return rffVar;
    }

    public static rff c(rjc rjcVar) {
        rff rffVar = new rff();
        rffVar.d(rjcVar);
        return rffVar;
    }

    public final void d(rjc rjcVar) {
        rkf.f(rjcVar);
        this.a = rjcVar;
    }

    public final void e(rjb rjbVar) {
        d(rjbVar.a());
    }

    @Override // defpackage.qqt
    public final boolean equals(Object obj) {
        return (obj instanceof rff) && super.equals(obj);
    }
}
