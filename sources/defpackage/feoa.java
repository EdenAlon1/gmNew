package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feoa extends femr {
    public final fejg a;
    private final fekh b;

    public feoa(fekh fekhVar, fejg fejgVar) {
        this.b = fekhVar;
        this.a = fejgVar;
    }

    @Override // defpackage.femr
    protected final fekh a() {
        return this.b;
    }

    @Override // defpackage.femr, defpackage.fejv
    public final fejs d(febs febsVar, febo feboVar, fdxj fdxjVar, fdxt[] fdxtVarArr) {
        return new fenz(this, this.b.d(febsVar, feboVar, fdxjVar, fdxtVarArr));
    }
}
