package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class embx implements Runnable {
    final /* synthetic */ emby a;
    private final errj b;

    public embx(emby embyVar, errj errjVar) {
        this.a = embyVar;
        this.b = errjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        errj errjVar = this.b;
        emby embyVar = this.a;
        synchronized (embyVar.f) {
            try {
                embyVar.g = (embu) erqt.q(errjVar);
                throw null;
            } catch (Exception unused) {
                embw embwVar = embyVar.h;
                if (embwVar != null && embwVar.a == errjVar) {
                    embyVar.h = null;
                }
            } catch (Throwable th) {
                embw embwVar2 = embyVar.h;
                if (embwVar2 != null && embwVar2.a == errjVar) {
                    embyVar.h = null;
                }
                throw th;
            }
        }
    }
}
