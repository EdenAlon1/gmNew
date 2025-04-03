package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrw {
    public static final ExecutorService a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: dkrs
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ExecutorService executorService = dkrw.a;
            return new Thread(runnable, "PrivateDataStorageThread");
        }
    });
    public File b;
    public File c;
    public Map d;
    public volatile boolean f;
    public int e = 0;
    public final Object g = new Object();

    public dkrw(Context context, String str) {
        synchronized (this) {
            this.f = false;
        }
        new dkrt(this, context, str).start();
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public final long a(String str, long j) {
        synchronized (this) {
            d();
            Long l = (Long) this.d.get(str);
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    public final dkru b() {
        synchronized (this) {
            d();
        }
        return new dkru(this);
    }

    public final String c(String str, String str2) {
        synchronized (this) {
            d();
            String str3 = (String) this.d.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    public final void d() {
        while (!this.f) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final synchronized void f(String str) {
        dkru b = b();
        synchronized (b) {
            b.a.put(str, b);
        }
        b.a();
    }

    public final synchronized void g(String str, boolean z) {
        dkru b = b();
        synchronized (b) {
            b.a.put(str, Boolean.valueOf(z));
        }
        b.a();
    }

    public final synchronized void h(String str, long j) {
        dkru b = b();
        synchronized (b) {
            b.a.put(str, Long.valueOf(j));
        }
        b.a();
    }

    public final synchronized void i(String str, Serializable serializable) {
        dkru b = b();
        synchronized (b) {
            b.a.put(str, serializable);
        }
        b.a();
    }

    public final synchronized void j(String str, String str2) {
        dkru b = b();
        synchronized (b) {
            b.a.put(str, str2);
        }
        b.a();
    }

    public final boolean k(String str) {
        boolean containsKey;
        synchronized (this) {
            d();
            containsKey = this.d.containsKey(str);
        }
        return containsKey;
    }

    public final boolean l(String str) {
        boolean booleanValue;
        synchronized (this) {
            d();
            Boolean bool = (Boolean) this.d.get(str);
            booleanValue = bool != null ? bool.booleanValue() : false;
        }
        return booleanValue;
    }
}
