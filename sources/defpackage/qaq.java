package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qaq implements Runnable {
    private final prv a;
    private final psb b;
    private final boolean c;
    private final int d;

    public qaq(prv prvVar, psb psbVar, boolean z, int i) {
        prvVar.getClass();
        this.a = prvVar;
        this.b = psbVar;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean e;
        pua a;
        if (this.c) {
            prv prvVar = this.a;
            psb psbVar = this.b;
            int i = this.d;
            Object obj = prvVar.j;
            String str = psbVar.a.a;
            synchronized (obj) {
                a = prvVar.a(str);
            }
            e = prv.e(str, a, i);
        } else {
            prv prvVar2 = this.a;
            psb psbVar2 = this.b;
            int i2 = this.d;
            Object obj2 = prvVar2.j;
            String str2 = psbVar2.a.a;
            synchronized (obj2) {
                if (prvVar2.e.get(str2) != null) {
                    ppt.c().a(prv.a, a.a(str2, "Ignored stopWork. WorkerWrapper ", " is in foreground"));
                } else {
                    Set set = (Set) prvVar2.g.get(str2);
                    if (set != null && set.contains(psbVar2)) {
                        e = prv.e(str2, prvVar2.a(str2), i2);
                    }
                }
                e = false;
            }
        }
        ppt.c().a(ppt.d("StopWorkRunnable"), "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + e);
    }
}
