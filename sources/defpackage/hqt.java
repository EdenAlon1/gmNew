package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqt implements hjk {
    public hrh a;
    public hrc b;
    public String c;
    public Object d;
    public Object[] e;
    public hrd f;
    private final ffix g = new hqs(this);

    public hqt(hrh hrhVar, hrc hrcVar, String str, Object obj, Object[] objArr) {
        this.a = hrhVar;
        this.b = hrcVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    public final void a() {
        String a;
        hrc hrcVar = this.b;
        if (this.f != null) {
            throw new IllegalArgumentException("entry(" + this.f + ") is not null");
        }
        if (hrcVar != null) {
            Object invoke = this.g.invoke();
            if (invoke == null || hrcVar.c(invoke)) {
                this.f = hrcVar.d(this.c, this.g);
                return;
            }
            if (invoke instanceof hso) {
                hso hsoVar = (hso) invoke;
                if (hsoVar.f() == hhs.a || hsoVar.f() == hla.a || hsoVar.f() == hji.a) {
                    a = "MutableState containing " + hsoVar.a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    a = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                a = hqr.a(invoke);
            }
            throw new IllegalArgumentException(a);
        }
    }

    @Override // defpackage.hjk
    public final void g() {
        hrd hrdVar = this.f;
        if (hrdVar != null) {
            hrdVar.a();
        }
    }

    @Override // defpackage.hjk
    public final void h() {
        hrd hrdVar = this.f;
        if (hrdVar != null) {
            hrdVar.a();
        }
    }

    @Override // defpackage.hjk
    public final void i() {
        a();
    }
}
