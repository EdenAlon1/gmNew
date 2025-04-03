package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeil extends TimerTask {
    final /* synthetic */ eeim a;
    private final String b;
    private final dktn c;

    public eeil(eeim eeimVar, String str, dktn dktnVar) {
        this.a = eeimVar;
        this.b = str;
        this.c = dktnVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        synchronized (this.a.d) {
            if (this.a.d.contains(this.b)) {
                eeim eeimVar = this.a;
                String str = this.b;
                dkty.r(eeimVar.a, "Transaction timed out for context id: %s", str);
                eeif f = eeimVar.f(str);
                if (f == null) {
                    dkty.r(eeimVar.a, "onTransactionTimeout: No transaction context found for context id: %s", str);
                } else {
                    eein eeinVar = f.d;
                    if (eeinVar == null) {
                        dkty.r(eeimVar.a, "onTransactionTimeout: No listener found for context id: %s", str);
                    } else {
                        eeinVar.c(f);
                    }
                }
            } else {
                dkty.d(this.c, "context id: %s already removed - transaction finished", this.b);
            }
            this.a.d.remove(this.b);
        }
    }
}
