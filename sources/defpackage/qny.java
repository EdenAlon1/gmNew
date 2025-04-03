package defpackage;

import android.os.Process;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qny extends Thread {
    private static final boolean b = qox.b;
    public final BlockingQueue a;
    private final BlockingQueue c;
    private final qnw d;
    private volatile boolean e = false;
    private final qoy f;
    private final qod g;

    public qny(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, qnw qnwVar, qod qodVar) {
        this.c = blockingQueue;
        this.a = blockingQueue2;
        this.d = qnwVar;
        this.g = qodVar;
        this.f = new qoy(this, blockingQueue2, qodVar);
    }

    private void b() {
        List arrayList;
        List list;
        qol qolVar = (qol) this.c.take();
        qolVar.d("cache-queue-take");
        qolVar.m();
        try {
            if (qolVar.j()) {
                qolVar.g("cache-discard-canceled");
            } else {
                qnv a = this.d.a(qolVar.b);
                if (a == null) {
                    qolVar.d("cache-miss");
                    if (!this.f.b(qolVar)) {
                        this.a.put(qolVar);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (a.a(currentTimeMillis)) {
                        qolVar.d("cache-hit-expired");
                        qolVar.j = a;
                        if (!this.f.b(qolVar)) {
                            this.a.put(qolVar);
                        }
                    } else {
                        qolVar.d("cache-hit");
                        byte[] bArr = a.a;
                        Map map = a.g;
                        if (map == null) {
                            list = null;
                        } else {
                            if (map.isEmpty()) {
                                arrayList = Collections.EMPTY_LIST;
                            } else {
                                arrayList = new ArrayList(map.size());
                                for (Map.Entry entry : map.entrySet()) {
                                    arrayList.add(new qoe((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                            list = arrayList;
                        }
                        qor b2 = qolVar.b(new qoh(BasePaymentResult.ERROR_REQUEST_FAILED, bArr, map, list, false));
                        qolVar.d("cache-hit-parsed");
                        if (!b2.a()) {
                            qolVar.d("cache-parsing-failed");
                            this.d.d(qolVar.b);
                            qolVar.j = null;
                            if (!this.f.b(qolVar)) {
                                this.a.put(qolVar);
                            }
                        } else if (a.f < currentTimeMillis) {
                            qolVar.d("cache-hit-refresh-needed");
                            qolVar.j = a;
                            b2.d = true;
                            if (this.f.b(qolVar)) {
                                this.g.b(qolVar, b2);
                            } else {
                                this.g.c(qolVar, b2, new qnx(this, qolVar));
                            }
                        } else {
                            this.g.b(qolVar, b2);
                        }
                    }
                }
            }
        } finally {
            qolVar.m();
        }
    }

    public final void a() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (b) {
            qox.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.b();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                qox.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
