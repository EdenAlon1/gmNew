package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwu implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ pww b;

    public pwu(pww pwwVar, String str) {
        this.b = pwwVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pyj pyjVar;
        prv prvVar = this.b.b.g;
        Object obj = prvVar.j;
        String str = this.a;
        synchronized (obj) {
            pua b = prvVar.b(str);
            pyjVar = b != null ? b.a : null;
        }
        if (pyjVar == null || !pyjVar.d()) {
            return;
        }
        synchronized (this.b.c) {
            this.b.f.put(pzh.a(pyjVar), pyjVar);
            pww pwwVar = this.b;
            this.b.g.put(pzh.a(pyjVar), pvq.a(pwwVar.h, pyjVar, pwwVar.j.b, pwwVar));
        }
    }
}
