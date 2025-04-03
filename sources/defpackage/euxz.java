package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euxz {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static dhqc c;

    public static void a(Context context) {
        if (c == null) {
            dhqc dhqcVar = new dhqc(context);
            c = dhqcVar;
            synchronized (dhqcVar.a) {
                dhqcVar.c = true;
            }
        }
    }

    static void b(Intent intent) {
        synchronized (b) {
            if (c != null && d(intent)) {
                c(intent, false);
                dhqc dhqcVar = c;
                if (dhqcVar.g.decrementAndGet() < 0) {
                    dhpz dhpzVar = dhqc.h;
                    Log.w("WakeLock", String.format("%s release without a matched acquire!", dhqcVar.e));
                }
                synchronized (dhqcVar.a) {
                    dhqcVar.d();
                    if (dhqcVar.f.containsKey(null)) {
                        dhqa dhqaVar = (dhqa) dhqcVar.f.get(null);
                        if (dhqaVar != null) {
                            int i = dhqaVar.a - 1;
                            dhqaVar.a = i;
                            if (i == 0) {
                                dhqcVar.f.remove(null);
                            }
                        }
                    } else {
                        Log.w("WakeLock", dhqcVar.e + " counter does not exist");
                    }
                    dhqcVar.e();
                }
            }
        }
    }

    public static void c(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
}
