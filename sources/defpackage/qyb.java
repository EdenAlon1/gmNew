package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyb implements qxv {
    private final File b;
    private qqz d;
    private final qxz c = new qxz();
    private final qym a = new qym();

    @Deprecated
    public qyb(File file) {
        this.b = file;
    }

    private final synchronized qqz d() {
        if (this.d == null) {
            File file = this.b;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    qqz.g(file2, file3, false);
                }
            }
            qqz qqzVar = new qqz(file);
            if (qqzVar.b.exists()) {
                try {
                    qqzVar.e();
                    qqz.d(qqzVar.c);
                    Iterator it = qqzVar.g.values().iterator();
                    while (it.hasNext()) {
                        qqx qqxVar = (qqx) it.next();
                        if (qqxVar.f == null) {
                            for (int i = 0; i < qqzVar.d; i = 1) {
                                qqzVar.e += qqxVar.b[0];
                            }
                        } else {
                            qqxVar.f = null;
                            for (int i2 = 0; i2 < qqzVar.d; i2 = 1) {
                                qqz.d(qqxVar.c());
                                qqz.d(qqxVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    qqzVar.c();
                }
                this.d = qqzVar;
            }
            file.mkdirs();
            qqzVar = new qqz(file);
            qqzVar.f();
            this.d = qqzVar;
        }
        return this.d;
    }

    private final synchronized void e() {
        this.d = null;
    }

    @Override // defpackage.qxv
    public final File a(qtp qtpVar) {
        String a = this.a.a(qtpVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a + " for for Key: " + String.valueOf(qtpVar));
        }
        try {
            qqy a2 = d().a(a);
            if (a2 != null) {
                return a2.a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.qxv
    public final synchronized void b() {
        try {
            try {
                d().c();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
        } finally {
            e();
        }
    }

    @Override // defpackage.qxv
    public final void c(qtp qtpVar, qvi qviVar) {
        qxx qxxVar;
        File d;
        qxz qxzVar = this.c;
        String a = this.a.a(qtpVar);
        synchronized (qxzVar) {
            qxxVar = (qxx) qxzVar.a.get(a);
            if (qxxVar == null) {
                qxy qxyVar = qxzVar.b;
                synchronized (qxyVar.a) {
                    qxxVar = (qxx) qxyVar.a.poll();
                }
                if (qxxVar == null) {
                    qxxVar = new qxx();
                }
                qxzVar.a.put(a, qxxVar);
            }
            qxxVar.b++;
        }
        qxxVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a + " for for Key: " + String.valueOf(qtpVar));
            }
            try {
                qqz d2 = d();
                if (d2.a(a) == null) {
                    qqw j = d2.j(a);
                    if (j == null) {
                        throw new IllegalStateException(a.t(a, "Had two simultaneous puts for: "));
                    }
                    try {
                        synchronized (j.d) {
                            qqx qqxVar = j.a;
                            if (qqxVar.f != j) {
                                throw new IllegalStateException();
                            }
                            if (!qqxVar.e) {
                                j.b[0] = true;
                            }
                            d = qqxVar.d();
                            j.d.a.mkdirs();
                        }
                        if (qviVar.a.a(qviVar.b, d, qviVar.c)) {
                            j.d.b(j, true);
                            j.c = true;
                        }
                    } finally {
                        j.b();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.c.a(a);
        }
    }
}
