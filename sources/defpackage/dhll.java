package defpackage;

import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.phenotype.Configurations;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dhll {
    protected final dhlf a;
    protected final String b;
    protected final AtomicBoolean c = new AtomicBoolean(false);

    public dhll(dhlf dhlfVar, String str) {
        this.a = dhlfVar;
        this.b = str;
    }

    private final boolean h(String str, int i) {
        return e(str, i - 1);
    }

    @Deprecated
    protected void a(Configurations configurations) {
        throw new IllegalStateException("Requires implementation");
    }

    protected void b(Configurations configurations) {
        a(configurations);
    }

    public final void c(Executor executor, dhlk dhlkVar) {
        d(executor, dhlkVar, 3, 0L);
    }

    public final void d(final Executor executor, final dhlk dhlkVar, final int i, final long j) {
        this.a.o(this.b, "").o(executor, new dhqs() { // from class: dhlh
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                final dhll dhllVar = dhll.this;
                final dhlk dhlkVar2 = dhlkVar;
                final int i2 = i;
                final Executor executor2 = executor;
                final long j2 = j;
                if (dhreVar.m()) {
                    dhllVar.b((Configurations) dhreVar.i());
                    String str = ((Configurations) dhreVar.i()).a;
                    if (str == null || str.isEmpty()) {
                        dhlkVar2.a(true);
                        return;
                    } else {
                        dhllVar.a.b(str).o(executor2, new dhqs() { // from class: dhli
                            @Override // defpackage.dhqs
                            public final void a(dhre dhreVar2) {
                                int i3;
                                boolean m = dhreVar2.m();
                                if (!m) {
                                    dhreVar2.h();
                                }
                                dhlk dhlkVar3 = dhlkVar2;
                                if (m || (i3 = i2) <= 1) {
                                    dhlkVar3.a(m);
                                    return;
                                }
                                long j3 = j2;
                                Executor executor3 = executor2;
                                dhll dhllVar2 = dhll.this;
                                Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + dhllVar2.b + " failed, retrying");
                                dhllVar2.g(executor3, dhlkVar3, i3, j3);
                            }
                        });
                        return;
                    }
                }
                boolean z = dhllVar.c.get() && i2 > 1;
                dhreVar.h();
                if (z) {
                    Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + dhllVar.b + " failed, retrying");
                    dhllVar.g(executor2, dhlkVar2, i2, j2);
                    return;
                }
                Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + dhllVar.b + " failed");
                dhlkVar2.a(false);
            }
        });
    }

    public final boolean e(String str, int i) {
        if (i <= 0) {
            Log.w("PhenotypeFlagCommitter", "No more attempts remaining, giving up for ".concat(String.valueOf(this.b)));
            return false;
        }
        boolean z = this.c.get() && i > 1;
        Configurations f = f(this.b, str);
        if (f == null) {
            if (z) {
                return h(str, i);
            }
            return false;
        }
        b(f);
        String str2 = f.a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                dhrt.g(this.a.b(f.a), 2000L, TimeUnit.MILLISECONDS);
                Uri a = ecvd.a(this.b);
                Map map = ecus.a;
                synchronized (ecus.class) {
                    ecus ecusVar = (ecus) ecus.a.get(a);
                    if (ecusVar != null) {
                        ecusVar.c();
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + this.b + " failed, retrying", e);
                return h(str, i);
            }
        }
        return true;
    }

    protected final Configurations f(String str, String str2) {
        try {
            return (Configurations) dhrt.g(this.a.o(str, str2), 2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("PhenotypeFlagCommitter", a.a(str, "Retrieving snapshot for ", " failed"), e);
            return null;
        }
    }

    public final void g(final Executor executor, final dhlk dhlkVar, final int i, final long j) {
        if (j > 0) {
            new dgxx(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dhlj
                @Override // java.lang.Runnable
                public final void run() {
                    dhll.this.d(executor, dhlkVar, i - 1, j);
                }
            }, 0L);
        } else {
            d(executor, dhlkVar, i - 1, 0L);
        }
    }
}
