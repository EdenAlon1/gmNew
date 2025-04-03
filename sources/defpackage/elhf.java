package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elhf implements oyy {
    public final /* synthetic */ elhg a;
    public final /* synthetic */ oyy b;

    public /* synthetic */ elhf(elhg elhgVar, oyy oyyVar) {
        this.a = elhgVar;
        this.b = oyyVar;
    }

    @Override // defpackage.oyy
    public final void a() {
        oyy oyyVar = this.b;
        ekzm b = this.a.a.b("TraceRefresh");
        try {
            oyyVar.a();
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
