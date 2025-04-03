package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bty implements bfk {
    private bcm a;
    private boolean b = false;

    public bty(bcm bcmVar) {
        this.a = bcmVar;
    }

    private final void d(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        bcm bcmVar = this.a;
        if (bcmVar == null) {
            avw.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
        } else if (z) {
            bcmVar.y();
        } else {
            bcmVar.v();
        }
    }

    @Override // defpackage.bfk
    public final void a(Throwable th) {
        avw.g("VideoCapture", "SourceStreamRequirementObserver#onError", th);
    }

    @Override // defpackage.bfk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ksw.d(biw.d(), "SourceStreamRequirementObserver can be updated from main thread only");
        d(Boolean.TRUE.equals((Boolean) obj));
    }

    public final void c() {
        ksw.d(biw.d(), "SourceStreamRequirementObserver can be closed from main thread only");
        avw.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.b);
        if (this.a == null) {
            avw.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
        } else {
            d(false);
            this.a = null;
        }
    }
}
