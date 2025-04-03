package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elhd implements llh {
    public final /* synthetic */ elhe a;
    public final /* synthetic */ llh b;
    public final /* synthetic */ String c;

    public /* synthetic */ elhd(elhe elheVar, llh llhVar, String str) {
        this.a = elheVar;
        this.b = llhVar;
        this.c = str;
    }

    @Override // defpackage.llh
    public final void a(Object obj) {
        llh llhVar = this.b;
        if (ekyf.v()) {
            llhVar.a(obj);
            return;
        }
        ekzm b = this.a.a.b(this.c);
        try {
            llhVar.a(obj);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
