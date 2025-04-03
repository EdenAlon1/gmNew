package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.federatedlearning.PrimesExampleStoreDataTtlService;
import java.util.Random;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecdz {
    private static final dlpw a = new dlqb();
    private static final Random b = new Random();
    private static final errl c;
    private static final Object d;
    private static dgur e;

    static {
        ersf ersfVar = new ersf();
        ersfVar.d("PrimesBrellaExampleStore-%d");
        c = errs.a(Executors.newSingleThreadExecutor(ersf.b(ersfVar)));
        d = new Object();
    }

    public static dgur a(Context context) {
        dgur dgurVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (d) {
            if (e == null) {
                dlpw dlpwVar = a;
                Random random = b;
                errl errlVar = c;
                e = new dgur(applicationContext, new dguw(applicationContext, dlpwVar, random, errlVar), errlVar, PrimesExampleStoreDataTtlService.class);
            }
            dgurVar = e;
        }
        return dgurVar;
    }
}
