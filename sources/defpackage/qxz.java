package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxz {
    public final Map a = new HashMap();
    public final qxy b = new qxy();

    final void a(String str) {
        qxx qxxVar;
        synchronized (this) {
            qxxVar = (qxx) this.a.get(str);
            rkf.f(qxxVar);
            int i = qxxVar.b;
            if (i <= 0) {
                throw new IllegalStateException(a.z(i, str, "Cannot release a lock that is not held, safeKey: ", ", interestedThreads: "));
            }
            int i2 = i - 1;
            qxxVar.b = i2;
            if (i2 == 0) {
                qxx qxxVar2 = (qxx) this.a.remove(str);
                if (!qxxVar2.equals(qxxVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + qxxVar.toString() + ", but actually removed: " + String.valueOf(qxxVar2) + ", safeKey: " + str);
                }
                qxy qxyVar = this.b;
                synchronized (qxyVar.a) {
                    if (qxyVar.a.size() < 10) {
                        qxyVar.a.offer(qxxVar2);
                    }
                }
            }
        }
        qxxVar.a.unlock();
    }
}
