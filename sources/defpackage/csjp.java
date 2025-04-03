package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csjp {
    private final long a;
    private int b = 15;
    private final Map c = new cmh();

    public csjp(long j) {
        this.a = j;
    }

    private final synchronized void b(long j) {
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            if (((csjo) ((Map.Entry) it.next()).getValue()).a <= j - this.a) {
                it.remove();
            }
        }
        int i = ((cpn) this.c).d;
        int i2 = this.b;
        if (i2 < 60 && i >= (i2 * 3) / 4) {
            i2 = Math.min(i + i, 60);
            this.b = i2;
        }
        if (i2 > 15 && i < (i2 >> 2)) {
            i2 = Math.max(i + i, 15);
            this.b = i2;
        }
        if (i2 >= 60) {
            this.c.clear();
        }
    }

    final synchronized boolean a(csls cslsVar, Object obj) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        csjo csjoVar = (csjo) this.c.get(obj);
        z = true;
        if (csjoVar == null) {
            this.c.put(obj, new csjo(elapsedRealtime));
        } else {
            if (csjoVar.a + this.a <= elapsedRealtime) {
                if (csjoVar.b > 0) {
                    cslsVar.I("[Throttled");
                    cslsVar.G(csjoVar.b);
                    cslsVar.I("times]");
                }
                csjoVar.a = elapsedRealtime;
            } else {
                csjoVar.b++;
                z = false;
            }
        }
        if (((cpn) this.c).d > this.b) {
            b(elapsedRealtime);
        }
        return z;
    }
}
