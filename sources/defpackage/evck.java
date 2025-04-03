package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.TokenData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evck implements evbu {
    static final long a = TimeUnit.MINUTES.toMillis(5);
    static final long b = TimeUnit.HOURS.toMillis(1);
    private static final emww e = new emww(" ");
    private final dlpw f;
    private final evcm h;
    private final errl g = new erpq();
    public final Map c = new HashMap();
    public final Map d = new HashMap();

    public evck(evcm evcmVar, dlpw dlpwVar) {
        this.h = evcmVar;
        this.f = dlpwVar;
    }

    private static final String f(Set set) {
        return "oauth2:".concat(e.b(set));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.evbu
    public final evbw a(evbr evbrVar, Set set) {
        ListenableFuture listenableFuture;
        errj errjVar;
        final evcl evclVar = new evcl(new Account(evbrVar.a(), "com.google"), f(set));
        synchronized (this.d) {
            listenableFuture = (ListenableFuture) this.d.get(evclVar);
            if (listenableFuture == null) {
                errjVar = new errj(new Callable() { // from class: evch
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        evbw d;
                        evck evckVar = evck.this;
                        evcj evcjVar = evclVar;
                        synchronized (evckVar.c) {
                            evckVar.e(evckVar.c(evcjVar));
                            d = evckVar.d(evcjVar);
                        }
                        return d;
                    }
                });
                errjVar.b(new Runnable() { // from class: evci
                    @Override // java.lang.Runnable
                    public final void run() {
                        evcj evcjVar = evclVar;
                        evck evckVar = evck.this;
                        synchronized (evckVar.d) {
                            evckVar.d.remove(evcjVar);
                        }
                    }
                }, this.g);
                this.d.put(evclVar, errjVar);
                listenableFuture = errjVar;
            } else {
                errjVar = null;
            }
        }
        if (errjVar != null) {
            errjVar.run();
        }
        try {
            return (evbw) listenableFuture.get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof evbv) {
                throw ((evbv) cause);
            }
            throw new evbv("Failed to refresh token", cause);
        }
    }

    @Override // defpackage.evbu
    public final evbw b(evbr evbrVar, Set set) {
        evbw c;
        try {
            evcl evclVar = new evcl(new Account(evbrVar.a(), "com.google"), f(set));
            synchronized (this.c) {
                c = c(evclVar);
            }
            return c;
        } catch (evbv e2) {
            throw e2;
        } catch (Throwable th) {
            throw new evbv("Failed to get auth token", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.evbw c(defpackage.evcj r8) {
        /*
            r7 = this;
            java.util.Map r0 = r7.c
            java.lang.Object r0 = r0.get(r8)
            evbw r0 = (defpackage.evbw) r0
            if (r0 == 0) goto L44
            java.lang.Long r1 = r0.c
            if (r1 == 0) goto L2a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r1.longValue()
            long r1 = r2.toMillis(r3)
            dlpw r3 = r7.f
            j$.time.Instant r3 = r3.f()
            long r3 = r3.toEpochMilli()
            long r1 = r1 - r3
            long r3 = defpackage.evck.a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L40
            goto L41
        L2a:
            dlpw r1 = r7.f
            j$.time.Instant r1 = r1.f()
            long r1 = r1.toEpochMilli()
            long r3 = r0.b
            long r1 = r1 - r3
            long r3 = defpackage.evck.b
            long r5 = defpackage.evck.a
            long r3 = r3 - r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L41
        L40:
            return r0
        L41:
            r7.e(r0)
        L44:
            evbw r8 = r7.d(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evck.c(evcj):evbw");
    }

    public final evbw d(evcj evcjVar) {
        evcl evclVar = (evcl) evcjVar;
        Account account = evclVar.a;
        String str = evclVar.b;
        evcm evcmVar = this.h;
        try {
            Context context = evcmVar.a;
            int i = dezv.a;
            TokenData b2 = dfac.b(context, account, str, null);
            evbw evbwVar = new evbw(b2.b, evcmVar.b.f().toEpochMilli(), b2.c);
            this.c.put(evcjVar, evbwVar);
            return evbwVar;
        } catch (dezu e2) {
            throw new evbv(e2);
        }
    }

    public final void e(evbw evbwVar) {
        String str = evbwVar.a;
        try {
            Context context = this.h.a;
            int i = dezv.a;
            dfac.f(context, str);
        } catch (dezu e2) {
            throw new evbv(e2);
        }
    }
}
