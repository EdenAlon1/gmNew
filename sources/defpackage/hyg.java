package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyg extends hvh implements hyk {
    public ffji a;
    private hzo b;

    public hyg(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.hyk
    public final void dP(hzo hzoVar) {
        if (ffkj.e(this.b, hzoVar)) {
            return;
        }
        this.b = hzoVar;
        this.a.invoke(hzoVar);
    }
}
