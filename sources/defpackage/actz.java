package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class actz implements acve {
    protected final acua a;
    final /* synthetic */ acuq b;

    public actz(acuq acuqVar, acua acuaVar) {
        this.b = acuqVar;
        this.a = acuaVar;
    }

    private final void c(String str, acyu acyuVar) {
        acum acumVar;
        synchronized (acuq.b) {
            acumVar = (acum) this.b.i.get(this.a);
        }
        if (acumVar == null || acumVar.g() || !acumVar.d().equals(acyuVar)) {
            acuq.a.p("Ignoring message from paused or closed JsBridgeChannel");
            return;
        }
        csjb c = acuq.a.c();
        c.I("Received message from Ditto");
        c.y("length", str != null ? str.length() : 0);
        c.r();
        a(str, acumVar);
    }

    public abstract void a(String str, acum acumVar);

    @Override // defpackage.acve
    public final void b(String str, acyu acyuVar) {
        if (!((Boolean) ((cfup) acuq.c.get()).e()).booleanValue()) {
            c(str, acyuVar);
            return;
        }
        ekzm b = this.b.h.b("JsBridgeManager onMessage");
        try {
            c(str, acyuVar);
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
