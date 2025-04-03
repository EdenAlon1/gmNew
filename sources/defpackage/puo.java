package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class puo implements Runnable {
    public final /* synthetic */ pup a;

    public /* synthetic */ puo(pup pupVar) {
        this.a = pupVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pup pupVar = this.a;
        if (pupVar.g != 0) {
            ppt c = ppt.c();
            String str = pup.a;
            pxs pxsVar = pupVar.d;
            Objects.toString(pxsVar);
            c.a(str, "Already started work for ".concat(pxsVar.toString()));
            return;
        }
        pupVar.g = 1;
        ppt c2 = ppt.c();
        String str2 = pup.a;
        pxs pxsVar2 = pupVar.d;
        Objects.toString(pxsVar2);
        c2.a(str2, "onAllConstraintsMet for ".concat(pxsVar2.toString()));
        puu puuVar = pupVar.e;
        if (!puuVar.d.g(pupVar.l, null)) {
            pupVar.a();
            return;
        }
        puu puuVar2 = pupVar.e;
        pxs pxsVar3 = pupVar.d;
        qba qbaVar = puuVar2.c;
        synchronized (qbaVar.e) {
            ppt.c().a(qba.a, a.n(pxsVar3, "Starting timer for "));
            qbaVar.a(pxsVar3);
            qaz qazVar = new qaz(qbaVar, pxsVar3);
            qbaVar.c.put(pxsVar3, qazVar);
            qbaVar.d.put(pxsVar3, pupVar);
            qbaVar.b.b(600000L, qazVar);
        }
    }
}
