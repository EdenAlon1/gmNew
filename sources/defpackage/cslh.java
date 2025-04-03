package defpackage;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.cslb;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public abstract class cslh extends AsyncTask implements cslb {
    public static final enru d = enru.c("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask");
    private final emwl a;
    private final emwl b;
    public final String g;
    public final long h;
    public final boolean i;
    public boolean j;

    public cslh(String str) {
        this(str, e, false);
    }

    protected abstract Object a(Object... objArr);

    protected abstract void d(Object obj);

    @Override // android.os.AsyncTask
    protected final Object doInBackground(Object... objArr) {
        return this.a.apply(objArr);
    }

    public final void e(Object... objArr) {
        csix.g();
        this.j = true;
        try {
            synchronized (f) {
                f.put(this, Long.valueOf(System.currentTimeMillis()));
            }
            executeOnExecutor(csky.a(), objArr);
        } catch (RejectedExecutionException e) {
            csky.b(this, e);
            throw e;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Object obj) {
    }

    public final String toString() {
        String str = this.g;
        String obj = super.toString();
        if (TextUtils.isEmpty(str)) {
            return obj;
        }
        return obj + " (" + this.g + ")";
    }

    public cslh(String str, byte[] bArr) {
        this(str, 2147483647L, false);
    }

    public cslh(String str, long j, boolean z) {
        csix.g();
        this.g = str;
        this.h = j;
        this.i = z;
        this.a = eldl.a(new emwl() { // from class: csle
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskz cH;
                cskz cH2;
                cslh cslhVar = cslh.this;
                Object[] objArr = (Object[]) obj;
                csix.k(cslhVar.j);
                if (cslhVar.i) {
                    cslq.a.postDelayed(new cslg(cslhVar), cslhVar.h);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Object a = cslhVar.a(objArr);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    synchronized (cslh.f) {
                        cslh.f.remove(cslhVar);
                    }
                    String str2 = cslhVar.g;
                    if (str2 != null && str2.startsWith("Bugle.") && (cH2 = ((cslb.a) ctba.a(cslb.a.class)).cH()) != null) {
                        cH2.k(cslhVar.g, elapsedRealtime2, cslhVar.h);
                    }
                    if (elapsedRealtime2 > cslhVar.h) {
                        ensk j2 = cslh.d.j();
                        j2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask", "doInternal", 122, "SafeAsyncTask.java")).C("%s took %dms", cslhVar, elapsedRealtime2);
                    }
                    return a;
                } catch (Throwable th) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    synchronized (cslh.f) {
                        cslh.f.remove(cslhVar);
                        String str3 = cslhVar.g;
                        if (str3 != null && str3.startsWith("Bugle.") && (cH = ((cslb.a) ctba.a(cslb.a.class)).cH()) != null) {
                            cH.k(cslhVar.g, elapsedRealtime3, cslhVar.h);
                        }
                        if (elapsedRealtime3 <= cslhVar.h) {
                            throw th;
                        }
                        ensk j3 = cslh.d.j();
                        j3.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask", "doInternal", 122, "SafeAsyncTask.java")).C("%s took %dms", cslhVar, elapsedRealtime3);
                        throw th;
                    }
                }
            }
        });
        this.b = eldl.a(new emwl() { // from class: cslf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cslh.this.d(obj);
                return null;
            }
        });
    }
}
