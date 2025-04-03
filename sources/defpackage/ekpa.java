package defpackage;

import android.accounts.Account;
import android.accounts.NetworkErrorException;
import com.google.android.gms.auth.TokenData;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpa extends ekos {
    public static final /* synthetic */ int f = 0;
    public final dfad c;
    public final ekot d;
    public final dlpw e;
    private final cpn h = new cpn();
    private final errl i;
    private final errl j;
    private final ejar k;
    static final long a = TimeUnit.MINUTES.toMillis(5);
    static final long b = TimeUnit.HOURS.toMillis(1);
    private static final efan g = new efan("debug.tiktok.apiary_token", "");

    public ekpa(errl errlVar, errl errlVar2, dfad dfadVar, ekot ekotVar, ejar ejarVar, dlpw dlpwVar) {
        this.i = errlVar;
        this.j = errlVar2;
        this.c = dfadVar;
        this.d = ekotVar;
        this.k = ejarVar;
        this.e = dlpwVar;
    }

    private final ListenableFuture e() {
        return erqt.i(new ekor(g.a(), this.e.f().toEpochMilli(), null));
    }

    private static final ekor f(ListenableFuture listenableFuture) {
        try {
            return (ekor) erqt.q(listenableFuture);
        } catch (ExecutionException unused) {
            return null;
        }
    }

    private static final boolean g() {
        return !g.a().isEmpty();
    }

    @Override // defpackage.ekos
    public final ListenableFuture a(final eisx eisxVar) {
        return g() ? e() : erqt.j(erny.g(this.k.b(eisxVar), eldl.d(new eroh() { // from class: ekoz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str = (String) obj;
                return str != null ? ekpa.this.c(str) : erqt.h(new IllegalStateException("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(eisxVar)))));
            }
        }), this.j));
    }

    @Override // defpackage.ekos
    public final ListenableFuture b(final eisx eisxVar) {
        return g() ? e() : erqt.j(erny.g(this.k.b(eisxVar), eldl.d(new eroh() { // from class: ekox
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str = (String) obj;
                return str != null ? ekpa.this.d(str) : erqt.h(new IllegalStateException("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(eisxVar)))));
            }
        }), this.j));
    }

    public final synchronized ListenableFuture c(final String str) {
        ekor ekorVar;
        ListenableFuture listenableFuture = (ListenableFuture) this.h.get(str);
        if (listenableFuture == null) {
            ekorVar = null;
        } else {
            if (!listenableFuture.isDone()) {
                return listenableFuture;
            }
            ekorVar = f(listenableFuture);
        }
        elfl f2 = elfo.e(ekorVar).i(new eroh() { // from class: ekou
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ekor ekorVar2 = (ekor) obj;
                if (ekorVar2 == null) {
                    return erre.a;
                }
                ekpa ekpaVar = ekpa.this;
                return duin.a(ekpaVar.c.a(ekorVar2.a));
            }
        }, this.i).i(new eroh() { // from class: ekov
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ekpa ekpaVar = ekpa.this;
                final long epochMilli = ekpaVar.e.f().toEpochMilli();
                return elfr.j(duin.a(ekpaVar.c.c(new Account(str, "com.google"), ekpaVar.d.a(), null)), new emwl() { // from class: ekoy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        TokenData tokenData = (TokenData) obj2;
                        String str2 = tokenData.b;
                        Long l = tokenData.c;
                        int i = ekpa.f;
                        return new ekor(str2, epochMilli, l);
                    }
                }, erpp.a);
            }
        }, this.i).f(IOException.class, new eroh() { // from class: ekow
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                int i = ekpa.f;
                return erqt.h(new NetworkErrorException("Can't get auth token.", (IOException) obj));
            }
        }, erpp.a);
        this.h.put(str, f2);
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if ((r8.e.f().toEpochMilli() - r1.b) < (defpackage.ekpa.b - defpackage.ekpa.a)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.common.util.concurrent.ListenableFuture d(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            cpn r0 = r8.h     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L56
            com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L50
            boolean r1 = r0.isDone()     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L12
            goto L4e
        L12:
            ekor r1 = f(r0)     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L50
            java.lang.Long r2 = r1.c     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L38
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L56
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L56
            long r1 = r1.toMillis(r2)     // Catch: java.lang.Throwable -> L56
            dlpw r3 = r8.e     // Catch: java.lang.Throwable -> L56
            j$.time.Instant r3 = r3.f()     // Catch: java.lang.Throwable -> L56
            long r3 = r3.toEpochMilli()     // Catch: java.lang.Throwable -> L56
            long r1 = r1 - r3
            long r3 = defpackage.ekpa.a     // Catch: java.lang.Throwable -> L56
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L4e
            goto L50
        L38:
            dlpw r2 = r8.e     // Catch: java.lang.Throwable -> L56
            j$.time.Instant r2 = r2.f()     // Catch: java.lang.Throwable -> L56
            long r2 = r2.toEpochMilli()     // Catch: java.lang.Throwable -> L56
            long r4 = r1.b     // Catch: java.lang.Throwable -> L56
            long r2 = r2 - r4
            long r4 = defpackage.ekpa.b     // Catch: java.lang.Throwable -> L56
            long r6 = defpackage.ekpa.a     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 >= 0) goto L50
        L4e:
            monitor-exit(r8)
            return r0
        L50:
            com.google.common.util.concurrent.ListenableFuture r9 = r8.c(r9)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)
            return r9
        L56:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekpa.d(java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }
}
