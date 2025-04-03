package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldk implements Runnable {
    final /* synthetic */ fflb a;
    final /* synthetic */ elat b;
    final /* synthetic */ Runnable c;

    public eldk(fflb fflbVar, elat elatVar, Runnable runnable) {
        this.a = fflbVar;
        this.b = elatVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((elep) this.a.a) != null) {
            throw null;
        }
        elat elatVar = this.b;
        Runnable runnable = this.c;
        elat h = ekyf.h(ekyf.b(), elatVar);
        try {
            runnable.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.c + "]";
    }
}
