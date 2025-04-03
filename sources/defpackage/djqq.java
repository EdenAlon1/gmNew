package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djqq implements Runnable {
    final /* synthetic */ djqr a;

    public djqq(djqr djqrVar) {
        this.a = djqrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dkty.r(this.a.b, "Server didn't respond to keep-alive, restarting IMS connection", new Object[0]);
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((djqs) it.next()).b();
        }
    }
}
