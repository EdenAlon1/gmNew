package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class put implements Runnable {
    private final puu a;

    public put(puu puuVar) {
        this.a = puuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        boolean isEmpty2;
        ppt.c().a(puu.a, "Checking if commands are complete.");
        puu.e();
        puu puuVar = this.a;
        synchronized (puuVar.g) {
            if (puuVar.h != null) {
                ppt.c().a(puu.a, "Removing command " + puuVar.h);
                if (!((Intent) puuVar.g.remove(0)).equals(puuVar.h)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                puuVar.h = null;
            }
            qak qakVar = puuVar.j.a;
            puk pukVar = puuVar.f;
            synchronized (pukVar.d) {
                isEmpty = pukVar.c.isEmpty();
            }
            if (isEmpty && puuVar.g.isEmpty()) {
                synchronized (qakVar.b) {
                    isEmpty2 = qakVar.a.isEmpty();
                }
                if (isEmpty2) {
                    ppt.c().a(puu.a, "No more commands & intents.");
                    pus pusVar = puuVar.i;
                    if (pusVar != null) {
                        pusVar.a();
                    }
                }
            }
            if (!puuVar.g.isEmpty()) {
                puuVar.c();
            }
        }
    }
}
