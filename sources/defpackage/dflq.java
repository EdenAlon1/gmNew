package defpackage;

import android.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dflq {
    public final String a;
    public final Object b;
    cpn c;
    public int d;
    final /* synthetic */ dfmc e;

    protected dflq(dfmc dfmcVar, dflq dflqVar) {
        this(dfmcVar, dflqVar.a);
        synchronized (dflqVar.b) {
            this.d = dflqVar.d;
            cpn cpnVar = this.c;
            this.c = dflqVar.c;
            dflqVar.c = cpnVar;
            dflqVar.d = 0;
        }
    }

    public final void a(final long j, final long j2, dflv dflvVar) {
        if (dflvVar == null) {
            dflvVar = dfmc.a;
        }
        emwl emwlVar = new emwl() { // from class: dflp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                long j3 = j;
                dflv dflvVar2 = (dflv) obj;
                dflq dflqVar = dflq.this;
                synchronized (dflqVar.b) {
                    cno cnoVar = (cno) dflqVar.c.get(dflvVar2);
                    if (cnoVar == null) {
                        cnoVar = new cno();
                        dflqVar.c.put(dflvVar2, cnoVar);
                    }
                    int i = dflqVar.d;
                    int i2 = dflqVar.e.c;
                    if (i >= i2) {
                        if (i == i2 && Log.isLoggable("Counters", 3)) {
                            Log.d("Counters", "exceeded sample count in " + dflqVar.a);
                        }
                        return false;
                    }
                    dflqVar.d = i + 1;
                    long[] jArr = (long[]) cnoVar.d(j3);
                    long j4 = j2;
                    if (jArr == null) {
                        cnoVar.h(j3, new long[]{j4});
                    } else {
                        jArr[0] = jArr[0] + j4;
                    }
                    return false;
                }
            }
        };
        dfwv.n(dflvVar);
        if (dfmc.b.equals(dflvVar)) {
            dflvVar = this.e.i;
        }
        ReentrantReadWriteLock.ReadLock readLock = this.e.d.readLock();
        readLock.lock();
        try {
            if (!this.e.j.contains(dflvVar)) {
                readLock.unlock();
                ReentrantReadWriteLock.WriteLock writeLock = this.e.d.writeLock();
                writeLock.lock();
                readLock.lock();
                try {
                    this.e.j.add(dflvVar);
                    writeLock.unlock();
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
            ((Boolean) emwlVar.apply(dflvVar)).booleanValue();
            Future future = this.e.f;
            readLock.unlock();
            if (this.e.e <= 0 || future != null) {
                return;
            }
            this.e.g();
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractCounter(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.b) {
            int i = 0;
            while (true) {
                cpn cpnVar = this.c;
                if (i < cpnVar.d) {
                    cno cnoVar = (cno) cpnVar.g(i);
                    sb.append(this.c.d(i));
                    sb.append(" -> [");
                    for (int i2 = 0; i2 < cnoVar.b(); i2++) {
                        sb.append(cnoVar.c(i2));
                        sb.append(" = ");
                        sb.append(((long[]) cnoVar.e(i2))[0]);
                        sb.append(", ");
                    }
                    sb.append("], ");
                    i++;
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected dflq(dfmc dfmcVar, String str) {
        this.e = dfmcVar;
        this.b = new Object();
        this.c = new cpn();
        dfwv.k(!dfmcVar.h.containsKey(str), "counter/histogram already exists: %s", str);
        this.a = str;
    }
}
