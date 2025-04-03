package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctfy implements Runnable {
    final /* synthetic */ ctgi a;

    public ctfy(ctgi ctgiVar) {
        this.a = ctgiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nsu nsuVar = this.a.a;
        nsuVar.c();
        ntf ntfVar = nsuVar.g;
        if (ntfVar == null) {
            nsuVar.a();
            return;
        }
        try {
            if (!ntfVar.v) {
                ntfVar.c();
                ntfVar.f.g(1, null).b();
                ntfVar.l.b();
                ntfVar.l.e();
                RuntimeException runtimeException = ntfVar.s;
                if (runtimeException != null) {
                    throw runtimeException;
                }
            }
            nsuVar.g(new nrz());
            nsuVar.g = null;
            int i = lvf.a;
            nsuVar.a();
        } catch (Throwable th) {
            nsuVar.g(new nrz());
            nsuVar.g = null;
            int i2 = lvf.a;
            throw th;
        }
    }
}
